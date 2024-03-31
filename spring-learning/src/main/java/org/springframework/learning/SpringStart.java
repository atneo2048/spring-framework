package org.springframework.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.learning.bean.UserBean;

/**
 * @author Neo-HJ.Niu
 * @created 2024/03/31  18:30
 * @slogan 千里之行始于足下
 */
public class SpringStart {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBean user = applicationContext.getBean("user", UserBean.class);
		System.out.println(user.toString());

	}
}
