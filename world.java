
import java.util.Arrays;
public class world {
    
    public static void main(String[] args) {
        int arr[]={1,3,2,43,4};
        int target=5;

        Arrays.sort(arr); 
        targetSum(arr,target);  
    }

    public static void targetSum(int arr[],int target) {
        int left=0;
        int right=arr.length-1;
        
        while (left<right) {
            int leftValue = arr[left];
            int rightValue = arr[right];
            int sum = leftValue + rightValue;
 
            if(sum>target)
            {
             right--;
            }
            else if(sum<target)
            {
                left++;
            }
            else 
            {
                System.out.println("found  "+ leftValue+"  "+rightValue);
                break;

                
                
            }
            
        }
        
    }
    
}
