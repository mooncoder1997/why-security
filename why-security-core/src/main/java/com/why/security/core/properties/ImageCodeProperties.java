package com.why.security.core.properties;

/**
 * ClassName: ImageCodeProperties
 * Description: TODO
 * Date: 2019/6/26 23:08
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class ImageCodeProperties {

    private int width = 67;

    private int height = 23;

    private int length = 4;

    private int expireIn = 60;

    private String url;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

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
