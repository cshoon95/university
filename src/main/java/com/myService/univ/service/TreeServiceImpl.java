package com.myService.univ.service;

import com.myService.univ.dao.TreeDAO;
import com.myService.univ.model.TreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService{

    @Autowired
    TreeDAO treeDAO;

    @Override
    public List<TreeVO> getRootNodes() {
        List<TreeVO> list = treeDAO.getRootNodes();
        return list;
    }
}
