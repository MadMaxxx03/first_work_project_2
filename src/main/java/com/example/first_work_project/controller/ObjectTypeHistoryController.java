package com.example.first_work_project.controller;

import com.example.first_work_project.classes.Object;
import com.example.first_work_project.classes.ObjectTypeHistory;
import com.example.first_work_project.service.ObjectService;
import com.example.first_work_project.service.ObjectTypeHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/objecttypehistory")
public class ObjectTypeHistoryController {

    @Autowired
    private ObjectTypeHistoryService objectTypeHistoryService;

    @RequestMapping(value = "getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ObjectTypeHistory>> getAll(){
        return new ResponseEntity<>(objectTypeHistoryService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> save(@RequestBody ObjectTypeHistory objectTypeHistory) {
        System.out.println(objectTypeHistory);
        objectTypeHistoryService.save(objectTypeHistory);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> delete(@RequestBody ObjectTypeHistory objectTypeHistory) {
        objectTypeHistoryService.delete(objectTypeHistory);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> update(@RequestBody ObjectTypeHistory objectTypeHistory) {
        objectTypeHistoryService.save(objectTypeHistory);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("Working...", HttpStatus.OK);
    }

}
