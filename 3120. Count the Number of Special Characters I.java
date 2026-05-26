class Solution {
    public int numberOfSpecialChars(String word) {
        // HashSet<Character> hs = new HashSet<>();
        // int cnt = 0;

        // for(char ch : word.toCharArray()){
        //     hs.add(ch);
        // }

        // for(char ch='a'; ch <= 'z'; ch++){
        //     if(hs.contains(ch) && hs.contains(Character.toUpperCase(ch))){
        //         cnt++;
        //     }
        // }
        // return cnt;


        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];

        for(char ch : word.toCharArray()) {

            if(Character.isLowerCase(ch)) {
                lower[ch - 'a'] = true;
            } else {
                upper[ch - 'A'] = true;
            }
        }

        int count = 0;

        for(int i = 0; i < 26; i++) {
            if(lower[i] && upper[i]) {
                count++;
            }
        }

        return count;
    }
}
