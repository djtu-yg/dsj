/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Comparator;

/**
 * ∂—≈≈–Ú
 * @author Yang.G
 * @param <T>
 */
public class HeapSort<T> implements ISort<T> {

    @Override
    public void sort(T[] records, Comparator<T> comparator) {
        this.createHeap(records, comparator);
        for(int i=1; i<records.length; i++) {
            T obj = records[0];
            records[0] = records[records.length-i];
            records[records.length-i] = obj;
            filter(records, 0, records.length-i, comparator);
        }
    }
    
    /**
     * …∏—°∑®°£
     * @param records
     * @param rootIndex
     * @param endIndex
     * @param comparator 
     */
    private void filter(T[] records, int rootIndex, int endIndex, Comparator<T> comparator) {
        int root = rootIndex;
        
        while(root * 2 < endIndex) {
            int maxIndex = root * 2;
            int rightIndex = root * 2 + 1;
            if(rightIndex < endIndex && comparator.compare(records[rightIndex], records[maxIndex]) > 0) {
                maxIndex = rightIndex;
            }
            if(comparator.compare(records[root], records[maxIndex]) > 0) {
                T obj = records[root];
                records[root] = records[maxIndex];
                records[maxIndex] = obj;
            }
            
            root = maxIndex;
        }
    }
    
    /**
     * Ω®∂—
     * @param records
     * @param comparator 
     */
    private void createHeap(T[] records, Comparator<T> comparator) {
        for(int rootIndex = records.length/2; rootIndex >=0; rootIndex--) {
            filter(records, rootIndex, records.length, comparator);
        }
    }
}
