/*
Lord Mendoza
SWE 645 - HW 3

This controller is the entry point for the REST APIs that takes the GET/POST/DELETE/etc. requests from frontend, and
passes the work to service layer.
 */

package com.swe645.hw3.controller;

import com.swe645.hw3.model.SurveyTableEntity;
import com.swe645.hw3.service.SurveyTableService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/surveys")
@CrossOrigin
public class SurveyTableController {

    private final SurveyTableService surveyTableService;

    public SurveyTableController(SurveyTableService surveyTableService) {
        this.surveyTableService = surveyTableService;
    }

    @GetMapping("/getAllSurveyEntries")
    public ResponseEntity<List<SurveyTableEntity>> getAllSurveyEntries() {
        List<SurveyTableEntity> resp = surveyTableService.getAllSurveys();
        return new ResponseEntity<>(resp, HttpStatus.OK);
    }

    @PostMapping("/submit-survey")
    public ResponseEntity<String> saveSurveyEntry(@RequestBody SurveyTableEntity survey) {
        SurveyTableEntity resp = surveyTableService.saveSurveyEntry(survey);
        return new ResponseEntity<>("Student survey inserted under id {id}".replace("{id}", resp.getId().toString()), HttpStatus.OK);
    }

    @PostMapping("/update-survey")
    public ResponseEntity<String> updateSurvey(@RequestBody SurveyTableEntity survey) {
        try {
            surveyTableService.updateSurveyEntry(survey);
            return new ResponseEntity<>("Student survey id {id} has been updated".replace("{id}", survey.getId().toString()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/delete-survey")
    public ResponseEntity<String> deleteSurvey(@RequestBody SurveyTableEntity survey) {
        try {
            surveyTableService.deleteSurveyEntry(survey);
            return new ResponseEntity<>("Student survey id {id} has been deleted".replace("{id}", survey.getId().toString()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
