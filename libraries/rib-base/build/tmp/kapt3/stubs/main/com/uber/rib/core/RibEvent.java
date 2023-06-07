package com.uber.rib.core;

/**
 * @param eventType [RibEventType]
 * @param router [Router]
 * @param parentRouter [Router] and null for the root ribs that are directly attached to
 *  RibActivity/Fragment
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/uber/rib/core/RibEvent;", "", "eventType", "Lcom/uber/rib/core/RibEventType;", "router", "Lcom/uber/rib/core/Router;", "parentRouter", "(Lcom/uber/rib/core/RibEventType;Lcom/uber/rib/core/Router;Lcom/uber/rib/core/Router;)V", "getEventType", "()Lcom/uber/rib/core/RibEventType;", "getParentRouter", "()Lcom/uber/rib/core/Router;", "getRouter", "rib-base"})
public class RibEvent {
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.RibEventType eventType = null;
    @org.jetbrains.annotations.NotNull()
    private final com.uber.rib.core.Router<?> router = null;
    @org.jetbrains.annotations.Nullable()
    private final com.uber.rib.core.Router<?> parentRouter = null;
    
    public RibEvent(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibEventType eventType, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Router<?> router, @org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Router<?> parentRouter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.uber.rib.core.RibEventType getEventType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.uber.rib.core.Router<?> getRouter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.uber.rib.core.Router<?> getParentRouter() {
        return null;
    }
}