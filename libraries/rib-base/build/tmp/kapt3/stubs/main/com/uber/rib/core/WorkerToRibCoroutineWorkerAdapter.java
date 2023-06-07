package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/uber/rib/core/WorkerToRibCoroutineWorkerAdapter;", "Lcom/uber/rib/core/RibCoroutineWorker;", "worker", "Lcom/uber/rib/core/Worker;", "(Lcom/uber/rib/core/Worker;)V", "onStart", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStop", "cause", "", "rib-base"})
public class WorkerToRibCoroutineWorkerAdapter implements com.uber.rib.core.RibCoroutineWorker {
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.Worker worker = null;
    
    public WorkerToRibCoroutineWorkerAdapter(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object onStart(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    public void onStop(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable cause) {
    }
}