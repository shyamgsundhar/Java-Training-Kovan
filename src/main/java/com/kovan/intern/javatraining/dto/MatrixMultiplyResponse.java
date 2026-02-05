package com.kovan.intern.javatraining.dto;

public class MatrixMultiplyResponse {
    private int[][] resultMatrix;
    private String message;
    
    public int[][] getResultMatrix() { return resultMatrix; }
    public void setResultMatrix(int[][] resultMatrix) { this.resultMatrix = resultMatrix; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
