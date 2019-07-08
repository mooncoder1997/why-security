package com.why.security.core.validate.code.sms;

/**
 * ClassName: DefaultSmsCodeSender
 * Description: TODO
 * Date: 2019-07-06 00:27
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机" + mobile + "发送短信验证码" + code);
    }
}
