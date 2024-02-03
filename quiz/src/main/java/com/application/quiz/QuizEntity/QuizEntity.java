package com.application.quiz.QuizEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuizEntity {
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private int userId;

public QuizEntity() {
}
private String userEmail;
public QuizEntity(String userEmail, String userPassword) {
    this.userEmail = userEmail;
    this.userPassword = userPassword;
}
@Override
public String toString() {
    return "QuizEntity [ userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
}
private String userPassword;
public int getUserId() {
    return userId;
}
public void setUserId(int userId) {
    this.userId = userId;
}
public String getUserEmail() {
    return userEmail;
}
public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
}
public String getUserPassword() {
    return userPassword;
}
public void setUserPassword(String userPassword) {
    this.userPassword = userPassword;
}
    
}
