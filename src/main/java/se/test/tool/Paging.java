package se.test.tool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Paging {
    public final long pageIndex;
    public final long pageSize;
    public final long total;

    @JsonCreator
    public Paging(@JsonProperty("pageIndex") long pageIndex, @JsonProperty("pageSize") long pageSize, @JsonProperty("total") long total){
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
    }
}