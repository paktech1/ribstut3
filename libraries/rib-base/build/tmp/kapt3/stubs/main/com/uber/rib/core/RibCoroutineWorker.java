package com.uber.rib.core;

/**
 * A manager or helper class bound to a [CoroutineScope] by using a binder like [bind].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/uber/rib/core/RibCoroutineWorker;", "", "onStart", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStop", "cause", "", "rib-base"})
public abstract interface RibCoroutineWorker {
    
    /**
     * Called when worker is started. Children coroutines can be launched in [scope].
     */
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object onStart(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    /**
     * Called when worker is stopped with [cause]. Should be fast, be non-blocking and not throw.
     */
    @kotlin.jvm.JvmDefault()
    public default void onStop(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable cause) {
    }
}