package com.uber.rib.core;

/**
 * Uber wrapper around Android Bundle to avoid Android and Robolectric dependencies.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u001a\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0000H\u0016J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/uber/rib/core/Bundle;", "", "androidBundle", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "getBoolean", "", "key", "", "defaultValue", "getBundleExtra", "getInt", "", "getParcelable", "Landroid/os/Parcelable;", "getString", "putBoolean", "", "value", "putBundleExtra", "bundle", "putInt", "putParcelable", "putString", "rib-base"})
public class Bundle {
    @org.jetbrains.annotations.NotNull()
    private final android.os.Bundle androidBundle = null;
    
    @kotlin.jvm.JvmOverloads()
    public Bundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle androidBundle) {
        super();
    }
    
    /**
     * Returns the value associated with the given key, or defaultValue if no mapping of the desired
     * type exists for the given key or if a null value is explicitly associated with the given key.
     *
     * @param key to fetch.
     * @param defaultValue if no value is present.
     * @return the boolean value associated with the given key or null if there is no string value in
     *  the bundle.
     */
    public boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    /**
     * Inserts a boolean value into the mapping of this Bundle, replacing any existing value for the
     * given key.
     *
     * @param key to insert.
     * @param value to insert.
     */
    public void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    /**
     * Returns a [Bundle] for a given key, or `null`.
     *
     * @param key to fetch.
     * @return a [Bundle] or `null`
     */
    @org.jetbrains.annotations.Nullable()
    public com.uber.rib.core.Bundle getBundleExtra(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * Inserts a wrapped Bundle value into the mapping of this Bundle, replacing any existing value
     * for the given key.
     *
     * @param key to insert.
     * @param bundle to insert.
     */
    public void putBundleExtra(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    com.uber.rib.core.Bundle bundle) {
    }
    
    /**
     * Returns the value associated with the given key, or null if no mapping of the desired type
     * exists for the given key or a null value is explicitly associated with the key.
     *
     * @param key to get.
     * @return the value, or `null`.
     */
    @org.jetbrains.annotations.Nullable()
    public android.os.Parcelable getParcelable(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * Inserts a Parcelable value into the mapping of this Bundle, replacing any existing value for
     * the given key. Either key or value may be null.
     *
     * @param key to insert.
     * @param value to insert.
     */
    public void putParcelable(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    android.os.Parcelable value) {
    }
    
    /**
     * Returns the value associated with the given key, or defaultValue if no mapping of the desired
     * type exists for the given key or if a null value is explicitly associated with the given key.
     *
     * @param key to fetch.
     * @return the String value associated with the given key or null if there is no string value in
     *  the bundle.
     */
    @org.jetbrains.annotations.Nullable()
    public java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    /**
     * Inserts a String value into the mapping of this Bundle, replacing any existing value for the
     * given key.
     *
     * @param key to insert.
     * @param value to insert.
     */
    public void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    /**
     * Inserts an Int value into the mapping of this Bundle, replacing any existing value for the
     * given key.
     *
     * @param key to insert.
     * @param value to insert.
     */
    public void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    /**
     * Returns the value associated with the given key, or defaultValue if no mapping of the desired
     * type exists for the given key or if a null value is explicitly associated with the given key.
     *
     * @param key to fetch.
     * @return the int value associated with the given key or defaultValue if there is no int value in
     *  the bundle.
     */
    public int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    @kotlin.jvm.JvmOverloads()
    public Bundle() {
        super();
    }
}