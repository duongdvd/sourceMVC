package com.hachinet.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class BaseService {
    protected Logger logger;

    public BaseService() {
        logger = LoggerFactory.getLogger(this.getClass());
    }

    public interface ServiceCaller {
        Object execute() throws Exception;
    }

}
