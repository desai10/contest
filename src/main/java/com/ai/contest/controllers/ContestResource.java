package com.ai.contest.controllers;

import com.ai.contest.entities.Contest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public interface ContestResource {

	@RequestMapping("/contest")
	List<Contest> getContest();

}
