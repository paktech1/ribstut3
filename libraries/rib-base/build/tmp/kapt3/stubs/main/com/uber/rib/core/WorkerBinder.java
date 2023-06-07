package com.uber.rib.core;

/**
 * Helper class to bind to an interactor's lifecycle to translate it to a [Worker] lifecycle.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J0\u0010\u0006\u001a\u00020\u000e2\u000e\u0010\b\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J(\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001e\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u001e\u0010\u001a\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u0005H\u0007J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\u0014H\u0007J\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0014H\u0007R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/uber/rib/core/WorkerBinder;", "", "()V", "workerBinderListenerWeakRef", "Ljava/lang/ref/WeakReference;", "Lcom/uber/rib/core/WorkerBinderListener;", "bind", "Lcom/uber/rib/core/WorkerUnbinder;", "interactor", "Lcom/uber/rib/core/Interactor;", "worker", "Lcom/uber/rib/core/Worker;", "dispatcherAtBinder", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "workers", "", "presenter", "Lcom/uber/rib/core/Presenter;", "mappedLifecycle", "Lio/reactivex/Observable;", "Lcom/uber/rib/core/lifecycle/WorkerEvent;", "bindTo", "lifecycle", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "Lcom/uber/rib/core/lifecycle/InteractorEvent;", "bindToWorkerLifecycle", "workerLifecycle", "initializeMonitoring", "workerBinderListener", "mapInteractorLifecycleToWorker", "interactorEventObservable", "mapPresenterLifecycleToWorker", "presenterEventObservable", "Lcom/uber/rib/core/lifecycle/PresenterEvent;", "rib-base"})
public final class WorkerBinder {
    @org.jetbrains.annotations.Nullable()
    private static java.lang.ref.WeakReference<com.uber.rib.core.WorkerBinderListener> workerBinderListenerWeakRef;
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.WorkerBinder INSTANCE = null;
    
    private WorkerBinder() {
        super();
    }
    
    /**
     * Initializes reporting of [WorkerBinderInfo] via [WorkerBinderListener]
     *
     * IMPORTANT: This should be called only once at early app scope to get proper monitoring of early
     * worker being bound
     */
    @kotlin.jvm.JvmStatic()
    public static final void initializeMonitoring(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.WorkerBinderListener workerBinderListener) {
    }
    
    /**
     * Bind a worker (ie. a manager or any other class that needs an interactor's lifecycle) to an
     * interactor's lifecycle events. Inject this class into your interactor and call this method on
     * any
     *
     * @param interactor The interactor that provides the lifecycle.
     * @param worker The class that wants to be informed when to start and stop doing work.
     * @param dispatcherAtBinder CoroutineDispatcher to be apply only when [Worker.coroutineContext]
     *  is not overriden with a value different that [EmptyCoroutineContext]
     * @return [WorkerUnbinder] to unbind [Worker]'s lifecycle.
     */
    @kotlin.jvm.JvmStatic()
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.WorkerUnbinder bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Interactor<?, ?> interactor, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcherAtBinder) {
        return null;
    }
    
    /**
     * Bind a list of workers (ie. a manager or any other class that needs an interactor's lifecycle)
     * to an interactor's lifecycle events. Use this class into your interactor and call this method
     * on attach.
     *
     * @param interactor The interactor that provides the lifecycle.
     * @param workers A list of classes that want to be informed when to start and stop doing work.
     * @param dispatcherAtBinder CoroutineDispatcher to be applied only when the
     *  [Worker.coroutineContext] is not overriden with a value different than
     *  [EmptyCoroutineContext]
     */
    @kotlin.jvm.JvmStatic()
    @kotlin.jvm.JvmOverloads()
    public static final void bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Interactor<?, ?> interactor, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.uber.rib.core.Worker> workers, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcherAtBinder) {
    }
    
    /**
     * Bind a worker (ie. a manager or any other class that needs an presenter's lifecycle) to an
     * presenter's lifecycle events. Inject this class into your presenter and call this method on any
     *
     * @param presenter The presenter that provides the lifecycle.
     * @param worker The class that wants to be informed when to start and stop doing work.
     * @param dispatcherAtBinder CoroutineDispatcher to be applied only when the
     *  [Worker.coroutineContext] is not overriden with a value different than
     *  [EmptyCoroutineContext]
     * @return [WorkerUnbinder] to unbind [Worker]'s lifecycle.
     */
    @kotlin.jvm.JvmStatic()
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.WorkerUnbinder bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Presenter presenter, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcherAtBinder) {
        return null;
    }
    
    /**
     * Bind a list of workers (ie. a manager or any other class that needs an presenter's lifecycle)
     * to an presenter's lifecycle events. Use this class into your presenter and call this method on
     * attach.
     *
     * @param presenter The presenter that provides the lifecycle.
     * @param workers A list of classes that want to be informed when to start and stop doing work.
     * @param dispatcherAtBinder CoroutineDispatcher to be applied only when the
     *  [Worker.coroutineContext] is not overriden with a value different than
     *  [EmptyCoroutineContext]
     */
    @kotlin.jvm.JvmStatic()
    public static final void bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Presenter presenter, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.uber.rib.core.Worker> workers, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcherAtBinder) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.annotation.VisibleForTesting()
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public static final com.uber.rib.core.WorkerUnbinder bind(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.uber.rib.core.lifecycle.WorkerEvent> mappedLifecycle, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Observable<com.uber.rib.core.lifecycle.WorkerEvent> mapInteractorLifecycleToWorker(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.uber.rib.core.lifecycle.InteractorEvent> interactorEventObservable) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final io.reactivex.Observable<com.uber.rib.core.lifecycle.WorkerEvent> mapPresenterLifecycleToWorker(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.uber.rib.core.lifecycle.PresenterEvent> presenterEventObservable) {
        return null;
    }
    
    /**
     * Bind a worker (ie. a manager or any other class that needs an interactor's lifecycle) to an
     * interactor's lifecycle events.
     *
     * @param lifecycle The interactor's [LifecycleScopeProvider].
     * @param worker The class that wants to be informed when to start and stop doing work.
     */
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static final void bindTo(@org.jetbrains.annotations.NotNull()
    com.uber.autodispose.lifecycle.LifecycleScopeProvider<com.uber.rib.core.lifecycle.InteractorEvent> lifecycle, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker) {
    }
    
    /**
     * Bind a worker to a [WorkerEvent] lifecycle provider.
     *
     * @param workerLifecycle the worker lifecycle event provider
     * @param worker the class that wants to be informed when to start and stop doing work
     */
    @kotlin.jvm.JvmStatic()
    @java.lang.Deprecated()
    public static final void bindToWorkerLifecycle(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.uber.rib.core.lifecycle.WorkerEvent> workerLifecycle, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker) {
    }
    
    @kotlin.jvm.JvmStatic()
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.WorkerUnbinder bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Interactor<?, ?> interactor, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    @kotlin.jvm.JvmOverloads()
    public static final void bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Interactor<?, ?> interactor, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.uber.rib.core.Worker> workers) {
    }
    
    @kotlin.jvm.JvmStatic()
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.WorkerUnbinder bind(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Presenter presenter, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker worker) {
        return null;
    }
}