/*
Lord Mendoza
SWE 645

This interface holds the methods for the service layer for handling the API requests from controller.
 */

package com.swe645.hw3.service;

import java.util.List;

import com.swe645.hw3.model.SurveyTableEntity;

public interface SurveyTableService {

	List<SurveyTableEntity> getAllSurveys();
	SurveyTableEntity saveSurveyEntry(SurveyTableEntity survey);
	void updateSurveyEntry(SurveyTableEntity survey);
	void deleteSurveyEntry(SurveyTableEntity survey);
}
