package hello.advanced.trace.helloTrace;

import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloTraceV1 {

    public TraceStatus begin (String message) {
        TraceId traceId = new TraceId();
        Long startTimeMs = System.currentTimeMillis();
//        log.info([{}]);
        // 로그 출력
        return new TraceStatus(traceId, startTimeMs, message);
    }
}
