package com.dequan.common.utils;


import com.dequan.common.enums.EnumErrorType;
import com.dequan.common.exception.LpforumException;

/**
 *异常处理工具类
 * @author lipeng
 * @version Id: ExceptionHandlerUtil.java, v 0.1 2019/4/25 19:43 lipeng Exp $$
 */
public class ExceptionHandlerUtil {

    public static void handlerException(String errCode, String errMsg, EnumErrorType errorType){
        throw new LpforumException(errCode,errMsg,errorType);
    }
}
