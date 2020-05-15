package com.ceprei.carmes.entity;
import org.hswebframework.web.commons.entity.SimpleGenericEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.List;
import java.util.Date;

/**
* 质量特性参数体系集
* @author Ceprei 1.0
*/
@Getter
@Setter
@Table(name = "carmes_base_param")
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "质量特性参数体系集")
public class SimpleCarmesBaseParamEntity extends SimpleGenericEntity<String> implements CarmesBaseParamEntity{
    
    @ApiModelProperty(value = "")
    @Column(name = "param_type")
    private String paramType;
    
    @ApiModelProperty(value = "")
    @Column(name = "param_name")
    private String paramName;
    
    @ApiModelProperty(value = "")
    @Column(name = "expect_value")
    private Float expectValue;
    
    @ApiModelProperty(value = "")
    @Column(name = "other_desc")
    private String otherDesc;
    
}