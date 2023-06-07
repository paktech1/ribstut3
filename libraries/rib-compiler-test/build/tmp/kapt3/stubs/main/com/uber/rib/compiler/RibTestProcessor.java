package com.uber.rib.compiler;

/**
 * Process the annotations for all added annotation processor pipelines.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/uber/rib/compiler/RibTestProcessor;", "Lcom/uber/rib/compiler/RibProcessor;", "()V", "interactorTestGenerator", "Lcom/uber/rib/compiler/InteractorTestGenerator;", "getProcessorPipelines", "", "Lcom/uber/rib/compiler/ProcessorPipeline;", "processContext", "Lcom/uber/rib/compiler/ProcessContext;", "getSupportedAnnotationTypes", "", "", "init", "", "processingEnv", "Ljavax/annotation/processing/ProcessingEnvironment;", "rib-compiler-test"})
@com.google.auto.service.AutoService(value = {javax.annotation.processing.Processor.class})
public class RibTestProcessor extends com.uber.rib.compiler.RibProcessor {
    @org.jetbrains.annotations.Nullable()
    private com.uber.rib.compiler.InteractorTestGenerator interactorTestGenerator;
    
    public RibTestProcessor() {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Synchronized()
    public synchronized void init(@org.jetbrains.annotations.NotNull()
    javax.annotation.processing.ProcessingEnvironment processingEnv) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Set<java.lang.String> getSupportedAnnotationTypes() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected java.util.List<com.uber.rib.compiler.ProcessorPipeline> getProcessorPipelines(@org.jetbrains.annotations.NotNull()
    com.uber.rib.compiler.ProcessContext processContext) {
        return null;
    }
}