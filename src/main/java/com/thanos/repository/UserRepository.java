package com.thanos.repository;

import com.thanos.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;

/**
 * @author Thanos Yu
 * @date 2018/4/25
 */


@Repository
@Table(name="user")
@Qualifier("userRepository")
public interface UserRepository extends CrudRepository<User, Long > {

    @Override
    public User findOne(Long id);

    @Override
    public User save(User u);

    @Query("select t from User t where t.userName=:name")
    public User findUserByName(@Param("name") String name);
}
