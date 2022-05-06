package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> l= new ArrayList<>();
        l.add(0,"leet");
        l.add(1, "code");
        System.out.println(wordBreak("leetcode", l));
    }

    public static boolean wordBreak(String s, List<String> wordDict){
        Map<String, Boolean> map= new HashMap();
        if(wordDict.contains(s))
            return true;
        if(map.containsKey(s))
            return map.get(s);
        for(int i = 1; i<=s.length(); i++){
            String left = s.substring(0,i);
            if(wordDict.contains(left) && wordBreak(s.substring(i), wordDict)){
                map.put(s,true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}
