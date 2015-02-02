package org.jeon.vo;

import java.sql.Date;

public class BoardVO {
	
	private int board_no;
	private String board_title;
	private String board_content;
	private String board_nickname;
	private String board_viewCnt;
	private Date board_regdate;
	
	public int getBoard_no() {
		return board_no;
	}
	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_content() {
		return board_content;
	}
	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	public String getBoard_nickname() {
		return board_nickname;
	}
	public void setBoard_nickname(String board_nickname) {
		this.board_nickname = board_nickname;
	}
	public String getBoard_viewCnt() {
		return board_viewCnt;
	}
	public void setBoard_viewCnt(String board_viewCnt) {
		this.board_viewCnt = board_viewCnt;
	}
	public Date getBoard_regdate() {
		return board_regdate;
	}
	public void setBoard_regdate(Date board_regdate) {
		this.board_regdate = board_regdate;
	}
	
	@Override
	public String toString() {
		return "BoardVO [board_no=" + board_no + ", board_title=" + board_title
				+ ", board_content=" + board_content + ", board_nickname="
				+ board_nickname + ", board_viewCnt=" + board_viewCnt
				+ ", board_regdate=" + board_regdate + "]";
	}
	
}
