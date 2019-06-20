package com.mallotec.reb.corporatetraining.util;

import com.mallotec.reb.corporatetraining.pojo.Result;

public class ResultUtil {

    /***
     * 自定义请求结果
     *
     * @param code 状态码
     * @param msg 提示信息
     * @param data 要返回的数据
     * @return 请求结果
     */
    public static Result result(Integer code, String msg, Object data) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(msg);
        result.setData(data);
        return result;
    }

    /***
     * 带数据返回请求成功
     *
     * @param data 要返回的数据
     * @return 请求结果
     */
    public static Result success(Object data) {
        return result(200, "请求成功", data);
    }

    /***
     * 无数据返回请求成功
     *
     * @return 请求结果
     */
    public static Result success() {
        return success(null);
    }

    /***
     * 自定义提示信息带数据返回请求成功
     *
     * @param data 要返回的数据
     * @param msg 提示信息
     * @return 请求结果
     */
    public static Result customizedSuccess(String msg, Object data) {
        return result(200, msg, data);
    }
    /***
     * 自定义提示信息无数据返回请求成功
     *
     * @param msg 提示信息
     * @return 请求结果
     */
    public static Result customizedSuccess(String msg) {
        return result(200, msg, null);
    }

    /***
     * 无数据返回请求失败
     *
     * @param errorCode 错误码
     * @param errorMsg 错误信息
     * @return 请求结果
     */
    public static Result error(Integer errorCode, String errorMsg) {
        return result(errorCode, errorMsg, null);
    }

    /***
     * 无数据返回请求失败500
     *
     * @param errorMsg 错误信息
     * @return 请求结果
     */
    public static Result error500(String errorMsg) {
        return result(500, errorMsg, null);
    }

}
