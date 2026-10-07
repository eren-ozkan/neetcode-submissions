class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')' , '(');
        map.put(']' , '[');
        map.put('}' , '{');

        Stack<Character> stack = new Stack<>();

        for (char elem : s.toCharArray()){
            if (map.containsValue(elem)){
                stack.push(elem);
            }
            else{
                if (stack.isEmpty()) {return false;}
                if (stack.pop() != map.get(elem)) {return false;}

            }
        }
        return stack.isEmpty();
    }
}
