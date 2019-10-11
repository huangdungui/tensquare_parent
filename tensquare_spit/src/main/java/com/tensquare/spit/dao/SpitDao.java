package com.tensquare.spit.dao;

import com.tensquare.spit.pojo.Spit;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @program: tensquare_parent
 * @description: Dao
 * @author: huangdungui
 * @create: 2019-10-11 15:13
 **/
public interface SpitDao extends MongoRepository<Spit,String> {

}
