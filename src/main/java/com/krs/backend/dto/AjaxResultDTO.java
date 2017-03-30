package com.krs.backend.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by fanshuai on 17/3/30.
 */
public class AjaxResultDTO implements Serializable {
    /**
     * 返回码
     */
    private int code = 200;
    /**
     * 给用户看的提示信息
     */
    private String tipsMsg = "";
    /**
     * 错误信息
     */
    private String errorMsg = "";
    /**
     * 返回的数据列表
     */
    private Map data = new HashMap();

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }
}
