package com.company;

public class Main {

    public static void main(String[] args) {


        public class Solution {
            public int lengthOfLongestSubstring(String s) {
                int n = s.length();

                int res = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = i; j < n; j++) {
                        if (checkRepetition(s, i, j)) {
                            res = Math.max(res, j - i + 1);
                        }
                    }
                }

                return res;
            }

            private boolean checkRepetition(String s, int first, int last) {
                int[] chars = new int[];

                for (int i = first; i <= last; i++) {
                    char c = s.charAt(i);
                    chars[c]++;
                    if (chars[c] > 1) {
                        return false;
                    }
                }

                return true;
            }
        }





    }
}
