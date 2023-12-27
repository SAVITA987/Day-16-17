package algorithms;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;

	public class MessageCustomizer {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the message:");
	        String message = scanner.nextLine();
	        String modifiedMessage = customizeMessage(message);
	        System.out.println("Modified Message:");
	        System.out.println(modifiedMessage);
	    }

	    private static String customizeMessage(String message) {
	        String currentDate = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
	        message = message.replaceAll("<<name>>", "savita"); 
	        message = message.replaceAll("<<full name>>", "savita tekale"); 
	        message = message.replaceAll("91-xxxxxxxxxx", "91-9876578610"); 
	        message = message.replaceAll("\\d{2}/\\d{2}/\\d{4}", currentDate); 
	        return message;
	    }
	}

