package com.examplepluralsight.confrencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplepluralsight.confrencedemo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
