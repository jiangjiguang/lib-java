package com.jiangjg.lib.JavaConcurrencyinPractice.TH2;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/*
 * ��״̬��servlet
 * ���Ȳ������κ���Ҳ�������κζ���������������ã�����Ǹ���״̬�Ķ���
 * ����ֻ����������������Ķ�������״̬������һ�����̰߳�ȫ�ġ�
 * ԭ����
 * ��̬����(Race Condition):��ĳ���������ȷ��ȡ���ڶ���̵߳Ľ���ִ��ʱ��ʱ����ô�ͻᷢ����̬����
 * 	����һ�ֿ���ʧЧ�Ĺ۲����������жϻ���ִ�м��㡣�������͵ľ�̬������Ϊ���ȼ���ִ�С�
 * Ҫ����״̬һ���ԣ�����Ҫ�ڵ���ԭ�Ӳ����и���������ص�״̬����
 * ������ Java���������൱��һ�ػ����壬����ζ�����ֻ��һ���߳��ܳ�����������
 * ���룺ĳ���߳���ͼ���һ���Ѿ������Լ����е�������ô�������������롣
 * ������ζ�Ż�ȡ�����������̶߳����ǵ���
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
