package com.uber.rib.core;

/**
 * [Interactor] that doesn't rely on field injection.
 *
 * @param <P> the type of [Presenter].
 * @param <R> the type of [Router].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B\u000f\b\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0006\u001a\u00028\u00008\u0004@\u0004X\u0085\u000e\u00a2\u0006\u0004\n\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/uber/rib/core/BasicInteractor;", "P", "", "R", "Lcom/uber/rib/core/Router;", "Lcom/uber/rib/core/Interactor;", "presenter", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "rib-base"})
public abstract class BasicInteractor<P extends java.lang.Object, R extends com.uber.rib.core.Router<?>> extends com.uber.rib.core.Interactor<P, R> {
    @kotlin.jvm.JvmField()
    @org.jetbrains.annotations.NotNull()
    protected P presenter;
    
    protected BasicInteractor(@org.jetbrains.annotations.NotNull()
    P presenter) {
        super();
    }
}