package ru.netology;

public class Main {
    public static void main(String[] args) {
        int costs = -600;
        int cost1mile = 20;
        int bonus = costs / cost1mile;
        if (bonus <0){
            System.out.println("ошибка");
        } else {
            System.out.println(bonus);

        }
    }


}