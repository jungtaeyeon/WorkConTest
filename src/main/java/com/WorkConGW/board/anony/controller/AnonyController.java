package com.WorkConGW.board.anony.controller;

import java.sql.SQLException;
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
import com.WorkConGW.board.anony.dto.AnonyReplyVO;
import com.WorkConGW.board.anony.dto.AnonyVO;
import com.WorkConGW.board.anony.service.AnonyService;
import com.WorkConGW.common.controller.BaseController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board/anony")
public class AnonyController extends BaseController{
}
