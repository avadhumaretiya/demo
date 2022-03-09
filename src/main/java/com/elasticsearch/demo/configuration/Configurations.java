package com.elasticsearch.demo.configuration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Component;


@Configuration
@Component
public class Configurations  {//extends AbstractElasticsearchConfiguration

//    @Value("${elasticsearch.host}")
//    public String host;
//    @Value("${elasticsearch.port}")
//    public int port;

//    @Value("${elasticsearch.url}")
//    public String url;
//
//    @Override
//    public RestHighLevelClient elasticsearchClient() {
//
//        final ClientConfiguration configuration =
//                ClientConfiguration
//                        .builder()
//                        .connectedTo(url)
//                        .build();
//        return RestClients.create(configuration).rest();
//    }

    @Bean
    public RestHighLevelClient client() {
        ClientConfiguration clientConfiguration
                = ClientConfiguration.builder()
                .connectedTo("localhost:9200")
                .build();

        return RestClients.create(clientConfiguration).rest();
    }

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchRestTemplate(client());
    }
}
