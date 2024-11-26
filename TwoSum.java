import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] ans = twoSum(arr,target);
        System.out.println("Indexes are"+ans[0]+","+ans[1]);
        }
        
    public static int[] twoSum(int[] arr, int target) {
                
               
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int i=0; i<arr.length; i++){
                    int num = arr[i];
                    int diff = target - num;
                    if(map.containsKey(diff)){
                        return new int[]{map.get(diff), i};
                    }
                    map.put(num, i);
                }

                throw new UnsupportedOperationException("Unimplemented method 'twoSum'");
    }
    
}
