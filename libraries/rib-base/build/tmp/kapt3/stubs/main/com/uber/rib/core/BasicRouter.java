package com.uber.rib.core;

/**
 * [Router] that does not require an [InteractorBaseComponent].
 *
 * @param <I> type of interactor.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/uber/rib/core/BasicRouter;", "I", "Lcom/uber/rib/core/Interactor;", "Lcom/uber/rib/core/Router;", "interactor", "(Lcom/uber/rib/core/Interactor;)V", "rib-base"})
public abstract class BasicRouter<I extends com.uber.rib.core.Interactor<?, ?>> extends com.uber.rib.core.Router<I> {
    
    public BasicRouter(@org.jetbrains.annotations.NotNull()
    I interactor) {
        super(null, null, null, null);
    }
}