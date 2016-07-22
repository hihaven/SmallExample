package cn.guoxinan.book._07SpringAdvice;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class logBefor implements MethodBeforeAdvice{
	private Logger log=Logger.getLogger(this.getClass().getName());

	public void before(Method m, Object[] args, Object target) {
		log.log(Level.INFO," -------"+m);
		
	}
}
