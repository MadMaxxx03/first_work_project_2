package com.example.first_work_project.controller;

import com.example.first_work_project.classes.NodeActivationCondition;
import com.example.first_work_project.service.NodeActivationConditionService;
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
@RequestMapping("/kb/nodeactivationcondition")
public class NodeActivationConditionController {

    @Autowired
    private NodeActivationConditionService nodeActivationConditionService;

    @RequestMapping(value = "/getall", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<NodeActivationCondition>> getAll(){
        return new ResponseEntity<>(nodeActivationConditionService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> save(@RequestBody NodeActivationCondition nodeActivationCondition) {
        System.out.println(nodeActivationCondition);
        nodeActivationConditionService.save(nodeActivationCondition);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> delete(@RequestBody NodeActivationCondition nodeActivationCondition) {
        nodeActivationConditionService.delete(nodeActivationCondition);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> update(@RequestBody NodeActivationCondition nodeActivationCondition) {
        nodeActivationConditionService.save(nodeActivationCondition);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping
    public ResponseEntity<String> status() {
        return new ResponseEntity<>("Working...", HttpStatus.OK);
    }

}
