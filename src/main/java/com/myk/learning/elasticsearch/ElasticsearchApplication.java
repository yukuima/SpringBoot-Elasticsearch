package com.myk.learning.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Elasticsearch application
 * <p/>
 * Created in 2018.11.29
 * <p/>
 *
 * @author myk
 */
@SpringBootApplication
public class ElasticsearchApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(ElasticsearchApplication.class, args);
    }
}
