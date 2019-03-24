package dzhh.demo.springaop.logsupport;


import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class SimpleLogSupport {

	static Logger log = LoggerFactory.getLogger(SimpleLogSupport.class);

	public void before(JoinPoint jp) {
		Object[] args = jp.getArgs();
		log.debug("args:{}", Arrays.toString(args));
        log.info("before");
	}

	public void after(JoinPoint jp) {

        log.info(" after");
	}

	public void afterReturning(JoinPoint jp, Object result) {

		log.debug("result:{}", result.toString());
		log.info("afterReturning");
	}

    public Object around() {
        return null;
    }
}
