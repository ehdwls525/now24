package org.jeon.mapper;

import javax.inject.Inject;

import org.jeon.vo.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardMapperTest {

	@Inject
	private BoardMapper mapper;
	
	@Test
	public void create() throws Exception{
		
		BoardVO vo = new BoardVO();
		
		vo.setBoard_title("力格");
		vo.setBoard_content("郴侩");
		vo.setBoard_nickname("臂敬捞");
		
		mapper.create(vo);
	}
	
	@Test
	public void list() throws Exception{
		
		mapper.list();
	}
	
	@Test
	public void read() throws Exception{
		
		mapper.read(2);
	}
	
	@Test
	public void update() throws Exception{
		
		BoardVO vo = new BoardVO();
		
		vo.setBoard_title("力格2");
		vo.setBoard_content("力格2");
		vo.setBoard_no(2);
		
		mapper.update(vo);
	}
	
	@Test
	public void delete() throws Exception{
		
		mapper.delete(2);
	}

}
