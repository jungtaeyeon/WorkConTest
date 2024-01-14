package com.WorkConGW.addbook.service;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.WorkConGW.addbook.command.AddBookEmpCommand;
import com.WorkConGW.addbook.command.AddBookRegistCommand;
import com.WorkConGW.addbook.dao.AddBookDAO;
import com.WorkConGW.addbook.dto.AddBookFormVO;
import com.WorkConGW.addbook.dto.AddBookVO;
import com.WorkConGW.emp.dto.EmpVO;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpSession;

public class AddBookService {

}
