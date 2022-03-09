package com.elasticsearch.demo.service;

import com.elasticsearch.demo.entity.ReportEntity;
import com.elasticsearch.demo.exception.ESRecordNotFound;
import com.elasticsearch.demo.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BaseServiceImpl implements BaseService {

    @Autowired
    BaseRepository baseRepository;

    @Value("${error.messages}")
    private String errorMessage;

    @Override
    public ReportEntity getDocument(String id) throws ESRecordNotFound {
        Optional<ReportEntity> optionalReportEntity = baseRepository.findById(id);
        if (optionalReportEntity.isPresent()) {
            return optionalReportEntity.get();
        } else {
            throw new ESRecordNotFound(errorMessage);
        }
    }

    @Override
    public ReportEntity saveDocument(ReportEntity reportEntity) {
        return baseRepository.save(reportEntity);
    }

    @Override
    public String getDocumentsWithCustom() {
        return baseRepository.getReports();
    }
}
