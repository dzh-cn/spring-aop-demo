package dzhh.demo.springaop.store.service.impl;

import dzhh.demo.springaop.store.service.SalespersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class SalespersonServiceImpl implements SalespersonService {

	static Logger logger = LoggerFactory.getLogger(SalespersonServiceImpl.class);

	public String payment(String some) {
//		log.info("\n\t pay : " + some);
        logger.info("payment : {}", some);
		return "success";
	}

    public String abc(String some) {
	    logger.info("abc : {}", some);
        return "success";
    }

}
