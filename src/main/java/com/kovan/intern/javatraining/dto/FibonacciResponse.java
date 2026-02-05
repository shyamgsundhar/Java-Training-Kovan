package com.kovan.intern.javatraining.dto;

public class FibonacciResponse {
    private int n;
    private int result;
    private String algorithm;
    
    public int getN() { return n; }
    public void setN(int n) { this.n = n; }
    
    public int getResult() { return result; }
    public void setResult(int result) { this.result = result; }
    
    public String getAlgorithm() { return algorithm; }
    public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }
}
