package Array;

public class Jagged {
    public static void main(String[] args) {
        int nums [][]=new int[3][];
        nums[0]=new int[4];
        nums[1]=new int [3];
        nums[2]=new int[5];

        // set ramdom value
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }
    // get value using Enhance for loop
    for(int num[]:nums){
        for (int ele:num){
             System.out.print(ele + " ");
        }
        System.err.println();
    }

    }

}
