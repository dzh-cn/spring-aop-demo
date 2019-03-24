package com.dzh.beans;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @author: dongzhihua
 * @time: 2019/3/24 17:23:35
 */
public class SomeResult {
    private boolean success;
    private String message;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"success\":\"")
                .append(success).append('\"');
        sb.append(",\"message\":\"")
                .append(message).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
