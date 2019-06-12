package com.bingo.security.web.handler;

import com.bingo.security.exception.UserNotExistException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chengb
 * @date 2019/5/24 18:43
 */
@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(UserNotExistException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String,Object> userNotExistExceptionHandler(UserNotExistException e){
        Map<String,Object> result = new HashMap<>();
        result.put("id",e.getId());
        result.put("message",e.getMessage());
        return result;
    }
}
