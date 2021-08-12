package com.devilnguyen.demospringboot.repository;

import com.devilnguyen.demospringboot.model.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserJpa extends CrudRepository<Users,Long>, PagingAndSortingRepository<Users, Long> {
    Page<Users> findAll(Pageable pageable);

    @Query("SELECT COUNT(u) FROM Users u")
    public Long getTotalUser();
}
