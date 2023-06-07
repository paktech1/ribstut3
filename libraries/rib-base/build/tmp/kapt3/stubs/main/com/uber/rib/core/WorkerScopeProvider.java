package com.uber.rib.core;

/**
 * [ScopeProvider] for [Worker] instances.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\b\u0010\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005B\u000f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0097\u0001\u00a8\u0006\u000b"}, d2 = {"Lcom/uber/rib/core/WorkerScopeProvider;", "Lcom/uber/autodispose/ScopeProvider;", "lifecycle", "Lio/reactivex/Observable;", "Lcom/uber/rib/core/lifecycle/WorkerEvent;", "(Lio/reactivex/Observable;)V", "delegate", "(Lcom/uber/autodispose/ScopeProvider;)V", "requestScope", "Lio/reactivex/CompletableSource;", "kotlin.jvm.PlatformType", "rib-base"})
public class WorkerScopeProvider implements com.uber.autodispose.ScopeProvider {
    
    public WorkerScopeProvider(@org.jetbrains.annotations.NotNull()
    com.uber.autodispose.ScopeProvider delegate) {
        super();
    }
    
    public WorkerScopeProvider(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.uber.rib.core.lifecycle.WorkerEvent> lifecycle) {
        super();
    }
    
    @io.reactivex.annotations.CheckReturnValue()
    @java.lang.Override()
    public io.reactivex.CompletableSource requestScope() {
        return null;
    }
}