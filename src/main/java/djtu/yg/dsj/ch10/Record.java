/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package djtu.yg.dsj.ch10;

import java.util.Random;

/**
 * 
 * @author Yang.G
 */
public class Record  {
    private int sortKey;
    
    public Record(int sortKey) {
        this.sortKey = sortKey;
    }
    
    public int getSortKey() {
        return sortKey;
    }
    
    public void setSortKey(int sortKey) {
        this.sortKey = sortKey;
    }
    
    @Override
    public String toString() {
        return String.valueOf(sortKey);
    }
    
    //***********************************************
    //** �෽��                                    **
    //***********************************************
    
    /**
     * ��ӡ��¼��
     * @param records 
     */
    public static void printRecords(Record[] records) {
        StringBuffer sbuf = new StringBuffer();
        sbuf.append("[");
        for (Record record : records) {
            sbuf.append(record.toString());
            sbuf.append(",");
        }
        if(sbuf.charAt(sbuf.length()-1) == ',') {
            sbuf.deleteCharAt(sbuf.length()-1);
        }
        sbuf.append("]");    
        System.out.println(sbuf.toString());
    }
    
    /**
     * ������������
     * @param size ��
     * @param upperBound ������Ͻ�
     * @return �����
     */
    public static Record[] generateSortList(int size, int upperBound) {
        Record[] records = new Record[size];
        Random random = new Random();
        for(int i=0; i<records.length; i++) {
            records[i] = new Record(random.nextInt(upperBound));
        }
        return records;
    }
}
