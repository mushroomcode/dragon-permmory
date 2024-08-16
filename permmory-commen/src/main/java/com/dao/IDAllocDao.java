package com.dao;

import com.model.LeafAlloc;

import java.util.List;

public interface IDAllocDao {
    List<LeafAlloc> getAllLeafAllocs();
    //
    LeafAlloc updateMaxIdAndGetLeafAlloc(String tag);
    //
    LeafAlloc updateMaxIdByCustomStepAndGetLeafAlloc(LeafAlloc leafAlloc);
    //
    List<String> getAllTags();
}
