package com.cloudnotes

class ContactController {

    def contact() { 
    	Contact contact = new Contact()
    	[contact: contact]
    }

    def save()  {
    	def contact = new Contact(params)    	
    	if (!contact.save(flush: true)) {
    		render (view: 'contact', model: [contact: contact])
    	}    	
	 	redirect(action: "index", controller: "note")
    }
}
