

import java.util.Scanner;

public class project1 {
    public static void main(String[]args){
        try{
        Scanner arg=new Scanner(System.in);
        System.out.println(" You are in a land full of dragons.");
        System.out.println("In front of you, you see two caves.  In a cave, the dragon is friendly \n");
        System.out.println("and will share its treasure with you.  The other dragon \n");
        System.out.println("is greedy and hungry and will eat you on sight.\n");
        System.out.println(" Which cave will you go to?  (1 or 2)");
        int x= arg.nextInt();
        if (x==1){
            System.out.println("You approach the cave...");
            System.out.println("It is dark and spooky...\n");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...\n");
            System.out.println("Gobbles you down in one bite!\n");
        }}catch(Expeption e){
          System.out.println("Caught Exception: Number Format Exception");

        }

    }
}
