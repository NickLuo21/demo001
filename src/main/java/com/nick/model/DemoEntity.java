package com.nick.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Nick on 2017/3/11.
 */
@Entity
@Table(name = "DemoEntity")
@NamedQuery(name="DemoEntity.findAll", query="SELECT e FROM DemoEntity e")
@ApiModel
public class DemoEntity implements Serializable{
    @Id
    @Column(name = "ENTITY_ID")
    private Long id;
    @Column(name = "ENTITY_NAME")
    private String name;
    @Column(name = "ENTITY_COMMENT")
    private String comment;

    @ApiModelProperty(position = 1, required = true, value = "User ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty(position = 2, required = true, value = "username containing only lowercase letters")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(position = 3, required = true)
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
