package com.config;

import com.selector.FishImportSelector.FishImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({FishImportSelector.class})
@Configuration
public class AutoAppConfig {
}
