import java.util.*;
  
public class sq{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number to find its square root: ");         
    int number = sc.nextInt();

    float out;
    float sqrt = number / 2;

    do {
		out = sqrt;
		sqrt = (out + (number / out)) / 2;
	} while ((out - sqrt) != 0);
 
	System.out.println("The square root is:"+sqrt);
    }   
    }
