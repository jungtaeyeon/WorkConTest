package com.WorkConGW.board.qt.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.WorkConGW.board.BoardFormVO;
import com.WorkConGW.board.qt.dto.QtVO;
import com.WorkConGW.board.qt.service.QtService;
import com.WorkConGW.common.controller.CommonController;

@Controller
@RequestMapping("/board/qt")
public class QtController extends CommonController{

}
