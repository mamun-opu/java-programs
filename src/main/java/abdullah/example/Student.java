package abdullah.example;

public class Student {
    private String name;
    private int age;
    public static int totalNumberOfStudent = 0;
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        totalNumberOfStudent ++;
    }

    public static int getTotalNumberOfStudent() {
        return totalNumberOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
