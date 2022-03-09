package com.elasticsearch.demo.repository;

import com.elasticsearch.demo.entity.ReportEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepository extends ElasticsearchRepository<ReportEntity, String>, CustomRepository {


}
