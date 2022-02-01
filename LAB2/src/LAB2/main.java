package LAB2;
import java.util.Scanner;


public class main {
    public main() {

    }//end fn

    public static void main(String[] args) {
        System.out.print( "Please enter your value : " );
            int n;
            int c = 5 ;
            Scanner scanf = new Scanner(System.in);
            n = scanf.nextInt();

        System.out.print(" ");
        System.out.println("-----------------------");

        for ( int i = 1 ; i <= n ; i++){
            if(i == n) {
                System.out.print(i);

            }else {
                if(i == c) {
                    System.out.print(i);
                    System.out.println();
                    c = c + 5 ;
                }else {
                    System.out.print(i + ",");
                }
            }
        }

    }

}
			
		


