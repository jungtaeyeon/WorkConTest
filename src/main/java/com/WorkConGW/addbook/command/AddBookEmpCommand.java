package com.WorkConGW.addbook.command;

import com.WorkConGW.addbook.dto.AddBookVO;

/** DB에서 emp정보 조회하여 주소록에 필요한 값 받기 위한 VO */
public class AddBookEmpCommand extends AddBookVO{
	

	public AddBookVO toAddBookVO() {
		AddBookVO addBookVO = new AddBookVO();
		
		return addBookVO;
	}
}
