/**
* CS110: Introduction to Computing
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS110-2015S
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs110.hw03.q02;

import java.util.Scanner;

public class DeckShuffle {
	public static void main(String[] args) {
		int i, j; // loop counter
		int temp; // for swapping variables

		Scanner input = new Scanner(System.in);
		System.out.print("How many deck of cards? ");
		int numDecks = input.nextInt();
		input.close();

		int numCards = numDecks * 52;
		int[] cards = new int[numCards];
		// initialize array of cards by sorting all decks
		for (i = 0; i < numDecks; i++) {
			for (j = 0; j < 52; j++) {
				cards[52*i+j] = j+1;
			}
		}
		// shuffling decks using Algorithm P by Durstenfeld and Knuth (1964)
		// inspired by Fisher-Yates (1938) shuffle algorithm
		for (i = 0; i < numCards; i ++) {
			// generate a random number between i<= and <n
			// for efficiency, it was better to use Random class
			j = (int) (i + (numCards-i)*Math.random()) ;
			// exchange a[j] and a[i]
			temp = cards[j];
			cards[j] = cards[i];
			cards[i] = temp;
		}
		// defining values and suits as array of strings
		String[] cardNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Soldier", "Queen", "King"};
		String[] cardSuits = {"Hearts", "Clubs", "Spades", "Diamonds"};

		String suit; // suit of the card
		String name; // value of the card
		// printing names of shuffled cards
		for (i = 0; i < numCards; i ++) {
			name = cardNames[ (cards[i]-1) % 13 ];
			suit = cardSuits[ (int) ((cards[i]-1) / 13) ];
			System.out.println(name + " of " + suit);
		}
	}
}
