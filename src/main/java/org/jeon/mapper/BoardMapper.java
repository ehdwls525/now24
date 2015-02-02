package org.jeon.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jeon.vo.BoardVO;

public interface BoardMapper {
	
	@Insert("insert into tbl_board(board_title, board_content, board_nickname)"
			+ " values (#{board_title}, #{board_content}, #{board_nickname})")
	public void create(BoardVO vo) throws Exception;
	
	@Select("select * from tbl_board")
	public List<BoardVO> list() throws Exception;
	
	@Select("select * from tbl_board where board_no = #{board_no}")
	public BoardVO read(int board_no) throws Exception;
	
	@Update("update tbl_board set board_title = #{board_title}, board_content = #{board_content}"
			+ " where board_no = #{board_no}")
	public void update(BoardVO vo) throws Exception;
	
	@Delete("delete from tbl_board where board_no = #{board_no}")
	public void delete(int board_no) throws Exception;
	
}
