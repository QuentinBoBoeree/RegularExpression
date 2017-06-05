package regex.utils;

/**
 * Created by quentin on 2017/6/5.
 */
public class RegexUtil {

    public static boolean isMatch(String text) {
        checkParam(text);
        String regexTarget = "^123$";
        return text.matches(regexTarget);
    }

    /**
     * 匹配a或b或c
     *
     * @param text
     * @return
     */
    public static boolean charType(String text) {
        checkParam(text);
        String regexTarget = "[abc]";
        return text.matches(regexTarget);
    }

    /**
     * 任何字符，除了 a、b 或 c（否定）
     * @param text
     * @return
     */
    public static boolean charTypeStartWith(String text) {
        checkParam(text);
        String regexTarget = "[^abc]";
        return text.matches(regexTarget);
    }

    private static void checkParam(String text) {
        if (text == null) {
            System.out.println("null data");
        }
    }

    public static void main(String[] args) {
        System.out.println(isMatch("123"));
        System.out.println(charType("1"));
        System.out.println(charTypeStartWith("a"));
    }
}
