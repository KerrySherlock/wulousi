package com.ceprei.carmes.controller;

import com.ceprei.carmes.entity.CarmesWorkItemEntity;
import com.ceprei.carmes.service.CarmesWorkItemService;
import com.ceprei.common.controller.SimpleGenericEntityController;
import io.swagger.annotations.Api;
import org.hswebframework.web.authorization.annotation.Authorize;
import org.hswebframework.web.commons.entity.param.QueryParamEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 质量特性基础工作项
 * @author Ceprei 1.0
 */
@RestController
@RequestMapping("carmes_work_item")
@Authorize(permission = "carmes_work_item",description="质量特性基础工作项")
@Api(tags = "质量特性基础工作项",value="质量特性基础工作项")
public class CarmesWorkItemController implements SimpleGenericEntityController<CarmesWorkItemEntity, String, QueryParamEntity> {

    private CarmesWorkItemService carmesWorkItemService;
  
    @Autowired
    public void setCarmesWorkItemService(CarmesWorkItemService carmesWorkItemService) {
        this.carmesWorkItemService = carmesWorkItemService;
    }
  
    @Override
    public CarmesWorkItemService getService() {
        return carmesWorkItemService;
    }
}
