package com.dzh.mock;

import com.dzh.utils.GsonUtil;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.aspectj.util.FileUtil;
import org.springframework.stereotype.Component;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.lang.reflect.Method;

/**
 * mock service
 *
 * @author: dongzhihua
 * @time: 2019/3/24 16:51:00
 */
@Component("mockProxy")
public class MockService {
    public Object proxy(ProceedingJoinPoint point) throws Throwable {
        System.out.println("MockService#proxy");

        Signature s = point.getSignature();
        MethodSignature ms = (MethodSignature)s;
        Method m = ms.getMethod();

        try {

            Class<?> declaringClass = m.getDeclaringClass();
            File file = ResourceUtils.getFile(String.format("classpath:mock/com/%s/%s.json",declaringClass.getSimpleName(), m.getName()));
            return GsonUtil.fromStr(FileUtil.readAsString(file), m.getReturnType());
        } catch (Exception e) {
            e.printStackTrace();
            return point.proceed();
        }
    }
}
