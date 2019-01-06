package gclibAOP;

import org.springframework.stereotype.Component;

@Component
public class OrderDao {
    public void book() {
        System.out.println("已经下单了");
    }

    public void otherAction() {
        System.out.println("other action");
    }
}
