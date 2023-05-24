
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
}

public class Demo {
    public static void main(String[] args) {
        Human obj1=new Human();
        obj1.setAge(4);
        obj1.getAge();
    }
}
