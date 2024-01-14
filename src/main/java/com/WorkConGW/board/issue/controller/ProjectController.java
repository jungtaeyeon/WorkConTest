package com.WorkConGW.board.issue.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WorkConGW.board.issue.command.ProjectCommand;
import com.WorkConGW.board.issue.dto.IssueVO;
import com.WorkConGW.board.issue.service.IssueService;
import com.WorkConGW.emp.dto.EmpVO;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/board")
public class ProjectController {

}
