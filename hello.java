public class hello {
    public static void main(String[] args) {
        int arr[] = { 7,4,21,-1 };
        int target = 6;

        targetSum(arr, target);
    }

    public static void targetSum(int arr[], int target) {
        for (int i = 0; i < arr.length-1; i++) 
        {
            int m=i;
            
            for (int j = m+1; j < arr.length; j++) 
            {
               if(arr[i]+arr[j]==target)
               {
                System.out.println(arr[i]+ "  "+arr[j]);
                return;
               }    

            }   
            

        }

    }
}