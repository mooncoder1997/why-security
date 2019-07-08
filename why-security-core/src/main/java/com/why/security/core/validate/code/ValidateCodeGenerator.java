package com.why.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * ClassName: ValidateCodeGenerator
 * Description: TODO
 * Date: 2019/6/26 23:52
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);
}
