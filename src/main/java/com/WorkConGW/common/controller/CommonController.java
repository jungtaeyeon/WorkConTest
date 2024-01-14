package com.WorkConGW.common.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.WorkConGW.attend.dto.AttendenceVO;
import com.WorkConGW.attend.service.AttendenceService;
import com.WorkConGW.board.notice.dto.NoticeVO;
import com.WorkConGW.board.notice.service.NoticeService;
import com.WorkConGW.common.command.FileUploadCommand;
import com.WorkConGW.common.dto.AlarmManageVO;
import com.WorkConGW.common.dto.AlarmVO;
import com.WorkConGW.common.dto.DashboardVO;
import com.WorkConGW.common.dto.HomeFormVO;
import com.WorkConGW.common.dto.MenuVO;
import com.WorkConGW.common.service.AlarmService;
import com.WorkConGW.common.service.HomeService;
import com.WorkConGW.common.service.MenuService;
import com.WorkConGW.emp.dto.EmpVO;
import com.WorkConGW.emp.service.EmpService;
import com.WorkConGW.exception.InvalidPasswordException;
import com.WorkConGW.exception.NotFoundIDException;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/common")
public class CommonController extends BaseController {
	
}
