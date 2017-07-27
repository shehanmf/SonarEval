package se.test.tool;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class Component {
    public final String organization;
    public final String key;
    public final String uuid;
    public final boolean enabled;
    public final String qualifier;
    public final String name;
    public final String longName;
    public final String path;

    @JsonCreator
    public Component(@JsonProperty("organization") String organization, @JsonProperty("key") String key, @JsonProperty("uuid") String uuid, @JsonProperty("enabled") boolean enabled, @JsonProperty("qualifier") String qualifier, @JsonProperty("name") String name, @JsonProperty("longName") String longName, @JsonProperty(value="path", required=false) String path){
        this.organization = organization;
        this.key = key;
        this.uuid = uuid;
        this.enabled = enabled;
        this.qualifier = qualifier;
        this.name = name;
        this.longName = longName;
        this.path = path;
    }
}