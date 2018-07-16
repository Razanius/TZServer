package com.example.demoo.repository;

import com.example.demoo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {



    User findOneById(Long id);
    List<User> findByAgeGreaterThan(int age);

    List<User> findAllByArticleGreaterThan(int a);



    @Query("select u from User u where (u.article.size>:size )")
    List<User> findCv(@org.springframework.data.repository.query.Param("size") Integer size);


}
