package com.hachinet.service;

import com.hachinet.dao.TestDAO;
import com.hachinet.model.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TestServiceImpl extends BaseService implements TestService {
    @Autowired
    TestDAO testDAO;

    @Override
    public TestEntity findbyId(int Id) {
        return testDAO.findbyId(Id);
    }

    @Override
    public boolean addTest(TestEntity testEntity) {
        return false;
    }

    @Override
    public List<TestEntity> findall() {
        return null;
    }
}
