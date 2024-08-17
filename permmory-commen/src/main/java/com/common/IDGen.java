package com.common;

import com.model.Result;

public interface IDGen {

    Result get(String key);
    boolean init();

}
