package org.jeon.mockmvc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class BoardControllerTest {

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void test() throws Exception{
		System.out.println("mockMvc : " +mockMvc);
		
		MvcResult result = 
				mockMvc.perform(MockMvcRequestBuilders.get("/board/list")).andReturn();
		
		System.out.println(result.getModelAndView().getModel());
	}
	
	@Test
	public void test2() throws Exception{
		
		System.out.println("mockMvc : " +mockMvc);
		
		mockMvc.perform(MockMvcRequestBuilders.post("/board/update")
				.param("board_no", "5")
				.param("board_title", "제목5")
				.param("board_content", "내용5")
			);
	}
	
	@Test
	public void test3() throws Exception{
		System.out.println("mockMvc : " +mockMvc);
		
		MvcResult result = 
				mockMvc.perform(MockMvcRequestBuilders.get("/read")
						.param("board_no", "4")
						)
						.andReturn();
		
		System.out.println(result.getModelAndView().getModel());
	}
}
