package stringExamples;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		String sentence;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Sentence : ");
		sentence=sc.nextLine();
		
		int n=sentence.split(" ").length;
		System.out.println("No of words : "+n);
	}

}
