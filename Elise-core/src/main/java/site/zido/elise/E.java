package site.zido.elise;

import java.nio.charset.Charset;

/**
 * this class provide some constants
 *
 * @author zido
 */
public class E {
    /**
     * The constant UTF_8.
     */
    public static final Charset UTF_8 = Charset.forName("utf-8");
    /**
     * The constant ASCII.
     */
    public static final Charset ASCII = Charset.forName("US-ASCII");
    /**
     * The constant ISO_8859_1.
     */
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

    /**
     * The type Status code.
     *
     * @author zido
     */
    public static class StatusCode {
        /**
         * The constant CODE_DOWNLOAD_ERROR.
         */
        public static final int CODE_DOWNLOAD_ERROR = -1;
        /**
         * The constant CODE_200.
         */
        public static final int CODE_200 = 200;
    }

    public static class Action {
        public static final String MATCH_LINK = "match_link";
        public static final String MATCH_NUMBER = "match_number";
        public static final String LINK_SELECTOR = "select_link";
        public static final String SELECT_URL = "select_url";
        public static final String SELECT_ORIGIN = "select_origin";
        public static final String CSS_SELECTOR = "css_selector";
        public static final String XPATH_SELECTOR = "xpath_selector";
    }
}
