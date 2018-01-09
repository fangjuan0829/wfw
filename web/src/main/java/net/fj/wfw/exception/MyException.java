package net.fj.wfw.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * wfw Project
 * net.fj.wfw.exception
 * 2017-12-26-18:51
 * 2017fj
 * Created by fannyfang on 2017-12-26.
 */
//自定义异常对象
public class MyException extends RuntimeException {

    private Integer code;

    public MyException(Integer code,String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
