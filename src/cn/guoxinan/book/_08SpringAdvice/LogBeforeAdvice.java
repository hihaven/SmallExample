package cn.guoxinan.book._08SpringAdvice;

import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{
	private Logger logger=Logger.getLogger(this.getClass().getName());
	@Override
	public void before(Method m, Object[] args, Object target) throws Exception {
		// TODO Auto-generated method stub
		
		logger.log(Level.INFO, "start "+m);
		System.out.println("---------------------??????????????????");
	}

}
