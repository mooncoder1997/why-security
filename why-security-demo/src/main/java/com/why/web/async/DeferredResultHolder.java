package com.why.web.async;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.async.DeferredResult;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: DeferredResultHolder
 * Description: TODO
 * Date: 2019-06-11 23:06
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
@Component
public class DeferredResultHolder {

    private Map<String, DeferredResult<String>> map = new HashMap<>();

    public Map<String, DeferredResult<String>> getMap() {
        return map;
    }

    public void setMap(Map<String, DeferredResult<String>> map) {
        this.map = map;
    }
}
