import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression

        String ipAddressRegEx =
                "(?<!\\d|\\d\\.)" +
                "((25[0-5]|2[0-4][0-9]|[1][0-9][0-9]|[0-1][0-9]|[0-9])\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|[1][0-9][0-9]|[0-1][0-9]|[0-9])" +
                "(?!\\d|\\.\\d)";

        Pattern pattern = Pattern.compile(ipAddressRegEx);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        } else
            return "";
    }
}