class Solution {
    public String restoreString(String s, int[] indices) {
        char[] letters = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            letters[indices[i]] = s.charAt(i);
        }
        return new String(letters);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3}));
    }
}