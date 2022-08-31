package org.example;

public class Script {

    private String uuid;
    private String name;
    private String createTime;

    public Script(String uuid, String name, String createTime) {
        this.uuid = uuid;
        this.name = name;
        this.createTime = createTime;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getCreateTime() {
        return createTime;
    }

}