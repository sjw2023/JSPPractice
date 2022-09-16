
@Component //빈으로 등록하기 위해
@Aspect //Aspect임을 알리는 어노테이션
public class LogAspect {
    //로거 생성
    Logger logger = loggerFactory.getLogger(logAspect.class);
    //Advice 부분
    //Around Annotation사용하면 안에서 joinPoint를 사용할수있게된다.
    //Join point는 기존의 서비스(메소드)를 말한다.
    @Around( "@annotation(LogExecutionTime)" )
    public Object logExecutionTime( ProcessingJoinPoint joinPoint ) throws Thrawable{
        Stopwatch stopwatch = new StopWatch(); // 우리가 추가하기 원하는 성능 측정을 위한 타이머를 시작하는 부분
        stopWatch.start();

        Object proceed = joinPoint.proceed(); // JoinPoint는 원래 서비스 메소드라고 했으므로 이부분은
                                            //   본래 메소드를 실행하는 부분

        stopWatch.stop();                      //우리가 추가하기 원하는 성능 측정을 위한 타이머를 멈추는 부분
        logger.info(stopWatch.prettyPrint());// 로거에 메소드를 실행하는동안 걸린 타이머시간이 기록될것이다.

        return proceed;
    }
}
