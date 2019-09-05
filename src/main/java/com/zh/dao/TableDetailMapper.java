package com.zh.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * Author zhanghe
 * Desc:
 * Date 2019/8/26 18:23
 */
public interface TableDetailMapper {

    @Select("select * from dxh_sys.tabledetail where vendorId=0 and tableName='skuProfitDayReport'")
    List<Map<String, Object>> list();

}
