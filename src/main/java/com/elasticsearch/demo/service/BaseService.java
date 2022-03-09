package com.elasticsearch.demo.service;

import com.elasticsearch.demo.entity.ReportEntity;
import com.elasticsearch.demo.exception.ESRecordNotFound;

import java.util.Optional;

public interface BaseService {

    public ReportEntity getDocument(String id) throws ESRecordNotFound;

    public ReportEntity saveDocument(ReportEntity reportEntity);

    public String getDocumentsWithCustom();
}
