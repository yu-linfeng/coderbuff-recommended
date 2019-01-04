package com.coderbuff.sdk.domain;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author OKevin
 * @description: 统一的接口出参包装类（不分页）
 * @date 2019-01-04 23:39
 */
@Data
@ToString
public class Result<T> implements Serializable {
    private static final long serialVersionUID = -6704418511278744554L;
    /**
     * 请求ID，用于传递调用链路的UUID
     */
    private String reqId;

    /**
     * 接口返回数据
     */
    private T data;

    /**
     * 接口返回是否成功
     */
    private boolean success;

    /**
     * 接口返回错误码
     */
    private String code;

    /**
     * 接口返回信息
     */
    private String message;
}
