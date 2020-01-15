package nl.capgemini.setrack.springboottest.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return Arrays.asList(
                new Topic("1", "Spring", "1st Season"),
                new Topic("2", "Summer", "2nd Season"),
                new Topic("3", "Autumn", "3rd Season"),
                new Topic("4", "Winter", "4th Season")
        );
    }
}
