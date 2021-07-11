package com.aws.respository;

import com.aws.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PersonRespository extends JpaRepository<Person,Integer> {
}
