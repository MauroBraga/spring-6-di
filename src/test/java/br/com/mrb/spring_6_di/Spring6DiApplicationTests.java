package br.com.mrb.spring_6_di;

import br.com.mrb.spring_6_di.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private MyController myController;

	@Test
	void testAutowireOfController(){
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerCtx(){
		MyController controller = context.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
