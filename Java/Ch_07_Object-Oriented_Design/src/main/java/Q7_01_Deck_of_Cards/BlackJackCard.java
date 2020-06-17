<<<<<<< HEAD:Java/Ch_07_Object-Oriented_Design/src/main/java/Q7_01_Deck_of_Cards/BlackJackCard.java
package Q7_01_Deck_of_Cards;

public class BlackJackCard extends Card {
	public BlackJackCard(int c, Suit s) {
		super(c, s);
	}
	
	public int value() {
		if (isAce()) { // Ace
			return 1; 
		} else if (faceValue >= 11 && faceValue <= 13) { // Face card
			return 10;
		} else { // Number card
			return faceValue;
		}
	}
	
	public int minValue() {
		if (isAce()) { // Ace
			return 1; 
		} else {
			return value();
		}
	}
	
	public int maxValue() {
		if (isAce()) { // Ace
			return 11; 
		} else {
			return value();
		}
	}
	
	public boolean isAce() { 
		return faceValue == 1;
	} 
	
	public boolean isFaceCard() {
		return faceValue >= 11 && faceValue <= 13;
	}
}
=======
package Q7_01_Deck_of_Cards;

public class BlackJackCard extends Card {
	public BlackJackCard(int c, Suit s) {
		super(c, s);
	}
	
	public int value() {
		if (isAce()) { // Ace
			return 1; 
		} else if (isFaceCard()) { // Face card
			return 10;
		} else { // Number card
			return faceValue;
		}
	}
	
	public int minValue() {
		if (isAce()) { // Ace
			return 1; 
		} else {
			return value();
		}
	}
	
	public int maxValue() {
		if (isAce()) { // Ace
			return 11; 
		} else {
			return value();
		}
	}
	
	public boolean isAce() { 
		return faceValue == 1;
	} 
	
	public boolean isFaceCard() {
		return faceValue >= 11 && faceValue <= 13;
	}
}
>>>>>>> 59018cfcb90292209275db1c4b3ed306d4b07d7f:Java/Ch 07. Object-Oriented Design/Q7_01_Deck_of_Cards/BlackJackCard.java
