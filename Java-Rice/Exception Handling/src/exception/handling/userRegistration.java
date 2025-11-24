package exception.handling;

import java.util.Scanner;

public class userRegistration {
    Scanner sc = new Scanner(System.in);


    public void register(){
        try{
            System.out.print("Input username: ");
            String username = sc.nextLine();

            if(username.length() < 5){
                throw new UsernameTooShortException("Username must be at least 6 characters long.");
            }

            System.out.print("Input password: ");
            String password = sc.nextLine();

            if(password.length() < 8){
                throw new WeakPasswordException("Password must be atleast 8 characters");
            }

            boolean hasDigit = false;
            for(int i = 0; i < password.length(); i++){
                if(Character.isDigit(password.charAt(i))){
                    hasDigit = true;
                    break;
                }
            }

            if(!hasDigit){
                throw new WeakPasswordException("Password must contain at least one digit.");
            }

        } catch(UsernameTooShortException | WeakPasswordException e){
            System.out.println("Registration Error: " + e.getMessage());
        } catch(Exception e){
            System.out.println("Unexpected Error: " + e.getMessage());
        }


    }
}
