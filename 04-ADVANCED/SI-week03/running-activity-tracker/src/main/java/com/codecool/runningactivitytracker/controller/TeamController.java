package com.codecool.runningactivitytracker.controller;

import com.codecool.runningactivitytracker.service.TeamService;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Data
    private static class CreateTeamRequest {
        private String teamName;
    }

    @Data
    private static class AddMemberRequest {
        private String memberName;
    }

    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @PostMapping("/team")
    public ResponseEntity<Void> createTeam(@RequestBody CreateTeamRequest request) {
        teamService.createTeam(request.getTeamName());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/team/members")
    public ResponseEntity<Void> addMember(@RequestBody AddMemberRequest request) {
        teamService.addMember(request.getMemberName());
        return ResponseEntity.ok(null);
    }
}
