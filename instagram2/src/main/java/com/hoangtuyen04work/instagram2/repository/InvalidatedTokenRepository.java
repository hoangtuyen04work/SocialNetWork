package com.hoangtuyen04work.instagram2.repository;

import com.hoangtuyen04work.instagram2.entity.InvalidatedTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedTokenEntity, String> {

}
