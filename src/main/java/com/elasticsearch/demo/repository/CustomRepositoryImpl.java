package com.elasticsearch.demo.repository;

import com.elasticsearch.demo.entity.ReportEntity;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Repository;

@Repository
public class CustomRepositoryImpl implements CustomRepository {

    @Autowired
    ElasticsearchOperations elasticsearchOperations;

//    @Override
//    public String getReports() {
//        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
//        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
//        SearchRequest searchRequest=new SearchRequest("patient");
//        searchRequest.source(searchSourceBuilder);
//        SearchResponse searchResponse= (SearchResponse) elasticsearchOperations.search(searchRequest);
//        return searchResponse.toString();
//    }
}
