package com.coderbuff.dao;

import com.coderbuff.domain.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * MongoDB操作类
 * Created by OKevin on 2019-01-07 23:55
 */
@Component
public class RepoDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Repository> findRepoByName(String name) {
        Query query = new Query(Criteria.where("name").is(name));
        List<Repository> repositories = mongoTemplate.find(query, Repository.class);
        return repositories;
    }
}
