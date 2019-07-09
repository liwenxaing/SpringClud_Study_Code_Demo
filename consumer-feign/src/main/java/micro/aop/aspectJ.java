package micro.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class aspectJ {

//       @Before("pointcut()")
        public void before(JoinPoint joinPoint){
           System.out.println("123478");
       }


//        @Pointcut("execution(* *..controller..*.*(..))")
        public void pointcut(){};

}
