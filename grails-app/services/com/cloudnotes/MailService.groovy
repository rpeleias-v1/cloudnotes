package com.cloudnotes

import org.apache.commons.mail.SimpleEmail

class MailService {

	boolean transaction = false

    String host= "smtp.gmail.com"
	String username = "mycloudnotes.rpeleias@gmail.com"
	String password = "cloudnotes123"
	String from = "mycloudnotes.rpeleias@gmail.com"
	Integer port = 465
	 
	def send(String subject, String msg, String to) {
		SimpleEmail email = new SimpleEmail()
		email.with {
			setHostName(host)
			addTo(to)
			setFrom(from)
			setSubject(subject)
			setMsg(msg)
			setSSL(true)
			setTLS(true);
			setAuthentication(username,password)
			setSmtpPort(port)
			send()
		}		
	}
}
