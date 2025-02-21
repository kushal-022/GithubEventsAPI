package com.example.raghuwanshi.kushal.githubActivity.util;

import com.example.raghuwanshi.kushal.githubActivity.dto.GithubEventSimpleDto;

public class GithubEventFormatter {

    public static String formatEvent(GithubEventSimpleDto event) {
        switch (event.getType()) {
            case "PushEvent":
                int numCommits = event.getPayload().getSize() != null ? event.getPayload().getSize() : 0;
                String latestMessage = "N/A";
                if (event.getPayload().getCommits() != null && !event.getPayload().getCommits().isEmpty()) {
                    latestMessage = event.getPayload().getCommits().get(0).getMessage();
                }
                return String.format("User %s pushed %d commit(s) to %s. Latest commit message: '%s'.",
                        event.getActor().getLogin(),
                        numCommits,
                        event.getRepo().getName(),
                        latestMessage);
            case "IssuesEvent":
                return String.format("User %s %s an issue titled '%s' in %s.",
                        event.getActor().getLogin(),
                        event.getPayload().getAction(),
                        event.getPayload().getIssue() != null ? event.getPayload().getIssue().getTitle() : "N/A",
                        event.getRepo().getName());
            case "PullRequestEvent":
                return String.format("User %s %s a pull request titled '%s' in %s.",
                        event.getActor().getLogin(),
                        event.getPayload().getAction(),
                        event.getPayload().getPull_request() != null ? event.getPayload().getPull_request().getTitle() : "N/A",
                        event.getRepo().getName());
            default:
                return "Unsupported event type: " + event.getType();
        }
    }
}
