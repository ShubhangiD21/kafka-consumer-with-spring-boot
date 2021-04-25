package com.spring.kafka.consumer.listener;



import java.util.List;
import java.util.Map;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import com.spring.kafka.consumer.model.Admin;

@Service
public class KafkaConsumerListener {


	@KafkaListener(topics = "KafkaDemo", groupId = "group_id")
	//TYpe-1 : public void consumeMessage(Object admin) //....If we give parameter like (Object admin) .
	//.It will give whole information with partition ,groupid, topics,values  etc
	
	//OR
	//Type -2 :It will consume only value if we pass parameter as (List<Admin> admin)
	public void consumeMessage(List<Admin> admin) {
		
		System.out.println("Consumed data : "+admin);
		
	}

}
