package com.uber.rib.core;

/**
 * A module that takes an interactor as a dependency.
 *
 * @param <I> type of interactor.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005R\u0016\u0010\u0004\u001a\u00028\u0000X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/uber/rib/core/InteractorModule;", "I", "Lcom/uber/rib/core/Interactor;", "", "interactor", "(Lcom/uber/rib/core/Interactor;)V", "getInteractor", "()Lcom/uber/rib/core/Interactor;", "Lcom/uber/rib/core/Interactor;", "rib-base"})
public abstract class InteractorModule<I extends com.uber.rib.core.Interactor<?, ?>> {
    @org.jetbrains.annotations.NotNull()
    private final I interactor = null;
    
    public InteractorModule(@org.jetbrains.annotations.NotNull()
    I interactor) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final I getInteractor() {
        return null;
    }
}