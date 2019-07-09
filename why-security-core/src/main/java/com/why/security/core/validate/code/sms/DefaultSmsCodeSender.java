package com.why.security.core.validate.code.sms;

import org.springframework.stereotype.Component;

/**
 * ClassName: DefaultSmsCodeSender
 * Description: TODO
 * Date: 2019-07-06 00:27
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@Component("smsCodeSender")
public class DefaultSmsCodeSender implements SmsCodeSender {
    @Override
    public void send(String mobile, String code) {
        System.out.println("向手机" + mobile + "发送短信验证码" + code);
    }
}
