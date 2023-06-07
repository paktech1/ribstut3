package com.uber.rib.core;

/**
 * Designates a component that can provide a specific interactor. This is identical to [ ]. This
 * exists soley for backwards compatibility with old versions of the Presidio Intellij Plugin.
 *
 * @param <T> type of interactor that is injected.
 * @param <P> type of presenter.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0012\b\u0001\u0010\u0003*\f\u0012\u0004\u0012\u0002H\u0001\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00030\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0001H&\u00a2\u0006\u0002\u0010\tJ\r\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/uber/rib/core/InteractorComponent;", "P", "Lcom/uber/rib/core/Presenter;", "T", "Lcom/uber/rib/core/Interactor;", "Lcom/uber/rib/core/InteractorBaseComponent;", "inject", "", "interactor", "(Lcom/uber/rib/core/Interactor;)V", "presenter", "()Lcom/uber/rib/core/Presenter;", "rib-base"})
public abstract interface InteractorComponent<P extends com.uber.rib.core.Presenter, T extends com.uber.rib.core.Interactor<P, ?>> extends com.uber.rib.core.InteractorBaseComponent<T> {
    
    /**
     * Inject the interactor.
     *
     * @param interactor to inject.
     */
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    T interactor);
    
    /**
     * The presenter.
     *
     * @return the presenter.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract P presenter();
}