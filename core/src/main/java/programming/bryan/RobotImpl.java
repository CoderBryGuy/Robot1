package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RobotImpl implements Robot {

    private static final Logger log = LoggerFactory.getLogger(Main.class);
    private int id;
    private String speech = "hello";

    @PostConstruct
    public void init(){
        log.info("calling init()");
    }

    @PreDestroy
    public void destroy(){
        log.info("calling destroy()");
    }

    @Override
    public void speak() {
        System.out.println(id + ": " + speech);
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setSpeech(String speech) {
        this.speech = speech;
    }
}
