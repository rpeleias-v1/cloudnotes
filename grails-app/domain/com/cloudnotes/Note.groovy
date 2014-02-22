package com.cloudnotes

class Note {

	static mapWith = "mongo"

	String userCode
	String content

    static constraints = {
    	userCode blank: false, nullable: false, unique: true
    }
}
