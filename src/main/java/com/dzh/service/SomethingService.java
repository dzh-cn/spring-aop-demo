package com.dzh.service;

import com.dzh.beans.SomeResult;
import com.dzh.beans.Something;

/**
 * something service
 *
 * @author: dongzhihua
 * @time: 2019/3/24 16:48:01
 */
public interface SomethingService {
    String doSomething(String something);
    SomeResult doSomething(Something something);
}
