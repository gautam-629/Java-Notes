package Array;

public class MultiDimen {
    public static void main(String[] args) {
        int nums[][]=new int [3][4];

        // set ramdom value 
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }
  
        //get value
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

        // enhance for loop
        for(int num[]:nums){
            for(int ele:num){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        
    }
}
