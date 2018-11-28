package com.example.demo1.model;

public class AuthToken {

        private String token;

        public AuthToken(){

        }

        public AuthToken(String token){
            this.token = token;
        }

    public AuthToken(String token, String username) {
    }

    public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

    }
