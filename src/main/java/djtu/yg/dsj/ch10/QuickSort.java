/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Comparator;

/**
 *
 * @author Yang.G
 * @param <T>
 */
public class QuickSort<T> implements ISort<T> {

    @Override
    public void sort(T[] records, Comparator<T> comparator) {
        quickSort(records, 0, records.length-1, comparator);
    }
    
    private void quickSort(T[] records, int start, int end, Comparator<T> comparator) {
        if(start >= end)
            return;
        
        int baseIndex = divide(records, start, end, comparator);
        quickSort(records, start, baseIndex-1, comparator);
        quickSort(records, baseIndex+1, end, comparator);
    }
    
    /**
     * 一次划分
     * @param records
     * @param start
     * @param end
     * @param comparator
     * @return 基准的位置
     */
    private int divide(T[] records, int start, int end, Comparator<T> comparator) {
        int i = start;
        int j = end;
        
        T baseObj = records[i];
        while(i < j) {
            while(i<j && comparator.compare(baseObj, records[j]) <= 0) {
                j--;
            }
            if(i<j){
                records[i] = records[j];
                i++;
            }
            while(i<j && comparator.compare(baseObj, records[i]) >= 0) {
                i++;
            }
            if(i<j) {
                records[j] = records[i];
                j--;
            }
        }
        records[i] = baseObj;
        
        return i;
    }

}
