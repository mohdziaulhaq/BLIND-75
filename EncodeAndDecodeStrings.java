import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    public static void main(String[] args) {
        List<String> stringTobeEncoded = new ArrayList<>(Arrays.asList("neet","code","love","you"));
        String encodedString = encode(stringTobeEncoded);
        List<String> decodedString = decode(encodedString);
        
        System.out.println(encodedString);
        System.out.println(decodedString.toString());

        if(stringTobeEncoded.equals(decodedString)){
            System.out.println("String encoded successfully");

        }       
    }
    public static List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
           int j = i;
           while(str.charAt(j) != '#'){
            j++;
           }
           int length = Integer.parseInt(str.substring(i, j));
           i = j + 1;
           j = i + length;
           res.add(str.substring(i, j));
           i = j;
        }
        return res;
    }
    public static String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String str : strs){
            res.append(str.length()).append("#").append(str);
        }
        return res.toString();    
    }
}
