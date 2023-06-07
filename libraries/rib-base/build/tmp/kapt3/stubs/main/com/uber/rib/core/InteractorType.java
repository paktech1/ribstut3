package com.uber.rib.core;

/**
 * An interface used as the upper bound of the generic used by [Router]s to avoid cyclic generic
 * types
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/uber/rib/core/InteractorType;", "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;", "Lcom/uber/rib/core/lifecycle/InteractorEvent;", "handleBackPress", "", "isAttached", "rib-base"})
public abstract interface InteractorType extends com.uber.autodispose.lifecycle.LifecycleScopeProvider<com.uber.rib.core.lifecycle.InteractorEvent> {
    
    /**
     * @return `true` if the controller is attached, `false` if not.
     */
    public abstract boolean isAttached();
    
    /**
     * Handle an activity back press.
     *
     * @return whether this interactor took action in response to a back press.
     */
    public abstract boolean handleBackPress();
}