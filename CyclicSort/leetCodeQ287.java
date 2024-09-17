package CyclicSort;

public class leetCodeQ287 {
    public static void swap(int i , int j , int[] nums){
        int temp = nums[i];
        nums[i] = nums[j] ;
        nums[j] = temp ;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2} ;
        while(true){
            int ele = nums[0] ;
            if(nums[ele] == ele){
                System.out.println(ele);
                break ;
            }
            swap(0,ele,nums) ;
        }
    }
}
