package com.why.security.core.properties;

/**
 * ClassName: ValidateCodeProperties
 * Description: TODO
 * Date: 2019/6/26 23:09
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class ValidateCodeProperties {

    private ImageCodeProperties image = new ImageCodeProperties();

    public ImageCodeProperties getImage() {
        return image;
    }

    public void setImage(ImageCodeProperties image) {
        this.image = image;
    }
}
