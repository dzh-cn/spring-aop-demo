package com.dzh;

import com.dzh.beans.SomeResult;
import com.dzh.beans.Something;
import com.dzh.service.SomethingService;
import com.dzh.utils.GsonUtil;
import org.aspectj.util.FileUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ResourceUtils;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;

/**
 * mock test
 *
 * @author: dongzhihua
 * @time: 2019/3/24 16:52:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:mockApplicationContext.xml")
public class MockTest {

    @Resource
    private SomethingService somethingService;

    @Test
    public void doSomething() throws IOException {
        File file = ResourceUtils.getFile("classpath:mock/com/SomethingService/doSomething.json");
        SomeResult someResult = GsonUtil.fromStr(FileUtil.readAsString(file), SomeResult.class);
        String result = somethingService.doSomething(someResult.toString());
        System.out.println(result);
    }

    @Test
    public void doSomethingObj() {
        Something something = new Something();
        something.setLevel(1);
        something.setName("转账");

        SomeResult result = somethingService.doSomething(something);
        System.out.println(result);
    }
}
