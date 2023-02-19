package com.example.demo.models;

public class ResponseObject {

    private String status;
    private String messages;
    private Object data;

    public ResponseObject(){}

    public ResponseObject(String status, String messages, Object data) {
        this.status = status;
        this.messages = messages;
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseObject{" +
                "status='" + status + '\'' +
                ", messages='" + messages + '\'' +
                ", data=" + data +
                '}';
    }
}
