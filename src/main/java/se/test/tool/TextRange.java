package se.test.tool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public  final class TextRange {
    public final long startLine;
    public final long endLine;
    public final long startOffset;
    public final long endOffset;

    @JsonCreator
    public TextRange(@JsonProperty("startLine") long startLine, @JsonProperty("endLine") long endLine, @JsonProperty("startOffset") long startOffset, @JsonProperty("endOffset") long endOffset){
        this.startLine = startLine;
        this.endLine = endLine;
        this.startOffset = startOffset;
        this.endOffset = endOffset;
    }
}