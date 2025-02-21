# GitHub User Public Activity Application

[![Java](https://img.shields.io/badge/Java-11-blue)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.7.x-green)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.6.3-yellow)](https://maven.apache.org/)

---

## Overview

**GitHub Activity Application** is a Spring Boot project that fetches public GitHub events for a given user and displays formatted messages in a API response as well as Console. The application retrieves data from the GitHub API, uses simplified DTOs to parse the JSON response, and then formats the events into human-readable sentences.

---

<img width="1039" alt="Screenshot 2025-02-21 at 8 57 32 AM" src="https://github.com/user-attachments/assets/68987660-de1f-4c01-a0e1-f0d8b6032a6c" />


## Features

- **Fetch GitHub Events:** Retrieve public events of any GitHub user.
- **Simplified Data Model:** Use of custom DTOs with only the necessary fields.
- **Dynamic Formatting:** Format events such as `PushEvent`, `IssuesEvent`, and `PullRequestEvent` into friendly sentences.
- **CLI Output:** Easily view event summaries directly in your terminal.

---


## How to Run the Project

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/GithubEventsAPI.git
cd GithubEventsAPI
```


### 2. Build the Project

```bash
mvn clean install
```

### 3. Run the Application

```bash
mvn spring-boot:run
```
### Project URL
<https://roadmap.sh/projects/github-user-activity>

