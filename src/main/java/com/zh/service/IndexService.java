package com.zh.service;

import com.zh.dao.TableDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Author zhanghe
 * Desc:
 * Date 2019/8/26 18:25
 */
@Service
public class IndexService {

    @Autowired
    private TableDetailMapper tableDetailMapper;

    public List<Map<String, Object>> list(){
        return tableDetailMapper.list();
    }

}
