/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.union.bof.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author tdashaolu
 */
public class FetchBVNResponse implements Serializable{
  private List<BVNRecords> bvnlist;

    /**
     * @return the bvnlist
     */
    public List<BVNRecords> getBvnlist() {
        return bvnlist;
    }

    /**
     * @param bvnlist the bvnlist to set
     */
    public void setBvnlist(List<BVNRecords> bvnlist) {
        this.bvnlist = bvnlist;
    }
     

    

    
    
}
