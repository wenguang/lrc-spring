package lrc.spring.ccb.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Moo {
    @Autowired(required = true)
    private Car car;
    @Autowired
    private Fun fun;

//    public Car getCar() {
//        return car;
//    }
//    @Autowired(required = true)
//    public void setCar(Car car) {
//        this.car = car;
//    }

    /**
     * 在构造函数上用Autowired的效果是一样的
     */
    //@Autowired
//    public Moo(Car car, Fun fun) {
//        this.car = car;
//        this.fun = fun;
//    }
}
