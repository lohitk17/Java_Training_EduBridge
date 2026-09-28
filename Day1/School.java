public class School {
    void teach(Teacher teacher, Student student) {
        System.out.println( teacher.name + " teaches " + student.name);
    }
}
class Teacher {
    String name;
    Teacher(String name) {
        this.name = name;
    }
}
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}
class Main4{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Harsh");
        Student s1 = new Student("Praveen");
        School school = new School();
        school.teach(t1, s1);
    }
}