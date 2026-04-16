
class Solution {
    public char repeatedCharacter(String s) {
        HashSet<Character> set = new HashSet<>();
        //Char[] ch= s.toCharArray();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(set.contains(ch)== true) return ch;
            else set.add(ch);
        }
        return ' ';
    }
}