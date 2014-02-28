package com.cloudnotes

class Contact {

	static mapWith = "mongo"

	String email
	String userName
	String content

    static constraints = {	
    	email(blank: false, nullable: true, email: true, unique: true) 
    	userName(blank: false, nullable: true)
    	content(blank: false, nullable: true)
    }

    static mapping =  {
    	version false
    }
}
