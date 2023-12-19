package com.example.spring2023.extern;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Класс отвечает за автоматизацию работы с почтой
 * */
public class EmailService {

    /**
     * Метод отвечает за отправку электронного письма
     * */
    public void sendEmail(String to, String subject, String body) {

        Properties props = new Properties();
        Session session = Session.getInstance(props, null);

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("from@example.com"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
            msg.setSubject(subject);
            msg.setText(body);
            Transport.send(msg);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод отвечает за получение электронного письма
     * */
    public void receiveEmail(String login, String password) {
        Properties properties = new Properties();
        properties.setProperty("mail.store.protocol", "imaps");
        try {
            Session session = Session.getInstance(properties, null);
            Store store = session.getStore();
            store.connect("imap.gmail.com", login, password);
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);
            Message[] messages = inbox.getMessages();
            for (Message message : messages) {
                // обработка полученных писем
                String from = InternetAddress.toString(message.getFrom());
                String subject = message.getSubject();
                //мб добавить другие действия с письмом
            }
            inbox.close(false);
            store.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}