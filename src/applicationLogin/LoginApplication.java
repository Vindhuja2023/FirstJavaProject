package applicationLogin;
import java.util.Scanner;
public class LoginApplication {

	String userName;
	String password; 
	String savedUserName;
	String savedPassword;
	Scanner sc = new Scanner(System.in);
	void loginWithUserIdAndPassword() {
		
		int chance;
		for(chance = 1; chance<= 3; chance++) {
			System.out.println("Enter Username : ");
			userName = sc.next();
			System.out.println("Enter Password : ");
			password = sc.next();
			if(savedUserName.equals(userName)&&savedPassword.equals(password)) {
				System.out.println("You are logged in to the application. ");
				break;
			}else {
				System.out.println("Incorrect Username or password.Try again. ");
			}
		}if(chance>3) {
			System.out.println("Account locked.");
		}
	}
	
}
