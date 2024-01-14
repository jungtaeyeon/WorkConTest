 package com.WorkConGW.emp.service;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.WorkConGW.board.BoardFormVO;
import com.WorkConGW.common.command.FileUploadCommand;
import com.WorkConGW.common.dao.DashboardDAO;
import com.WorkConGW.common.dto.AuthVO;
import com.WorkConGW.emp.dao.EmpDAO;
import com.WorkConGW.emp.dto.EmpVO;
import com.WorkConGW.exception.InvalidPasswordException;
import com.WorkConGW.exception.NotFoundIDException;
import com.WorkConGW.treeview.command.DeptDetailCommand;

import jakarta.servlet.http.HttpSession;

public class EmpService {
	
}
