package jdkDynamicProxy;

import org.springframework.stereotype.Component;

@Component
public class AnnotationDao implements IUser {
    public void save() {
        System.out.println("annotation db save");
    }
}
