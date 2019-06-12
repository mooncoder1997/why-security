package com.why.security.browser.support;

/**
 * ClassName: SimpleResponse
 * Description: TODO
 * Date: 2019-06-13 00:08
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class SimpleResponse {

    public SimpleResponse(Object content) {
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
