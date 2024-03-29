package com.dequan.common.entity;


import com.dequan.common.enums.EnumErrorType;

/**
 *
 * @author lipeng
 * @version Id: ExceptionInfo.java, v 0.1 2019/4/25 16:11 lipeng Exp $$
 */
public class ExceptionInfo{
    /** 错误码 **/
    private String errorCode;
    /** 错误类型 **/
    private EnumErrorType errorType;
    /** 租户号 **/
    private String tenantNo;
    /** 模块名称 **/
    private String moduleName;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public EnumErrorType getEnumErrorType() {
        return errorType;
    }

    public void setEnumErrorType(EnumErrorType errorType) {
        this.errorType = errorType;
    }

    public void setEnumErrorType(String errorType) {
        this.errorType = EnumErrorType.valueOf(errorType);
    }

    public String getTenantNo() {
        return tenantNo;
    }

    public void setTenantNo(String tenantNo) {
        this.tenantNo = tenantNo;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
