package com.WorkConGW.noticeTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NoticeTestLogic {
    @Autowired
    NoticeTestDao noticeTestDao = null;
    public List<Map<String, Object>> noticeList() {
        List<Map<String, Object>> list = noticeTestDao.noticeList();
        return list;
    }
}
