package com.WorkConGW.board.duty.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorkConGW.board.BoardFormVO;
import com.WorkConGW.board.duty.command.DutyManagerCommand;
import com.WorkConGW.board.duty.dto.DutyReplyVO;
import com.WorkConGW.board.duty.dto.DutyVO;
import com.WorkConGW.board.duty.service.DutyService;
import com.WorkConGW.common.controller.BaseController;
import com.WorkConGW.common.dto.AttachVO;
import com.WorkConGW.emp.dto.EmpVO;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board/duty")
public class DutyController extends BaseController {
	
}
