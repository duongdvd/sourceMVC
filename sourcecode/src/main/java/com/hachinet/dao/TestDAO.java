package com.hachinet.dao;


import com.hachinet.model.entity.TestEntity;

import java.util.List;

public interface TestDAO  {
    TestEntity findbyId(int Id);
    boolean addTest(TestEntity testEntity);
    List<TestEntity> findall();
}
