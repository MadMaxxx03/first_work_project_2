package com.example.first_work_project.controller;

import com.example.first_work_project.classes.ObjectAttribute;
import com.example.first_work_project.service.ObjectAttributeService;
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
@RequestMapping("/objectattribute")
public class ObjectAttributeController {

    @Autowired
    private ObjectAttributeService objectAttributeService;

    @RequestMapping(value = "getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<ObjectAttribute>> getAll(){
        return new ResponseEntity<>(objectAttributeService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> save(@RequestBody ObjectAttribute objectAttribute) {
        System.out.println(objectAttribute);
        objectAttributeService.save(objectAttribute);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> delete(@RequestBody ObjectAttribute objectAttribute) {
        objectAttributeService.delete(objectAttribute);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> update(@RequestBody ObjectAttribute objectAttribute) {
        objectAttributeService.save(objectAttribute);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("Working...", HttpStatus.OK);
    }

}
