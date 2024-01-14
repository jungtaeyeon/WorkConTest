package com.WorkConGW.noticeTest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class NoticeTestDao {
    @Autowired
    SqlSessionTemplate sqlSessionTemplate = null;

    public List<Map<String, Object>> noticeList() {
        List<Map<String, Object>> list = sqlSessionTemplate.selectList("noticeList");
        return list;
    }
}
