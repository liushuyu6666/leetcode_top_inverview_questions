import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class First_unique_character_in_string {
    public int firstUniqChar(String s){
        // !! avoid s = "";
        if(s.length() < 1) return -1;
        Map<Character, Integer> map = new HashMap<>();
        char c;
        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, i);
            }
            else{
                map.put(c, Integer.MAX_VALUE);
            }
        }

        int minIndex = Collections.min(map.values());
        if(minIndex == Integer.MAX_VALUE) return -1;
        else return minIndex;
    }

    public static void main(String args[]){
        String str = "dddccdbba";
        First_unique_character_in_string s = new First_unique_character_in_string();
        System.out.println(s.firstUniqChar(str));
    }
}
