package com.jiangjg.lib.JavaAndPattern.TH15;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigManager {
	//�����ļ�ȫ��
	private static final String PFILE = System.getProperty("user.dir") + File.separator + "Singleton.properties";
	//��Ӧ�������ļ����ļ��������
	private File m_file = null;
	//�����ļ�������޸�����
	private long m_lastModifiedime = 0;
	//�����ļ�����Ӧ�����Զ������
	private Properties m_propers = null;
	
	private static ConfigManager m_instance = new ConfigManager();
	private ConfigManager(){
		m_file = new File(PFILE);
		m_lastModifiedime = m_file.lastModified();
		if(m_lastModifiedime == 0){
			System.out.println(PFILE + " file does not exit!");
		}
		m_propers = new Properties();
		try {
			m_propers.load(new FileInputStream(PFILE));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	synchronized public static ConfigManager getInstance(){
		return m_instance;
	}
	
	final public Object getConfigItem(String name, Object defaultVal){
		long newTime = m_file.lastModified();
		if(newTime == 0){
			if(m_lastModifiedime == 0){
				//�����ļ�������
			}
			else {
				//�����ļ���ɾ��
			}
			return defaultVal;
		}
		else if(newTime > m_lastModifiedime){
			m_propers.clear();
			try {
				m_propers.load(new FileInputStream(PFILE));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		m_lastModifiedime = newTime;
		Object val = m_propers.getProperty(name);
		if(val == null){
			return defaultVal;
		}
		else{
			return val;
		}
	}
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(File.separator);

	}

}
