/*
 * Frank Stalteri
 * CSC 236
 * Lab 4
 */
public class MorseCode {

	String [] morse;
	BinarySearchTree<Character> tree;
	
	// creates array and tree
	MorseCode(String [] morse, BinarySearchTree<Character> tree) {
		
		this.morse = morse; // holds the morse code array
		this.tree = tree;	// holds the created morse code tree
	
	}
	// turns message into morse code by calling helper method that holds the bulk
	public String encode(String message) {
		// will hold encoded message
		String encode = "";
		
		encode = encodeWork(message);
		
		return encode;
	}
	// turns morse code into English
	public String decode(String code, BinarySearchTree<Character> tree) {
		
		// will hold decoded message
		String decode = decodeWork(code, tree);
		
		return decode;
	}
	// does the work to encode the message entered by the user
	private String encodeWork(String message) {
		String wordEncode = "";
		
		char[] letters = message.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 'A') {
				//System.out.print(morse[0] + " ");
				wordEncode += morse[0] + " ";
			}
			else if (letters[i] == 'B') {
				//System.out.print(morse[1] + " ");
				wordEncode += morse[1] + " ";
			}
			else if (letters[i] == 'C') {
				//System.out.print(morse[2] + " ");
				wordEncode += morse[2] + " ";
			}
			else if (letters[i] == 'D') {
				//System.out.print(morse[3] + " ");
				wordEncode += morse[3] + " ";
			}
			else if (letters[i] == 'E') {
				//System.out.print(morse[4] + " ");
				wordEncode += morse[4] + " ";
			}
			else if (letters[i] == 'F') {
				//System.out.print(morse[5] + " ");
				wordEncode += morse[5] + " ";
			}
			else if (letters[i] == 'G') {
				//System.out.print(morse[6] + " ");
				wordEncode += morse[6] + " ";
			}
			else if (letters[i] == 'H') {
				//System.out.print(morse[7] + " ");
				wordEncode += morse[7] + " ";
			}
			else if (letters[i] == 'I') {
				//System.out.print(morse[8] + " ");
				wordEncode += morse[8] + " ";
			}
			else if (letters[i] == 'J') {
				//System.out.print(morse[9] + " ");
				wordEncode += morse[9] + " ";
			}
			else if (letters[i] == 'K') {
				//System.out.print(morse[10] + " ");
				wordEncode += morse[10] + " ";
			}
			else if (letters[i] == 'L') {
				//System.out.print(morse[11] + " ");
				wordEncode += morse[11] + " ";
			}
			else if (letters[i] == 'M') {
				//System.out.print(morse[12] + " ");
				wordEncode += morse[12] + " ";
			}
			else if (letters[i] == 'N') {
				//System.out.print(morse[13] + " ");
				wordEncode += morse[13] + " ";
			}
			else if (letters[i] == 'O') {
				//System.out.print(morse[14] + " ");
				wordEncode += morse[14] + " ";
			}
			else if (letters[i] == 'P') {
				//System.out.print(morse[15] + " ");
				wordEncode += morse[15] + " ";
			}
			else if (letters[i] == 'Q') {
				//System.out.print(morse[16] + " ");
				wordEncode += morse[16] + " ";
			}
			else if (letters[i] == 'R') {
				//System.out.print(morse[17] + " ");
				wordEncode += morse[17] + " ";
			}
			else if (letters[i] == 'S') {
				//System.out.print(morse[18] + " ");
				wordEncode += morse[18] + " ";
			}
			else if (letters[i] == 'T') {
				//System.out.print(morse[19] + " ");
				wordEncode += morse[19] + " ";
			}
			else if (letters[i] == 'U') {
				//System.out.print(morse[20] + " ");
				wordEncode += morse[20] + " ";
			}
			else if (letters[i] == 'V') {
				//System.out.print(morse[21] + " ");
				wordEncode += morse[21] + " ";
			}
			else if (letters[i] == 'W') {
				//System.out.print(morse[22] + " ");
				wordEncode += morse[22] + " ";
			}
			else if (letters[i] == 'X') {
				//System.out.print(morse[23] + " ");
				wordEncode += morse[23] + " ";
			}
			else if (letters[i] == 'Y') {
				//System.out.print(morse[24] + " ");
				wordEncode += morse[24] + " ";
			}
			else if (letters[i] == 'Z') {
				//System.out.print(morse[25] + " ");
				wordEncode += morse[25] + " ";
			}
			else if (letters[i] == ' ') {
				wordEncode += "# ";
			}
		}
		// the finished encrypted message is returned
		return wordEncode;
	}
	// calls uncode method to do the work
	private String decodeWork(String code, BinarySearchTree<Character> tree) {
		
		String message = tree.uncode(code, tree.root);
		
		return message;
	}
}
