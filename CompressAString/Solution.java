/*


Given a String, compress the given string. See example for more details.

Input Format

Input contains string of lowercase and uppercase characters - S.

Constraints

1 <= len(S) <= 100

Output Format

Print the compressed string.

Sample Input 0

aaaBBBBhhhekkL
Sample Output 0

a3B4h3e1k2L1
Explanation 0

In the given string, a is repeating for 3 times - after compression a3.
Similarly, B is repeating for 4 times - B4
h is repeating for 3 times - h3
e is repeating for 1 times - e1
k is repeating for 2 times - k2
L is repeating for 1 times - L1


*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 1;
        for(int i = 0; i < s.length(); i++) {
            if(i != s.length() - 1 && s.charAt(i) == s.charAt(i+1))
                count ++;
            else {
                System.out.print(s.charAt(i)); 
                System.out.print(count);
                count = 1;
            }
             
        }
    }
}











