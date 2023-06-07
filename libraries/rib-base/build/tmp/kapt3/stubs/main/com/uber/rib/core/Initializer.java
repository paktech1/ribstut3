package com.uber.rib.core;

/**
 * Drop-in replacement for com.facebook.infer.annotation.Initializer.
 *
 * Method, annotated as @Initializer, should be call before object is used externally. It can be
 * used as a marker for different late-init methods of Android lifecycle, methods called indirectly
 * by the constructor or builder methods necessary to complete before build.
 */
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.BINARY)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.ANNOTATION_CLASS, kotlin.annotation.AnnotationTarget.CLASS, kotlin.annotation.AnnotationTarget.FIELD, kotlin.annotation.AnnotationTarget.CONSTRUCTOR, kotlin.annotation.AnnotationTarget.FUNCTION, kotlin.annotation.AnnotationTarget.PROPERTY_GETTER, kotlin.annotation.AnnotationTarget.PROPERTY_SETTER})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.CLASS)
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR, java.lang.annotation.ElementType.ANNOTATION_TYPE})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000\u00a8\u0006\u0002"}, d2 = {"Lcom/uber/rib/core/Initializer;", "", "rib-base"})
public abstract @interface Initializer {
}