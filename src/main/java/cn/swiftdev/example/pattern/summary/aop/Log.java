package cn.swiftdev.example.pattern.summary.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
    @Pointcut("execution(* cn.swiftdev.example.pattern.summary.ioc..*(..))")
    public void aspect(){}

    @Before("aspect()")
    public void before(JoinPoint joinPoint){
        System.out.println("日志");
    }
}
