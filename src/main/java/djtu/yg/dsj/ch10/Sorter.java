/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Comparator;

/**
 * ÅÅÐòÆ÷
 * @author Yang.G
 * @param <T>
 */
public class Sorter<T> {
    private ISort<T> sortStrategy;
    private Comparator<T> comparator;
    
    public void setSortStrategy(ISort<T> isort) {
        sortStrategy = isort;
    }
    
    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }
    
    public void executeSort(T[] records) {
        sortStrategy.sort(records, comparator);
    }
}
