package com.kovan.intern.javatraining.service.impl.collections;

import com.kovan.intern.javatraining.dto.ListPerformanceResponse;
import java.util.ArrayList;
import java.util.LinkedList;
import org.springframework.stereotype.Service;

@Service
public class ListPerformanceTestService {
    public ListPerformanceResponse runTest(int size) {
        int safeSize = Math.max(1, size);
        int middleIndex = safeSize / 2;

        ArrayList<Integer> arrayList = new ArrayList<>(safeSize);
        for (int i = 0; i < safeSize; i++) {
            arrayList.add(i);
        }

        long arrayStartTime = System.nanoTime();
        int valueMiddleArray = arrayList.get(middleIndex);
        long arrayEndTime = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < safeSize; i++) {
            linkedList.add(i);
        }

        long linkedListStartTime = System.nanoTime();
        int valueMiddleLinkedList = linkedList.get(middleIndex);
        long linkedListEndTime = System.nanoTime();

        ListPerformanceResponse response = new ListPerformanceResponse();
        response.setSize(safeSize);
        response.setMiddleIndex(middleIndex);
        response.setArrayListMiddleValue(valueMiddleArray);
        response.setLinkedListMiddleValue(valueMiddleLinkedList);
        response.setArrayListAccessTimeNs(arrayEndTime - arrayStartTime);
        response.setLinkedListAccessTimeNs(linkedListEndTime - linkedListStartTime);
        return response;
    }
}
