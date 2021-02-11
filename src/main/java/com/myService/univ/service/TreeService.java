package com.myService.univ.service;

import com.myService.univ.dao.TreeDAO;
import com.myService.univ.model.TreeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TreeService {

    List<TreeVO> getRootNodes();
}
