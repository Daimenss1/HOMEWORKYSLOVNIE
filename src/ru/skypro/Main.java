package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int clientOS = 1;
        System.out.println(" * Задача № 1");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }

        int clientDeviceYear = 2014;
        clientOS = 1;
        System.out.println(" * Задача № 2");
        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
            } else if (clientOS == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке ");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }


        int year = 2017;
        System.out.println(" * Задача № 3");
        if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0) {
            System.out.println(year + " год является високосным ");
        } else {
            System.out.println(year + " год не является високосным ");
        }

        int deliveryDistance = 95;
        int day = 1;
        System.out.println(" * Задача № 4");
        if (deliveryDistance > 20) {
            day++;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 100) {
            day++;
        }
        System.out.println("Потребуется дней: " + day);


        int monthNumber = 12;
        System.out.println(" * Задача № 5 ");
        switch (monthNumber) {
            case 1:
                System.out.println("Зима ");
                break;
            case 2:
                System.out.println("Зима ");
                break;
            case 3:
                System.out.println("Весна ");
                break;
            case 4:
                System.out.println("Весна ");
                break;
            case 5:
                System.out.println("Весна ");
                break;
            case 6:
                System.out.println("Лето ");
                break;
            case 7:
                System.out.println("Лето ");
                break;
            case 8:
                System.out.println("Лето ");
                break;
            case 9:
                System.out.println("Осень ");
                break;
            case 10:
                System.out.println("Осень ");
                break;
            case 11:
                System.out.println("Осень ");
                break;
            case 12:
                System.out.println("Зима ");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}









