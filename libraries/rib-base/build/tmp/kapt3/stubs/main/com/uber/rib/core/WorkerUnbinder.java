package com.uber.rib.core;

/**
 * API for unbinding a [Worker] before currently bound lifecycle has ended. Use this if you need to
 * stop your [Worker] before the [Interactor] becomes inactive for example.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/uber/rib/core/WorkerUnbinder;", "", "unbind", "", "rib-base"})
public abstract interface WorkerUnbinder {
    
    /**
     * Unbind from bound lifecycle and end worker's lifecycle.
     */
    public abstract void unbind();
}