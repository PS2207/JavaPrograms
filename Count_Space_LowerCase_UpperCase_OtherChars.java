import java.util.Scanner;

// ____________________Main class start___________________________
public class Count_Space_LowerCase_UpperCase_OtherChars {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("\nEntered String is " + str);
        new Count(sc, str);
    }
}
// ____________________Main class end______________________________

// _____________________Another class start________________________
class Count {
    private final String str;
    private final Scanner sc;
    private int spaceCount = 0;
    private int lowerCount = 0;
    private int upperCount = 0;
    private int digitCount = 0;
    private int otherCount = 0;

    public Count(Scanner sc, String str) {
        this.str = str;
        this.sc = sc;
        countChar();
    }

    public void countChar() {
      
    //Way1- count Uppercase,Lowercase, sapce & so on using ASCII value
        // for (int i = 0; i <= str.length() - 1; i++) {
        //     char ch = str.charAt(i);
        //     if (ch == 32) {
        //         spaceCount++;
        //     } else if (ch >= 97 && ch <= 122) {
        //         lowerCount++;
        //     } else if (ch >= 65 && ch <= 90) {
        //         upperCount++;
        //     } else if (ch >= 48 && ch <= 57) {
        //         digitCount++;
        //     } else {
        //         otherCount++;
        //     }
        // }
    //Way2- count Uppercase,Lowercase, sapce & so on using the Class "Character" by calling its methods.
        for (int i = 0; i <= str.length() - 1; i++) {
        char ch = str.charAt(i);
        if (Character.isWhitespace(ch)) {
        spaceCount++;
        } else if (Character.isLowerCase(ch)) {
        lowerCount++;
        } else if (Character.isUpperCase(ch)) {
        upperCount++;
        } else if(Character.isDigit(ch)){
        digitCount++;
        }else{
        otherCount++;
        }
        }
        System.out.println("Space count: " + spaceCount);
        System.out.println("Lower count: " + lowerCount);
        System.out.println("Upper count: " + upperCount);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Other count: " + otherCount);
    }

}
// ____________OUTPUT__________
// Enter a string:
// Hello World !!

// Entered String is hello
// Space count: 3
// Lower count: 8
// Upper count: 2
// Digit count: 0
// Other count: 2
// _____________________________
