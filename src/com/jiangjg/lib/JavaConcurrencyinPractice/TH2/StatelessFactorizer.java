package com.jiangjg.lib.JavaConcurrencyinPractice.TH2;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * 无状态的servlet
 * 它既不包含任何域，也不包含任何对其他类中域的引用，因此是个无状态的对象
 * 这种只包含方法不包含域的对象是无状态对象，其一定是线程安全的。
 * 原子性
 * 竞态条件(Race Condition):当某个计算的正确性取决于多个线程的交替执行时序时，那么就会发生竞态条件
 * 	基于一种可能失效的观察结果来做出判断或者执行计算。这种类型的竞态条件称为“先检查后执行”
 * 要保持状态一致性，就需要在单个原子操作中更新所有相关的状态变量
 * 内置锁 Java的内置锁相当于一重互斥体，这意味着最多只有一个线程能持有这种锁。
 * 重入：某个线程试图获得一个已经由它自己持有的锁，那么这个请求就是重入。
 * 重入意味着获取锁的粒度是线程而不是调用
 */
public class StatelessFactorizer implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp)
			throws ServletException, IOException {
		
		
	}

}
