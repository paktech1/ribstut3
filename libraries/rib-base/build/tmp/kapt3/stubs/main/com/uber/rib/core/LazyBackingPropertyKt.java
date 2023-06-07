package com.uber.rib.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0005H\u0080\b\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0007"}, d2 = {"setIfNullAndGet", "T", "", "Lkotlin/reflect/KMutableProperty0;", "initializer", "Lkotlin/Function0;", "(Lkotlin/reflect/KMutableProperty0;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "rib-base"})
public final class LazyBackingPropertyKt {
    
    /**
     * Lazily sets a value produced by [initializer] into the receiver mutable property and returns it
     * if the property is set to `null`, or returns the value set into the property without calling
     * [initializer].
     *
     * This is similar to [lazy].
     *
     * This function is needed because of Mockito mocking. When we mock a class, mockito does not call
     * any constructor and does not initialize private fields of the class. By having a null (unset)
     * field being dynamically set by a final function, we can overcome this issue.
     *
     * To properly support concurrency, the backing mutable property should be [Volatile].
     */
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>T setIfNullAndGet(@org.jetbrains.annotations.NotNull()
    kotlin.reflect.KMutableProperty0<T> $this$setIfNullAndGet, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> initializer) {
        return null;
    }
}