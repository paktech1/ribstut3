package com.uber.rib.core;

/**
 * Contains presentation logic. This class exists mainly for legacy reasons. In the past we believed
 * it was useful to have a class between interactors and views to facilitate model transformations
 * and believed these transformations would be complex enough to require its own lifecycle. In
 * practice this caused confusion: if both a presenter and interactor can perform complex rx logic
 * it becomes unclear where you should write your bussiness logic.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0015J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0014H\u0015R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@BX\u0084\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, d2 = {"Lcom/uber/rib/core/Presenter;", "Lcom/uber/autodispose/ScopeProvider;", "()V", "_lifecycleFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/uber/rib/core/lifecycle/PresenterEvent;", "_lifecycleObservable", "Lio/reactivex/Observable;", "<set-?>", "", "isLoaded", "()Z", "lifecycleFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getLifecycleFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "lifecycleObservable", "getLifecycleObservable", "()Lio/reactivex/Observable;", "didLoad", "", "dispatchLoad", "dispatchUnload", "lifecycle", "requestScope", "Lio/reactivex/CompletableSource;", "willUnload", "Companion", "rib-base"})
public abstract class Presenter implements com.uber.autodispose.ScopeProvider {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.uber.rib.core.lifecycle.PresenterEvent> _lifecycleFlow = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile io.reactivex.Observable<com.uber.rib.core.lifecycle.PresenterEvent> _lifecycleObservable;
    
    /**
     * @return `true` if the presenter is loaded, `false` if not.
     */
    private boolean isLoaded = false;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.ClosedRange<com.uber.rib.core.lifecycle.PresenterEvent> lifecycleRange = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Presenter.Companion Companion = null;
    
    public Presenter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.SharedFlow<com.uber.rib.core.lifecycle.PresenterEvent> getLifecycleFlow() {
        return null;
    }
    
    private final io.reactivex.Observable<com.uber.rib.core.lifecycle.PresenterEvent> getLifecycleObservable() {
        return null;
    }
    
    /**
     * @return `true` if the presenter is loaded, `false` if not.
     */
    protected final boolean isLoaded() {
        return false;
    }
    
    public void dispatchLoad() {
    }
    
    public void dispatchUnload() {
    }
    
    /**
     * Tells the presenter that it has finished loading.
     */
    @androidx.annotation.CallSuper()
    protected void didLoad() {
    }
    
    /**
     * Tells the presenter that it will be destroyed. Presenter subclasses should perform any required
     * cleanup here.
     */
    @org.checkerframework.checker.guieffect.qual.UIEffect()
    @androidx.annotation.CallSuper()
    protected void willUnload() {
    }
    
    /**
     * @return an observable of this controller's lifecycle events.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.uber.rib.core.lifecycle.PresenterEvent> lifecycle() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.CompletableSource requestScope() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/uber/rib/core/Presenter$Companion;", "", "()V", "lifecycleRange", "Lkotlin/ranges/ClosedRange;", "Lcom/uber/rib/core/lifecycle/PresenterEvent;", "getLifecycleRange$rib_base", "()Lkotlin/ranges/ClosedRange;", "rib-base"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}