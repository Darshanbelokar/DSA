public class valid_paranthesis {

    public static void main(String[] args) {

        String s = "[({})]";

        System.out.println(isvalid(s));
    }

    public static boolean isvalid(String s) {

        while (s.contains("()") ||
               s.contains("{}") ||
               s.contains("[]")) {

            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }

        return s.isEmpty();
    }
}