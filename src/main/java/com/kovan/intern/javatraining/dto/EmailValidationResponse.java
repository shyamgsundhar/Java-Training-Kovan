package com.kovan.intern.javatraining.dto;

public class EmailValidationResponse {
    private String email;
    private boolean isValid;
    private String message;
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public boolean isValid() { return isValid; }
    public void setValid(boolean valid) { isValid = valid; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
