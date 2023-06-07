package com.uber.rib.core;

/**
 * The base implementation for all [Interactor]s.
 *
 * @param <P> the type of [Presenter].
 * @param <R> the type of [Router].
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 @*\b\b\u0000\u0010\u0001*\u00020\u0002*\f\b\u0001\u0010\u0003*\u0006\u0012\u0002\b\u00030\u00042\u00020\u0005:\u0002@AB\u000f\b\u0014\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0007B\u0005\u00a2\u0006\u0002\u0010\bJ\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0(J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0015J\u0012\u0010-\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\r\u0010.\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\u0010J\r\u0010/\u001a\u00028\u0000H\u0003\u00a2\u0006\u0002\u0010\u0010J\b\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u000201H\u0016J\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020,H\u0014J\u0015\u00106\u001a\u00020*2\u0006\u00105\u001a\u00020,H\u0000\u00a2\u0006\u0002\b7J\b\u00108\u001a\u0004\u0018\u00010\u000bJ\u0006\u00109\u001a\u00020:J\u0017\u0010;\u001a\u00020*2\u0006\u0010\u0006\u001a\u00028\u0000H\u0001\u00a2\u0006\u0004\b<\u0010\u0007J\u0019\u0010=\u001a\u00020*2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000\u00a2\u0006\u0002\b>J\b\u0010?\u001a\u00020*H\u0014R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0080\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007R \u0010\u0013\u001a\u00028\u00008\u0006@\u0006X\u0087.\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR+\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001d\u001a\u00028\u00018V@TX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010%\u001a\u0018\u0012\u0004\u0012\u00028\u00010&R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006B"}, d2 = {"Lcom/uber/rib/core/Interactor;", "P", "", "R", "Lcom/uber/rib/core/Router;", "Lcom/uber/rib/core/InteractorType;", "presenter", "(Ljava/lang/Object;)V", "()V", "_lifecycleFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/uber/rib/core/lifecycle/InteractorEvent;", "_lifecycleObservable", "Lio/reactivex/Observable;", "actualPresenter", "getActualPresenter$rib_base", "()Ljava/lang/Object;", "setActualPresenter$rib_base", "Ljava/lang/Object;", "injectedPresenter", "getInjectedPresenter", "setInjectedPresenter", "lifecycleFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getLifecycleFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "lifecycleObservable", "getLifecycleObservable", "()Lio/reactivex/Observable;", "<set-?>", "router", "getRouter", "()Lcom/uber/rib/core/Router;", "setRouter", "(Lcom/uber/rib/core/Router;)V", "router$delegate", "Lcom/uber/rib/core/Interactor$InitOnceProperty;", "routerDelegate", "Lcom/uber/rib/core/Interactor$InitOnceProperty;", "correspondingEvents", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "didBecomeActive", "", "savedInstanceState", "Lcom/uber/rib/core/Bundle;", "dispatchAttach", "dispatchDetach", "getPresenter", "handleBackPress", "", "isAttached", "lifecycle", "onSaveInstanceState", "outState", "onSaveInstanceStateInternal", "onSaveInstanceStateInternal$rib_base", "peekLifecycle", "requestScope", "Lio/reactivex/CompletableSource;", "setPresenter", "setPresenter$rib_base", "setRouterInternal", "setRouterInternal$rib_base", "willResignActive", "Companion", "InitOnceProperty", "rib-base"})
public abstract class Interactor<P extends java.lang.Object, R extends com.uber.rib.core.Router<?>> implements com.uber.rib.core.InteractorType {
    @javax.inject.Inject()
    public P injectedPresenter;
    @org.jetbrains.annotations.Nullable()
    private P actualPresenter;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.uber.rib.core.lifecycle.InteractorEvent> _lifecycleFlow = null;
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private volatile io.reactivex.Observable<com.uber.rib.core.lifecycle.InteractorEvent> _lifecycleObservable;
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.Interactor<P, R>.InitOnceProperty<R> routerDelegate = null;
    
    /**
     * @return the router for this interactor.
     */
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.Interactor.InitOnceProperty router$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.ranges.ClosedRange<com.uber.rib.core.lifecycle.InteractorEvent> lifecycleRange = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.uber.autodispose.lifecycle.CorrespondingEventsFunction<com.uber.rib.core.lifecycle.InteractorEvent> LIFECYCLE_MAP_FUNCTION = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Interactor.Companion Companion = null;
    
    public Interactor() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final P getInjectedPresenter() {
        return null;
    }
    
    public final void setInjectedPresenter(@org.jetbrains.annotations.NotNull()
    P p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final P getActualPresenter$rib_base() {
        return null;
    }
    
    public final void setActualPresenter$rib_base(@org.jetbrains.annotations.Nullable()
    P p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.SharedFlow<com.uber.rib.core.lifecycle.InteractorEvent> getLifecycleFlow() {
        return null;
    }
    
    private final io.reactivex.Observable<com.uber.rib.core.lifecycle.InteractorEvent> getLifecycleObservable() {
        return null;
    }
    
    /**
     * @return the router for this interactor.
     */
    @org.jetbrains.annotations.NotNull()
    public R getRouter() {
        return null;
    }
    
    /**
     * @return the router for this interactor.
     */
    protected void setRouter(@org.jetbrains.annotations.NotNull()
    R p0) {
    }
    
    protected Interactor(@org.jetbrains.annotations.NotNull()
    P presenter) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.uber.rib.core.lifecycle.InteractorEvent> lifecycle() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public final com.uber.autodispose.lifecycle.CorrespondingEventsFunction<com.uber.rib.core.lifecycle.InteractorEvent> correspondingEvents() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public final com.uber.rib.core.lifecycle.InteractorEvent peekLifecycle() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.CompletableSource requestScope() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isAttached() {
        return false;
    }
    
    @java.lang.Override()
    public boolean handleBackPress() {
        return false;
    }
    
    /**
     * Called when attached. The presenter will automatically be added when this happens.
     *
     * @param savedInstanceState the saved [Bundle].
     */
    @androidx.annotation.CallSuper()
    protected void didBecomeActive(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Bundle savedInstanceState) {
    }
    
    /**
     * Called when detached. The [Interactor] should do its cleanup here. Note: View will be removed
     * automatically so [Interactor] doesn't have to remove its view here.
     */
    protected void willResignActive() {
    }
    
    public final void onSaveInstanceStateInternal$rib_base(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Bundle outState) {
    }
    
    /**
     * Called when saving state.
     *
     * @param outState the saved [Bundle].
     */
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Bundle outState) {
    }
    
    public void dispatchAttach(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public P dispatchDetach() {
        return null;
    }
    
    public final void setRouterInternal$rib_base(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Router<?> router) {
    }
    
    /**
     * @return the currently attached presenter if there is one
     */
    @androidx.annotation.VisibleForTesting()
    private final P getPresenter() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setPresenter$rib_base(@org.jetbrains.annotations.NotNull()
    P presenter) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8@X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/uber/rib/core/Interactor$Companion;", "", "()V", "LIFECYCLE_MAP_FUNCTION", "Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;", "Lcom/uber/rib/core/lifecycle/InteractorEvent;", "kotlin.jvm.PlatformType", "lifecycleRange", "Lkotlin/ranges/ClosedRange;", "getLifecycleRange$rib_base", "()Lkotlin/ranges/ClosedRange;", "rib-base"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u00028\u00022\u0006\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\nH\u0096\u0002\u00a2\u0006\u0002\u0010\u000bJ*\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u000e\u001a\u00028\u0002H\u0096\u0002\u00a2\u0006\u0002\u0010\u000fR\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0002X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/uber/rib/core/Interactor$InitOnceProperty;", "T", "Lkotlin/properties/ReadWriteProperty;", "", "(Lcom/uber/rib/core/Interactor;)V", "backingField", "Ljava/lang/Object;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "setValue", "", "value", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "rib-base"})
    final class InitOnceProperty<T extends java.lang.Object> implements kotlin.properties.ReadWriteProperty<java.lang.Object, T> {
        @org.jetbrains.annotations.Nullable()
        private T backingField;
        
        public InitOnceProperty() {
            super();
        }
        
        @java.lang.Override()
        public T getValue(@org.jetbrains.annotations.NotNull()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property) {
            return null;
        }
        
        @java.lang.Override()
        public void setValue(@org.jetbrains.annotations.NotNull()
        java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property, T value) {
        }
    }
}