package concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {
	
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){};
	
	//环绕通知
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("CLAP CLAP CLAP!");
		} catch (Throwable e) {
			System.out.println("Demanding a refund");
		}
	}
	
//	
////	@Before("execution(**  concert.Performance.perform(..))")
//	@Before("performance()")
//	public void silenceCellPhones() {
//		System.out.println("Silencing cell phones");
//	}
//	
////	@Before("execution(** concert.Performance.perform(..))")
//	@Before("performance()")
//	public void takeSeats() {
//		System.out.println();
//	}
//	
////	@AfterReturning("execution(** concert.Performance.perform(..))")
//	@AfterReturning("performance()")
//	public void applause() {
//		System.out.println("CLAP CLAP CLAP !");
//	}
//	
////	@AfterThrowing("execution (** concert.Performance.perform(..))")
//	@AfterThrowing("performance()")
//	public void demandRefund() {
//		System.out.println("Demand a refund");
//	}
	
}
