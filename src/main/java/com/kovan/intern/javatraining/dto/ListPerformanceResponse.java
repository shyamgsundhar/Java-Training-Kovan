package com.kovan.intern.javatraining.dto;

public class ListPerformanceResponse {
    private int size;
    private int middleIndex;
    private int arrayListMiddleValue;
    private int linkedListMiddleValue;
    private long arrayListAccessTimeNs;
    private long linkedListAccessTimeNs;

    public int getSize() { return size; }
    public void setSize(int size) { this.size = size; }

    public int getMiddleIndex() { return middleIndex; }
    public void setMiddleIndex(int middleIndex) { this.middleIndex = middleIndex; }

    public int getArrayListMiddleValue() { return arrayListMiddleValue; }
    public void setArrayListMiddleValue(int arrayListMiddleValue) { this.arrayListMiddleValue = arrayListMiddleValue; }

    public int getLinkedListMiddleValue() { return linkedListMiddleValue; }
    public void setLinkedListMiddleValue(int linkedListMiddleValue) { this.linkedListMiddleValue = linkedListMiddleValue; }

    public long getArrayListAccessTimeNs() { return arrayListAccessTimeNs; }
    public void setArrayListAccessTimeNs(long arrayListAccessTimeNs) { this.arrayListAccessTimeNs = arrayListAccessTimeNs; }

    public long getLinkedListAccessTimeNs() { return linkedListAccessTimeNs; }
    public void setLinkedListAccessTimeNs(long linkedListAccessTimeNs) { this.linkedListAccessTimeNs = linkedListAccessTimeNs; }
}
