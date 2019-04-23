package com.k2data.kbc.properties.service.Impl;

import com.k2data.kbc.properties.dao.PropertiesMapper;
import com.k2data.kbc.properties.model.Properties;
import com.k2data.kbc.properties.service.PropertiesService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class PropertiesServiceImpl implements PropertiesService {

    @Autowired
    PropertiesMapper mapper;

    @Override
    public List<Properties> list(Map<String, Object> map) {
        return mapper.list(map);
    }

    @Override
    public void save(Properties Properties) {
        mapper.insert(Properties);
    }

    @Override
    public void deleteByPrimaryKey(Integer id) {
         mapper.deleteByPrimaryKey(id);
    }
}
