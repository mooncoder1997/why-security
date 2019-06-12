package com.why.security.core;

import com.why.security.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: SecurityCoreConfig
 * Description: TODO
 * Date: 2019-06-13 00:15
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
