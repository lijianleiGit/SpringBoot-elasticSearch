package com.example.demo.elasticsearch.service.impl;

import com.example.demo.elasticsearch.service.EsQuestionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

@Service
public class EsQuestionServiceImpl implements EsQuestionService {
    //索引名字
    private final static String INDEX_NAME = "little-mistake";

    //类型名字
    private final static String TYPE_NAME = "question";

    //建议查询的搜索字段
    private final static String suggest_name = "suggest";

    private static final Logger logger = LoggerFactory.getLogger(EsQuestionService.class);

//    @Autowired
//    private ElasticsearchTemplate elasticsearchTemplate;


    @Override
    public void test() {
        System.out.println("ee");
    }
}
