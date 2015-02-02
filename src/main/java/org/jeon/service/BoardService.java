package org.jeon.service;

import java.util.List;

import javax.inject.Inject;

import org.jeon.mapper.BoardMapper;
import org.jeon.vo.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

	@Inject
	private BoardMapper mapper;
	
	public void create(BoardVO vo) throws Exception{
		
		mapper.create(vo);
	}
	
	public List<BoardVO> list() throws Exception{
		
		return mapper.list();
	}
	
	public BoardVO read(int board_no) throws Exception{
		
		return mapper.read(board_no);
	}
	
	public void update(BoardVO vo) throws Exception{
		
		mapper.update(vo);
	}
	
	public void delete(int board_no) throws Exception{
		
		mapper.delete(board_no);
	}
}
