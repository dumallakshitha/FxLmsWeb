package com.dls.common;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class EmailUtility {

	
	public static String sendEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException, MessagingException {
		
	
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);

      
        try {
			Authenticator auth = new Authenticator() {
				public PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(userName, password);
				}
			};
			Session session = Session.getInstance(properties, auth);
			Message msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(userName));
			InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
			msg.setRecipients(Message.RecipientType.TO, toAddresses);
			msg.setSubject(subject);
			msg.setSentDate(new Date());
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(message, "text/html");
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			// sets the multi-part as e-mail's content
			msg.setContent(multipart);
			// sends the e-mail
			Transport.send(msg);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
        
        
        
	}

	
	/*
	
		void sendMail(String number) {
        String host = "";
        // String host = "smtp.gmail.com";
        // String host = "smtp.mail.yahoo.com";
        String port = "587";
       
        String mailFrom = findComMail();//ube mail eka
        String password = findPass(mailFrom);//ube password eka
        if (mailFrom.toLowerCase().contains("gmail.com")) {
            host = "smtp.gmail.com";
        } else {
            host = "smtp.mail.yahoo.com";
        }
       

        String mailTo = findStdEmail(number);//send karana mail eka
        // String subject = "New email with attachments";
        String subject = number;
        String message = "Dear " + findStdName(number) + "<br><br>"
                + "Please find attached the certificate. Please provide us with your correct mail address to courier this certificate.<br><br>"
                + "Thanks.<br><br>"
                + "Best regards,<br><br>"
                + "Registry Team";

        // attachments ... if dont need comment it ;)
        String[] attachFiles = new String[1];
        attachFiles[0] = "D:/gimpc/scan/" + number + ".jpg";
       

        try {
            sendEmailWithAttachments(host, port, mailFrom, password, mailTo,
                    subject, message, attachFiles);
            System.out.println("Email sent.");
        } catch (Exception ex) {
            System.out.println("Could not send email.");
            JOptionPane.showMessageDialog(rootPane, "error 3 " + ex);
            ex.printStackTrace();
        }
    }

    public static void sendEmailWithAttachments(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message, String[] attachFiles)
            throws AddressException, MessagingException {
       
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.user", userName);
        properties.put("mail.password", password);

      
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(userName, password);
            }
        };
        Session session = Session.getInstance(properties, auth);

    
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = {new InternetAddress(toAddress)};
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());

  
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent(message, "text/html");


        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

 
        if (attachFiles != null && attachFiles.length > 0) {
            for (String filePath : attachFiles) {
                MimeBodyPart attachPart = new MimeBodyPart();

                try {
                    attachPart.attachFile(filePath);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "error 5" + ex);
                    ex.printStackTrace();
                }

                multipart.addBodyPart(attachPart);
            }
        }

        // sets the multi-part as e-mail's content
        msg.setContent(multipart);

        // sends the e-mail
        Transport.send(msg);

    }
			
			
	*/		
	
    
}
