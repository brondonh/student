package com.brayanrondonh.student.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration
{
    protected String getDatabaseName()
    {
        return "Bootcamp";
    }

    public MongoClient mongoClient()
    {
        return new MongoClient("mongo",27017);
    }

    protected String getMappingBasePackage()
    {
        return "com.brayabrondonh.student.dto";
    }
}
