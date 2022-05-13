package com.main.hrsolutions;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;




//            HackerRank Socks Problem







//There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//        Example
//
//
//        There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
//
//        Function Description
//
//        Complete the sockMerchant function in the editor below.
//
//        sockMerchant has the following parameter(s):
//
//        int n: the number of socks in the pile
//        int ar[n]: the colors of each sock
//        Returns
//
//        int: the number of pairs
//        Input Format
//
//        The first line contains an integer , the number of socks represented in .
//        The second line contains  space-separated integers, , the colors of the socks in the pile.
//
//        Constraints
//
//        where
//        Sample Input
//
//        STDIN                       Function
//        -----                       --------
//        9                           n = 9
//        10 20 20 10 10 30 50 10 20  ar = [10, 20, 20, 10, 10, 30, 50, 10, 20]
//        Sample Output
//
//        3
//        Explanation
//
//        sock.png



public class HackerRankSolutions {




    class Result {

        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */

        public static int sockMerchant(int n, List<Integer> ar) {
            // Write your code here

//            1. my understanding : we need to have a set. if i matches the key places

            HashMap<Integer, Integer> mapa = new HashMap<Integer, Integer>();
            int pairs = 0;
            for (int i = 0; i < ar.size(); i++){
                if(!mapa.containsKey(ar.get(i))){
                    mapa.put(ar.get(i), 1);
                } else {
                    mapa.replace(ar.get(i), mapa.get(ar.get(i))+1);
                }
            }
            int whole;
            for(Integer key : mapa.keySet()) {
                whole = (int)mapa.get(key)/2;
                pairs=pairs+whole;
            }
            return pairs;
        }

    }


    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            int result = Result.sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }


        /**Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).

One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

Scanner scanner = new Scanner(System.in);
String myString = scanner.next();
int myInt = scanner.nextInt();
scanner.close();

System.out.println("myString is: " + myString);
System.out.println("myInt is: " + myInt);
The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:

Hi 5
Our code will print:

myString is: Hi
myInt is: 5
Alternatively, you can use the BufferedReader class.

Task
In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

Input Format

There are  lines of input, and each line contains a single integer.

Sample Input

42
100
125
Sample Output

42
100
125 */
    }


    import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // Complete this line
        // Complete this line
        
        

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Complete this line
        // Complete this line
    }

    /***Welcome to the world of Java! In this challenge, we practice printing to stdout.

The code stubs in your editor declare a Solution class and a main method. Complete the main method by copying the two lines of code below and pasting them inside the body of your main method.

System.out.println("Hello, World.");
System.out.println("Hello, Java.");
Input Format

There is no input for this challenge.

Output Format

You must print two lines of output:

Print Hello, World. on the first line.
Print Hello, Java. on the second line.
Sample Output

Hello, World.
Hello, Java. */

    public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        
    
      System.out.println("Hello, World.");
      System.out.println("Hello, Java.");
    }
    

}



}

}
/***In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Wikipedia if-else flow chart

Source: Wikipedia

Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer, .

Constraints

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
Explanation

Sample Case 0: 
 is odd and odd numbers are weird, so we print Weird.

Sample Case 1: 
 and  is even, so it isn't weird. Thus, we print Not Weird.
 
  */


// If  is odd, print Weird
        if(N % 2 == 1){
            System.out.println("Weird");
            
        } else if(N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
            // If N is even and in the inclusive range of 2 to 5, print Not Weird
        } else if (N % 2 == 0 && N <= 5 && N >= 2){
            System.out.println("Not Weird");

            // If N is even and in the inclusive range of 6 to 20, print Weird
        } else if (N % 2 == 0 && N <= 20 && N >= 6 ){
            System.out.println("Weird");
        } 
    }


    public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

 
       
        

        // Write your code here.
        scan.nextLine();
        String s = scan.nextLine();
        Double d = scan.nextDouble();
        int i = scan.nextInt();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}



public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        



// If N is even and greater than 20, print Not Weird

// If  is odd, print Weird
        if(N % 2 == 1){
            System.out.println("Weird");
            
        } else if(N % 2 == 0 && N > 20){
            System.out.println("Not Weird");
            // If N is even and in the inclusive range of 2 to 5, print Not Weird
        } else if (N % 2 == 0 && N <= 5 && N >= 2){
            System.out.println("Not Weird");

            // If N is even and in the inclusive range of 6 to 20, print Weird
        } else if (N % 2 == 0 && N <= 20 && N >= 6 ){
            System.out.println("Weird");
        } 
    }
}



}