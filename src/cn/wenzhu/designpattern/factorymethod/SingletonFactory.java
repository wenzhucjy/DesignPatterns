package cn.wenzhu.designpattern.factorymethod;

import java.lang.reflect.Constructor;

/**
 * 名称: SingletonFactory.java<br>
 * 描述: 负责生产单例的工厂类<br>
 * 类型: JAVA<br>
 * @since  2015年3月26日
 * @author jy.chen
 */
public class SingletonFactory {
	
	private static Singleton singleton;
	
	static {
		try {
			Class<?> clazz = Class.forName(Singleton.class.getName());
			//无参构造方法
			Constructor<?> constructor = clazz.getConstructor();
			//可访问
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			//异常处理
		}
	} 
	
	public static Singleton getSingletonInstance(){
		return singleton;
	}
}
