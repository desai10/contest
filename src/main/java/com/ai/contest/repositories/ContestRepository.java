package com.ai.contest.repositories;

import com.ai.contest.entities.Contest;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContestRepository extends MongoRepository<Contest, String> {

	public List<Contest> findByIdBotA(String idBotA);
	public List<Contest> findByIdBotB(String idBotB);

}
