package com.ceprei.carmes.controller;

import com.ceprei.common.controller.SimpleGenericEntityController;
import io.swagger.annotations.Api;
import org.hswebframework.web.authorization.annotation.Authorize;
import org.hswebframework.web.commons.entity.param.QueryParamEntity;
import com.ceprei.common.controller.SimpleGenericEntityController;
import com.ceprei.carmes.entity.CarmesBaseParamEntity;
import com.ceprei.carmes.service.CarmesBaseParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 质量特性参数体系集
 * @author Ceprei 1.0
 */
@RestController
@RequestMapping("carmes_base_param")
@Authorize(permission = "carmes_base_param",description="质量特性参数体系集")
@Api(tags = "质量特性参数体系集",value="质量特性参数体系集")
public class CarmesBaseParamController implements SimpleGenericEntityController<CarmesBaseParamEntity, String, QueryParamEntity> {

    private CarmesBaseParamService carmesBaseParamService;
  
    @Autowired
    public void setCarmesBaseParamService(CarmesBaseParamService carmesBaseParamService) {
        this.carmesBaseParamService = carmesBaseParamService;
    }
  
    @Override
    public CarmesBaseParamService getService() {
        return carmesBaseParamService;
    }
}
