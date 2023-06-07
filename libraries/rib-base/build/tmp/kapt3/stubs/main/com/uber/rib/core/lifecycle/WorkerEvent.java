package com.uber.rib.core.lifecycle;

/**
 * Enum used represent when a [Worker][com.uber.rib.core.Worker] should stop and start in response
 * to interactor lifecycle events.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/uber/rib/core/lifecycle/WorkerEvent;", "", "(Ljava/lang/String;I)V", "START", "STOP", "rib-base"})
public enum WorkerEvent {
    /*public static final*/ START /* = new START() */,
    /*public static final*/ STOP /* = new STOP() */;
    
    WorkerEvent() {
    }
}