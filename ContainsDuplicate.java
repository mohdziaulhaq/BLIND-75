import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,5,5};
//        boolean ans = containsDuplicate(arr);
        boolean ans = containsDuplicateUsingHashMap(arr);        
                System.out.println(ans);
            }
        
            public static boolean containsDuplicate(int[] arr) {
                // TODO Auto-generated method stub
                HashSet<Integer> seen = new HashSet<>();
                for(int num : arr){
                    if(seen.contains(num))
                    return true;
                    seen.add(num);
                }
                return false;
             }

             public static boolean containsDuplicateUsingHashMap(int[] arr){
                HashMap<Integer, Boolean> map = new HashMap<>();
                for(int num : arr){
                    if(map.containsKey(num))
                    return true;
                    map.put(num, true);

                }
                return false;
             }
}
