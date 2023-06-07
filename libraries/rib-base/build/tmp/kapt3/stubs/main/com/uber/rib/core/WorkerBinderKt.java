package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0002\u001aR\u0010\t\u001a\u00020\n\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u0002H\u000b0\f*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002\u001aF\u0010\u0014\u001a\u00020\u0015*\u00020\u00022\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00012\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u001b\u00a2\u0006\u0002\b\u001cH\u0082\b\u001a2\u0010\u001d\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u00a8\u0006!"}, d2 = {"bindingCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Lcom/uber/rib/core/Worker;", "getBindingCoroutineContext", "(Lcom/uber/rib/core/Worker;)Lkotlin/coroutines/CoroutineContext;", "getJobCoroutineContext", "dispatcherAtBinder", "Lkotlinx/coroutines/CoroutineDispatcher;", "worker", "bind", "Lcom/uber/rib/core/WorkerUnbinder;", "T", "", "lifecycle", "Lkotlinx/coroutines/flow/SharedFlow;", "lifecycleRange", "Lkotlin/ranges/ClosedRange;", "workerDurationListenerWeakRef", "Ljava/lang/ref/WeakReference;", "Lcom/uber/rib/core/WorkerBinderListener;", "bindAndReportWorkerInfo", "", "workerBinderListeners", "event", "Lcom/uber/rib/core/lifecycle/WorkerEvent;", "coroutineContext", "workerBinderAction", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "reportWorkerBinderInfo", "workerEvent", "totalBindingEventMilli", "", "rib-base"})
public final class WorkerBinderKt {
    
    private static final kotlin.coroutines.CoroutineContext getBindingCoroutineContext(com.uber.rib.core.Worker $this$bindingCoroutineContext) {
        return null;
    }
    
    private static final kotlin.coroutines.CoroutineContext getJobCoroutineContext(kotlinx.coroutines.CoroutineDispatcher dispatcherAtBinder, com.uber.rib.core.Worker worker) {
        return null;
    }
    
    private static final <T extends java.lang.Comparable<? super T>>com.uber.rib.core.WorkerUnbinder bind(com.uber.rib.core.Worker $this$bind, kotlinx.coroutines.flow.SharedFlow<? extends T> lifecycle, kotlin.ranges.ClosedRange<T> lifecycleRange, kotlinx.coroutines.CoroutineDispatcher dispatcherAtBinder, java.lang.ref.WeakReference<com.uber.rib.core.WorkerBinderListener> workerDurationListenerWeakRef) {
        return null;
    }
    
    private static final void bindAndReportWorkerInfo(com.uber.rib.core.Worker $this$bindAndReportWorkerInfo, java.lang.ref.WeakReference<com.uber.rib.core.WorkerBinderListener> workerBinderListeners, com.uber.rib.core.lifecycle.WorkerEvent event, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function1<? super com.uber.rib.core.Worker, kotlin.Unit> workerBinderAction) {
    }
    
    private static final void reportWorkerBinderInfo(java.lang.ref.WeakReference<com.uber.rib.core.WorkerBinderListener> $this$reportWorkerBinderInfo, com.uber.rib.core.Worker worker, kotlin.coroutines.CoroutineContext coroutineContext, com.uber.rib.core.lifecycle.WorkerEvent workerEvent, long totalBindingEventMilli) {
    }
}