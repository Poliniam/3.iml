package student_info;

public class Student  {
    public String surname;
    public String name;
    public String specialty;
    public int group;
    public  int course;
    public float score;
    Study_form studyForm;


    public enum Study_form {
        full_time,
        extramural,
        evening
    }

    // в лабораторной должны быть добавлены getter-ы и setter-ы
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }
    public void setScore(float score) {
        this.score = score;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    //________________________________________________________________

    HeadMan head1 = new HeadMan("headman");
    HeadMan head0 = new HeadMan("not the headman");

    public Student(String surname, String name, String specialty, int group, int course, float score, Study_form form){
        this.surname = surname;
        this.name =  name;
        this.specialty = specialty;
        this.group = group;
        this.course = course;
        this.score = score;
        studyForm = form;
    }


    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", group=" + group +
                ", course=" + course +
                ", score=" + score +
                ", studyForm=" + studyForm +
                '}';
    }

    public class HeadMan {

        public String isTheHeadman;

        public HeadMan(String isTheHeadman) {
            this.isTheHeadman = isTheHeadman;
        }
    }
}
