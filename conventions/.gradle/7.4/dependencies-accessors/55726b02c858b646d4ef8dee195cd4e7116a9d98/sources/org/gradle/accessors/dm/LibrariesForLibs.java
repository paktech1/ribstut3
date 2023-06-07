package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
*/
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final ActivityLibraryAccessors laccForActivityLibraryAccessors = new ActivityLibraryAccessors(owner);
    private final AndroidLibraryAccessors laccForAndroidLibraryAccessors = new AndroidLibraryAccessors(owner);
    private final AutodisposeLibraryAccessors laccForAutodisposeLibraryAccessors = new AutodisposeLibraryAccessors(owner);
    private final AutovalueLibraryAccessors laccForAutovalueLibraryAccessors = new AutovalueLibraryAccessors(owner);
    private final ComposeLibraryAccessors laccForComposeLibraryAccessors = new ComposeLibraryAccessors(owner);
    private final CoroutinesLibraryAccessors laccForCoroutinesLibraryAccessors = new CoroutinesLibraryAccessors(owner);
    private final DaggerLibraryAccessors laccForDaggerLibraryAccessors = new DaggerLibraryAccessors(owner);
    private final ErrorproneLibraryAccessors laccForErrorproneLibraryAccessors = new ErrorproneLibraryAccessors(owner);
    private final GradleLibraryAccessors laccForGradleLibraryAccessors = new GradleLibraryAccessors(owner);
    private final GuavaLibraryAccessors laccForGuavaLibraryAccessors = new GuavaLibraryAccessors(owner);
    private final JavaxLibraryAccessors laccForJavaxLibraryAccessors = new JavaxLibraryAccessors(owner);
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final MotifLibraryAccessors laccForMotifLibraryAccessors = new MotifLibraryAccessors(owner);
    private final UberLibraryAccessors laccForUberLibraryAccessors = new UberLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(providers, config);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers) {
        super(config, providers);
    }

        /**
         * Creates a dependency provider for annotation (androidx.annotation:annotation)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAnnotation() { return create("annotation"); }

        /**
         * Creates a dependency provider for appcompat (androidx.appcompat:appcompat)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppcompat() { return create("appcompat"); }

        /**
         * Creates a dependency provider for autocommon (com.google.auto:auto-common)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutocommon() { return create("autocommon"); }

        /**
         * Creates a dependency provider for autoservice (com.google.auto.service:auto-service)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAutoservice() { return create("autoservice"); }

        /**
         * Creates a dependency provider for checkerqual (org.checkerframework:checker-qual)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCheckerqual() { return create("checkerqual"); }

        /**
         * Creates a dependency provider for flipper (com.facebook.flipper:flipper)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFlipper() { return create("flipper"); }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() { return create("gson"); }

        /**
         * Creates a dependency provider for javapoet (com.squareup:javapoet)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJavapoet() { return create("javapoet"); }

        /**
         * Creates a dependency provider for jsr250 (javax.annotation:jsr250-api)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getJsr250() { return create("jsr250"); }

        /**
         * Creates a dependency provider for leakcanary (com.squareup.leakcanary:leakcanary-android)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLeakcanary() { return create("leakcanary"); }

        /**
         * Creates a dependency provider for percent (androidx.percentlayout:percentlayout)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPercent() { return create("percent"); }

        /**
         * Creates a dependency provider for reactivestreams (org.reactivestreams:reactive-streams)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getReactivestreams() { return create("reactivestreams"); }

        /**
         * Creates a dependency provider for rxandroid2 (io.reactivex.rxjava2:rxandroid)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxandroid2() { return create("rxandroid2"); }

        /**
         * Creates a dependency provider for rxbinding (com.jakewharton.rxbinding2:rxbinding)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxbinding() { return create("rxbinding"); }

        /**
         * Creates a dependency provider for rxjava2 (io.reactivex.rxjava2:rxjava)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxjava2() { return create("rxjava2"); }

        /**
         * Creates a dependency provider for rxkotlin (io.reactivex.rxjava2:rxkotlin)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxkotlin() { return create("rxkotlin"); }

        /**
         * Creates a dependency provider for rxrelay2 (com.jakewharton.rxrelay2:rxrelay)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxrelay2() { return create("rxrelay2"); }

        /**
         * Creates a dependency provider for savedstate (androidx.savedstate:savedstate)
         * This dependency was declared in catalog libs.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSavedstate() { return create("savedstate"); }

    /**
     * Returns the group of libraries at activity
     */
    public ActivityLibraryAccessors getActivity() { return laccForActivityLibraryAccessors; }

    /**
     * Returns the group of libraries at android
     */
    public AndroidLibraryAccessors getAndroid() { return laccForAndroidLibraryAccessors; }

    /**
     * Returns the group of libraries at autodispose
     */
    public AutodisposeLibraryAccessors getAutodispose() { return laccForAutodisposeLibraryAccessors; }

    /**
     * Returns the group of libraries at autovalue
     */
    public AutovalueLibraryAccessors getAutovalue() { return laccForAutovalueLibraryAccessors; }

    /**
     * Returns the group of libraries at compose
     */
    public ComposeLibraryAccessors getCompose() { return laccForComposeLibraryAccessors; }

    /**
     * Returns the group of libraries at coroutines
     */
    public CoroutinesLibraryAccessors getCoroutines() { return laccForCoroutinesLibraryAccessors; }

    /**
     * Returns the group of libraries at dagger
     */
    public DaggerLibraryAccessors getDagger() { return laccForDaggerLibraryAccessors; }

    /**
     * Returns the group of libraries at errorprone
     */
    public ErrorproneLibraryAccessors getErrorprone() { return laccForErrorproneLibraryAccessors; }

    /**
     * Returns the group of libraries at gradle
     */
    public GradleLibraryAccessors getGradle() { return laccForGradleLibraryAccessors; }

    /**
     * Returns the group of libraries at guava
     */
    public GuavaLibraryAccessors getGuava() { return laccForGuavaLibraryAccessors; }

    /**
     * Returns the group of libraries at javax
     */
    public JavaxLibraryAccessors getJavax() { return laccForJavaxLibraryAccessors; }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() { return laccForKotlinLibraryAccessors; }

    /**
     * Returns the group of libraries at motif
     */
    public MotifLibraryAccessors getMotif() { return laccForMotifLibraryAccessors; }

    /**
     * Returns the group of libraries at uber
     */
    public UberLibraryAccessors getUber() { return laccForUberLibraryAccessors; }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() { return vaccForVersionAccessors; }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() { return baccForBundleAccessors; }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() { return paccForPluginAccessors; }

    public static class ActivityLibraryAccessors extends SubDependencyFactory {

        public ActivityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (androidx.activity:activity-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() { return create("activity.compose"); }

    }

    public static class AndroidLibraryAccessors extends SubDependencyFactory {

        public AndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for api (com.google.android:android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getApi() { return create("android.api"); }

    }

    public static class AutodisposeLibraryAccessors extends SubDependencyFactory {

        public AutodisposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coroutines (com.uber.autodispose:autodispose-coroutines-interop)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoroutines() { return create("autodispose.coroutines"); }

            /**
             * Creates a dependency provider for errorprone (com.uber.autodispose:autodispose-error-prone)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getErrorprone() { return create("autodispose.errorprone"); }

            /**
             * Creates a dependency provider for library (com.uber.autodispose:autodispose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLibrary() { return create("autodispose.library"); }

            /**
             * Creates a dependency provider for lifecycle (com.uber.autodispose:autodispose-lifecycle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLifecycle() { return create("autodispose.lifecycle"); }

    }

    public static class AutovalueLibraryAccessors extends SubDependencyFactory {

        public AutovalueLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for annotations (com.google.auto.value:auto-value-annotations)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnnotations() { return create("autovalue.annotations"); }

            /**
             * Creates a dependency provider for library (com.google.auto.value:auto-value)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLibrary() { return create("autovalue.library"); }

    }

    public static class ComposeLibraryAccessors extends SubDependencyFactory {
        private final ComposeRuntimeLibraryAccessors laccForComposeRuntimeLibraryAccessors = new ComposeRuntimeLibraryAccessors(owner);

        public ComposeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animation (androidx.compose.animation:animation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimation() { return create("compose.animation"); }

            /**
             * Creates a dependency provider for compiler (androidx.compose.compiler:compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("compose.compiler"); }

            /**
             * Creates a dependency provider for foundation (androidx.compose.foundation:foundation)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFoundation() { return create("compose.foundation"); }

            /**
             * Creates a dependency provider for material (androidx.compose.material:material)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() { return create("compose.material"); }

            /**
             * Creates a dependency provider for navigation (androidx.navigation:navigation-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() { return create("compose.navigation"); }

            /**
             * Creates a dependency provider for ui (androidx.compose.ui:ui)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUi() { return create("compose.ui"); }

            /**
             * Creates a dependency provider for uitooling (androidx.compose.ui:ui-tooling)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUitooling() { return create("compose.uitooling"); }

            /**
             * Creates a dependency provider for viewmodel (androidx.lifecycle:lifecycle-viewmodel-compose)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewmodel() { return create("compose.viewmodel"); }

        /**
         * Returns the group of libraries at compose.runtime
         */
        public ComposeRuntimeLibraryAccessors getRuntime() { return laccForComposeRuntimeLibraryAccessors; }

    }

    public static class ComposeRuntimeLibraryAccessors extends SubDependencyFactory {

        public ComposeRuntimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for rx2 (androidx.compose.runtime:runtime-rxjava2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRx2() { return create("compose.runtime.rx2"); }

    }

    public static class CoroutinesLibraryAccessors extends SubDependencyFactory {

        public CoroutinesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (org.jetbrains.kotlinx:kotlinx-coroutines-android)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("coroutines.android"); }

            /**
             * Creates a dependency provider for core (org.jetbrains.kotlinx:kotlinx-coroutines-core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("coroutines.core"); }

            /**
             * Creates a dependency provider for rx2 (org.jetbrains.kotlinx:kotlinx-coroutines-rx2)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getRx2() { return create("coroutines.rx2"); }

    }

    public static class DaggerLibraryAccessors extends SubDependencyFactory {

        public DaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:dagger-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("dagger.compiler"); }

            /**
             * Creates a dependency provider for library (com.google.dagger:dagger)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLibrary() { return create("dagger.library"); }

    }

    public static class ErrorproneLibraryAccessors extends SubDependencyFactory {

        public ErrorproneLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (com.google.errorprone:error_prone_core)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() { return create("errorprone.core"); }

            /**
             * Creates a dependency provider for javac (com.google.errorprone:javac)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJavac() { return create("errorprone.javac"); }

    }

    public static class GradleLibraryAccessors extends SubDependencyFactory {
        private final GradleAndroidLibraryAccessors laccForGradleAndroidLibraryAccessors = new GradleAndroidLibraryAccessors(owner);
        private final GradleErrorproneLibraryAccessors laccForGradleErrorproneLibraryAccessors = new GradleErrorproneLibraryAccessors(owner);
        private final GradleKotlinLibraryAccessors laccForGradleKotlinLibraryAccessors = new GradleKotlinLibraryAccessors(owner);
        private final GradleNullawayLibraryAccessors laccForGradleNullawayLibraryAccessors = new GradleNullawayLibraryAccessors(owner);
        private final GradleSpotlessLibraryAccessors laccForGradleSpotlessLibraryAccessors = new GradleSpotlessLibraryAccessors(owner);

        public GradleLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at gradle.android
         */
        public GradleAndroidLibraryAccessors getAndroid() { return laccForGradleAndroidLibraryAccessors; }

        /**
         * Returns the group of libraries at gradle.errorprone
         */
        public GradleErrorproneLibraryAccessors getErrorprone() { return laccForGradleErrorproneLibraryAccessors; }

        /**
         * Returns the group of libraries at gradle.kotlin
         */
        public GradleKotlinLibraryAccessors getKotlin() { return laccForGradleKotlinLibraryAccessors; }

        /**
         * Returns the group of libraries at gradle.nullaway
         */
        public GradleNullawayLibraryAccessors getNullaway() { return laccForGradleNullawayLibraryAccessors; }

        /**
         * Returns the group of libraries at gradle.spotless
         */
        public GradleSpotlessLibraryAccessors getSpotless() { return laccForGradleSpotlessLibraryAccessors; }

    }

    public static class GradleAndroidLibraryAccessors extends SubDependencyFactory {

        public GradleAndroidLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.android.tools.build:gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("gradle.android.plugin"); }

    }

    public static class GradleErrorproneLibraryAccessors extends SubDependencyFactory {

        public GradleErrorproneLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (net.ltgt.gradle:gradle-errorprone-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("gradle.errorprone.plugin"); }

    }

    public static class GradleKotlinLibraryAccessors extends SubDependencyFactory {

        public GradleKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (org.jetbrains.kotlin:kotlin-gradle-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("gradle.kotlin.plugin"); }

    }

    public static class GradleNullawayLibraryAccessors extends SubDependencyFactory {

        public GradleNullawayLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (net.ltgt.gradle:gradle-nullaway-plugin)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("gradle.nullaway.plugin"); }

    }

    public static class GradleSpotlessLibraryAccessors extends SubDependencyFactory {

        public GradleSpotlessLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for plugin (com.diffplug.spotless:spotless-plugin-gradle)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPlugin() { return create("gradle.spotless.plugin"); }

    }

    public static class GuavaLibraryAccessors extends SubDependencyFactory {

        public GuavaLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for android (com.google.guava:guava)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAndroid() { return create("guava.android"); }

            /**
             * Creates a dependency provider for jre (com.google.guava:guava)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getJre() { return create("guava.jre"); }

    }

    public static class JavaxLibraryAccessors extends SubDependencyFactory {

        public JavaxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for inject (javax.inject:javax.inject)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInject() { return create("javax.inject"); }

    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStdlib() { return create("kotlin.stdlib"); }

    }

    public static class MotifLibraryAccessors extends SubDependencyFactory {

        public MotifLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compiler (com.uber.motif:motif-compiler)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() { return create("motif.compiler"); }

            /**
             * Creates a dependency provider for library (com.uber.motif:motif)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLibrary() { return create("motif.library"); }

    }

    public static class UberLibraryAccessors extends SubDependencyFactory {

        public UberLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for nullaway (com.uber.nullaway:nullaway)
             * This dependency was declared in catalog libs.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNullaway() { return create("uber.nullaway"); }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidVersionAccessors vaccForAndroidVersionAccessors = new AndroidVersionAccessors(providers, config);
        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final CompileVersionAccessors vaccForCompileVersionAccessors = new CompileVersionAccessors(providers, config);
        private final ComposeVersionAccessors vaccForComposeVersionAccessors = new ComposeVersionAccessors(providers, config);
        private final ErrorproneVersionAccessors vaccForErrorproneVersionAccessors = new ErrorproneVersionAccessors(providers, config);
        private final GradleVersionAccessors vaccForGradleVersionAccessors = new GradleVersionAccessors(providers, config);
        private final GuavaVersionAccessors vaccForGuavaVersionAccessors = new GuavaVersionAccessors(providers, config);
        private final KotlinxVersionAccessors vaccForKotlinxVersionAccessors = new KotlinxVersionAccessors(providers, config);
        private final MockitoVersionAccessors vaccForMockitoVersionAccessors = new MockitoVersionAccessors(providers, config);
        private final UberVersionAccessors vaccForUberVersionAccessors = new UberVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: autocommon (0.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAutocommon() { return getVersion("autocommon"); }

            /**
             * Returns the version associated to this alias: autodispose (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAutodispose() { return getVersion("autodispose"); }

            /**
             * Returns the version associated to this alias: autoservice (1.0-rc4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAutoservice() { return getVersion("autoservice"); }

            /**
             * Returns the version associated to this alias: autovalue (1.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAutovalue() { return getVersion("autovalue"); }

            /**
             * Returns the version associated to this alias: checkerqual (2.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCheckerqual() { return getVersion("checkerqual"); }

            /**
             * Returns the version associated to this alias: coroutines (1.6.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("coroutines"); }

            /**
             * Returns the version associated to this alias: dagger (2.43.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getDagger() { return getVersion("dagger"); }

            /**
             * Returns the version associated to this alias: flipper (0.93.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getFlipper() { return getVersion("flipper"); }

            /**
             * Returns the version associated to this alias: gjf (1.16.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGjf() { return getVersion("gjf"); }

            /**
             * Returns the version associated to this alias: gson (2.8.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: intellij (2022.2.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getIntellij() { return getVersion("intellij"); }

            /**
             * Returns the version associated to this alias: javapoet (1.11.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJavapoet() { return getVersion("javapoet"); }

            /**
             * Returns the version associated to this alias: jsr250 (1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJsr250() { return getVersion("jsr250"); }

            /**
             * Returns the version associated to this alias: junit (4.12)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJunit() { return getVersion("junit"); }

            /**
             * Returns the version associated to this alias: kotlin (1.8.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ktfmt (0.43)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtfmt() { return getVersion("ktfmt"); }

            /**
             * Returns the version associated to this alias: ktlint (0.48.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKtlint() { return getVersion("ktlint"); }

            /**
             * Returns the version associated to this alias: leakcanary (1.5.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLeakcanary() { return getVersion("leakcanary"); }

            /**
             * Returns the version associated to this alias: motif (0.3.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getMotif() { return getVersion("motif"); }

            /**
             * Returns the version associated to this alias: percent (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPercent() { return getVersion("percent"); }

            /**
             * Returns the version associated to this alias: reactivestreams (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getReactivestreams() { return getVersion("reactivestreams"); }

            /**
             * Returns the version associated to this alias: rxandroid2 (2.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRxandroid2() { return getVersion("rxandroid2"); }

            /**
             * Returns the version associated to this alias: rxbinding (2.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRxbinding() { return getVersion("rxbinding"); }

            /**
             * Returns the version associated to this alias: rxjava2 (2.2.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRxjava2() { return getVersion("rxjava2"); }

            /**
             * Returns the version associated to this alias: rxkotlin (2.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRxkotlin() { return getVersion("rxkotlin"); }

            /**
             * Returns the version associated to this alias: rxrelay2 (2.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getRxrelay2() { return getVersion("rxrelay2"); }

            /**
             * Returns the version associated to this alias: savedstate (1.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getSavedstate() { return getVersion("savedstate"); }

            /**
             * Returns the version associated to this alias: truth (0.43)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTruth() { return getVersion("truth"); }

        /**
         * Returns the group of versions at versions.android
         */
        public AndroidVersionAccessors getAndroid() { return vaccForAndroidVersionAccessors; }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() { return vaccForAndroidxVersionAccessors; }

        /**
         * Returns the group of versions at versions.compile
         */
        public CompileVersionAccessors getCompile() { return vaccForCompileVersionAccessors; }

        /**
         * Returns the group of versions at versions.compose
         */
        public ComposeVersionAccessors getCompose() { return vaccForComposeVersionAccessors; }

        /**
         * Returns the group of versions at versions.errorprone
         */
        public ErrorproneVersionAccessors getErrorprone() { return vaccForErrorproneVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle
         */
        public GradleVersionAccessors getGradle() { return vaccForGradleVersionAccessors; }

        /**
         * Returns the group of versions at versions.guava
         */
        public GuavaVersionAccessors getGuava() { return vaccForGuavaVersionAccessors; }

        /**
         * Returns the group of versions at versions.kotlinx
         */
        public KotlinxVersionAccessors getKotlinx() { return vaccForKotlinxVersionAccessors; }

        /**
         * Returns the group of versions at versions.mockito
         */
        public MockitoVersionAccessors getMockito() { return vaccForMockitoVersionAccessors; }

        /**
         * Returns the group of versions at versions.uber
         */
        public UberVersionAccessors getUber() { return vaccForUberVersionAccessors; }

    }

    public static class AndroidVersionAccessors extends VersionFactory  {

        public AndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: android.api (4.1.1.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getApi() { return getVersion("android.api"); }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.activity (1.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("androidx.activity"); }

            /**
             * Returns the version associated to this alias: androidx.annotations (1.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAnnotations() { return getVersion("androidx.annotations"); }

            /**
             * Returns the version associated to this alias: androidx.appcompat (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAppcompat() { return getVersion("androidx.appcompat"); }

            /**
             * Returns the version associated to this alias: androidx.lifecycle (2.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("androidx.lifecycle"); }

    }

    public static class CompileVersionAccessors extends VersionFactory  {

        public CompileVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compile.testing (0.17)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getTesting() { return getVersion("compile.testing"); }

    }

    public static class ComposeVersionAccessors extends VersionFactory  {

        public ComposeVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: compose.compiler (1.4.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCompiler() { return getVersion("compose.compiler"); }

            /**
             * Returns the version associated to this alias: compose.libraries (1.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLibraries() { return getVersion("compose.libraries"); }

            /**
             * Returns the version associated to this alias: compose.navigation (2.4.0-alpha03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("compose.navigation"); }

    }

    public static class ErrorproneVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public ErrorproneVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: errorprone (2.3.3)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("errorprone"); }

            /**
             * Returns the version associated to this alias: errorprone.javac (9+181-r4173-1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJavac() { return getVersion("errorprone.javac"); }

    }

    public static class GradleVersionAccessors extends VersionFactory  {

        private final GradleAndroidVersionAccessors vaccForGradleAndroidVersionAccessors = new GradleAndroidVersionAccessors(providers, config);
        private final GradleErrorproneVersionAccessors vaccForGradleErrorproneVersionAccessors = new GradleErrorproneVersionAccessors(providers, config);
        private final GradleIntellijVersionAccessors vaccForGradleIntellijVersionAccessors = new GradleIntellijVersionAccessors(providers, config);
        private final GradleMavenVersionAccessors vaccForGradleMavenVersionAccessors = new GradleMavenVersionAccessors(providers, config);
        private final GradleNullawayVersionAccessors vaccForGradleNullawayVersionAccessors = new GradleNullawayVersionAccessors(providers, config);
        private final GradleSpotlessVersionAccessors vaccForGradleSpotlessVersionAccessors = new GradleSpotlessVersionAccessors(providers, config);
        public GradleVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.gradle.android
         */
        public GradleAndroidVersionAccessors getAndroid() { return vaccForGradleAndroidVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle.errorprone
         */
        public GradleErrorproneVersionAccessors getErrorprone() { return vaccForGradleErrorproneVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle.intellij
         */
        public GradleIntellijVersionAccessors getIntellij() { return vaccForGradleIntellijVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle.maven
         */
        public GradleMavenVersionAccessors getMaven() { return vaccForGradleMavenVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle.nullaway
         */
        public GradleNullawayVersionAccessors getNullaway() { return vaccForGradleNullawayVersionAccessors; }

        /**
         * Returns the group of versions at versions.gradle.spotless
         */
        public GradleSpotlessVersionAccessors getSpotless() { return vaccForGradleSpotlessVersionAccessors; }

    }

    public static class GradleAndroidVersionAccessors extends VersionFactory  {

        public GradleAndroidVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.android.plugin (7.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("gradle.android.plugin"); }

    }

    public static class GradleErrorproneVersionAccessors extends VersionFactory  {

        public GradleErrorproneVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.errorprone.plugin (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("gradle.errorprone.plugin"); }

    }

    public static class GradleIntellijVersionAccessors extends VersionFactory  {

        public GradleIntellijVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.intellij.plugin (1.13.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("gradle.intellij.plugin"); }

    }

    public static class GradleMavenVersionAccessors extends VersionFactory  {

        private final GradleMavenPublishVersionAccessors vaccForGradleMavenPublishVersionAccessors = new GradleMavenPublishVersionAccessors(providers, config);
        public GradleMavenVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.gradle.maven.publish
         */
        public GradleMavenPublishVersionAccessors getPublish() { return vaccForGradleMavenPublishVersionAccessors; }

    }

    public static class GradleMavenPublishVersionAccessors extends VersionFactory  {

        public GradleMavenPublishVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.maven.publish.plugin (0.25.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("gradle.maven.publish.plugin"); }

    }

    public static class GradleNullawayVersionAccessors extends VersionFactory  {

        public GradleNullawayVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.nullaway.plugin (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("gradle.nullaway.plugin"); }

    }

    public static class GradleSpotlessVersionAccessors extends VersionFactory  {

        public GradleSpotlessVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: gradle.spotless.plugin (6.18.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("gradle.spotless.plugin"); }

    }

    public static class GuavaVersionAccessors extends VersionFactory  {

        public GuavaVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: guava.android (27.1-android)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("guava.android"); }

            /**
             * Returns the version associated to this alias: guava.jre (27.1-jre)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJre() { return getVersion("guava.jre"); }

    }

    public static class KotlinxVersionAccessors extends VersionFactory  {

        public KotlinxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: kotlinx.coroutines (1.6.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("kotlinx.coroutines"); }

    }

    public static class MockitoVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public MockitoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: mockito (4.6.1)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("mockito"); }

            /**
             * Returns the version associated to this alias: mockito.kotlin (4.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("mockito.kotlin"); }

    }

    public static class UberVersionAccessors extends VersionFactory  {

        public UberVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: uber.nullaway (0.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getNullaway() { return getVersion("uber.nullaway"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for androidApplication to the plugin id 'com.android.application'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

            /**
             * Creates a plugin provider for androidLibrary to the plugin id 'com.android.library'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getAndroidLibrary() { return createPlugin("androidLibrary"); }

            /**
             * Creates a plugin provider for errorprone to the plugin id 'net.ltgt.errorprone'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getErrorprone() { return createPlugin("errorprone"); }

            /**
             * Creates a plugin provider for intellij to the plugin id 'org.jetbrains.intellij'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getIntellij() { return createPlugin("intellij"); }

            /**
             * Creates a plugin provider for kotlinAndroid to the plugin id 'org.jetbrains.kotlin.android'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

            /**
             * Creates a plugin provider for kotlinKapt to the plugin id 'org.jetbrains.kotlin.kapt'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getKotlinKapt() { return createPlugin("kotlinKapt"); }

            /**
             * Creates a plugin provider for mavenPublish to the plugin id 'com.vanniktech.maven.publish'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getMavenPublish() { return createPlugin("mavenPublish"); }

            /**
             * Creates a plugin provider for nullaway to the plugin id 'net.ltgt.nullaway'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getNullaway() { return createPlugin("nullaway"); }

            /**
             * Creates a plugin provider for spotless to the plugin id 'com.diffplug.spotless'
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getSpotless() { return createPlugin("spotless"); }

    }

}
