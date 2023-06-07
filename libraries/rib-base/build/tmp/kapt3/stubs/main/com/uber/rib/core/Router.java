package com.uber.rib.core;

/**
 * Responsible for handling the addition and removal of children routers.
 *
 * @param <I> type of interactor this router routes.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u000b\b&\u0018\u0000 4*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00014B\u001d\b\u0014\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B\u000f\b\u0014\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\bB-\b\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0014\u0010 \u001a\u00020!2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0017J\u001c\u0010 \u001a\u00020!2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0017J\b\u0010#\u001a\u00020!H\u0014J\b\u0010$\u001a\u00020!H\u0002J\u0014\u0010%\u001a\u00020!2\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0017J\b\u0010&\u001a\u00020!H\u0015J\u0012\u0010\'\u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0017J\u001a\u0010\'\u001a\u00020!2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017J\b\u0010(\u001a\u00020!H\u0016J\u0017\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000*H\u0010\u00a2\u0006\u0002\b+J\b\u0010,\u001a\u00020\u0018H\u0016J\u0016\u0010-\u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0004J\u0010\u0010.\u001a\u00020!2\u0006\u0010/\u001a\u00020\u001aH\u0014J\u0015\u00100\u001a\u00020!2\u0006\u0010/\u001a\u00020\u001aH\u0000\u00a2\u0006\u0002\b1J\b\u00102\u001a\u00020!H\u0014J\b\u00103\u001a\u00020!H\u0014R\u0018\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0013\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00065"}, d2 = {"Lcom/uber/rib/core/Router;", "I", "Lcom/uber/rib/core/InteractorType;", "", "interactor", "component", "Lcom/uber/rib/core/InteractorBaseComponent;", "(Lcom/uber/rib/core/InteractorType;Lcom/uber/rib/core/InteractorBaseComponent;)V", "(Lcom/uber/rib/core/InteractorType;)V", "ribRefWatcher", "Lcom/uber/rib/core/RibRefWatcher;", "mainThread", "Ljava/lang/Thread;", "(Lcom/uber/rib/core/InteractorBaseComponent;Lcom/uber/rib/core/InteractorType;Lcom/uber/rib/core/RibRefWatcher;Ljava/lang/Thread;)V", "children", "", "getInteractor", "()Lcom/uber/rib/core/InteractorType;", "Lcom/uber/rib/core/InteractorType;", "interactorGeneric", "Lcom/uber/rib/core/Interactor;", "getInteractorGeneric", "()Lcom/uber/rib/core/Interactor;", "isLoaded", "", "savedInstanceState", "Lcom/uber/rib/core/Bundle;", "<set-?>", "", "tag", "getTag$rib_base", "()Ljava/lang/String;", "attachChild", "", "childRouter", "attachToInteractor", "checkForMainThread", "detachChild", "didLoad", "dispatchAttach", "dispatchDetach", "getChildren", "", "getChildren$rib_base", "handleBackPress", "inject", "saveInstanceState", "outState", "saveInstanceStateInternal", "saveInstanceStateInternal$rib_base", "willAttach", "willDetach", "Companion", "rib-base"})
public abstract class Router<I extends com.uber.rib.core.InteractorType> {
    @org.jetbrains.annotations.NotNull()
    private final I interactor = null;
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.RibRefWatcher ribRefWatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Thread mainThread = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.uber.rib.core.Router<?>> children = null;
    
    /**
     * @return the Tag.
     */
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tag;
    @org.jetbrains.annotations.Nullable()
    private com.uber.rib.core.Bundle savedInstanceState;
    private boolean isLoaded = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_CHILD_ROUTERS = "Router.childRouters";
    @kotlin.jvm.JvmField()
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_INTERACTOR = "Router.interactor";
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Router.Companion Companion = null;
    
    protected Router(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.InteractorBaseComponent<?> component, @org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibRefWatcher ribRefWatcher, @org.jetbrains.annotations.NotNull()
    java.lang.Thread mainThread) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public I getInteractor() {
        return null;
    }
    
    private final com.uber.rib.core.Interactor<?, ?> getInteractorGeneric() {
        return null;
    }
    
    /**
     * @return the Tag.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTag$rib_base() {
        return null;
    }
    
    protected Router(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.Nullable()
    com.uber.rib.core.InteractorBaseComponent<?> component) {
        super();
    }
    
    protected Router(@org.jetbrains.annotations.NotNull()
    I interactor) {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    protected final void inject(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.InteractorBaseComponent<?> component) {
    }
    
    protected void attachToInteractor() {
    }
    
    /**
     * Dispatch back press to the associated interactor. Do not override this.
     *
     * @return TRUE if the interactor handles the back press.
     */
    public boolean handleBackPress() {
        return false;
    }
    
    /**
     * Called after the router has been loaded and initialized.
     */
    @Initializer()
    protected void didLoad() {
    }
    
    /**
     * Called when a router is being attached. Router subclasses can perform setup here for anything
     * that is needed again but is cleaned up in willDetach(). Use didLoad() if the setup is only
     * needed once.
     */
    protected void willAttach() {
    }
    
    /**
     * Called when a router is being a detached, router subclasses should perform any required clean
     * up here.
     */
    protected void willDetach() {
    }
    
    @androidx.annotation.MainThread()
    public void attachChild(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Router<?> childRouter) {
    }
    
    /**
     * Attaches a child router to this router.
     *
     * @param childRouter the [Router] to be attached.
     * @param tag an identifier to namespace saved instance state [Bundle] objects.
     */
    @androidx.annotation.MainThread()
    public void attachChild(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Router<?> childRouter, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    /**
     * Detaches the {@param childFactory} from the current [Interactor]. NOTE: No consumers of this
     * API should ever keep a reference to the detached child router, leak canary will enforce that it
     * gets garbage collected.
     *
     * If you need to keep references to previous routers, use RouterNavigator.
     *
     * @param childRouter the [Router] to be detached.
     */
    @androidx.annotation.MainThread()
    public void detachChild(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Router<?> childRouter) {
    }
    
    @androidx.annotation.CallSuper()
    public void dispatchAttach(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper()
    @Initializer()
    public void dispatchAttach(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public void dispatchDetach() {
    }
    
    /**
     * Gets the children of this [Router].
     *
     * @return Children.
     */
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.uber.rib.core.Router<?>> getChildren$rib_base() {
        return null;
    }
    
    public final void saveInstanceStateInternal$rib_base(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Bundle outState) {
    }
    
    protected void saveInstanceState(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Bundle outState) {
    }
    
    private final void checkForMainThread() {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.Thread getMainThread() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0007R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002\u00a8\u0006\f"}, d2 = {"Lcom/uber/rib/core/Router$Companion;", "", "()V", "KEY_CHILD_ROUTERS", "", "getKEY_CHILD_ROUTERS$annotations", "getKEY_CHILD_ROUTERS", "()Ljava/lang/String;", "KEY_INTERACTOR", "getKEY_INTERACTOR$annotations", "getMainThread", "Ljava/lang/Thread;", "rib-base"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getKEY_CHILD_ROUTERS() {
            return null;
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getKEY_CHILD_ROUTERS$annotations() {
        }
        
        @androidx.annotation.VisibleForTesting()
        @java.lang.Deprecated()
        public static void getKEY_INTERACTOR$annotations() {
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Thread getMainThread() {
            return null;
        }
    }
}