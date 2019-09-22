package com.ai.contest.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Contest {

	@Id
	public String id;

	public String idBotA;
	public String idBotB;

	public int gameState;

}
