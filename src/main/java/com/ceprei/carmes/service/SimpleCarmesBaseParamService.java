package com.ceprei.carmes.service;

import com.ceprei.carmes.dao.CarmesBaseParamDao;
import com.ceprei.carmes.entity.CarmesBaseParamEntity;
import com.ceprei.carmes.service.CarmesBaseParamService;
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
@Service("carmesBaseParamService")
@CacheConfig(cacheNames="carmesBaseParam")
public class SimpleCarmesBaseParamService extends EnableCacheAllEvictGenericEntityService<CarmesBaseParamEntity, String>
        implements CarmesBaseParamService {
            
    @Autowired
    private CarmesBaseParamDao carmesBaseParamDao;
    
    @Override
    protected IDGenerator<String> getIDGenerator() {
        return IDGenerator.MD5;
    }
    @Override
    public CarmesBaseParamDao getDao() {
        return carmesBaseParamDao;
    }

}
