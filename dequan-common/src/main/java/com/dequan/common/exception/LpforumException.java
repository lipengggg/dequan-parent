package com.dequan.common.exception;

import com.dequan.common.abstracts.AbstractExceptionWrapper;
import com.dequan.common.enums.EnumErrorType;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author lipeng
 * @version Id: LpforumException.java, v 0.1 2019/4/25 19:15 lipeng Exp $$
 */
public class LpforumException extends AbstractExceptionWrapper {
    /**  */
    private static final long   serialVersionUID = -4925740763089830032L;

    private static final String TENANT_ID        = "tenantId";
    private static final String MODEL_NAME       = "WEB";

    /**
     * 例外代码
     */
    public String  iErrCode         = "";

    /**
     * 详细信息
     */
    public String  iErrMessage      = "";

    /**
     * 构造ServiceException对象，并给定对象[异常信息]属性。
     * @param aMessage 异常信息
     */
    public LpforumException(String aMessage) {
        super(aMessage, null, null, null, null);
        this.iErrMessage = aMessage;
    }

    /**
     * 构造ServiceException对象，并给定对象[异常代码]及[异常信息]属性。
     * @param aCode 异常代码
     * @param aMessage 异常信息
     */
    public LpforumException(String aCode, String aMessage) {
        super(aMessage, aCode, TENANT_ID, MODEL_NAME, EnumErrorType.FLOW_ERR);
        iErrCode = aCode.trim();
        this.iErrMessage = aMessage;
    }

    /**
     * 构造ServiceException对象，并给定对象[异常代码]及[异常信息]属性。
     * @param aCode 异常代码
     * @param aMessage 异常信息
     */
    public LpforumException(String aCode, String aMessage, EnumErrorType type) {
        super(aMessage, aCode, TENANT_ID, MODEL_NAME, type);
        iErrCode = aCode.trim();
        this.iErrMessage = aMessage;
    }

    /**
     * 取得异常代码
     * @return 异常代码
     */
    public String getCode() {
        return iErrCode;
    }

    /**
     * 取得异常信息
     * @return 异常信息
     */
    public String getMessage() {
        return StringUtils.isBlank(super.getMessage()) ? this.iErrMessage : super.getMessage();
    }

    /**
     * @return the iErrMessage 详细信息
     */
    public String getErrMsg() {
        String errMsg = StringUtils.isBlank(iErrMessage) ? super.getMessage() : iErrMessage;
        return errMsg;
    }

    /**
     * 构造ServiceException对象，并给定对象[例外代码]、[详细信息]及[错误对象]属性。
     * @param iErrCode 例外代码
     * @param iErrMessage 详细信息
     * @param cause 错误对象
     */
    public LpforumException(String iErrCode, String iErrMessage, Throwable cause) {
        super(iErrMessage, iErrCode, TENANT_ID, MODEL_NAME, EnumErrorType.FLOW_ERR, cause);
        this.iErrCode = iErrCode.trim();
        this.iErrMessage = iErrMessage.trim();
    }
}
