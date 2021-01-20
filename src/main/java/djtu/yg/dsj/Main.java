/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj;

import djtu.yg.dsj.ch10.InsertSort;
import djtu.yg.dsj.ch10.Record;
import djtu.yg.dsj.ch10.RecordComparator;
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
        // TODO code application logic here
        Sorter<Record> sorter = new Sorter<>();
        sorter.setComparator(new RecordComparator());
        sorter.setSortStrategy(new InsertSort<>());
        
        Record[] records = Record.generateSortList(20, 100);
        Record.printRecords(records);
        sorter.executeSort(records);
        Record.printRecords(records);
    }
}
