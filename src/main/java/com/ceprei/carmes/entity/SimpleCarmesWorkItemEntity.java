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
* 质量特性基础工作项
* @author Ceprei 1.0
*/
@Getter
@Setter
@Table(name = "carmes_work_item")
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "质量特性基础工作项")
public class SimpleCarmesWorkItemEntity extends SimpleGenericEntity<String> implements CarmesWorkItemEntity{
    
    @ApiModelProperty(value = "")
    @Column(name = "work_item_name")
    private String workItemName;
    
    @ApiModelProperty(value = "")
    @Column(name = "quality_chara")
    private String qualityChara;
    
    @ApiModelProperty(value = "")
    @Column(name = "other_desc")
    private String otherDesc;
    
    @ApiModelProperty(value = "")
    @Column(name = "delete_yn")
    private String deleteYn;
    
}