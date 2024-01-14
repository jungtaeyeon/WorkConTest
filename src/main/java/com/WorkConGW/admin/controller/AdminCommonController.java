package com.WorkConGW.admin.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorkConGW.admin.dto.AdminFormVO;
import com.WorkConGW.board.notice.dto.NoticeVO;
import com.WorkConGW.board.notice.service.NoticeService;
import com.WorkConGW.common.controller.BaseController;
import com.WorkConGW.common.dto.DeptVO;
import com.WorkConGW.common.dto.MenuVO;
import com.WorkConGW.common.dto.TimeVO;
import com.WorkConGW.common.service.DeptService;
import com.WorkConGW.common.service.MenuService;
import com.WorkConGW.common.service.TimeService;
import com.WorkConGW.emp.dto.EmpVO;
import com.WorkConGW.emp.service.EmpService;
import com.WorkConGW.reservation.dto.ReservationComplainVO;
import com.WorkConGW.reservation.service.MeetRoomService;

@Controller
@RequestMapping("/admin")
public class AdminCommonController extends BaseController{
	
}
