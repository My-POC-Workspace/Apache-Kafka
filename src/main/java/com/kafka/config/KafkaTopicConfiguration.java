package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    @Bean
    public NewTopic springKafkaTopic(){
        return TopicBuilder.name("springKafka")
//                .partitions(10)  --> How many partitions we want, if we don't provide then it will configure the default partition provided by kafk
                .build();
    }

    @Bean
    public NewTopic springKafkaJsonTopic(){
        return TopicBuilder.name("jsonTopic")
                .build();
    }

}
