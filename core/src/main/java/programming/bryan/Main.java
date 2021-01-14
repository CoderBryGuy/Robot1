package programming.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final String CONFIG_LOCATION = "beans.xml";
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        Robot robot = (Robot) context.getBean( RobotImpl.class);

        robot.setId(123);
        robot.setSpeech("hey mom");
        robot.speak();

        context.close();
    }
}
