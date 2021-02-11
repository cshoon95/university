package com.myService.univ.dao;

import com.myService.univ.model.TreeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface TreeDAO {
    public List<TreeVO> getRootNodes();
}
