package com.WorkConGW.doc.controller;

import java.sql.SQLException;
import java.util.List;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorkConGW.common.controller.BaseController;
import com.WorkConGW.common.dto.AttachVO;
import com.WorkConGW.doc.dto.DocFormVO;
import com.WorkConGW.doc.dto.DocVO;
import com.WorkConGW.doc.service.DocService;
import com.WorkConGW.emp.dto.EmpVO;
import com.WorkConGW.emp.service.EmpService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/doc")
public class DocController extends BaseController {

}
