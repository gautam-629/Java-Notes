package abstractClassWithAnonymousInnerClass;

 abstract class A{
    public abstract  void show();
    public abstract void config();
}


public class Demo {
    public static void main(String[] args) {
        // you cannot create object of A you can create object of anonymous inner class
        A obj=new A() 
        {
            public void show(){
                System.out.println("In new show");
            }
            public void config(){
                System.out.println("config ");
            }
        };
        obj.show();
        obj.config();
    }
}
