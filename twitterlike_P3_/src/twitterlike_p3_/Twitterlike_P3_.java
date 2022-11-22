/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterlike_p3_;
import java.util.Scanner;
/**
 *
 * @author nokolie23
 */
public class Twitterlike_P3_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        twitter bob = new twitter("bob101", "12345", "bob@gmail.com");
        String Email;
        System.out.println("--------WELCOME TWITTER V0.01--------");
        
        System.out.println("Please Enter your Email...");
        Email = in.nextLine();
        
        if(!Email.equals(bob.getemail()))
        {
            System.out.println("email mismatch...");
            System.out.println("We see you are a new user");
            System.out.println("What is your preferred name?");
                //  String U = in.nextLine();
            bob.setname(in.nextLine());
            System.out.println("What is your email?");
            bob.setemail(in.nextLine());
            System.out.println("What is your password?");
            bob.setpassword(in.nextLine());   
        }
        int choice = -1;
        
        while(choice != 6)
        {
            System.out.println("1. Create a Tweet");
            System.out.println("2. Display Tweets");
            System.out.println("3. Change Username");
            System.out.println("4. Change Email");
            System.out.println("5. Change Password");
            System.out.println("6. Exit");
            choice = in.nextInt();
            in.nextLine();
            
            if(choice == 1)
            {
                System.out.println("Please enter your tweet: ");
                bob.settweets(in.nextLine());
                System.out.println("----TWEETS----");
                System.out.println(bob.gettweets());
            }
            if(choice == 2)
            {
                System.out.println("----" + bob.getname() + "----");
                System.out.println(bob.gettweets());
            }
            if(choice == 3)
            {
                System.out.println("What is your current username?");
                String name2 = in.nextLine();
                System.out.println("What is your current password?");
                String username_password = in.nextLine();
                if(name2.equals(bob.getname()) && username_password.equals(bob.getpassword()))
                {
                    System.out.println("What would you like to change your username to?");
                    bob.setname(in.nextLine());
                    System.out.println("Your username is now " + bob.getname());
                }
                else
                {
                    System.out.println("Incorrect username or password, please try again");
                    System.out.println("What is your current username?");
                    bob.setname(in.nextLine());
                    System.out.println("What is your current password?");
                    bob.setpassword(in.nextLine());
                }
                
            }
            if(choice == 4)
            {
                System.out.println("What is your current email?");
                String email2 = in.nextLine();
                System.out.println("What is your current password?");
                String email_password = in.nextLine();
                if(email2.equals(bob.getemail()) && email_password.equals(bob.getpassword()))
                {
                    System.out.println("What would you like to change your email to?");
                    bob.setemail(in.nextLine());
                    System.out.println("Your email is now " + bob.getemail());
                }
                else
                {
                    System.out.println("Incorrect email or password, please try again");
                    System.out.println("What is your current email?");
                    bob.setemail(in.nextLine());
                    System.out.println("What is your current password?");
                    bob.setpassword(in.nextLine());
                }
            }
            
            if(choice == 5)
            {
                System.out.println("What is your current password?");
                String password2 = in.nextLine();
                if(password2.equals(bob.getpassword()))
                {
                    System.out.println("What would you like to change your password to?");
                    bob.setpassword(in.nextLine());
                    System.out.println("Your password is now " + bob.getpassword());
                }
                else
                {
                    System.out.println("Incorrect password, please try again");
                    System.out.println("What is your current password?");
                    bob.setpassword(in.nextLine());
                }
            }
        }
    }    
}
