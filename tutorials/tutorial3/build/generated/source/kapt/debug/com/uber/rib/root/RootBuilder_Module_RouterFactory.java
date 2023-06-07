package com.uber.rib.root;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.RootBuilder.RootScope")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RootBuilder_Module_RouterFactory implements Factory<RootRouter> {
  private final Provider<RootBuilder.Component> componentProvider;

  private final Provider<RootView> viewProvider;

  private final Provider<RootInteractor> interactorProvider;

  public RootBuilder_Module_RouterFactory(Provider<RootBuilder.Component> componentProvider,
      Provider<RootView> viewProvider, Provider<RootInteractor> interactorProvider) {
    this.componentProvider = componentProvider;
    this.viewProvider = viewProvider;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public RootRouter get() {
    return router(componentProvider.get(), viewProvider.get(), interactorProvider.get());
  }

  public static RootBuilder_Module_RouterFactory create(
      Provider<RootBuilder.Component> componentProvider, Provider<RootView> viewProvider,
      Provider<RootInteractor> interactorProvider) {
    return new RootBuilder_Module_RouterFactory(componentProvider, viewProvider, interactorProvider);
  }

  public static RootRouter router(Object component, RootView view, RootInteractor interactor) {
    return Preconditions.checkNotNullFromProvides(RootBuilder.Module.router((RootBuilder.Component) component, view, interactor));
  }
}
