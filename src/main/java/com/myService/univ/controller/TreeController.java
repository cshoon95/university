package com.myService.univ.controller;

import com.myService.univ.model.TreeVO;
import com.myService.univ.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TreeController {

    @Autowired
    TreeService treeService;

    @RequestMapping("/getRootNodes")
    public List<TreeVO> TreeNodes() {
        return treeService.getRootNodes();
    }
}
