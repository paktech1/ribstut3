package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0001H\u0082H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u001a\n\u0010\t\u001a\u00020\u0003*\u00020\n\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\rH\u0007\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0012*\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0007\u001a\u0014\u0010\u0014\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0005*\u00020\u0010H\u0002\u001ay\u0010\u0018\u001a\u00020\u0019*\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\r2\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u001b\u00a2\u0006\u0002\b\u001c2\'\u0010\u001d\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001e\u00a2\u0006\u0002\b\u001cH\u0002\u00f8\u0001\u0000\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001\n\b\b\u0001\u0012\u0002\u0010\u0003 \u0000\u00a2\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"bindAndAwaitCancellation", "", "worker", "Lcom/uber/rib/core/RibCoroutineWorker;", "bindJob", "Lkotlinx/coroutines/CompletableJob;", "(Lcom/uber/rib/core/RibCoroutineWorker;Lkotlinx/coroutines/CompletableJob;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchIfNeeded", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "asRibCoroutineWorker", "Lcom/uber/rib/core/Worker;", "asWorker", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "asWorkerScopeProvider", "Lcom/uber/rib/core/WorkerScopeProvider;", "Lkotlinx/coroutines/CoroutineScope;", "bind", "Lcom/uber/rib/core/BindWorkerHandle;", "context", "cancelOrCompleteExceptionally", "throwable", "", "createBindingJob", "launch", "Lkotlinx/coroutines/Job;", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "rib-base"})
public final class RibCoroutineWorkerKt {
    
    /**
     * Binds [worker] in a scope that is a child of the [CoroutineScope] receiver.
     *
     * The binding operation runs [RibCoroutineWorker.onStart] in a context inherited from the
     * [CoroutineScope] receiver, but with additional [context] elements that is, by default,
     * [RibDispatchers.Default]. This makes the worker run on the default dispatcher by default. Pass in
     * [EmptyCoroutineContext] instead if you want the worker to not override the dispatcher in the
     * scope (if any), or pass in a custom dispatcher as [context] to specify a different dispatcher. If
     * there is no dispatcher in [CoroutineScope] nor in [context], [RibDispatchers.Default] is used.
     *
     * The scope passed on to [RibCoroutineWorker.onStart] as a parameter is a child scope of the
     * [CoroutineScope] receiver, but with the additional [context] elements and a [SupervisorJob].
     *
     * Binding a worker is an asynchronous operation. To ensure [RibCoroutineWorker.onStart] is
     * finished, callers can [join][BindWorkerHandle.join] the resulting [BindWorkerHandle] when in a
     * coroutine:
     * ```
     * val handle = coroutineScope.bind(worker)
     * handle.join() // wait for onStart to finish
     * ```
     */
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.BindWorkerHandle bind(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$bind, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibCoroutineWorker worker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context) {
        return null;
    }
    
    /**
     * Guarantees to run synchronous [init] block exactly once in an undispatched manner.
     *
     * **Exceptions thrown in [init] block will be rethrown at call site.**
     */
    @kotlin.OptIn(markerClass = {kotlin.contracts.ExperimentalContracts.class})
    private static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope $this$launch, kotlin.coroutines.CoroutineContext context, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CoroutineScope, kotlin.Unit> init, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    private static final java.lang.Object dispatchIfNeeded(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private static final kotlinx.coroutines.CompletableJob createBindingJob(kotlinx.coroutines.CoroutineScope $this$createBindingJob) {
        return null;
    }
    
    @kotlin.Suppress(names = {"TooGenericExceptionCaught"})
    private static final java.lang.Object bindAndAwaitCancellation(com.uber.rib.core.RibCoroutineWorker worker, kotlinx.coroutines.CompletableJob bindJob, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Cancel the deferred if [throwable] is a [CancellationException], otherwise completes it
     * exceptionally.
     */
    private static final void cancelOrCompleteExceptionally(kotlinx.coroutines.CompletableJob $this$cancelOrCompleteExceptionally, java.lang.Throwable throwable) {
    }
    
    /**
     * Converts a [Worker] to a [RibCoroutineWorker].
     */
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.RibCoroutineWorker asRibCoroutineWorker(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Worker $this$asRibCoroutineWorker) {
        return null;
    }
    
    /**
     * Converts a [RibCoroutineWorker] to a [Worker].
     */
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Worker asWorker(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibCoroutineWorker $this$asWorker, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext coroutineContext) {
        return null;
    }
    
    private static final com.uber.rib.core.WorkerScopeProvider asWorkerScopeProvider(kotlinx.coroutines.CoroutineScope $this$asWorkerScopeProvider) {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Worker asWorker(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibCoroutineWorker $this$asWorker) {
        return null;
    }
    
    @kotlin.jvm.JvmOverloads()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.BindWorkerHandle bind(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope $this$bind, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibCoroutineWorker worker) {
        return null;
    }
}