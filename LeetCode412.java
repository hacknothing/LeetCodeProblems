package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode412 {

        public static void main(String[] args) {
            System.out.println(fizzBuzz(5));
        }
        public static List<String> fizzBuzz(int n) {
            List<String> al = new ArrayList<>();
            for(int i=1;i<=n;i++)
            {
                if(i%3==0 && i%5==0)
                {
                    al.add("FizzBuzz");
                }
                else if(i%3==0)
                {
                    al.add("Fizz");
                }
                else if(i%5==0)
                {
                    al.add("Buzz");
                }
                else {
                    al.add(String.valueOf(i));
                }
            }


            return al;
        }
    }
