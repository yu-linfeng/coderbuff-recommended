package com.coderbuff.sdk.enums;

/**
 * @author OKevin
 * @description:
 * @date 2019-01-05 00:15
 */
public enum ErrorCodeEnum implements BaseEnum<String> {

    SUCCESS("2000", "成功");

    /**
     * 枚举码
     */
    private String code;

    /**
     * 枚举描述
     */
    private String desc;

    ErrorCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }}
