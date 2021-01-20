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
 */
public class RecordComparator implements Comparator<Record> {

    @Override
    public int compare(Record o1, Record o2) {
        return o1.getSortKey() - o2.getSortKey();
    }
}
