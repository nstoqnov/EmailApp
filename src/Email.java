
import java.util.Scanner;

public class Email {
    
    private String firstName;
    private String lastName;
    private String password;
    private final int defaultpasslength = 10;
    private String department;
    private int mailboxCapacity = 100;
    private String alternativeEmail;
    private String email;
    
    //Constructor for Email
    public Email(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);
        
        //Call for department
        this.department=setDepartment();
        System.out.println("Department: " + this.department);
        
        //Call for random password
        this.password=setPassword(defaultpasslength);
        System.out.println("Password:" + this.password);
        
        //Call for generate email
        this.email=setEmail();
        System.out.println("Your email is succesfully generate: " + email);
        System.out.println("Your mail box capacity: " + mailboxCapacity);
    }
    
    //Method for calling department
    private String setDepartment(){
        System.out.println("CHOOSE DEPARTMENT \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter your code: ");
        Scanner in= new Scanner(System.in);
        int dep = in.nextInt();
        if (dep == 1) {return "Sales";
        }else if(dep == 2){return "Development";
        }else if (dep == 3) { return "Accounting";
        }else { return "";}
    }
    
    //Method for generating random password
    private String setPassword(int length){
        String chars = "QWERTYUIOPASDFGHJKLZXCVBNM!@#$%^&*()1234567890";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * chars.length());
            password[i] = chars.charAt(rand);
        }
        return new String(password);
    }
    //Set Email
    private String setEmail(){
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + "company.com";
        return email;
    }
    
    
    //GetName
    public String getName(){
        return this.firstName;
    }
    
    //GetEmail
    public String getEmail(){
        return email;
    }
    
    //GetMailboxCapacity
    public int getCapacity(){
        return mailboxCapacity;
    }
    //Get alternative email
    public String getAlternativeEmail(){
        return alternativeEmail;
    }
    //Get password
    public String getPassword(){
        
        return password;
    }
    
    //Set alternative email
    public void setAlternativeEmail(String alternativeEmail){
        this.alternativeEmail=alternativeEmail;
    }
    //Change password method
    public void changePassword(String password){
        System.out.println("New password: ");
        this.password=password;
    }
    
}
