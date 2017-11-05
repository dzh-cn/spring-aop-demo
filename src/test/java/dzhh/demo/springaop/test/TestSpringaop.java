package dzhh.demo.springaop.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dzhh.demo.springaop.store.service.SalespersonService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:springConext.xml")
public class TestSpringaop {
	org.apache.commons.logging.impl.Log4JLogger l;
	@Autowired
	SalespersonService salespersonService;

	@Test
	public void main() {
		salespersonService.payment("apples");
	}
}
