package com.Projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueCharactersOfAllSubstringsOfString {

    public static Map<Character, List<Integer>> index;
    public static int[] peek;
    public static int N;

    public static void main(String[] args) {
        System.out.println(uniqueLetterString("HENRY"));
    }

    public static int uniqueLetterString(String S) {
        index = new HashMap();
        peek = new int[26];
        N = S.length();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            index.computeIfAbsent(c, x -> new ArrayList<>()).add(i);
        }

        long current = 0, count = 0;
        for (char c : index.keySet()) {
            index.get(c).add(N);
            index.get(c).add(N);
            current += get(c);
        }

        for (char c : S.toCharArray()) {
            count += current;
            long prevValue = get(c);
            peek[c - 'A']++;
            current += get(c) - prevValue;
        }

        return (int) count % 1_000_000_007;
    }

    public static long get(char c) {
        List<Integer> indexes = index.get(c);
        int i = peek[c - 'A'];
        return indexes.get(i + 1) - indexes.get(i);
    }
}
