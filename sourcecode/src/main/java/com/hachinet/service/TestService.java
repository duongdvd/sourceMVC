package com.hachinet.service;

import com.hachinet.model.entity.TestEntity;

import java.util.List;

public interface TestService {
    TestEntity findbyId(int Id);
    boolean addTest(TestEntity testEntity);
    List<TestEntity> findall();
}
