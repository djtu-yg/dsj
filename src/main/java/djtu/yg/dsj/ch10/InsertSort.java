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
public class InsertSort<T> implements ISort<T> {

    @Override
    public void sort(T[] recores, Comparator<T> comparator) {
        T obj;
        for(int i=1; i<recores.length; i++) {
            obj = recores[i];
            int j = i-1;
            while(j>=0 && comparator.compare(obj, recores[j]) < 0) {
                recores[j+1] = recores[j];
                j--;
            }
            recores[j+1] = obj;
        }
    }    
}
