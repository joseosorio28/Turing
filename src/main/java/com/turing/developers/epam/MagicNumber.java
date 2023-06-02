package com.turing.developers.epam;

public class MagicNumber {
    
    public static void main(String[] args) {
        int num = 1631;
        System.out.print("The number " + num + " is ");
        isMagicNumber(num);
    }
    
    public static void isMagicNumber(int num){
        int sumOfDigits = 0;
        while (num > 0 || sumOfDigits > 9)
        {
            if (num == 0)
            {
                num = sumOfDigits;
                sumOfDigits = 0;
            }
            sumOfDigits += num % 10;
            num /= 10;
        }
    
        // If sum is 1, original number is magic number
        if(sumOfDigits == 1) {
            System.out.println("Magic number");
        }else {
            System.out.println("Not magic number");
        }
    }
}
