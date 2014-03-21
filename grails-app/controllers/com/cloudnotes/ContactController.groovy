package com.cloudnotes

class ContactController {

    def mailService

    def contact() { 
    	Contact contact = new Contact()
    	[contact: contact]        
    }

    def save()  {     
    	def contact = new Contact(params)    
    	if (!contact.save(flush: true)) {
    		render (view: 'contact', model: [contact: contact])
            return
    	}    	
        mailService.send("Cloud Notes Contact", contact.content, contact.email)
	 	redirect(action: "index", controller: "note")
    }
}
