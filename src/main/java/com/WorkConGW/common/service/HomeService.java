package com.WorkConGW.common.service;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.WorkConGW.approval.dao.ApprovalDAO;
import com.WorkConGW.approval.dto.ApprovalVO;
import com.WorkConGW.attend.dto.AttendenceVO;
import com.WorkConGW.board.cac.dto.CacVO;
import com.WorkConGW.board.duty.dao.DutyDAO;
import com.WorkConGW.board.duty.dto.DutyVO;
import com.WorkConGW.board.issue.dao.IssueDAO;
import com.WorkConGW.board.issue.dto.IssueVO;
import com.WorkConGW.board.notice.dto.NoticeVO;
import com.WorkConGW.common.dao.DashboardDAO;
import com.WorkConGW.common.dao.HomeDAO;
import com.WorkConGW.common.dto.DashboardVO;
import com.WorkConGW.common.dto.HomeFormVO;
import com.WorkConGW.emp.dto.EmpVO;
import com.WorkConGW.reservation.dao.MeetRoomDAO;
import com.WorkConGW.reservation.dto.MeetRoomVO;
import com.WorkConGW.scheduler.dto.ScheduleVO;

import jakarta.servlet.http.HttpSession;

@Service
public class HomeService {
	
}
