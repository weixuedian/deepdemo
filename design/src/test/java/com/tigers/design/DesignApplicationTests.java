package com.tigers.design;

import com.tigers.design.decorator.Man;
import com.tigers.design.decorator.ManDecoratorA;
import com.tigers.design.decorator.ManDecoratorB;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignApplicationTests {

	@Test
	public void contextLoads() {

	}

	@Test
	public  void testDecorator(){
		Man man = new Man();
		ManDecoratorA md1 = new ManDecoratorA();
		ManDecoratorB md2 = new ManDecoratorB();
		md1.setPerson(man);
		md2.setPerson(md1);
		md2.eat();
	}

}
