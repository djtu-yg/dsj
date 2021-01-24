/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj;

import djtu.yg.dsj.ch10.BubbleSort;
import djtu.yg.dsj.ch10.HeapSort;
import djtu.yg.dsj.ch10.InsertSort;
import djtu.yg.dsj.ch10.QuickSort;
import djtu.yg.dsj.ch10.Record;
import djtu.yg.dsj.ch10.RecordComparator;
import djtu.yg.dsj.ch10.SelectSort;
import djtu.yg.dsj.ch10.ShellSort;
import djtu.yg.dsj.ch10.Sorter;

/**
 *
 * @author Yang.G
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //生成随机排序表
        Record[] records = Record.generateSortList(20, 100);
        Record.printRecords(records);
        
        // 创建排序器
        Sorter<Record> sorter = new Sorter<>();
        sorter.setComparator(new RecordComparator());
        
        //设置排序算法、执行排序
        sorter.setSortStrategy(new ShellSort<>());        
        sorter.executeSort(records);
        Record.printRecords(records);
        
        sorter.setSortStrategy(new InsertSort<>());        
        sorter.executeSort(records);
        Record.printRecords(records);
        
        sorter.setSortStrategy(new BubbleSort<>());        
        sorter.executeSort(records);
        Record.printRecords(records);
        
        sorter.setSortStrategy(new QuickSort<>());        
        sorter.executeSort(records);
        Record.printRecords(records);
        
        sorter.setSortStrategy(new SelectSort<>());        
        sorter.executeSort(records);
        Record.printRecords(records);
        
        sorter.setSortStrategy(new HeapSort<>());        
        sorter.executeSort(records);
        Record.printRecords(records);

    }
}
