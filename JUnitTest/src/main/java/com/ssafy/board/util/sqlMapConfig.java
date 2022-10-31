package com.ssafy.board.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class sqlMapConfig {
	private static SqlSessionFactory factory;
	
	static {
		try {
			String resource = "mapper/mybatis-config.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSqlSession() {
		return factory.openSession();
	}
}
