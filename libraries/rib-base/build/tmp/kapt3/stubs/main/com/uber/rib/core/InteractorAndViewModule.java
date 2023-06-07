package com.uber.rib.core;

/**
 * A module that takes an interactor and a view as dependencies.
 *
 * @param <I> type of interactor.
 * @param <V> type of view.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\bR\u0016\u0010\u0007\u001a\u00028\u0001X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/uber/rib/core/InteractorAndViewModule;", "I", "Lcom/uber/rib/core/Interactor;", "V", "Landroid/view/View;", "Lcom/uber/rib/core/InteractorModule;", "interactor", "view", "(Lcom/uber/rib/core/Interactor;Landroid/view/View;)V", "getView", "()Landroid/view/View;", "Landroid/view/View;", "rib-base"})
public abstract class InteractorAndViewModule<I extends com.uber.rib.core.Interactor<?, ?>, V extends android.view.View> extends com.uber.rib.core.InteractorModule<I> {
    @org.jetbrains.annotations.NotNull()
    private final V view = null;
    
    public InteractorAndViewModule(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    V view) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final V getView() {
        return null;
    }
}