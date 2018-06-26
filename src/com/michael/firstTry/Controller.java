package com.michael.firstTry;
import java.util.Scanner;
import com.michael.firstTry.Animal; //the online training said this is needed in order to use the Animal class in this case but it doesn't look like it's used

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

        Security designations -

                a. Private - means that the variable can only be accessed by the methods of the class it's included in
                b. Protected - only subclasses can access them
                c. Public - making the class public means that it can be access by any class.
                d. Default - (only used for classes and it is done by not assigning any of the security keywords to the class...so leave it blank)
                              If I were to leave it blank the class would only be accessable to the classes inside it's package. (remember the standard
                              file structure for java is project name > package > class)

       Hash Map - Stores information as key and value pairs. You can use these commands to manipulate the information held in a hash map:
                a. put - adds information to the hash
                b. remove - removes information from the hash
                c. get - retrieves the information from the hash based off of a value you are trying to find
                Note: if you try and put a value or a key value into a hash that is already included in the hast...that new key or value for the key
                will be overridden!
                d. containsKey - will help you determine if there is already that key value in the hash
                e. containsValue - will help you determine if there is already that Value for the key in the hash

       static - when a variable is declared static that means it will only be created once no matter how many objects of the class (instances) are
                created. So if say you declared a variable called count in a class and used the static keyword, all the objects that are made from
                that class will SHARE that count variable and its value

       final - makes a variable so it can only be assigned a value once (like const in c++). If someone was to try and change the value of that
               variable there would be an error.

       super - this keyword is how you access variables from the parent class

        Topics:

        Encapsulation - (data hiding) it ensures the implementation details are hidden from users. It does this by making one class' variables
                        only accessable by that class' methods

        Inheritance - use the "extends" keyword to make a class (the derived or sub-class) inherit the properties of another class (the parent class)
                      like this... class Dog extends Animal { some code }

        Polymorphism - being able to create one method in the parent class and have multiple different implementations of that method in the derived
                       classes

        Overriding - when a method in a subclass is used in place of what the method does in the parent class. Some rules for overriding:

            a. The overriding method should have the same return type AND the same arguments of the method it overrides
            b. The overriding method can only be the same access level the overriden function has. (so if the parent class' method is made public,
               the subclass' method has to be public...it can't be private or protected
            c. A method that is declared final or static can't be overwritten
            d. Constructors can't be overridden

        Overloading - using a method with the same name as another method, but it uses different parameters

        Abstraction - representing essential features without implementation details. You use the keyword "abstract" when making a class or method
                      abstract. You can't instantiate an abstract class...meaning you can't create and object of that class. For example, Animal is
                      a perfect example of an abstract class, because we could call the Animal class abstract and every subclass of animal (dog, cat,
                      bird, etc.) would HAVE to inherit the methods of the abstract Animal class. Also, note that an abstract method, is a method
                      that is declared without any implementation. Like this... abstract void walk(); There is no code to say how the class walks

        Interfaces - Used by using the keyword "interface" and what they are is, they are completely abstract classes that contain ONLY abstract methods...
                     so no variables at all...just methods. Also, those methods are all implicitly public. Example of an interface:

                     interface Habits
                     {
                        public void eat();
                        public void makeSound();
                     }

                     You don't use the abstract keyword when declaring an interface or it's methods (so don't use the abstract keyword at all with interfaces
                     as they are implicitly abstract). They are useful because in Java a class can only inherit from one super class but can implement multiple
                     interfaces! To have your class implement (be able to use) the methods in the interface, use the "implements" keyword like this...
                     class Dog implements Habits {}. When you implement an interface you have to use (override) all of the interface's methods.

         Type Casting - Place the type of variable you want to cast your information to in front of what you are trying to change. Example:
                        int a = (int) 3.14   this is casting 3.14 to an integer and then storing it in an int variable named "a".

         Upcasting - Is automatic (because it can't fail). Example assumes Cat is a subclass of the Animal class: Animal a = new Cat(); So this is trying
                     to make an Animal into a Cat, which is possible since a cat is a subclass to animal.

         Downcasting - Has to be done manually (because it could fail). Example:
                       Animal a = new Animal();
                       (Cat)a).makeSound();

                       This could fail because every Animal, may not be a cat...it could be a dog or horse or bird. So this could fail.

         @Override - Can be used to override a method on the fly. If there is a method in the class or parent class of your object you can use the "@Override
                     " keyword to override what a certain function does in the acutal code. (I assume you shouldn't use this much).

         Nesting classes - You can have a class in a class. Example:
                           class Robot //This is the main class
                           {
                                  int id;
                                  Robot(int i)
                                  {
                                    id = i;
                                    Brain b = new Brain();
                                    b.think();
                                  }

                                  private class Brain //This is the nested class and it can access everything inside the Robot class
                                  {
                                    public void think()
                                    {
                                      System.out.println(id + " is thinking");
                                    }
                                  }

                            }

    */


    public static void main(String[] args)
    {
        /*System.out.println("Hello World!");

        Scanner userInput = new Scanner(System.in); //initializing a Scanner class object to get user input with the line directly below this one
        System.out.println(userInput.nextLine());

        Animal dog = new Animal(3, 75, "McGee", "Labrador Retriever");
        System.out.println(dog.getName() + " is a " + dog.getBreed() +  " that is " +dog.getHeight() + " feet tall and " + dog.getWeight() + "lbs!");*/


        //Rounding Numbers in Java to a specific decimal place...it isn't easy ^
        double number = 3.14159265358979;
        double numberRounded = Math.round(number * 100) / 100.0; //rounding to 2 decimal places
        //double numberRounded = Math.round(number * 1000) / 1000.0; //Rounding to 3 decimal places
        //double numberRounded = Math.round(number * 10000) / 10000.0; //Rounding to 4 decimal places
        //double numberRounded = Math.round(number * 10000) / 100000.0; //Rounding to 5 decimal places and so on

        System.out.println(numberRounded);

        /* To round numbers you can use the Math.round() function which (you don't have to
         import the Math file by the way) will round a number to the nearest WHOLE integer.
         If you want to round to a specific number of decimal places you can use the
         Math.round function and INSIDE the parenthesis multiply the number by 100 and then
         OUTSIDE the parenthesis divide that number by 100.0! The point 0 is important!
         If you were to run this same code but without the .0 on the end of the 100 being
         divided into the variable you'd get 3.0 and not your desired 3.14! */

        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


    }
}
