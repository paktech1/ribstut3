package com.uber.rib.core;

/**
 * Designates a component that can provide a specific interactor.
 *
 * @param <T> type of interactor that is injected.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/uber/rib/core/InteractorBaseComponent;", "T", "Lcom/uber/rib/core/Interactor;", "", "inject", "", "interactor", "(Lcom/uber/rib/core/Interactor;)V", "rib-base"})
public abstract interface InteractorBaseComponent<T extends com.uber.rib.core.Interactor<?, ?>> {
    
    /**
     * Inject the interactor.
     *
     * @param interactor to inject.
     */
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    T interactor);
}