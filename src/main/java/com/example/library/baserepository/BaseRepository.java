package com.example.library.baserepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID>,
        JpaSpecificationExecutor<T>,
        CrudRepository<T,ID> {

}