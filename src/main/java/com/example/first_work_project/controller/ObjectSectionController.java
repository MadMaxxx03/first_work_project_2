package com.example.first_work_project.controller;

import com.example.first_work_project.classes.Application;
import com.example.first_work_project.classes.ObjectSection;
import com.example.first_work_project.service.ApplicationService;
import com.example.first_work_project.service.ObjectConnectionService;
import com.example.first_work_project.service.ObjectSectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/objectsections")
public class ObjectSectionController {

    @Autowired
    private ObjectSectionService objectSectionService;

    @RequestMapping(value = "getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ObjectSection>> getAll(){
        return new ResponseEntity<>(objectSectionService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> save(@RequestBody ObjectSection objectSection) {
        System.out.println(objectSection);
        objectSectionService.save(objectSection);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> delete(@RequestBody ObjectSection objectSection) {
        objectSectionService.delete(objectSection);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> update(@RequestBody ObjectSection objectSection) {
        objectSectionService.save(objectSection);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("Working...", HttpStatus.OK);
    }

}
