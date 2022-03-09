package com.elasticsearch.demo.controller;

import com.elasticsearch.demo.entity.ReportEntity;
import com.elasticsearch.demo.exception.ESRecordNotFound;
import com.elasticsearch.demo.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/report")
public class BaseContoller {

    @Autowired
    BaseService baseService;

    @GetMapping(value = "/patient/{id}")
    public ReportEntity getDocument(String id) throws ESRecordNotFound {
        return baseService.getDocument(id);
    }

    @PostMapping(value = "/patient")
    public ReportEntity saveDocument(@RequestBody ReportEntity reportEntity) {
        return baseService.saveDocument(reportEntity);
    }

    @GetMapping(value = "/reports")
    public String getDocumentsWithCustom(){
        return baseService.getDocumentsWithCustom();
    }
}
