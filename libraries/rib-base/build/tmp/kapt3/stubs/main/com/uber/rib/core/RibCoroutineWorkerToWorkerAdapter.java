package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/uber/rib/core/RibCoroutineWorkerToWorkerAdapter;", "Lcom/uber/rib/core/Worker;", "ribCoroutineWorker", "Lcom/uber/rib/core/RibCoroutineWorker;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "(Lcom/uber/rib/core/RibCoroutineWorker;Lkotlin/coroutines/CoroutineContext;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "onStart", "", "lifecycle", "Lcom/uber/rib/core/WorkerScopeProvider;", "onStop", "rib-base"})
public class RibCoroutineWorkerToWorkerAdapter implements com.uber.rib.core.Worker {
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.RibCoroutineWorker ribCoroutineWorker = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    
    public RibCoroutineWorkerToWorkerAdapter(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibCoroutineWorker ribCoroutineWorker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @java.lang.Override()
    public void onStart(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.WorkerScopeProvider lifecycle) {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
}