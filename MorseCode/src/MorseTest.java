/*
 * Frank Stalteri
 * CSC 236
 * Lab 4
 */
import java.util.Scanner;
public class MorseTest {

	public static void main(String[] args) {
		// create scanner and tree
		Scanner kb = new Scanner(System.in);
		BinarySearchTree<Character> tree = buildTree();
		String [] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		
		// make object to hold the array and built tree
		MorseCode build = new MorseCode(morse, tree);
		
		// create menu and prompt user
		System.out.println("What would you like to do?");
		System.out.println("1: Enter String.");
		System.out.println("2: Enter Morse Code.");
		System.out.println("3: Exit.");
		int choice = kb.nextInt();
		
		// while the user doesn't exit
		while (choice != 3) {
			if (choice == 1) {
				// clear buffer
				kb.nextLine();
				
				System.out.println("Enter string now.");
				String message = kb.nextLine().toUpperCase();
				
				System.out.println(build.encode(message));
			}
			else if (choice == 2) {
				// clear buffer
				kb.nextLine();
				
				System.out.println("Enter morse code now.");
				String code = kb.nextLine();
				
				System.out.println(build.decode(code, tree));
			}
			// reprompt for menu choice
			System.out.println("Enter new choice.");
			choice = kb.nextInt();
			
		} // end while loop
		
		System.out.println("Exit Complete.");
		kb.close();
	}
	// builds the tree
	public static BinarySearchTree<Character> buildTree() {
		
		// create the tree with BSTNode class
		BSTNode<Character> root = new BSTNode<Character>(' ');
		BSTNode<Character> E = new BSTNode<Character>('E');
		BSTNode<Character> T = new BSTNode<Character>('T');
		BSTNode<Character> I = new BSTNode<Character>('I');
		BSTNode<Character> A = new BSTNode<Character>('A');
		BSTNode<Character> N = new BSTNode<Character>('N');
		BSTNode<Character> M = new BSTNode<Character>('M');
		BSTNode<Character> S = new BSTNode<Character>('S');
		BSTNode<Character> U = new BSTNode<Character>('U');
		BSTNode<Character> R = new BSTNode<Character>('R');
		BSTNode<Character> W = new BSTNode<Character>('W');
		BSTNode<Character> D = new BSTNode<Character>('D');
		BSTNode<Character> K = new BSTNode<Character>('K');
		BSTNode<Character> G = new BSTNode<Character>('G');
		BSTNode<Character> O = new BSTNode<Character>('O');
		BSTNode<Character> H = new BSTNode<Character>('H');
		BSTNode<Character> V = new BSTNode<Character>('V');
		BSTNode<Character> F = new BSTNode<Character>('F');
		BSTNode<Character> L = new BSTNode<Character>('L');
		BSTNode<Character> P = new BSTNode<Character>('P');
		BSTNode<Character> J = new BSTNode<Character>('J');
		BSTNode<Character> B = new BSTNode<Character>('B');
		BSTNode<Character> X = new BSTNode<Character>('X');
		BSTNode<Character> C = new BSTNode<Character>('C');
		BSTNode<Character> Y = new BSTNode<Character>('Y');
		BSTNode<Character> Z = new BSTNode<Character>('Z');
		BSTNode<Character> Q = new BSTNode<Character>('Q');
		
		// root's children
		root.setLeft(E);
		root.setRight(T);
		
		// T's children
		T.setLeft(N);
		T.setRight(M);
		
		// E's children
		E.setLeft(I);
		E.setRight(A);
		
		// I's children
		I.setLeft(S);
		I.setRight(U);
		
		// A's children
		A.setLeft(R);
		A.setRight(W);
		
		// N's children
		N.setLeft(D);
		N.setRight(K);
		
		// M's children
		M.setLeft(G);
		M.setRight(O);
		
		// S's children
		S.setLeft(H);
		S.setRight(V);
		
		// U's children
		U.setLeft(F);
		
		// R's children
		R.setLeft(L);
		
		// W's children
		W.setLeft(P);
		W.setRight(J);
		
		// D's children
		D.setLeft(B);
		D.setRight(X);
		
		// K's children
		K.setLeft(C);
		K.setRight(Y);
		
		// G's children
		G.setLeft(Z);
		G.setRight(Q);
		
		// create the tree and assign the tree's root as 
		// the root for the constructor
		BinarySearchTree<Character> tree = new BinarySearchTree<Character>();
		tree.root = root;
		
		// return the created tree
		return tree;
	}
}
