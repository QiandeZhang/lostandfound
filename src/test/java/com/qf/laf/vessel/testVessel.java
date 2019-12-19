package com.qf.laf.vessel;

import com.qf.laf.container.BaseSpringTest;
import com.qf.laf.mapper.ITestMapper;
import com.qf.laf.service.TestServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

public class testVessel extends BaseSpringTest {
    @Resource
    TestServiceImpl testServiceImpl;
    @Resource
    ITestMapper testMapper;
    @Test
    public void testUserService() {
        System.out.println(testServiceImpl);
    }
    @Test
    public void testMapper() {
        System.out.println(testMapper.testClient());
    }

    @Test
    public void testLogger() {
        Logger logger = LoggerFactory.getLogger(testVessel.class);
        logger.info("这是一条测试用的日志");
    }
}
