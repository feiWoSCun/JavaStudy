package com.itextpdf.controller;

import com.itextpdf.service.impl.selectZdMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ITextController {
    @Autowired
    private selectZdMapperServiceImpl impl;

    //各请求的作用
    @RequestMapping("/getPdf")
    public String doText() throws Exception {
 /*       //以数组的形式返回所有表单名
        String[] sheetNames = impl.getSheetNames();
        for (String sheetName : sheetNames) {
            List<?> objects = impl.transListIntoEntity(sheetName);
        }*/
        return null;
    }
}
