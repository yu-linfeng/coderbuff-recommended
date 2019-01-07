package com.coderbuff.enums;

/**
 * 编程语言枚举
 * Created by OKevin on 2019-01-07 23:37
 */
public enum LanguageEnum implements BaseEnum<String> {

    JAVA("Java", "Java");

    /**
     * 枚举码
     */
    private String code;

    /**
     * 枚举码描述
     */
    private String desc;

    LanguageEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getDesc() {
        return this.desc;
    }}
