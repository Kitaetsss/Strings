package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// задание 1
       String firstName = "Ivan";
       String middleName = "Ivanovich";
       String lastName = "Ivanov";
       String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //задание 3
        StringBuilder sb = new StringBuilder(lastName);
        StringBuilder sb1 = new StringBuilder(firstName);
        sb = sb.append(";");
        sb1 = sb1.append(";");
        fullName = sb + " " + sb1 + " " + middleName;
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName);
        //задание 4
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replaceAll("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
