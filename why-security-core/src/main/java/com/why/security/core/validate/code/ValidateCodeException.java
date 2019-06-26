package com.why.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * ClassName: ValidateCodeException
 * Description: TODO
 * Date: 2019/6/26 22:43
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class ValidateCodeException extends AuthenticationException {
    public ValidateCodeException(String msg) {
        super(msg);
    }
}
