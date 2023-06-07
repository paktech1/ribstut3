package com.uber.rib.core;

/**
 * Interface used when creating a manager or helper class that should be bound to an interactor's
 * lifecycle using a binder like [WorkerBinder]. The worker event is decoupled from the interactor's
 * actual lifecycle so that we're not stuck moving these classes around if there are other
 * lifecycles we're interested in.
 *
 * By default a [Worker] will be bound on the [CoroutineDispatcher] defined at [WorkerBinder.bind]
 * call, except when the [Worker]'s [coroutineContext] is overriden with any other value than the
 * default [EmptyCoroutineContext]. The new resulting binding dispatcher (e.g.
 * RibDispatchers.Default) from [Worker] will take priority over the one passed via a
 * [WorkerBinder.bind] call
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\b\u0010\f\u001a\u00020\tH\u0017R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004\u00a2\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\r"}, d2 = {"Lcom/uber/rib/core/Worker;", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext$annotations", "()V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "onStart", "", "lifecycle", "Lcom/uber/rib/core/WorkerScopeProvider;", "onStop", "rib-base"})
public abstract interface Worker {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.coroutines.CoroutineContext getCoroutineContext();
    
    /**
     * Called when worker is started.
     *
     * @param lifecycle The lifecycle of the worker to use for subscriptions.
     */
    @kotlin.jvm.JvmDefault()
    public default void onStart(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.WorkerScopeProvider lifecycle) {
    }
    
    /**
     * Called when the worker is stopped.
     */
    @kotlin.jvm.JvmDefault()
    public default void onStop() {
    }
    
    /**
     * Interface used when creating a manager or helper class that should be bound to an interactor's
     * lifecycle using a binder like [WorkerBinder]. The worker event is decoupled from the interactor's
     * actual lifecycle so that we're not stuck moving these classes around if there are other
     * lifecycles we're interested in.
     *
     * By default a [Worker] will be bound on the [CoroutineDispatcher] defined at [WorkerBinder.bind]
     * call, except when the [Worker]'s [coroutineContext] is overriden with any other value than the
     * default [EmptyCoroutineContext]. The new resulting binding dispatcher (e.g.
     * RibDispatchers.Default) from [Worker] will take priority over the one passed via a
     * [WorkerBinder.bind] call
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        /**
         * When overriden, will specify on which [CoroutineContext] the [Worker] will be bound via
         * [WorkerBinder] (ignoring any [CoroutineDispatcher] being passed via [WorkerBinder])
         *
         * For example given list of workers:
         * 1) workers = listOf(defaultWorker, uiWorker)
         * 2) Where [uiWorker] overrides [coroutinesContext] with [RibDispatchers.Main]
         * 3) After calling WorkerBinder.bind(interactor, workers, RibDispatchers.IO). [uiWorker] will be
         *   guaranteed to be called on RibDispatchers.Main
         */
        @kotlin.jvm.JvmDefault()
        @java.lang.Deprecated()
        public static void getCoroutineContext$annotations() {
        }
    }
}