package abdullah.example;

public class JavaClassObject{

    public static void main(String[] args){
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());

        Temu t = new Temu("abc", "def", 3, 2);
        t.m1();
        t.m2();
        t.m3();
    }
}

class Dog{
    private String name;
    private String bread;
    private int age;
    private String color;

    public Dog(String name, String bread, int age, String color){
        this.name = name;
        this.bread = bread;
        this.age = age;
        this.color = color;
    }
    public String getName(){
        return name;
    }
    public String getBread() {
        return bread;
    }
    public int getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString(){
        return("Hi, My name is: " +this.getName()+"\nMy bread, age and color are: " +
               this.getBread() + ", " + this.getAge() + ", " + this.getColor() );
    }
}

abstract class Demo{
    private String s1;

    abstract void m1();
    abstract void m2();
    abstract void m3();

}
class Temu extends Demo{
    private String s1;
    private String s2;
    private int i;
    private int j;
    public Temu(String s1, String s2, int i, int j){
        this.s1 = s1;
        this.s2 = s2;
        this.i = i;
        this.j = j;
    }
    public void m1(){
        System.out.println(s1);
    }
    public void m2(){
        System.out.println(s2);
    }
    public void m3(){
        System.out.println(i + j);
    }
}