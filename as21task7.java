import java.util.Scanner;

class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    	String username = input.nextLine();
        signIn(username);
    }

    public static void signIn(String username) {
    	if ("user".equals(username.trim())) { 
            return;
    	}
        else {
    		System.out.println("Welcome " + username);
            System.out.println("Missed you very much, " + username);
	    }
    }
}

