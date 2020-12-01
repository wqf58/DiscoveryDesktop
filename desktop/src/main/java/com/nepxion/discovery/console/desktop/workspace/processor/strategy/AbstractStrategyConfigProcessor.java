package com.nepxion.discovery.console.desktop.workspace.processor.strategy;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import com.nepxion.discovery.console.desktop.workspace.processor.AbstractConfigProcessor;
import com.nepxion.discovery.console.desktop.workspace.type.StrategyType;

public abstract class AbstractStrategyConfigProcessor extends AbstractConfigProcessor implements StrategyConfigProcessor {
    protected StrategyType strategyType;

    @Override
    public StrategyType getStrategyType() {
        return strategyType;
    }

    @Override
    public void setStrategyType(StrategyType strategyType) {
        this.strategyType = strategyType;
    }
}