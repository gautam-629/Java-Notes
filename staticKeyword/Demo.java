package staticKeyword;

public class Demo {
   static int count;

   public void incrementCount(){
      count++;
   }
    public static void main(String[] args) {
         Demo obj1=new Demo();
         Demo obj2=new Demo();

         obj1.incrementCount();
         System.out.println(obj1.count);

         Demo.count=10;
         System.out.println(Demo.count);
    }
}
