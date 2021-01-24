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
public class SelectSort<T> implements ISort<T> {

    @Override
    public void sort(T[] records, Comparator<T> comparator) {
        for(int i=0; i<records.length-1; i++) {
            int minIndex = i;
            for(int j=i+1; j<records.length; j++) {
                if(comparator.compare(records[minIndex], records[j]) > 0) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                T obj = records[i];
                records[i] = records[minIndex];
                records[minIndex] = obj;
            }
        }
    }
    
}
