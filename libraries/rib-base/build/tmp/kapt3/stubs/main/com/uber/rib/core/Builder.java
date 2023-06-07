package com.uber.rib.core;

/**
 * Responsible for building a router. Parent routers should pass in static dependencies via the
 * dependency passed in via the constructor. For dynamic dependencies (things that are fetched
 * asynchronously - or created dynamically in the parent), they should be passed in via a build
 * method that vends a router.
 *
 * @param <T> type of interactor to build.
 * @param <D> type of dependency required to build the interactor.
 * @param dependency required to build the router.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0006R\u0016\u0010\u0005\u001a\u00028\u0001X\u0084\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\n"}, d2 = {"Lcom/uber/rib/core/Builder;", "T", "Lcom/uber/rib/core/Router;", "D", "", "dependency", "(Ljava/lang/Object;)V", "getDependency", "()Ljava/lang/Object;", "Ljava/lang/Object;", "rib-base"})
public abstract class Builder<T extends com.uber.rib.core.Router<?>, D extends java.lang.Object> {
    private final D dependency = null;
    
    public Builder(D dependency) {
        super();
    }
    
    protected final D getDependency() {
        return null;
    }
}