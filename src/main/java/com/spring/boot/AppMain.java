package com.spring.boot;

import java.io.File;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class AppMain {
	public static void main(String[] args) throws MessagingException {
		
		System.out.println("preparing to send message ...");
		String message = "<html>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"<h1>My First Heading</h1>\r\n" + 
				"<p>My first paragraph.</p>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>";
		String subject = "CodersArea : Confirmation";
		String to = "vishalbagde.mmm@gmail.com";
		String from = "vishalbagde.mail@gmail.com";
		
		
		sendEmail(message,subject,to,from);

	}
	//this is responsible to send email..
		private static void sendEmail(String message, String subject, String to, String from) throws MessagingException {
			
			//Variable for gmail
			String host="smtp.gmail.com";
			
			//get the system properties
			Properties properties = System.getProperties();
			System.out.println("PROPERTIES "+properties);
			
			//setting important information to properties object
			
			//host set
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port","465");
			properties.put("mail.smtp.ssl.enable","true");
			properties.put("mail.smtp.auth","true");
			
			//Step 1: to get the session object..
			Session session=Session.getInstance(properties,new Authenticator() {
				@Override
				protected PasswordAuthentication getPasswordAuthentication() {				
					return new PasswordAuthentication("vba.axelor@gmail.com", "bagde@123");
				}
				
				
				
			});
			
			session.setDebug(true);
			
			//Step 2 : compose the message [text,multi media]
			MimeMessage m = new MimeMessage(session);
			//m.setContent(message,"text/html" );  
			
			
			//file path
			String path="C:\\Users\\vishal\\Desktop\\rmerror.jpg";
			
			
			MimeMultipart mimeMultipart = new MimeMultipart();
			//text
			//file
			
			MimeBodyPart textMime = new MimeBodyPart();
			
			MimeBodyPart fileMime = new MimeBodyPart();
			
			try {
				

				textMime.setContent(message,"text/html");
				
				File file=new File(path);
				fileMime.attachFile(file);
				
				
				mimeMultipart.addBodyPart(textMime);
				mimeMultipart.addBodyPart(fileMime);
			
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			
			m.setContent(mimeMultipart,"text/html" ); 
			
			
			try {
			
			//from email
			m.setFrom(from);
			
			//adding recipient to message
			m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//adding subject to message
			m.setSubject(subject);
		
			
			//adding text to message
			//m.setText(message);
			
			//send 
			
			//Step 3 : send the message using Transport class
			Transport.send(m);
			
			System.out.println("Sent success...................");
			
			
			}catch (Exception e) {
				e.printStackTrace();
			}
				
		}

}
