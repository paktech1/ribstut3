package com.uber.rib.core;

/**
 * Used to watch objects in order to verify they have no inbound references. Used to find memory
 * leaks.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J$\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/uber/rib/core/RibRefWatcher;", "", "()V", "referenceWatcher", "Lcom/uber/rib/core/RibRefWatcher$ReferenceWatcher;", "disableLeakCanary", "", "disableULeakLifecycleTracking", "enableBreadcrumbLogging", "enableLeakCanary", "enableULeakLifecycleTracking", "logBreadcrumb", "eventType", "", "child", "parent", "setReferenceWatcher", "watcher", "watchDeletedObject", "objectToWatch", "Companion", "ReferenceWatcher", "rib-base"})
@androidx.annotation.MainThread()
public class RibRefWatcher {
    @org.jetbrains.annotations.Nullable()
    private com.uber.rib.core.RibRefWatcher.ReferenceWatcher referenceWatcher;
    @org.jetbrains.annotations.Nullable()
    private static com.uber.rib.core.RibRefWatcher ribRefWatcher;
    
    /**
     * Returns whether or not LeakCanary is enabled.
     *
     * @return whether or not LeakCanary is enabled.
     */
    private static boolean isLeakCanaryEnabled = false;
    private static boolean uLeakEnabled = false;
    private static boolean breadcrumbsEnabled = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.RibRefWatcher.Companion Companion = null;
    
    public RibRefWatcher() {
        super();
    }
    
    /**
     * Initialize Paper to use a [ReferenceWatcher] for observing deleted references.
     *
     * @param watcher the watcher.
     */
    public void setReferenceWatcher(@org.jetbrains.annotations.Nullable()
    com.uber.rib.core.RibRefWatcher.ReferenceWatcher watcher) {
    }
    
    /**
     * Watch this object to verify it has no inbound references.
     *
     * @param objectToWatch the object to watch.
     */
    public void watchDeletedObject(@org.jetbrains.annotations.Nullable()
    java.lang.Object objectToWatch) {
    }
    
    /**
     * Pipes breadcrumb data to the breadcrumb logger through the referenceWatcher.
     *
     * @param eventType Type of breadcrumb event
     * @param data breadcrumb data
     * @param parent breadcrumb parent if any
     */
    public void logBreadcrumb(@org.jetbrains.annotations.NotNull()
    java.lang.String eventType, @org.jetbrains.annotations.Nullable()
    java.lang.String child, @org.jetbrains.annotations.Nullable()
    java.lang.String parent) {
    }
    
    /**
     * Enables Breadcrumb logging.
     */
    public void enableBreadcrumbLogging() {
    }
    
    /**
     * Enables LeakCanary.
     */
    public void enableLeakCanary() {
    }
    
    /**
     * Disables LeakCanary.
     */
    public void disableLeakCanary() {
    }
    
    /**
     * Enables ULeak's Lifecycle tracking functionality. ULeak itself is behind a plugin.
     */
    public void enableULeakLifecycleTracking() {
    }
    
    /**
     * Disables ULeak's Lifecycle Tracking.
     */
    public void disableULeakLifecycleTracking() {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.RibRefWatcher getInstance() {
        return null;
    }
    
    public static final boolean isLeakCanaryEnabled() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0087\u000e\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u0006\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/uber/rib/core/RibRefWatcher$Companion;", "", "()V", "breadcrumbsEnabled", "", "<set-?>", "isLeakCanaryEnabled", "isLeakCanaryEnabled$annotations", "()Z", "ribRefWatcher", "Lcom/uber/rib/core/RibRefWatcher;", "uLeakEnabled", "getInstance", "rib-base"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Get an instance of the [RibRefWatcher].
         *
         * @return the [RibRefWatcher] instance.
         */
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.uber.rib.core.RibRefWatcher getInstance() {
            return null;
        }
        
        /**
         * Returns whether or not LeakCanary is enabled.
         *
         * @return whether or not LeakCanary is enabled.
         */
        public final boolean isLeakCanaryEnabled() {
            return false;
        }
        
        /**
         * Returns whether or not LeakCanary is enabled.
         *
         * @return whether or not LeakCanary is enabled.
         */
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void isLeakCanaryEnabled$annotations() {
        }
    }
    
    /**
     * Interface for classes that watch objects.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H&\u00a8\u0006\n"}, d2 = {"Lcom/uber/rib/core/RibRefWatcher$ReferenceWatcher;", "", "logBreadcrumb", "", "eventType", "", "data", "parent", "watch", "objectToWatch", "rib-base"})
    public static abstract interface ReferenceWatcher {
        
        /**
         * Watch this object to verify it has no inbound references.
         *
         * @param objectToWatch the object to watch.
         */
        public abstract void watch(@org.jetbrains.annotations.NotNull()
        java.lang.Object objectToWatch);
        
        /**
         * Method to pipe breadcrumbs into the Breadcrumb logger.
         *
         * @param eventType Type of Breadcrumb event
         * @param data The breadcrumb data
         * @param parent The breadcrumb parent
         */
        public abstract void logBreadcrumb(@org.jetbrains.annotations.NotNull()
        java.lang.String eventType, @org.jetbrains.annotations.NotNull()
        java.lang.String data, @org.jetbrains.annotations.NotNull()
        java.lang.String parent);
    }
}