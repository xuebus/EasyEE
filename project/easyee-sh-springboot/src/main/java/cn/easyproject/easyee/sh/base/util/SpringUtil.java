package cn.easyproject.easyee.sh.base.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring工具类
 * 
 * @author easyproject.cn
 *
 */
@SuppressWarnings("unchecked")
public class SpringUtil {
	static ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	public static <T> T getBean(String name) {
		return (T) ac.getBean(name);
	}

}
