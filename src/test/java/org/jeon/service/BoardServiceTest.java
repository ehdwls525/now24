package org.jeon.service;

import javax.inject.Inject;

import org.jeon.vo.BoardVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardServiceTest {
	
	@Inject
	private BoardService service;

	@Test
	public void create() throws Exception{
		
		BoardVO vo = new BoardVO();
		
		vo.setBoard_title("제목3");
		vo.setBoard_content("내용3");
		vo.setBoard_nickname("글쓴이3");
		
		service.create(vo);
	}
	
	@Test
	public void list() throws Exception{
		
		service.list();
	}
	
	@Test
	public void read() throws Exception{
		
		service.read(3);
	}
	
	@Test
	public void update() throws Exception{
		
		BoardVO vo = new BoardVO();
		
		vo.setBoard_title("제목1 수정");
		vo.setBoard_content("내용1");
		vo.setBoard_no(3);
		
		service.update(vo);
	}
	
	@Test
	public void delete() throws Exception{
		
		service.delete(3);
	}

}
