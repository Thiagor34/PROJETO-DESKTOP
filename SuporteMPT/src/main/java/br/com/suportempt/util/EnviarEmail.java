package br.com.suportempt.util;

import br.com.suportempt.entidade.Chamado;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EnviarEmail {
    
    public static void enviarMensagem(Chamado chamado){
        Properties props = new Properties();
        /** Parâmetros de conexão com servidor Hotmail */
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.host", "smtp.office365.com");
        props.put("mail.smtp.socketFactory.port", "587");
        props.put("mail.smtp.socketFactory.fallback", "false");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "587");
        Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {
                         @Override
                         protected PasswordAuthentication getPasswordAuthentication() 
                         {
                               return new PasswordAuthentication("suporte_mpt@hotmail.com", "Senac2021");
                         }
                    });
        session.setDebug(true);

        try {

              Message message = new MimeMessage(session);
              message.setFrom(new InternetAddress("suporte_mpt@hotmail.com")); //Remetente

              message.setRecipients(Message.RecipientType.TO, 
                                InternetAddress.parse("suporte_mpt@hotmail.com")); //Destinatário(s)
              message.setSubject("Novo chamado cadastrado!");//Assunto
              message.setText("Chamado de número " + chamado.getId() + " criado no sistema!");
              Transport.send(message);

              System.out.println("Feito!!!");

         } catch (MessagingException e) {
              throw new RuntimeException(e);
        }
    }
}
