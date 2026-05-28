class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<String, Integer> first_word = new HashMap<>();
        Map<String, Integer> second_word = new HashMap<>();
        
        for (int i = 0; i < s.length(); i ++) {
            if (first_word.containsKey(Character.toString(s.charAt(i)))) {
                first_word.put(Character.toString(s.charAt(i)), first_word.get(Character.toString(s.charAt(i)))+1);
            }
            else first_word.put(Character.toString(s.charAt(i)), 1);
        }

        for (int i = 0; i < t.length(); i ++) {
            if (second_word.containsKey(Character.toString(t.charAt(i)))) {
                second_word.put(Character.toString(t.charAt(i)), second_word.get(Character.toString(t.charAt(i)))+1);
            }
            else second_word.put(Character.toString(t.charAt(i)), 1);
        }

        return first_word.equals(second_word);

    }
}
