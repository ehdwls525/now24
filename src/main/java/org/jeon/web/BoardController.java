package org.jeon.web;

import javax.inject.Inject;

import org.jeon.service.BoardService;
import org.jeon.vo.BoardVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Inject
	private BoardService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void list(Model model) throws Exception{
		
		model.addAttribute("list", service.list());
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public void read(Model model, int board_no) throws Exception{
		
		model.addAttribute("read", service.read(board_no));
	}
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void write() throws Exception{
		
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String writePost(BoardVO vo) throws Exception{
		
		service.create(vo);
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.GET)
	public void update(Model model, int board_no) throws Exception{
		
		model.addAttribute("read", service.read(board_no));
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updatePost(BoardVO vo) throws Exception{
		
		service.update(vo);
		
		logger.info("===update===");
		
		return "redirect:/board/list";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deletePost(int board_no) throws Exception{
		
		service.delete(board_no);
		
		return "redirect:/board/list";
	}
	
}
