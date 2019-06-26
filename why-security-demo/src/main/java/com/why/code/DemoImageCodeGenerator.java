package com.why.code;

import com.why.security.core.validate.code.ImageCode;
import com.why.security.core.validate.code.ValidateCodeGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * ClassName: DemoImageCodeGenerator
 * Description: TODO
 * Date: 2019/6/26 23:59
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {
    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("更高级的图形验证码生成代码");
        return null;
    }
}
