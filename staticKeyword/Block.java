package staticKeyword;

 class Mobile{
    static int count;

    static {
        // Static block
        count = 0;
        System.out.println("Static block executed");
    }
}

public class Block {
   public static void main(String[] args) throws ClassNotFoundException {
         Class.forName("Mobile");     // load the class
   }
}


