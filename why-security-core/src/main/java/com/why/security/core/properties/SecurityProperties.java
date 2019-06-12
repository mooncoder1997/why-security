package com.why.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName: SecurityProperties
 * Description: TODO
 * Date: 2019-06-13 00:13
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@ConfigurationProperties(prefix = "why.security")
public class SecurityProperties {

    BrowserProperties browser = new BrowserProperties();

    public BrowserProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowserProperties browser) {
        this.browser = browser;
    }
}
