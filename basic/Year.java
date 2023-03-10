import java.util.Scanner;

public class Year {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        
        
        int count=0;
        while (count != 5)
        
        {
 
            n = n + 1;
            
 
            if ((n % 400 == 0)
                || (n % 4 == 0 && n % 100 != 0)) {
 
                
                count++;
 
                
                System.out.println(n);
                }
            }       
    }
}
