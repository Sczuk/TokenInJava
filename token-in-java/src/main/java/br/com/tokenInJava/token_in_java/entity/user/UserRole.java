package br.com.tokenInJava.token_in_java.entity.user;

public enum UserRole {

    ADMIN("admin"),
    COMMON_USER("user");

    private String role;

    UserRole(String role){
        this.role = role;
    }

}
