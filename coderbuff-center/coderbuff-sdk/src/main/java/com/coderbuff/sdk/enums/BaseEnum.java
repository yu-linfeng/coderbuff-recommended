package com.coderbuff.sdk.enums;

/**
 * @author OKevin
 * @description: 公共枚举接口
 * @date 2019-01-05 00:14
 */
public interface BaseEnum<T> {
    /**
     * 获取枚举码
     * @return 枚举码
     */
    T getCode();

    /**
     * 获取枚举描述
     * @return 描述
     */
    String getDesc();
}
