package String;

public class Demo {
    public static void main(String[] args) {
       String name= new String("navin");
       String s1="Navin";
       String s2="Navin";
       System.out.println(s1==s2);
       name=name + "reddy";

       //Immutable
       name.toUpperCase(); // cannot be change
    }
}
