import java.util.*;


public class MorseCode {
	
	public static void main (String [] args){
		
			String choice = " ";
			Scanner sc = new Scanner (System.in);
			
			do {
				System.out.println("Menu: " +
								   "\n1. Send Morse Message" +
								   "\n2. Receive Morse Message" +
								   "\n3. Print Letters and Morse Code" +
								   "\n4. Exit" +
								   "\n\nInput code :");
				
				
				choice = sc.next();
				
				switch (choice) {
				
				// send morse message
				case "1":
					
					  Encode();	
					  
					   	
					  break;
				
				case "2": 
					
				   	Decode();	
				   	
					break;
				
				case "3":
					
					printMorse();
					
					break;
				
				case "4":
					System.out.println("Bye dits-dahs..  ");
					break;
					
				default:
					System.out.println("Invalid choice");
					break;
					
				}
			}
			while (Integer.parseInt(choice) !=4);
				
	}

	 		private static void Encode() {
	 			
	 			
	 			ArrayList <String> letter = new <String>ArrayList();
	 			ArrayList <String> num = new <String>ArrayList();
	 			ArrayList <Character> nlist = new ArrayList<Character>();
	 			
	 			char [] eng =
	 				{
	 						
	 						'A', 'B', 'C', 'D', 'E', 'F',
	 						'G', 'H', 'I', 'J', 'K', 'L',
	 						'M', 'N', 'O', 'P', 'Q', 'R',
	 						'S', 'T', 'U', 'V', 'W', 'X',
	 						'Y', 'Z', 
	 						
	 						'.', ',', ':', '"', '\'', '!', 
	 						'?', '@', '-', ';', '(', ')', '=', 
	 						
	 						'1', '2', '3','4', '5', 
	 						'6', '7', '8', '9', '0'
	 					};
	 			
	 			for(int i=0;i<eng.length;i++){
 			 		nlist.add(eng[i]); }
	 				
	 			String[] morseCode =
	 					
	 				{
	 						
	 						".-", "-...", "-.-.", "-..", ".", "..-.",
	 						"--.", "....", "..", ".---", "-.-", ".-..",
	 						"--", "-.", "---", ".--.", "--.-", ".-.",
	 						"...", "-", "..-", "...-", ".--", "-..-",
	 						"-.--", "--..", 
	 						
	 						".-.-.-", "--..--", "---...", ".-..-.", ".----.", "-.-.--", 
	 						"..--..", ".--.-.", "-....-", "-.-.-.", "-.--.", "-.--.-", "-...-", 
	 						
	 						".----", "..---", "...--", "....-", ".....", 
	 						"-....", "--...", "---..", "----.", "-----"
	 					};
	 			
	 			
	 			
	 			for(int i=0;i<5;i++) {        		
 			    	Scanner sc= new Scanner(System.in);
 			    	String text = sc.nextLine();
 			    
 			    String w = text.toUpperCase();
 			    char[] c = w.toCharArray();
 			    
 			    String str = "";
 			    for (int j = 0; j < c.length; j++){
 			        for (int k = 0; k < eng.length; k++){

 			            if ((eng[k] == c[j])){
 			                str = str + morseCode[k] + " ";  
 			            }
 			        }
 			    }
 			    System.out.println(str);
 			    }
 			
	 					//total line
	 					String lines = Integer.toString(letter.size());
	 					num.add(lines);
	 					
	 					String totalword = "";
	 					String totalalp = "";
	 					String totalsym = "";
	 					String totalnum = "";
	 					
	 					for (String st : letter)
	 					{
	 						totalword+=st + " ";
	 					}
	 					
	 					String [] str = totalword.split("\\s+");
	 					System.out.println(str.length);
	 					int words=str.length;
	 					String words1=Integer.toString(words);
	 					num.add(words1);
	 					
	 					//total alphabets
	 					totalalp=totalword.replaceAll("\\s+", "");
	 			 		System.out.println(totalalp);
	 					
	 					char[] alphabet=totalalp.toCharArray();
	 					System.out.println(alphabet.length);
	 					int alphabets=alphabet.length;
	 					String alphabets1=Integer.toString(alphabets);
	 					num.add(alphabets1);
	 					
	 					
	 					
	 					//total symbols
	 					totalsym=totalalp.replaceAll("\\w+",  "");
	 					System.out.println(totalsym);
	 					
	 					char[] alphabet1=totalsym.toCharArray();
	 					System.out.println(alphabet1.length);
	 					int symbols=alphabet1.length;
	 					String symbols1 = Integer.toString(symbols);
	 					num.add(symbols1);
	 					
	 					//total numbers
	 					 totalnum=totalalp.replaceAll("\\D+", "");
	 					System.out.println(totalnum);
	 					
	 					char[] alphabet2= totalnum.toCharArray();
	 					System.out.println(alphabet2.length);
	 					int numbers=alphabet2.length;
	 					String numbers1=Integer.toString(numbers);
	 					num.add(numbers1);
	 					
	 					System.out.println("EOT");
	 				
	 		}
	 		
	 		
	 		private static void Decode() {
	 				 					
	 			char [] eng =
	 				{
	 						
	 						'A', 'B', 'C', 'D', 'E', 'F',
	 						'G', 'H', 'I', 'J', 'K', 'L',
	 						'M', 'N', 'O', 'P', 'Q', 'R',
	 						'S', 'T', 'U', 'V', 'W', 'X',
	 						'Y', 'Z', 
	 						
	 						'.', ',', ':', '"', '\'', '!', 
	 						'?', '@', '-', ';', '(', ')', '=', 
	 						
	 						'1', '2', '3','4', '5', 
	 						'6', '7', '8', '9', '0'
	 					};
	 				
	 			String[] morseCode =
	 					
	 				{
	 						
	 						".-", "-...", "-.-.", "-..", ".", "..-.",
	 						"--.", "....", "..", ".---", "-.-", ".-..",
	 						"--", "-.", "---", ".--.", "--.-", ".-.",
	 						"...", "-", "..-", "...-", ".--", "-..-",
	 						"-.--", "--..", 
	 						
	 						".-.-.-", "--..--", "---...", ".-..-.", ".----.", "-.-.--", 
	 						"..--..", ".--.-.", "-....-", "-.-.-.", "-.--.", "-.--.-", "-...-", 
	 						
	 						".----", "..---", "...--", "....-", ".....", 
	 						"-....", "--...", "---..", "----.", "-----"
	 					};
	 			ArrayList<Character> nlist = new ArrayList<Character>();
	 			Scanner sc = new Scanner (System.in);
	 			String text;
	 			
	 			
	 			do
	 			{
	 				text = sc.nextLine();
	 				
	 				
	 				for (String w : text.split(" "))
	 				{
	 					
	 					for (String c : w.split("  "))
	 					{
	 						for (int j=0; j<morseCode.length; j++)
	 						{
	 							if (c.equals(morseCode[j]))
	 							{
	 								nlist.add(eng[j]);
	 								System.out.print(eng[j]);
	 							}
	 						}
	 					}
	 					System.out.print(" ");
	 				}
	 				System.out.println();
	 			}while (!text.equals(". --- -"));
	 		
	 			
	 		
	 			
	 		}	
	 		private static void printMorse() {
	 				
	 			System.out.println("5 .....    	H ....     	4 ....-		S ...		V ...-");  
	 			System.out.println("3 ...--		I ..		F ..-.		U ..-		? ..--..");
	 			System.out.println("2 ..---		E .		L .-..		\" .-..-.	R .-.");
	 			System.out.println(". .-.-.-	A .-		P .--.		@ .--.-.	W .--");
	 			System.out.println("J .---		' .----.	1 .----		6 -....		- -....-");
	 			System.out.println("B -...		= -...-		D -..		X -..-		N -.");
	 			System.out.println("C -.-.		; -.-.-.	! -.-.--	K -.-		( -.--.");
	 			System.out.println(") -.--.-	Y -.--		T -		7 --...		Z --..");
	 			System.out.println(", --..--	G --.		Q --.-		M --		: ---...");
	 			System.out.println("8 ---..		O ---		9 ----.		0 -----");
	 			
	 			
	 		
	 		}
} 		
	 		
		 
