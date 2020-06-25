package ru.spring.examples.sweater.repository;

import org.springframework.data.repository.CrudRepository;
import ru.spring.examples.sweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}