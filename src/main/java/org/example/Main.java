package org.example;


import java.util.Scanner;




public class Main
{

    public static void main(String[] args)
    {
        String result = "";
        System.out.print("Введите текст:");
        Scanner scanner1 = new Scanner(System.in);
        String text = scanner1.nextLine();
        System.out.print("Введите слово:");
        Scanner scanner2 = new Scanner(System.in);
        String word = scanner2.nextLine();
// [.!?]\s*  цей вираз знайшов, сам не вмію писати
        String sentences[] = text.split("[.!?]\\s*");
        for(int i=0; i<sentences.length;i++){
            if(sentences[i].contains(word)) result+=sentences[i]+"\n";
        }
        System.out.println(result);

    }
}