package com.uber.rib.core;

/**
 * Holds configuration and settings for riblets.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/uber/rib/core/Rib;", "", "()V", "Companion", "Configuration", "DefaultConfiguration", "rib-base"})
public class Rib {
    @org.jetbrains.annotations.Nullable()
    private static com.uber.rib.core.Rib.Configuration configuration;
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Rib.Companion Companion = null;
    
    public Rib() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final com.uber.rib.core.Rib.Configuration getConfiguration() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setConfiguration(@org.jetbrains.annotations.NotNull()
    com.uber.rib.core.Rib.Configuration configurationToSet) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/uber/rib/core/Rib$Companion;", "", "()V", "configuration", "Lcom/uber/rib/core/Rib$Configuration;", "getConfiguration", "setConfiguration", "", "configurationToSet", "rib-base"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Sets the configuration to use in the application. This can only be called once before any RIB
         * code is used. Calling it twice, or calling it after using RIB code will throw an exception.
         *
         * @param configurationToSet to set.
         */
        @kotlin.jvm.JvmStatic()
        public final void setConfiguration(@org.jetbrains.annotations.NotNull()
        com.uber.rib.core.Rib.Configuration configurationToSet) {
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final com.uber.rib.core.Rib.Configuration getConfiguration() {
            return null;
        }
    }
    
    /**
     * Responsible for app-specific riblet configuration.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H&\u00a2\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&\u00a8\u0006\u000f"}, d2 = {"Lcom/uber/rib/core/Rib$Configuration;", "", "handleDebugMessage", "", "format", "", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "handleNonFatalError", "errorMessage", "throwable", "", "handleNonFatalWarning", "warningMessage", "rib-base"})
    public static abstract interface Configuration {
        
        /**
         * Called when there is a non-fatal error in the RIB framework. Consumers should route this data
         * to a place where it can be monitored (crash reporting, monitoring, etc.).
         *
         * If no configuration is set, the default implementation of this will crash the app when there
         * is a non-fatal error.
         *
         * @param errorMessage an error message that describes the error.
         * @param throwable an optional throwable.
         */
        public abstract void handleNonFatalError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable throwable);
        
        /**
         * Called when there is a non-fatal warning in the RIB framework. Consumers should route this
         * data to a place where it can be monitored (crash reporting, monitoring, etc.).
         *
         * NOTE: This API is used in a slightly different way than the
         * [ ][Configuration.handleNonFatalError] error method. Non-fatal errors should never happen,
         * warnings however can happen in certain conditions.
         *
         * @param warningMessage an error message that describes the error.
         * @param throwable an optional throwable.
         */
        public abstract void handleNonFatalWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String warningMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable throwable);
        
        /**
         * Called when there is a message that should be logged for debugging. Consumers should route
         * this data to a debug logging location.
         *
         * If no configuration is set, the default implementation of this will drop the messages.
         *
         * @param format Message format - See [String.format]
         * @param args Arguments to use for printing the message.
         */
        public abstract void handleDebugMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args);
    }
    
    /**
     * Default, internal implementation that is used when host app does not set a configuration.
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\"\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016\u00a8\u0006\u0011"}, d2 = {"Lcom/uber/rib/core/Rib$DefaultConfiguration;", "Lcom/uber/rib/core/Rib$Configuration;", "()V", "handleDebugMessage", "", "format", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "handleNonFatalError", "errorMessage", "throwable", "", "handleNonFatalWarning", "warningMessage", "rib-base"})
    static final class DefaultConfiguration implements com.uber.rib.core.Rib.Configuration {
        
        public DefaultConfiguration() {
            super();
        }
        
        @java.lang.Override()
        public void handleNonFatalError(@org.jetbrains.annotations.NotNull()
        java.lang.String errorMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable throwable) {
        }
        
        @java.lang.Override()
        public void handleNonFatalWarning(@org.jetbrains.annotations.NotNull()
        java.lang.String warningMessage, @org.jetbrains.annotations.Nullable()
        java.lang.Throwable throwable) {
        }
        
        @java.lang.Override()
        public void handleDebugMessage(@org.jetbrains.annotations.NotNull()
        java.lang.String format, @org.jetbrains.annotations.NotNull()
        java.lang.Object... args) {
        }
    }
}