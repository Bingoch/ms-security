package com.bingo.security.exception;

/**
 * @author chengb
 * @date 2019/5/24 18:36
 */
public class UserNotExistException extends RuntimeException{
    private Integer id;

    public UserNotExistException(Integer id) {
        super("User Not Exist");
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
