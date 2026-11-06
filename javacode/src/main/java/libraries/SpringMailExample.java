package libraries;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class SpringMailExample {

    private final JavaMailSender mailSender;

    public SpringMailExample(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendSimpleEmail(String from, String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }

    public static void main(String[] args) {
        String host = requiredEnvironmentVariable("SMTP_HOST");
        String from = requiredEnvironmentVariable("MAIL_FROM");
        String to = requiredEnvironmentVariable("MAIL_TO");

        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(host);
        sender.setPort(Integer.parseInt(
                System.getenv().getOrDefault("SMTP_PORT", "587")));
        sender.setUsername(System.getenv("SMTP_USERNAME"));
        sender.setPassword(System.getenv("SMTP_PASSWORD"));

        Properties mailProperties = sender.getJavaMailProperties();
        mailProperties.put("mail.smtp.auth", "true");
        mailProperties.put("mail.smtp.starttls.enable", "true");

        new SpringMailExample(sender).sendSimpleEmail(
                from, to, "Spring mail example", "This is a test email.");
    }

    private static String requiredEnvironmentVariable(String name) {
        String value = System.getenv(name);
        if (value == null || value.isBlank()) {
            throw new IllegalStateException("Set the " + name + " environment variable.");
        }
        return value;
    }
}
