package com.ansh.quizapp.model;

public class Response {
    private Integer id;
    private String response;

    // No-argument constructor
    public Response() {
    }

    // Parameterized constructor
    public Response(Integer id, String response) {
        this.id = id;
        this.response = response;
    }

    // Getters
    public Integer getId() {
        return id;
    }

    public String getResponse() {
        return response;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    // toString method
    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", response='" + response + '\'' +
                '}';
    }
}

