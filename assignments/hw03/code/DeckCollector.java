// package deckOfCards;
//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS110: Introduction to Computing
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.Arrays;
public class DeckCollector {
	public static void printCardNames(int[] cards) {
		String[] cardNames = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Soldier", "Queen", "King"};
		String[] cardSuits = {"Hearts", "Clubs", "Spades", "Diamonds"};
		String suit; // suit of the card
		String name; // value of the card
		for (int i = 0; i < cards.length; i ++) {
 			System.out.print((i+1) + ": ");
 			System.out.print( cards[i] + ": ");
 			name = cardNames[ (cards[i]-1) % 13 ];
 			suit = cardSuits[ (int) ((cards[i]-1) / 13) ];
 			System.out.println(name + " of " + suit);
 		}
	}
	public static int[] shuffleDeck(int numDecks) {
		int i, j; // loop counter
		int temp; // for swapping variables

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
		return cards;
	}
	public static void main(String[] args) {
		int i;
		int numDecks = 5;
		int[] cards = shuffleDeck(numDecks);

		// PART (a)
		// Finding number of cards to reveal to get 1 card of each suit
		boolean[] suitDesired = new boolean[4];
		Arrays.fill(suitDesired,true);
		boolean[] suitChecker = new boolean[4];
		Arrays.fill(suitChecker, false);

		i = 0;
		while (!Arrays.equals(suitChecker, suitDesired)) {
			suitChecker [ (int) ((cards[i]-1) / 13) ] = true;
			i++;
		}
		System.out.println("It took " + i + " cards to get one card of each suit.");

		// PART (b)
		// Finding number of cards to reveal to get 1 card of each value
		boolean[] valueDesired = new boolean[13];
		Arrays.fill(valueDesired,true);
		boolean[] valueChecker = new boolean[13];
		Arrays.fill(valueChecker, false);

		i = 0;
		while (!Arrays.equals(valueChecker, valueDesired)) {
			valueChecker [ (cards[i]-1) % 13 ] = true;
			i++;
		}
		System.out.println("It took " + i + " cards to get one card of each value.");

		// PART (c)
		// Finding number of cards to reveal to get all 13 values of suit Hearts
		// uncomment following line if previous PARTs removed
		// boolean[] valueDesired = new boolean[13];
		Arrays.fill(valueDesired,true); // only to avoid dependency of different sections
		// uncomment following line if previous PARTs removed
		// boolean[] valueChecker = new boolean[13];
		Arrays.fill(valueChecker, false); // this is really necessary

		int suitNum;
		i = 0;
		while (!Arrays.equals(valueChecker, valueDesired)) {
			suitNum = (int) ((cards[i]-1) / 13);
			if (suitNum == 0)
				valueChecker [ (cards[i]-1) % 13 ] = true;
			i++;
		}
		System.out.println("It took " + i + " cards to get all 13 values of suit Hearts.");

		// PART (d)
		// Finding number of cards to reveal to get all cards of suit Hearts in all decks

		// uncomment following line if previous PARTs removed
		// int suitNum;
		int countHearts = 0;
		i = 0;
		while(countHearts != 13*numDecks) {
			suitNum = (int) ((cards[i]-1) / 13);
			if (suitNum == 0)
				countHearts++;
			i++;
		}
		System.out.println("It took " + i + " cards to get all cards of suit Hearts in all decks.");

		// PART (e)
		// Finding number of cards to reveal to get a standard 52-card deck

		boolean[] statusIdeal = new boolean[52];
		Arrays.fill(statusIdeal, true);
		boolean[] statusCurrent = new boolean[52];
		Arrays.fill(statusCurrent, false);
		i = 0;
		while (!Arrays.equals(statusIdeal, statusCurrent)) {
			statusCurrent [ (cards[i]-1) % 52 ] = true;
			i++;
		}
		System.out.println("It took " + i + " cards to get a standard 52-card deck.");

		//uncomment following to print name of cards
		//printCardNames(cards);
	}
}
