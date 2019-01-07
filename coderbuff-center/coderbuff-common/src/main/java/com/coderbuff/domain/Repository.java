package com.coderbuff.domain;

import com.coderbuff.enums.LanguageEnum;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

/**
 * 代码仓库实体类，对应MongoDB中的repo
 * Created by OKevin on 2019-01-07 23:31
 */
@Data
@ToString
@Document(collection = "repo")
public class Repository implements Serializable {

    private static final long serialVersionUID = -5450817881047545026L;

    /**
     * MongoDB主键 _id
     */
    @Id
    private String id;

    /**
     * 仓库名字
     */
    @Field
    private String name;

    /**
     * 仓库地址
     */
    @Field
    private String url;

    /**
     * 仓库描述
     */
    @Field
    private String description;

    /**
     * 编程语言
     * {@link com.coderbuff.enums.LanguageEnum}
     */
    @Field
    private LanguageEnum language;

    /**
     * star数
     */
    @Field
    private Integer star;

    /**
     * fork数
     */
    private Integer fork;

}
