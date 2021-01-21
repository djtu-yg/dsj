/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Comparator;

/**
 * ÆðÅÝÅÅÐò
 * @author Yang.G
 * @param <T>
 */
public class BubbleSort<T> implements ISort<T> {

    @Override
    public void sort(T[] records, Comparator<T> comparator) {
        for(int i=1; i<records.length; i++) {
            boolean notSwap = true;
            for(int j=0; j<records.length-i; j++) {
                if(comparator.compare(records[j], records[j+1]) > 0) {
                    T obj = records[j];
                    records[j] = records[j+1];
                    records[j+1] = obj;
                    notSwap = false;
                }
            }
            
            if(notSwap)
                break;
        }
    }
}
