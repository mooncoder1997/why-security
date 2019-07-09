package com.why.security.core.validate.code;

import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * ClassName: ValidateCodeProcessor
 * Description: 校验码处理器，封装不同校验码的处理逻辑
 * Date: 2019-07-06 00:46
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public interface ValidateCodeProcessor {

    /** 验证码放入Session时的前缀 */
    String SESSION_KEY_PREFIX = "SESSION_KEY_FOR_CODE_";

    /**
     * 创建校验码
     * @param request
     * @throws Exception
     */
    void create(ServletWebRequest request) throws Exception;

    /**
     * 校验验证码
     * @param servletWebRequest
     */
    void validate(ServletWebRequest servletWebRequest) throws ServletRequestBindingException;
}