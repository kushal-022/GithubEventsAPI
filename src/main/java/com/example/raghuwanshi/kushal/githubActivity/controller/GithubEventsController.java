package com.example.raghuwanshi.kushal.githubActivity.controller;

import com.example.raghuwanshi.kushal.githubActivity.dto.GithubEventSimpleDto;
import com.example.raghuwanshi.kushal.githubActivity.util.GithubEventFormatter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/events")
public class GithubEventsController {

    @GetMapping("/{name}")
    public ResponseEntity<?> getGithubUserEvents(@PathVariable("name") String username) {
        String url = "https://api.github.com/users/" + username + "/events/public";
        RestTemplate restTemplate = new RestTemplate();
        GithubEventSimpleDto[] events = restTemplate.getForObject(url, GithubEventSimpleDto[].class);

        System.out.println();
        System.out.println();

        for (GithubEventSimpleDto event : events) {
            String sentence = GithubEventFormatter.formatEvent(event);
            System.out.println(sentence);
        }

        return new ResponseEntity<>(events, HttpStatus.OK);
    }
}
