package com.kovan.intern.javatraining.dto;

public class SpiralMatrixResponse {
    private int[][] spiralMatrix;
    private int size;
    
    public int[][] getSpiralMatrix() { return spiralMatrix; }
    public void setSpiralMatrix(int[][] spiralMatrix) { this.spiralMatrix = spiralMatrix; }
    
    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }
}
