import java.util.*;

public class Project2GenSpark {
    public static void main(String[]args){
      try{
          Scanner arg=new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name=arg.nextLine();

        System.out.println("Well, "+name+", I am thinking of a namber between 1 and 20.");

        for (int i=3; i>0 ;--i){
            System.out.println("Take a guss.");
            int x=arg.nextInt();
            if ((x>=10) && (x<=20)){
                System.out.println("Your guess is too high.");

            } else if ((x>1) && (x<9)){
                System.out.println("Your guess is too low.");
            }



        }

        System.out.println("Good job, "+name+"! You guessed my number in 3 guesses!");


        System.out.println("Would you like to play again? (y or n)");

        Character Y= arg.next().charAt(0);

        if(Y.equals('y')){
            for (int i=3; i>0 ;--i){
                System.out.println("Take a guss.");
                int x=arg.nextInt();
                if (x>=10 || x<=20){
                    System.out.println("Your guess is too high.");
                } else if (x>1 || x<9){
                    System.out.println("Your guess is too low.");
                }

            }
            System.out.println("Good job, "+name+"! You guessed my number in 3 guesses!");
        }catch(Exception e){
                        System.out.println("Caught Exception: Number Format Exception");

        }
          


        }

    }
}
