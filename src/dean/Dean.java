package dean;

import student_info.Student;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Dean implements Comparator<Student>
    {
        private String position;
        private int experience;

        public String getPosition() {
            return position;
        }
        public void setPosition(String position) {
            this.position = position;
        }

        public int getExperience() {
            return experience;
        }
        public void setExperience(int experience) {
            this.experience = experience;
        }

        public Dean(String position, int experience){
            this.position = position;
            this.experience = experience;
        }

        @Override
        public int compare(Student o1, Student o2) {
            //return Integer.compare(o1.course, o2.course); //сортировка по курсам
            return o1.surname.compareTo(o2.surname); // сортировка по фамилиям
        }



    }
