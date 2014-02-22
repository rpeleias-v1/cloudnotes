package com.cloudnotes

class NoteController {

    def index() { 
    	println params.code
    	if (params.code == null) {
    		params.code = "teste"
    	}    	
    	Note note = Note.findByUserCode(params.code)
    	note.content = "teste"
    	if (!note) {
    		note = new Note(userCode: params.code)
    		println note.save()	
    	}    
    	[note: note]	
    	
    }

    def updateNote() {
    	//Note note = Note.findBy(params.code)
    	//println note.content
    	println "atualizou!!"
    	println params
    }
}
