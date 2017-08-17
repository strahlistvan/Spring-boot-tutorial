package io.javabrains.springbootquickstart.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{topicId}")
	public Topic getTopic(@PathVariable String topicId) {
		return topicService.getTopic(topicId);
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(value="/topics/{topicId}", method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String topicId) {
		topicService.deleteTopic(topicId);
	}
	
	@RequestMapping(value="/topics/{topicId}", method=RequestMethod.PUT)
	public void updateTopic(@PathVariable String topicId, @RequestBody Topic topicObj) {
		topicService.updateTopic(topicId, topicObj);
	}
}
