package org.ssm.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.ssm.utils.DateUtils;

import java.util.Arrays;

@Aspect
public class LogService {
    private static Logger log = Logger.getLogger(LogService.class);

    @Pointcut("execution(* org.ssm.service.*.*(..))")
    private void pointCut(){};

    @Before("pointCut()")
    public void before(JoinPoint joinPoint){
        log.info("###类名:"+joinPoint.getTarget()+",方法名:"
                +joinPoint.getSignature().getName()+",参数:"+ Arrays.toString(joinPoint.getArgs()));
    }

    @AfterReturning(pointcut="pointCut()",returning="returnValue")
    public void afterNoException(JoinPoint joinPoint,Object returnValue){
        log.info("###类名:"+joinPoint.getTarget()+",方法名:"
                +joinPoint.getSignature().getName()+",参数:"+Arrays.toString(joinPoint.getArgs())+"返回值：" + returnValue);
    }

    @AfterThrowing(pointcut="pointCut()",throwing="ex")
    public void afterNasException(JoinPoint joinPoint,RuntimeException ex){
        log.info("##afterHasException:类名是:" + joinPoint.getTarget() + ",方法:"
                + joinPoint.getSignature().getName() + ",异常是:"+ex);
    }

    @After("pointCut()")
    public void afterFinal(JoinPoint jp){
        log.info("##after:类名是:" + jp.getTarget() + ",方法:"
                + jp.getSignature().getName() +"在【"+ DateUtils.getNowTime()+"】这个时间执行完毕");
    }
}