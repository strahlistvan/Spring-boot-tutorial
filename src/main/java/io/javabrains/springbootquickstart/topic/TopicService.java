package io.javabrains.springbootquickstart.topic;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework description"),
			new Topic("java","Core Java", "Core Java description"),
			new Topic("javascript", "JavaScript", "JavaScript description"),
			new Topic("PHP", "PHP", "PHP description")
			);	
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	
	public Topic getTopic(String topicId) {
		for (Topic t: topics) {
			if (topicId != null && topicId.toLowerCase().equals(t.getId().toLowerCase())) {
				return t;
			}
		}
		return null;
	}
	
    public void addTopic(Topic topic) {
    	topics.add(topic);
    }
    
    public void deleteTopic(String topicId) {
    	for (int i=0; i<topics.size(); ++i) {
    		Topic t = topics.get(i);
			if (topicId != null && topicId.toLowerCase().equals(t.getId().toLowerCase())) {
				topics.remove(i);
			}	
		}    	
    }
    
    public void updateTopic(String topicId, Topic topicObj) {
    	for (int i=0; i<topics.size(); ++i) {
    		Topic t = topics.get(i);
			if (topicId != null && topicId.toLowerCase().equals(t.getId().toLowerCase())) {
				topics.set(i, topicObj);
			}	
		}  
    }
}
