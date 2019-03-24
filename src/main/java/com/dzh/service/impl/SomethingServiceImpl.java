package com.dzh.service.impl;

import com.dzh.beans.SomeResult;
import com.dzh.beans.Something;
import com.dzh.service.SomethingService;
import org.springframework.stereotype.Service;

/**
 * something service impl
 *
 * @author: dongzhihua
 * @time: 2019/3/24 16:49:04
 */
@Service
public class SomethingServiceImpl implements SomethingService {
    public String doSomething(String something) {
        return "finish: " + something;
    }

    public SomeResult doSomething(Something something) {
        SomeResult sr = new SomeResult();
        sr.setMessage("接口异常！");
        sr.setSuccess(false);
        return sr;
    }
}
