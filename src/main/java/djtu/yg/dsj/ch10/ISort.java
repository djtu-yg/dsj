/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Comparator;

/**
 * 排序接口
 * @author Yang.G
 * @param <T>
 */
public interface ISort<T> {
    /**
     * 排序方法
     * @param records 排序表，顺序存储结构
     * @param comparator 比较器，用于比较排序表中元素的大小
     */
    void sort(T[] records, Comparator<T> comparator);
}
