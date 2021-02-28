 package main;
 import student_info.Student;
 import dean.Dean;

 import java.io.FileInputStream;
 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.logging.Level;
 import java.util.logging.LogManager;
 import java.util.logging.Logger;

 class Main extends Dean {


       public Main(String position, int experience) {
           super(position, experience);
       }


       public static void main(String[] args) {

             Student s_1 = new Student("Булгаков", "Михаил", "ПОИТ", 4, 4, 9.4f, Student.Study_form.full_time);
             Student s_2 = new Student("Пушкин", "Александр", "ИСИТ", 4, 2, 5.1f, Student.Study_form.extramural);
             Student s_3 = new Student("Цветаева", "Марина", "ИСИТ", 4, 3, 4.2f, Student.Study_form.extramural);
             Student s_4 = new Student("Ахматова", "Анна", "ДЭИВИ", 3, 1, 9.9f, Student.Study_form.extramural);
             Student s_5 = new Student("Довлатов", "Сергей", "ПОИБМС", 3, 1, 6.7f, Student.Study_form.full_time);
             Student s_6 = new Student("Куприн", "Александр", "ПОИТ", 3, 2, 6.3f, Student.Study_form.evening);
             Student s_7 = new Student("Блок", "Александр", "ПОИТ", 2, 3, 5.9f, Student.Study_form.evening);
             Student s_8 = new Student("Донцова", "Дарья", "ПОИБМС", 2, 4, 8.6f, Student.Study_form.extramural);
             Student s_9 = new Student("Пастернак", "Борис", "ИСИТ", 2, 1, 7.5f, Student.Study_form.full_time);
             Student s_10 = new Student("Бродский", "Иосиф", "ДЭИВИ", 1, 2, 8.8f, Student.Study_form.evening);
             Student s_11 = new Student("Гоголь", "Николай", "ПОИБМС", 1, 3, 4.3f, Student.Study_form.evening);


             ArrayList<Student> students = new ArrayList<>();
             students.add(s_1);
             students.add(s_2);
             students.add(s_3);
             students.add(s_4);
             students.add(s_5);
             students.add(s_6);
             students.add(s_7);
             students.add(s_8);
             students.add(s_9);
             students.add(s_10);
             students.add(s_11);

             Collections.sort(students, new Dean("Dean", 6));
             System.out.println("Отсортированные по курсу студенты:");
             System.out.println(students);
             System.out.println("Отсортированные по фамилиям студенты:");
             Collections.sort(students, new Dean("m-Dean", 2));
             System.out.println(students);

             System.out.println("Студенты первого курса:");
             students.stream().filter(s -> s.course == 1).forEach(s -> System.out.println(s));

             System.out.println("Студенты четвертого курса:");
             students.stream().filter(s -> s.course == 4).forEach(s -> System.out.println(s));

             System.out.println("Студенты, чья успеваемость выше 7:");
             students.stream().filter(s -> s.score >= 7).forEach(s -> System.out.println(s));

             System.out.println("Студенты третьей группы:");
             students.stream().filter(s -> s.group == 3).forEach(s -> System.out.println(s));

             System.out.println("Студенты специальности ПОИТ:");
             students.stream().filter(s -> s.specialty == "ПОИТ").forEach(s -> System.out.println(s));

         }
     }
