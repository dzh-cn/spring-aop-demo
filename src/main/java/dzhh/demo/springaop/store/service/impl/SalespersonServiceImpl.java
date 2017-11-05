package dzhh.demo.springaop.store.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import dzhh.demo.springaop.cache.SimepleCache;
import dzhh.demo.springaop.store.service.SalespersonService;

@Service
public class SalespersonServiceImpl implements SalespersonService {

	static Logger log = LoggerFactory.getLogger(SalespersonServiceImpl.class);

	public String payment(String some) {
//		log.info("\n\t pay : " + some);
		log.info("payment : {}", some);
		SimepleCache.sb.append(some);
		return "success";
	}
}
