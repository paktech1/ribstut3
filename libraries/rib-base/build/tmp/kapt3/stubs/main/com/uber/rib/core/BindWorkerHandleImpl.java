package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0005J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0097\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u0097\u0001J\u0015\u0010\u001b\u001a\u00020\u000b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0097\u0001J\u001b\u0010\u001b\u001a\u00020\u001c2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001fj\u0004\u0018\u0001` H\u0096\u0001J6\u0010!\u001a\u0002H\"\"\u0004\b\u0000\u0010\"2\u0006\u0010#\u001a\u0002H\"2\u0018\u0010$\u001a\u0014\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u0002H\"0%H\u0096\u0001\u00a2\u0006\u0002\u0010\'J(\u0010(\u001a\u0004\u0018\u0001H)\"\b\b\u0000\u0010)*\u00020&2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H)0\u0010H\u0096\u0003\u00a2\u0006\u0002\u0010*J\r\u0010+\u001a\u00060\u001fj\u0002` H\u0097\u0001JF\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u000b2\b\b\u0002\u0010/\u001a\u00020\u000b2\'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001e\u00a2\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001c01j\u0002`4H\u0097\u0001J2\u0010,\u001a\u00020-2\'\u00100\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u001e\u00a2\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u001c01j\u0002`4H\u0096\u0001J\u0011\u00105\u001a\u00020\u001cH\u0096A\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u0015\u00107\u001a\u0002082\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096\u0001J\u0011\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0096\u0003J\u0011\u00109\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u0002H\u0097\u0003J\t\u0010<\u001a\u00020\u000bH\u0096\u0001J\b\u0010=\u001a\u00020\u0002H\u0016R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0012\u0010\r\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\u000bX\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0010X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u0096\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0004\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006>"}, d2 = {"Lcom/uber/rib/core/BindWorkerHandleImpl;", "Lcom/uber/rib/core/BindWorkerHandle;", "Lkotlinx/coroutines/Job;", "bindJob", "unbindJob", "(Lkotlinx/coroutines/Job;Lkotlinx/coroutines/Job;)V", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "isActive", "", "()Z", "isCancelled", "isCompleted", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "cancel", "", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "get", "E", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getCancellationException", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "minusKey", "Lkotlin/coroutines/CoroutineContext;", "plus", "context", "other", "start", "unbind", "rib-base"})
final class BindWorkerHandleImpl implements com.uber.rib.core.BindWorkerHandle, kotlinx.coroutines.Job {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.Job unbindJob = null;
    
    public BindWorkerHandleImpl(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job bindJob, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job unbindJob) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.Job unbind() {
        return null;
    }
    
    @java.lang.Override()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.ChildHandle attachChild(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.ChildJob child) {
        return null;
    }
    
    @java.lang.Override()
    public void cancel(@org.jetbrains.annotations.Nullable()
    java.util.concurrent.CancellationException cause) {
    }
    
    @java.lang.Override()
    public <R extends java.lang.Object>R fold(R initial, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public <E extends kotlin.coroutines.CoroutineContext.Element>E get(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext.Key<E> key) {
        return null;
    }
    
    @java.lang.Override()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @org.jetbrains.annotations.NotNull()
    public java.util.concurrent.CancellationException getCancellationException() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.sequences.Sequence<kotlinx.coroutines.Job> getChildren() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.coroutines.CoroutineContext.Key<?> getKey() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.selects.SelectClause0 getOnJoin() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.DisposableHandle invokeOnCompletion(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        return null;
    }
    
    @java.lang.Override()
    @kotlinx.coroutines.InternalCoroutinesApi()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.DisposableHandle invokeOnCompletion(boolean onCancelling, boolean invokeImmediately, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        return null;
    }
    
    @java.lang.Override()
    public boolean isActive() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCancelled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean isCompleted() {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object join(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext.Key<?> key) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.CoroutineContext context) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    @java.lang.Deprecated()
    public kotlinx.coroutines.Job plus(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.Job other) {
        return null;
    }
    
    @java.lang.Override()
    public boolean start() {
        return false;
    }
}