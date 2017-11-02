
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
   Email em1 = new Email("Nikolai", "Stoyanov");
   
   em1.changePassword(in.next());
   
        System.out.println(em1.getPassword());
   
 }
    
}
