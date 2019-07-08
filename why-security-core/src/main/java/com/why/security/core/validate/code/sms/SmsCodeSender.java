package com.why.security.core.validate.code.sms;

/**
 * ClassName: SmsCodeSender
 * Description: TODO
 * Date: 2019-07-06 00:27
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public interface SmsCodeSender {

    void send(String mobile, String code);
}
