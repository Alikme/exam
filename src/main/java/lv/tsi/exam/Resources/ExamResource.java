package lv.tsi.exam.Resources;

import lv.tsi.exam.entity.ForumRepository;
import lv.tsi.exam.entity.TopicEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/forum")
public class ExamResource {

    @Autowired
    ForumRepository forumRepository;
    @GetMapping("/getAll")
    public List<TopicEntity> getAllTopic(){
        return forumRepository.findAll();
    }
}
