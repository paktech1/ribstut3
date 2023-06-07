package com.uber.rib.core;

/**
 * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
 * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
 * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
 * `onStart` are not waited: worker is considered bound when `onStart` finishes.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0001H&\u0082\u0001\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/uber/rib/core/BindWorkerHandle;", "Lkotlinx/coroutines/Job;", "unbind", "Lcom/uber/rib/core/BindWorkerHandleImpl;", "rib-base"})
public abstract interface BindWorkerHandle extends kotlinx.coroutines.Job {
    
    /**
     * Unbinds the worker.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.Job unbind();
    
    /**
     * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
     * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
     * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
     * `onStart` are not waited: worker is considered bound when `onStart` finishes.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        /**
         * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
         * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
         * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
         * `onStart` are not waited: worker is considered bound when `onStart` finishes.
         */
        public static <R extends java.lang.Object>R fold(@org.jetbrains.annotations.NotNull()
        com.uber.rib.core.BindWorkerHandle $this, R initial, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> operation) {
            return null;
        }
        
        /**
         * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
         * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
         * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
         * `onStart` are not waited: worker is considered bound when `onStart` finishes.
         */
        @org.jetbrains.annotations.Nullable()
        public static <E extends kotlin.coroutines.CoroutineContext.Element>E get(@org.jetbrains.annotations.NotNull()
        com.uber.rib.core.BindWorkerHandle $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext.Key<E> key) {
            return null;
        }
        
        /**
         * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
         * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
         * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
         * `onStart` are not waited: worker is considered bound when `onStart` finishes.
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlin.coroutines.CoroutineContext minusKey(@org.jetbrains.annotations.NotNull()
        com.uber.rib.core.BindWorkerHandle $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext.Key<?> key) {
            return null;
        }
        
        /**
         * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
         * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
         * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
         * `onStart` are not waited: worker is considered bound when `onStart` finishes.
         */
        @org.jetbrains.annotations.NotNull()
        public static kotlin.coroutines.CoroutineContext plus(@org.jetbrains.annotations.NotNull()
        com.uber.rib.core.BindWorkerHandle $this, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.CoroutineContext context) {
            return null;
        }
        
        /**
         * A handle to interact with [RibCoroutineWorker] binding job. This handle implements [Job], which
         * refers to the completion of [RibCoroutineWorker.onStart]. It can be [joined][join] to make sure
         * `onStart` finished. Note that children coroutines launched in the [CoroutineScope] passed on to
         * `onStart` are not waited: worker is considered bound when `onStart` finishes.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Deprecated()
        public static kotlinx.coroutines.Job plus(@org.jetbrains.annotations.NotNull()
        com.uber.rib.core.BindWorkerHandle $this, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.Job other) {
            return null;
        }
    }
}