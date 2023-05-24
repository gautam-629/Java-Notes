package constructor;

public class Demo {
    String name;
    int age;

    public Demo() {
          // work like dataBase connection
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
        getName();  // also call method inside it
    }

    public Demo(String name) {
        this.name = name;
    }

    public void getName(){
        System.out.println("My name is "+ this.name);
    }
    public static void main(String[] args) {
        Demo obj=new Demo("Binod", 6);
    }
}
