package org.example;
import org.example.grepServices.GrepService;
import org.example.utils.FileReader;

import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.print("Введите слово:");
        String word = new Scanner(System.in).nextLine();

        List<String> res=new FileReader("text").reading();
        System.out.println("Повний текст:"+res);

        String grepService=new GrepService().grepService(res,word);
        System.out.println(grepService);
    }
}