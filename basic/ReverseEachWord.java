import java.util.Scanner;
public class ReverseEachWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string which needs to be reversed: ");
        String input=sc.nextLine();
        String output=returnReverseString(input) ;
        System.out.println(output);
        sc.close();
    }    
    public static String returnReverseString(String s){
        String words[]=s.split("\\s");  
      
        String output = "";
        for (int i = 0; i < words.length; i++) {
            String reverseWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverseWord += words[i].charAt(j);
            }
            output += reverseWord + " ";
        }
        return output;
    }
}
