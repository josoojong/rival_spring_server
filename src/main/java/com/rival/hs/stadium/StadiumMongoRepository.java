package com.rival.hs.stadium;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Minwoo on 2017. 4. 1..
 */
public interface StadiumMongoRepository extends MongoRepository<StadiumDo, String> {


    public Page<StadiumDo> findAll(Pageable pageable);

}
