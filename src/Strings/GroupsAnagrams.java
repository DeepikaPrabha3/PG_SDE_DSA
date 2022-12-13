package Strings;

import java.util.*;

public class GroupsAnagrams {
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramsCategorizeBySorting(str));
    }
    public static List<List<String>> groupAnagramsCategorizeBySorting(String[] strs) {

        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> stringAnagramsMap = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            if (!stringAnagramsMap.containsKey(key))
                stringAnagramsMap.put(key, new ArrayList<>());

            stringAnagramsMap.get(key).add(s);
        }

        List<List<String>> resultList = new ArrayList<>();
        for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
            resultList.add(stringAnagrams.getValue());
        }
        return resultList;
    }
}
