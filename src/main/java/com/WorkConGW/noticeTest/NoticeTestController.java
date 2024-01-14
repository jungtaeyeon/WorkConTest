package com.WorkConGW.noticeTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/noticeTest/*")
public class NoticeTestController {
    Logger logger = LoggerFactory.getLogger(NoticeTestController.class);
    @Autowired
    NoticeTestLogic noticeTestLogic = null;

    @GetMapping("noticeList")
    public String noticeList(){
        List<Map<String, Object>> list = noticeTestLogic.noticeList();
        logger.info(list.toString());
        return "";
    }
}

