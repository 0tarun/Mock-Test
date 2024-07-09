import java.util.HashMap;

public class maph {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int target=6;
        
        result(arr,target);

    }

    public static void result(int arr[],int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++) 
        {
            int diff=target-arr[i];
            if(map.containsKey(diff))
            {
                System.out.println("pair found "+arr[i]+" "+diff);
                return;
            }
            map.put(arr[i],i);
        }
        
        
    }

}