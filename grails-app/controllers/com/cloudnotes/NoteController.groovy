package com.cloudnotes

class NoteController {

    def index() { 
    	println params.code
    	if (params.code == null) {
    		params.code = "teste"
    	}    	
    	Note note = Note.findByUserCode(params.code)
    	if (!note) {
    		note = new Note(userCode: params.code)
    		println note.save()	
    	}    
    	[note: note]	
    	
    }

    def updateNote() {    	
    	Note note = Note.findByUserCode(params.id)
    	note.content = params.content    
    	note.save()	    
    }
}
