package cn.wenzhu.designpattern.factorymethod;

import java.lang.reflect.Constructor;

public class SingletonFactory {
	
	private static Singleton singleton;
	
	static {
		try {
			Class<?> clazz = Class.forName(Singleton.class.getName());
			//�޲ι��췽��
			Constructor<?> constructor = clazz.getConstructor();
			//�ɷ���
			constructor.setAccessible(true);
			singleton = (Singleton) constructor.newInstance();
		} catch (Exception e) {
			//�쳣����
		}
	} 
	
	public static Singleton getSingletonInstance(){
		return singleton;
	}
}
