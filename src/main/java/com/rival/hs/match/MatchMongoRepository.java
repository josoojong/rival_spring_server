package com.rival.hs.match;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


import java.util.List;

/**
 * Created by Minwoo on 2017. 3. 16..
 */

public interface MatchMongoRepository extends MongoRepository<MatchDo, String> {

    @Query(value = "{ 'city' : ?0, 'type' : ?1 }")
    public List<MatchDo> findByCityAndType(String city, String type);

    @Query(value = "{ 'type' : ?0, 'city' : ?1 }")
    public Page<MatchDo> findByType(String type, String city, Pageable pageable);

  /*  @Query(value = "{ 'city' : ?0}")
    public Page<MatchDo> findByLocation(String city, Pageable pageable);*/
    //public List<GameDo> find

    //public List<MatchDo> find
}
