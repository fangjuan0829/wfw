package net.fj.wfw.utils;

import net.fj.wfw.domain.Result;

/**
 * wfw Project
 * net.fj.wfw.utils
 * 2017-12-26-18:33
 * 2017fj
 * Created by fannyfang on 2017-12-26.
 */
public class ResultUtil {

    public static Result success(Object object){
        Result result = new Result(0,"成功",object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result(code,msg);
        return result;
    }
}
