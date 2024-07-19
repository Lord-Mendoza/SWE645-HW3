/*
Lord Mendoza
SWE 645 - HW 3

This repository holds the connection between the service layer and the JPA repository/RDS database.
 */

package com.swe645.hw3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swe645.hw3.model.SurveyTableEntity;

public interface SurveyTableRepository extends JpaRepository<SurveyTableEntity, Long> {

}
