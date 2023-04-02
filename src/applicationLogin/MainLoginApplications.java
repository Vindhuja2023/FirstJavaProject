package applicationLogin;

public class MainLoginApplications {

	public static void main(String[] args) {
		LoginApplication application = new LoginApplication();
		application.savedUserName = "pivotAdmin";
		application.savedPassword = "Admin123";
		application.loginWithUserIdAndPassword();
	}

}
