package interfaceDemo;

interface A{

    //By default static and final
    int age=44;
    String area="Kathmandu";

    // By default public abstract in interface
    void show();
    void config();
}

public class Demo {
    public static void main(String[] args) {
        A obj=new A() {
           public void show(){
                System.out.println("in show");
            }
            public void config(){
                System.out.println("in show");
            }
        };
    }
}

// interface to interface -> extends
// class to interface-> implements