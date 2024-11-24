package com.selector.FishImportSelector;

import com.pojo.Halibut;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class FishImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //
        return new String[]{"com.pojo.salmon", Halibut.class.getName()};
    }
}
