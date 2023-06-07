package com.uber.rib.core;

/**
 * Reports total binding duration of Worker.onStart/onStop
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/uber/rib/core/WorkerBinderListener;", "", "onBindCompleted", "", "workerBinderInfo", "Lcom/uber/rib/core/WorkerBinderInfo;", "rib-base"})
public abstract interface WorkerBinderListener {
    
    /**
     * Reports all related Worker information via [WorkerBinderInfo] when onStart/onStop methods are
     * completed
     */
    public abstract void onBindCompleted(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.WorkerBinderInfo workerBinderInfo);
}