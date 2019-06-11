package com.why.exception;

/**
 * ClassName: UserNotExistException
 * Description: TODO
 * Date: 2019-06-10 22:13
 *
 * @author Wang, Haoyue
 * @version V1.0
 * @since JDK 1.8
 */
public class UserNotExistException extends RuntimeException {

    private String id;

    public UserNotExistException(String id) {
        super("user not exist");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
