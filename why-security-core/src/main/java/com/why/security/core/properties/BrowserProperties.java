package com.why.security.core.properties;

/**
 * ClassName: BrowserProperties
 * Description: TODO
 * Date: 2019-06-13 00:13
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class BrowserProperties {

    private String loginPage = "/why-signIn.html";

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}
