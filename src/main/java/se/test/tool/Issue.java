package se.test.tool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public  final class Issue {
    public final String organization;
    public final String key;
    public final String rule;
    public final String severity;
    public final String component;
    public final String project;
    public final String subProject;
    public final long line;
    public final TextRange textRange;
    public final Flow flows[];
    public final String status;
    public final String message;
    public final String effort;
    public final String debt;
    public final String author;
    public final String[] tags;
    public final String creationDate;
    public final String updateDate;
    public final String type;

    @JsonCreator
    public Issue(@JsonProperty("organization") String organization, @JsonProperty("key") String key, @JsonProperty("rule") String rule, @JsonProperty("severity") String severity, @JsonProperty("component") String component, @JsonProperty("project") String project, @JsonProperty("subProject") String subProject, @JsonProperty("line") long line, @JsonProperty("textRange") TextRange textRange, @JsonProperty("flows") Flow[] flows, @JsonProperty("status") String status, @JsonProperty("message") String message, @JsonProperty("effort") String effort, @JsonProperty("debt") String debt, @JsonProperty("author") String author, @JsonProperty("tags") String[] tags, @JsonProperty("creationDate") String creationDate, @JsonProperty("updateDate") String updateDate, @JsonProperty("type") String type) {
        this.organization = organization;
        this.key = key;
        this.rule = rule;
        this.severity = severity;
        this.component = component;
        this.project = project;
        this.subProject = subProject;
        this.line = line;
        this.textRange = textRange;
        this.flows = flows;
        this.status = status;
        this.message = message;
        this.effort = effort;
        this.debt = debt;
        this.author = author;
        this.tags = tags;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.type = type;
    }
}