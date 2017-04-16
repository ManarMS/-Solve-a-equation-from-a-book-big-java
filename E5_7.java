
package homework4;

 import java.util.Scanner; 
 
public class E5_7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("please enter n1 : ");
        double n1 = input.nextDouble();
        System.out.print("please enter n2: ");
        double n2 = input.nextDouble();
        System.out.print("please enter n3 : ");
        double n3 = input.nextDouble(); 
        if ((n1 <= n2  && n2 < n3) || (n1 < n2 && n2 <= n3) || (n1 > n2 && n2 >= n3) || (n1 >= n2 && n2 > n3)) 
        { 
            System.out.println("In order"); 
        } 
        else 
        { 
            System.out.println("Not in order"); 
        } 
       
    }
        
}
  
