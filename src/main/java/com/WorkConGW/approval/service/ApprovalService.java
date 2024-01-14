package com.WorkConGW.approval.service;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.WorkConGW.approval.dao.ApprovalDAO;
import com.WorkConGW.approval.dto.AgencyVO;
import com.WorkConGW.approval.dto.ApprovalAttachVO;
import com.WorkConGW.approval.dto.ApprovalHistoryVO;
import com.WorkConGW.approval.dto.ApprovalLineVO;
import com.WorkConGW.approval.dto.ApprovalSaveVO;
import com.WorkConGW.approval.dto.ApprovalVO;
import com.WorkConGW.approval.dto.FormVO;
import com.WorkConGW.common.command.FileUploadCommand;
import com.WorkConGW.emp.dao.EmpDAO;
import com.WorkConGW.emp.dto.EmpVO;

import jakarta.servlet.http.HttpSession;

public class ApprovalService{
	
}
