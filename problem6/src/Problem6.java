import java.util.Scanner;
public class Problem6 {

    public static int countVowels(String str) {              // method to count the number of vowels in a string
        int count = 0;
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    public static String stringWithMostVowels(String[] strings){    // method to return the string with most vowels
        String mostVowelsString = "";                               // empty string to store the current string with most vowels
        int maxVowels = 0;
        for(String str : strings){
            int vowelCount = countVowels(str);                      // method call to get number of vowels in string
            if(vowelCount > maxVowels){
                maxVowels = vowelCount;
                mostVowelsString = str;                             // compare and store the string with most vowels in mostVowelString
            }
        }
        return mostVowelsString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        sc.nextLine();                                    // to consumer new line character left in buffer after sc.nextInt()
        String[] strings = new String[size];
        System.out.println("Enter the strings: ");
        for (int i = 0; i < size; i++) {                  // loop to input the array of strings
            strings[i] = sc.nextLine();
        }
        System.out.println("String with the most vowels: " + stringWithMostVowels(strings));
    }
}
