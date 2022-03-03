package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] newArr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
        int randomResult = randomIndex(newArr);
        System.out.println(randomResult);
        recursionMethod(10);

        ArrayList<Integer> result = math(10);

        for (int number:result){
             System.out.println(number);
        }

        Fibunacci(1,1);
    }

    public static ArrayList<Integer> math(int divisibleNumber)
    {
        ArrayList<Integer> tempResult = new ArrayList<>();

        for (int i = 1; i<100; i++)
        {
            if(i%divisibleNumber == 0)
            {
                tempResult.add(i);
            }
        }
        return tempResult;
    }
    public static int randomIndex(int[] randomNumber)
    {
        Random ran = new Random();
        int result = ran.nextInt(randomNumber.length);
        return randomNumber[result];
    }
    public static void recursionMethod(int para)
    {
        System.out.println(para);
        int result = para - 1;
        if(result >= 0)
        {
            recursionMethod(result);
        }
    }
    public static void Fibunacci(int number1, int number2)
    {
        System.out.println(number1 + "\t" + number2);
        int result = number1 + number2;
        if (result <= 1000)
        {
            Fibunacci(number2,result);
        }

    }
}
