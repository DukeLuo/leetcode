class _58LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words.length > 0 ? words[words.length - 1].length() : 0;
    }

    public static void main(String[] args) {
        _58LengthOfLastWord solution = new _58LengthOfLastWord();
        System.out.println(solution.lengthOfLastWord("Hello World"));
        System.out.println(solution.lengthOfLastWord(""));
        System.out.println(solution.lengthOfLastWord("    "));
        System.out.println(solution.lengthOfLastWord("a    "));
        System.out.println(solution.lengthOfLastWord("       a"));
    }
}
