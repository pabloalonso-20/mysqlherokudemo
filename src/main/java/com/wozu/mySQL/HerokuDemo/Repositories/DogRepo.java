package com.wozu.mySQL.HerokuDemo.Repositories;

import com.wozu.mySQL.HerokuDemo.Models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepo extends CrudRepository<Dog, Long> {

}
