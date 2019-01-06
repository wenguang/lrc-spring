package lrc.spring.ccb.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Result {
    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    /**
     * .@Required注解作用于Beansetter方法上，用于检查一个Bean的属性的值在xml配置期间是否被赋予或设置(populated)
     *  若要想@Required注解起作用，还在配置文件中加上一句：<context:annotation-config/>
     */
    @Required
    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }
    @Required
    public void setMessage(String message) {
        this.message = message;
    }
}
