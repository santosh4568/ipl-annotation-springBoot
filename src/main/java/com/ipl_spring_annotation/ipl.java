package com.ipl_spring_annotation;


import java.util.ArrayList;

import org.springframework.stereotype.Component;
@Component
public class ipl {
	private String team_name;
	ArrayList<String> players;
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public ArrayList<String> getPlayers() {
		return players;
	}
	public void setPlayers(ArrayList<String> players) {
		this.players = players;
	}
}
