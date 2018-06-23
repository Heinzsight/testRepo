package com.michael.firstTry;
import java.util.Scanner;

public class Controller {

    /*

        Concatination - use the plus (+) sign

        Getting user input - use the "Scanner" class. Import the java.util.Scanner file above and initialize an object of this class as shown in
                             main function

        Arrays - simply put in order to declare an array you have to use square brackets right after tha variable type (example: int[], double[], etc.)
                 You can take a shortcut and declare/initialize an array like this int[] arr = {1, 2, 3, 4, 5}; but this only works with PRIMATIVE data types
                 link ints doubles, etc. It will not work when declaring arrays of objects...so you have to declare/initicalize it like this
                 object[] arr = new object[5];

        Enhanced for loop - used to loop through the elements of an array
                            Example: for(int t: arr) {} the way it works is you declare a variable of the same type that the array is. So if the array you want to
                            go through is an integer array you would create an int variable. In this instance I used an int variable because the arr array (I used
                            in the Array information above) is an array of ints. Then you type a colon (:) and type the name of the array you want to loop through.
                            The variable t you create in the above for loop example will contain the current index elements' value and will be accessable just in
                            for loop



    */


    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        Scanner userInput = new Scanner(System.in); //initializing a Scanner class object to get user input with the line directly below this one
        System.out.println(userInput.nextLine());


    }
}
