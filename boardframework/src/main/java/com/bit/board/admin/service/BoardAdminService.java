package com.bit.board.admin.service;

import java.util.List;

import com.bit.board.admin.model.BoardListDto;
import com.bit.board.admin.model.CategoryDto;
import com.bit.board.model.BoardDto;

public interface BoardAdminService {

	List<BoardListDto> getBoardMenu();

	List<CategoryDto> getCategory();

	void makeCategory(CategoryDto categorydto);

	List<BoardDto> getBoardType();

	void makeBoard(BoardDto boardDto); 
	
	
}
