
@Component
@Aspect
public class LogAspect {
    @Around( "@annotation(LogExecutionTime)" )
    public Object logExecutionTime( ProcessingJoinPoint joinPoint ) throws Thrawable{
        Stopwatch stopwatch = new StopWatch();
        stopWatch.start();

        Object proceed = joinPoint.proceed();

        stopWatch.stop();
        logger.info(stopWatch.prettyPrint());

        return proceed;
    }
}
