package com.uber.rib.core;

/**
 * Holds all relevant information for completed Worker.onStart/onStop actions. (e.g. Name of the
 * Worker bound, duration of total onStart/onStop, thread name where onStart/onStop happens,etc)
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\nH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/uber/rib/core/WorkerBinderInfo;", "", "workerName", "", "workerEvent", "Lcom/uber/rib/core/lifecycle/WorkerEvent;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "threadName", "totalBindingDurationMilli", "", "(Ljava/lang/String;Lcom/uber/rib/core/lifecycle/WorkerEvent;Lkotlin/coroutines/CoroutineContext;Ljava/lang/String;J)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getThreadName", "()Ljava/lang/String;", "getTotalBindingDurationMilli", "()J", "getWorkerEvent", "()Lcom/uber/rib/core/lifecycle/WorkerEvent;", "getWorkerName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "rib-base"})
public final class WorkerBinderInfo {
    
    /**
     * Worker class name
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String workerName = null;
    
    /**
     * Worker event type (START/STOP)
     */
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.lifecycle.WorkerEvent workerEvent = null;
    
    /**
     * The [CoroutineContext] where a [Worker] will be bound
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.coroutines.CoroutineContext coroutineContext = null;
    
    /**
     * Thread name where Worker.onStart/onStop was called.
     *
     * e.g. When [CoroutineDispatcher] is set as [RibDispatchers.Default] a sample threadName value
     * would be similar to `DefaultDispatcher-worker-2`
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String threadName = null;
    
    /**
     * Total binding duration in milliseconds of Worker.onStart/onStop
     */
    private final long totalBindingDurationMilli = 0L;
    
    public WorkerBinderInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String workerName, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.lifecycle.WorkerEvent workerEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull()
    java.lang.String threadName, long totalBindingDurationMilli) {
        super();
    }
    
    /**
     * Worker class name
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWorkerName() {
        return null;
    }
    
    /**
     * Worker event type (START/STOP)
     */
    @org.jetbrains.annotations.NotNull()
    public final com.uber.rib.core.lifecycle.WorkerEvent getWorkerEvent() {
        return null;
    }
    
    /**
     * The [CoroutineContext] where a [Worker] will be bound
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    /**
     * Thread name where Worker.onStart/onStop was called.
     *
     * e.g. When [CoroutineDispatcher] is set as [RibDispatchers.Default] a sample threadName value
     * would be similar to `DefaultDispatcher-worker-2`
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getThreadName() {
        return null;
    }
    
    /**
     * Total binding duration in milliseconds of Worker.onStart/onStop
     */
    public final long getTotalBindingDurationMilli() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uber.rib.core.lifecycle.WorkerEvent component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.coroutines.CoroutineContext component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.uber.rib.core.WorkerBinderInfo copy(@org.jetbrains.annotations.NotNull()
    java.lang.String workerName, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.lifecycle.WorkerEvent workerEvent, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext, @org.jetbrains.annotations.NotNull()
    java.lang.String threadName, long totalBindingDurationMilli) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}