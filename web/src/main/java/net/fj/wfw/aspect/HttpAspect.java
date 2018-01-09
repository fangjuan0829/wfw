package net.fj.wfw.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * wfw Project
 * net.fj.wfw.aspect
 * 2017-12-26-17:54
 * 2017fj
 * Created by fannyfang on 2017-12-26.
 */
@Component
@Aspect
public class HttpAspect {

    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * net.fj.wfw.controller.UserController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        logger.info("url={}",request.getRequestURI());

        //method
        logger.info("method={}",request.getMethod());

        //ip
        logger.info("ip={}",request.getRemoteAddr());

        //类方法
        logger.info("class_method={}",joinPoint.getSignature().getDeclaringTypeName() + "," + joinPoint.getSignature().getName());

        //参数
        logger.info("args={}",joinPoint.getArgs());

        logger.info("------Before------");

    }

    @After("log()")
    public void doAfter(){
        logger.info("------After------");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void DoAfterReturning(Object object){
        logger.info("response={}",object);
    }
}
