package com.WorkConGW.board.issue.controller;

import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorkConGW.board.BoardFormVO;
import com.WorkConGW.board.issue.dto.IssueReplyVO;
import com.WorkConGW.board.issue.dto.IssueVO;
import com.WorkConGW.board.issue.dto.MilestoneVO;
import com.WorkConGW.board.issue.service.IssueService;
import com.WorkConGW.board.issue.service.MilestoneService;
import com.WorkConGW.common.controller.BaseController;
import com.WorkConGW.emp.dto.EmpVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board/issue")
public class IssueController extends BaseController {
	
	
}
