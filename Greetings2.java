import java.util.Scanner;

/**
 * In class assignment
 *
 * @author: Matthew Lu
 * @version: 8/22/18
 * @author Period: 4
 * @author Assignment: JMCh02_Hello - Greetings2.java
 *
 * @author Sources: none
 */
public class Greetings2
{
    public static void main( String[] args )
    {
        Scanner kboard = new Scanner( System.in );
        System.out.print( "Enter your first name: " );
        String firstName = kboard.nextLine();
        System.out.print( "Enter your last name: " );
        String lastName = kboard.nextLine();
        System.out.println( "Hello, " + firstName + " " + lastName );
        System.out.println( "Welcome to Java!" );
    }
}
 