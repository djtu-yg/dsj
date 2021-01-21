/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Yang.G
 * @param <T>
 */
public class ShellSort<T> implements ISort<T>  {
    private int[] gaps;
        
    public void setGaps(int[] gaps) {
        this.gaps = Arrays.copyOf(gaps, gaps.length);
    }
    
    public int[] getGaps() {
        return Arrays.copyOf(gaps, gaps.length);
    }

    @Override
    public void sort(T[] records, Comparator<T> comparator) {
        int[] gapArray = gaps;
        if(gapArray == null) {
            gapArray = generateDefaultGaps(records.length);
        }
        
        T insertedRecord = null;
        for(int gap:gapArray) {
            for(int i=gap; i<records.length; i++) {
                insertedRecord = records[i];
                int j = i - gap;
                while(j >= 0 && comparator.compare(insertedRecord, records[j]) < 0) {
                    records[j+gap] = records[j];
                    j -= gap;
                }
                
                records[j+gap] = insertedRecord;
            }
        }
    }
    
    private int[] generateDefaultGaps(int len) {
        int gapsLen = (int)(Math.log(len)/Math.log(2));
        int[] steps = new int[gapsLen];
        for(int i=0; i<steps.length; i++) {
            steps[i] = (int)Math.pow(2, gapsLen-i-1);
        }
        return steps;
    }
    
}
