package org.jeon.web;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

public class MybatisTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;

	@Test
	public void test() {
		
		System.out.println(sqlFactory);
	}

}
