package com.example.watidemo.service.impl;

import com.example.watidemo.mapper.WatiDemoMapper;
import com.example.watidemo.po.WatiDemoPO;
import com.example.watidemo.service.WatiDemoService;
import com.example.watidemo.vo.WatiDemoAddInVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class WatiDemoServiceImpl implements WatiDemoService {
    @Autowired
    private WatiDemoMapper mapper;

    /**
     * add.
     *
     * @param inVO
     * @return sum
     */
    @Override
    public String add(WatiDemoAddInVO inVO) {
        BigDecimal sum = new BigDecimal(inVO.getNum1()).add(new BigDecimal(inVO.getNum2()));
        WatiDemoPO demoPO = new WatiDemoPO();
        demoPO.setSum(sum.toString());
        mapper.add(demoPO);
        return sum.toString();
    }
}
