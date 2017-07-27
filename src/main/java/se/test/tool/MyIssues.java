package se.test.tool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class MyIssues {
    public final long total;
    public final long p;
    public final long ps;
    public final Paging paging;
    public final Issue issues[];
    public final Component components[];

    @JsonCreator
    public MyIssues(@JsonProperty("total") long total, @JsonProperty("p") long p, @JsonProperty("ps") long ps, @JsonProperty("paging") Paging paging, @JsonProperty("issues") Issue[] issues, @JsonProperty("components") Component[] components) {
        this.total = total;
        this.p = p;
        this.ps = ps;
        this.paging = paging;
        this.issues = issues;
        this.components = components;
    }
}