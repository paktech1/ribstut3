package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/uber/rib/core/RibEvents;", "", "()V", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/uber/rib/core/RibEvent;", "events", "Lio/reactivex/Observable;", "getEvents", "()Lio/reactivex/Observable;", "emitEvent", "", "eventType", "Lcom/uber/rib/core/RibEventType;", "child", "Lcom/uber/rib/core/Router;", "parent", "Companion", "rib-base"})
public final class RibEvents {
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.uber.rib.core.RibEvent> _events = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.Observable<com.uber.rib.core.RibEvent> events = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.uber.rib.core.RibEvents instance = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.RibEvents.Companion Companion = null;
    
    private RibEvents() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.uber.rib.core.RibEvent> getEvents() {
        return null;
    }
    
    /**
     * @param eventType [RibEventType]
     * @param child [Router]
     * @param parent [Router] and null for the root ribs that are directly attached to
     *  RibActivity/Fragment
     */
    public final void emitEvent(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.RibEventType eventType, @org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Router<?> child, @org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Router<?> parent) {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.RibEvents getInstance() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/uber/rib/core/RibEvents$Companion;", "", "()V", "instance", "Lcom/uber/rib/core/RibEvents;", "getInstance", "rib-base"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.uber.rib.core.RibEvents getInstance() {
            return null;
        }
    }
}