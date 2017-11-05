package dzhh.demo.springaop.logsupport;


import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dzhh.demo.springaop.cache.SimepleCache;

public class SimpleLogSupport {

	static Logger log = LoggerFactory.getLogger(SimpleLogSupport.class);

	public void before(JoinPoint jp) {
		Object[] args = jp.getArgs();
		log.debug("args:{}", Arrays.toString(args));
		SimepleCache.sb.append("before ");
	}

	public void after(JoinPoint jp) {

		SimepleCache.sb.append(" after");
	}

	public void afterReturning(JoinPoint jp, Object result) {

		log.debug("result:{}", result.toString());
		log.info(SimepleCache.sb.toString());
	}
}
