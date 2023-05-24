package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>(); // use store and retrive data
        // collection<Integer> nums= new ArrayList<>();
        List<Integer> numss= new ArrayList<>();  // list get index value
        nums.add(1);
        nums.add(4);
        nums.add(3);

        for (int n: nums){
            System.out.println(n);
        }
    }
}
