package LC01;

import java.util.*;

public class Code49 {
    public static void main(String[] args) {
        String[] abc = { "eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(abc));

    }

    /**
     * 暴力破解
     *
     * @return
     */
    public static List<List<String>>  groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String (chars);
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }

        return  new ArrayList<List<String>>(map.values());
    }



}
