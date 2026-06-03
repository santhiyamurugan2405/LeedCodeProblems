import java.util.*;

class Solution {

    String[] phones = {
        " ", " ", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };
    void bt(List<String> res, String digits, StringBuilder s, int i) {
        if (s.length() == digits.length()) {
            res.add(s.toString());
            return;
        }
        String letters = phones[digits.charAt(i) - '0'];
        for (char c : letters.toCharArray()) {
            s.append(c);
            bt(res, digits, s, i + 1);
            s.deleteCharAt(s.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        bt(res, digits, new StringBuilder(), 0);

        return res;
    }
}