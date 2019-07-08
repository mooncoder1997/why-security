package com.why.security.core.properties;

/**
 * ClassName: SmsCodeProperties
 * Description: TODO
 * Date: 2019-07-06 00:35
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class SmsCodeProperties {

    private int length = 6;
    private int expireIn = 60;

    private String url;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
