package com.company;

import Strings.Genders;

public class Main {

    public static void main(String[] args) {

      /*
        Створити клас Man (людина) з полями: ім’я, вік, стать і вага. Визначити методи
        переприсвоєння імені, зміни віку і зміни ваги.
        Створити клас-контейнер Student, що має поля «людина» та «рік навчання».
        Визначити методи переприсвоєння та збільшення року навчання.

        -NESTED CLASS MAN-
        */

        Student.Man stephan = new Student.Man("Степан", Genders.GENDER_MALE, 15, 52.5);
        Student.Man maria = new Student.Man("Марія", Genders.GENDER_FEMALE, 16, 57.0);

        Student[] students = {
                new Student(9, stephan),
                new Student(10, maria)
        };

        System.out.println(students[1].getMan().getAge() + " " + students[1].getMan().getName());
        students[1].getMan().setAge(12);
        System.out.println(students[1].getMan().getAge() + " " + students[1].getMan().getName());
    }
}
