/*
Lord Mendoza
SWE 645

This class is the implementation of the interface of the service layer, where the individual queries
are performed for retrieving list of saved surveys to db, and saving a row of survey data to table in the
db.
 */

package com.swe645.hw3.service.impl;

import com.swe645.hw3.model.SurveyTableEntity;
import com.swe645.hw3.repository.SurveyTableRepository;
import com.swe645.hw3.service.SurveyTableService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyTableServiceImpl implements SurveyTableService {

    public SurveyTableRepository surveyTableRepo;

    public SurveyTableServiceImpl(SurveyTableRepository surveyTableRepo) {
        super();
        this.surveyTableRepo = surveyTableRepo;
    }

    @Override
    public SurveyTableEntity saveSurveyEntry(SurveyTableEntity survey) {
        return surveyTableRepo.save(survey);
    }

    @Override
    public void updateSurveyEntry(SurveyTableEntity survey) {
        if (survey != null && survey.getId() != null) {
            Long id = survey.getId();
            Optional<SurveyTableEntity> surveyRecord = surveyTableRepo.findById(id);
            if (surveyRecord.isPresent()) {
                surveyTableRepo.save(survey);
            } else {
                throw new NullPointerException("Survey Entry not found");
            }
        } else {
            throw new NullPointerException("Survey is null, or survey id is null.");
        }
    }

    @Override
    public void deleteSurveyEntry(SurveyTableEntity survey) {
        if (survey != null && survey.getId() != null) {
            Long id = survey.getId();
            Optional<SurveyTableEntity> surveyRecord = surveyTableRepo.findById(id);
            if (surveyRecord.isPresent()) {
                surveyTableRepo.delete(survey);
            } else {
                throw new NullPointerException("Survey Entry not found");
            }
        } else {
            throw new NullPointerException("Survey is null, or survey id is null.");
        }
    }

    @Override
    public List<SurveyTableEntity> getAllSurveys() {
        return surveyTableRepo.findAll();
    }

}
