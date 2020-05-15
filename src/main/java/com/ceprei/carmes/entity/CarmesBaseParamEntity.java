package com.ceprei.carmes.entity;

import org.hswebframework.web.commons.entity.GenericEntity;
import java.util.Date;

public interface CarmesBaseParamEntity extends GenericEntity<String> {
    
    
      String paramType = "";
    
    
      String paramName = "";
    
    
      Float expectValue = 0f; 
    
    
      String otherDesc = "";
    
    
}
