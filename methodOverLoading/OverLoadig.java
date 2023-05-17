package methodOverLoading;

class Calculator{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
}


public class OverLoadig {
       public static void main(String[] args) {
            Calculator obj=new Calculator();
          int value= obj.add(5, 7,9);

            
       }
}
