package com.hachinet.dao;

import com.hachinet.model.entity.TestEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class TestDAOImpl implements TestDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public TestEntity findbyId(int Id) {
        CriteriaBuilder builder = sessionFactory.getCriteriaBuilder();
        CriteriaQuery<TestEntity> criteria = builder.createQuery(TestEntity.class);
        Root<TestEntity> root = criteria.from(TestEntity.class);
        criteria.select(root).where(builder.equal(root.get("id"), Id));
        List<TestEntity> testEntity = sessionFactory.getCurrentSession().createQuery(criteria)
                .getResultList();
        if (CollectionUtils.isEmpty(testEntity)) {
            return null;
        }
        return testEntity.get(0);
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
