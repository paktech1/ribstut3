package com.uber.rib.compiler;

/**
 * Generates a dagger scope for a RibBuilder. Example: <code>
 *
 * @Scope
 * @Retention(SOURCE) public @interface LoggedInScope { } </code>
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/uber/rib/compiler/InteractorTestGenerator;", "Lcom/uber/rib/compiler/Generator;", "Lcom/uber/rib/compiler/InteractorAnnotatedClass;", "processingEnvironment", "Ljavax/annotation/processing/ProcessingEnvironment;", "errorReporter", "Lcom/uber/rib/compiler/ErrorReporter;", "(Ljavax/annotation/processing/ProcessingEnvironment;Lcom/uber/rib/compiler/ErrorReporter;)V", "createMethodSpec", "Lcom/squareup/javapoet/MethodSpec;", "interactor", "generate", "", "annotatedInteractor", "rib-compiler-test"})
public class InteractorTestGenerator extends com.uber.rib.compiler.Generator<com.uber.rib.compiler.InteractorAnnotatedClass> {
    
    public InteractorTestGenerator(@org.jetbrains.annotations.NotNull()
    javax.annotation.processing.ProcessingEnvironment processingEnvironment, @org.jetbrains.annotations.NotNull()
    com.uber.rib.compiler.ErrorReporter errorReporter) {
        super(null, null);
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    public void generate(@org.jetbrains.annotations.NotNull()
    com.uber.rib.compiler.InteractorAnnotatedClass annotatedInteractor) throws java.io.IOException {
    }
    
    private final com.squareup.javapoet.MethodSpec createMethodSpec(com.uber.rib.compiler.InteractorAnnotatedClass interactor) {
        return null;
    }
}