package com.example.raghuwanshi.kushal.githubActivity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GithubEventSimpleDto {
    private String type;
    private SimpleActor actor;
    private SimpleRepo repo;
    private PayloadSimpleDto payload;

    @JsonProperty("created_at")
    private String createdAt;

    // Getters and setters
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public SimpleActor getActor() {
        return actor;
    }
    public void setActor(SimpleActor actor) {
        this.actor = actor;
    }
    public SimpleRepo getRepo() {
        return repo;
    }
    public void setRepo(SimpleRepo repo) {
        this.repo = repo;
    }
    public PayloadSimpleDto getPayload() {
        return payload;
    }
    public void setPayload(PayloadSimpleDto payload) {
        this.payload = payload;
    }
    public String getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    // Nested DTO classes
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SimpleActor {
        private String login;
        private String url; // Profile URL

        // Getters and setters
        public String getLogin() {
            return login;
        }
        public void setLogin(String login) {
            this.login = login;
        }
        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SimpleRepo {
        private String name;
        private String url; // Repository URL

        // Getters and setters
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getUrl() {
            return url;
        }
        public void setUrl(String url) {
            this.url = url;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PayloadSimpleDto {
        // For PushEvent
        private Integer size; // Number of commits
        private List<SimpleCommit> commits;

        // For IssuesEvent and PullRequestEvent
        private String action;
        private SimpleIssue issue;
        private SimplePullRequest pull_request;

        // Getters and setters
        public Integer getSize() {
            return size;
        }
        public void setSize(Integer size) {
            this.size = size;
        }
        public List<SimpleCommit> getCommits() {
            return commits;
        }
        public void setCommits(List<SimpleCommit> commits) {
            this.commits = commits;
        }
        public String getAction() {
            return action;
        }
        public void setAction(String action) {
            this.action = action;
        }
        public SimpleIssue getIssue() {
            return issue;
        }
        public void setIssue(SimpleIssue issue) {
            this.issue = issue;
        }
        public SimplePullRequest getPull_request() {
            return pull_request;
        }
        public void setPull_request(SimplePullRequest pull_request) {
            this.pull_request = pull_request;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SimpleCommit {
        private String message;
        // Getter and setter
        public String getMessage() {
            return message;
        }
        public void setMessage(String message) {
            this.message = message;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SimpleIssue {
        private String title;
        // Getter and setter
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SimplePullRequest {
        private String title;
        // Getter and setter
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
    }
}
