package com.cloudnotes

import org.apache.commons.lang.RandomStringUtils

class NoteController {

    def index() {     	
    	if (params.code == null) {
            createRandomStrings()
            redirect(uri: "/${params.code}", controller: 'note', action: 'index', params:[code: params.code])
    	}    	       
    	def note = saveNotes()
    	[note: note]
    }

    def createRandomStrings() {
        int randomStringLength = 8
        String charset = (('a'..'z') + ('A'..'Z') + ('0'..'9')).join()
        String randomString = RandomStringUtils.random(randomStringLength, charset.toCharArray())
        params.code = randomString        
    }

    def saveNotes() {
        Note note = Note.findByUserCode(params.code)
        if (!note) {            
            note = new Note(userCode: params.code)               
            note.save(flush: true)  
        }    
        return note
    }

    def updateNote() {    	
    	Note note = Note.findByUserCode(params.id)
    	note.content = params.content    
    	note.save()	    
    }

    def changeCode() {
        Note note = Note.findByUserCode(params.userCode)
        println "Note = " + note
        note.userCode = params.newCode
        if (!note.save()) {
            render(text: message(code: 'default.message.existedCode'))
            return
        }
        def url = createLink(uri: "/${note.userCode}", controller: 'note', action: 'index', params:[code: note.userCode])
        render(contentType: 'text/html', text: "<script>window.location.href='$url'</script>")
        //redirect(uri: "/${note.userCode}", controller: 'note', action: 'index', params:[code: note.userCode])
    } 
}
