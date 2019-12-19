package com.qf.laf.service;

import org.springframework.stereotype.Service;

@Service("userServiceImpl")
public class TestServiceImpl {
    public String test() {
        return "hello test";
    }
}
