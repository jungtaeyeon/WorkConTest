package com.WorkConGW.approval.controller;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
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
import org.springframework.web.bind.annotation.ResponseBody;

import com.WorkConGW.approval.dto.AgencyVO;
import com.WorkConGW.approval.dto.ApprovalFormVO;
import com.WorkConGW.approval.dto.ApprovalHistoryVO;
import com.WorkConGW.approval.dto.ApprovalSaveVO;
import com.WorkConGW.approval.dto.ApprovalVO;
import com.WorkConGW.approval.service.ApprovalService;
import com.WorkConGW.common.controller.BaseController;
import com.WorkConGW.emp.dto.EmpVO;
import com.WorkConGW.emp.service.EmpService;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/approval")
public class ApprovalController extends BaseController{
	
}
