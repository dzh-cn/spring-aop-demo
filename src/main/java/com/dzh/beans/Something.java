package com.dzh.beans;

/**
 * something
 *
 * @author: dongzhihua
 * @time: 2019/3/24 17:21:53
 */
public class Something {
    private String name;
    private Integer level;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"name\":\"")
                .append(name).append('\"');
        sb.append(",\"level\":")
                .append(level);
        sb.append('}');
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
