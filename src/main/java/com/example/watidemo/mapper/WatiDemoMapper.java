package com.example.watidemo.mapper;

import com.example.watidemo.po.WatiDemoPO;
import com.example.watidemo.vo.WatiDemoAddInVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WatiDemoMapper {
    void add(WatiDemoPO po);
}
