package com.examplepluralsight.confrencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplepluralsight.confrencedemo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
