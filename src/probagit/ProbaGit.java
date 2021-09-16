/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probagit;

import java.util.Scanner;

/**
 *
 * @author pavlo
 */
public class ProbaGit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Задача 1
        Пользователь вводит трехзначное число.
        Найдите: Число единиц, десятков, cумму цифр.
        Для решения можно использовать арифметический оператор % -остаток от деления.
        */
      
        
        System.out.println("Ведите трехзначное число: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        int units = num;
        int tens = num / 10;
        int hundreds = num /100;
        
        int summ = units + tens + hundreds;
        
        System.out.println("В заданном Вами числе единиц " + units);
        System.out.println("В заданном Вами числе десятков " + tens);
        System.out.println("В заданном Вами числе сотен " + hundreds);
        System.out.println("Сумма всех цифр равна " + summ );
        
       System.out.println("Введите значение температуры в градусах цельсия:");
        Scanner temp = new Scanner(System.in); //объявили Scanner temp
        double cels = temp.nextDouble(); //считали значение double cels
        double far = cels * 9 / 5 + 32; //высчитали значение double far
        
        System.out.println("Если температура в градусах Цельсия равна: " + cels + ", то в градусах Фаренгейта это будет: " + far );
        
    }
    
}

