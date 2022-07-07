package com.springjpa.study.demo.team;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamJpaRepository extends JpaRepository<Team, Long> {
}
