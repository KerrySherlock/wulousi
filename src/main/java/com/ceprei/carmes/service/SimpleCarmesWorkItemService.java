package com.ceprei.carmes.service;

import com.ceprei.carmes.dao.CarmesWorkItemDao;
import com.ceprei.carmes.entity.CarmesWorkItemEntity;
import com.ceprei.carmes.service.CarmesWorkItemService;
import com.ceprei.common.service.EnableCacheAllEvictGenericEntityService;
import org.hswebframework.web.id.IDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.stereotype.Service;

/**
 * 默认的服务实现
 *
 * @author Ceprei 1.0
 */
@Service("carmesWorkItemService")
@CacheConfig(cacheNames="carmesWorkItem")
public class SimpleCarmesWorkItemService extends EnableCacheAllEvictGenericEntityService<CarmesWorkItemEntity, String>
        implements CarmesWorkItemService {
            
    @Autowired
    private CarmesWorkItemDao carmesWorkItemDao;
    
    @Override
    protected IDGenerator<String> getIDGenerator() {
        return IDGenerator.MD5;
    }
    @Override
    public CarmesWorkItemDao getDao() {
        return carmesWorkItemDao;
    }

}
