package com.ai.contest.controllers;

import com.ai.contest.entities.Contest;
import com.ai.contest.repositories.ContestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ContestResourceImpl implements ContestResource {

	@Autowired
	private ContestRepository contestRepository;

	@Override
	public List<Contest> getContest() {
		return contestRepository.findAll();
	}
}
