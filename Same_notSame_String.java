import java.util.Scanner;
import java.util.Arrays;
/*Write a program to check whether two given strings contains same
same set of characters as well as having same length.
input
String s1 = "amar";
String s2 = "rama";
output : both contains same characters
 */
public class Same_notSame_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();    //example= rama
        String s2 = scan.nextLine();    //example = amar
        char[] arr1 = new char[s1.length()]; //new array to store charcter os s1
        char[] arr2 = new char[s2.length()];    //new array to store character of s2
        if(s1.length() == s2.length()) { //append in arr1
            for (int i = 0; i < s1.length(); i++) {
                arr1[i] = s1.charAt(i);
            }
            //append in arr2
            for (int i = 0; i < s2.length(); i++) {
                arr2[i] = s2.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);  //sorting both arrays
            for (char e:arr1
                 ) {
                System.out.println(e);
            }
            System.out.println("====================");
            for (char e:arr2
            ) {
                System.out.println(e);
            }
            //checking for same array
            if(Arrays.equals(arr1, arr2)) {
                System.out.println("Both contains same character");
            }
            else {
                System.out.println("NOt same");
            }
        }
        else {
            System.out.println("Strings are not same");
        }
        scan.close();
    }
}
