package com.cloudnotes

import org.apache.commons.mail.SimpleEmail

class MailService {

	boolean transaction = false

    String host= "xxx"
	String username = "xxx"
	String password = "xxx"
	String from = "xxx"
	Integer port = 465
	 
	def send(String subject, String msg, String to) {
		SimpleEmail email = new SimpleEmail()
		email.setHostName(host)
		email.addTo(to)
		email.setFrom(from)
		email.setSubject(subject)
		email.setMsg(msg)

		email.setAuthentication(username,password)

		email.setSmtpPort(port)

		println email
		email.send()
	}
}
