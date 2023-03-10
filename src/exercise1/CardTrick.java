package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 * @author Gabriela Moniz Feb 1, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < hand.length; i++) {
            hand[i] = new Card();
            hand[i].setSuit(Card.SUITS[random.nextInt(4)]);
            hand[i].setValue(random.nextInt(13)+1);
            hand[i].printInfo();
            
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        System.out.println("Pick a card");
        System.out.print("Suit:");
        String pickedSuit = scanner.nextLine();
        
        System.out.print("Value:");
        int pickedValue = scanner.nextInt();
        
        boolean found = false;
        for(int i = 0; i < hand.length; i++){
            if(hand[i].getSuit().equals(pickedSuit)&& hand[i].getValue()== 
                    pickedValue){
                found = true;
                hand[i].printInfo();
                break;
            }
        }
            if(!found){
                System.out.println("Card not found in the hand");
            }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, print System.out.println("Congratulations, you guessed right!");.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     * @author Gabriela Moniz Feb 1, 2023
     */
    private static void printInfo() {
    
        System.out.println("I'm done!");
        System.out.println();
        
        System.out.println("Hi, my name is Gabriela");
        System.out.println("I love cats");
	System.out.println("I have a travel blog");
        
        System.out.println("My career ambitions:");
        System.out.println("-- Find a good job after I graduate");
        System.out.println();
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Travelling");
        System.out.println("-- Travel with my husband and kids");
        System.out.println("-- Cooking");
        System.out.println();

        System.out.println();
        
    
    }

}
