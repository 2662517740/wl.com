package com.web.utils;


import com.web.entity.response.AppResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice(annotations = RestController.class)
@Slf4j
public class TotalExceptionHandler {

    @ExceptionHandler
    private AppResponse runtimeException(Exception e) {
//        e.getMessage();
        log.error(e.getMessage());
        return AppResponse.bizError("你的机器有问题！");
    }
}
