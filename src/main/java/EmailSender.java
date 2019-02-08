
public class EmailSender {
	
	public static void main(String[] args) {
		
		final String fromEmail = "email@email.com.br";
		final String password = "***********";
		final String toEmail = "email2@email.com.br";
		
		System.out.println("Initializing email send");
		
		EmailConfig config = new EmailConfig();
		
		config.sendEmail(fromEmail, password, toEmail, "Subject", "Email Body");
	}
}
