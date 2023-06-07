package com.uber.rib.root.loggedin.offgame;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.loggedin.offgame.OffGameBuilder.OffGameScope")
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
public final class OffGameBuilder_Module_RouterFactory implements Factory<OffGameRouter> {
  private final Provider<OffGameBuilder.Component> componentProvider;

  private final Provider<OffGameView> viewProvider;

  private final Provider<OffGameInteractor> interactorProvider;

  public OffGameBuilder_Module_RouterFactory(Provider<OffGameBuilder.Component> componentProvider,
      Provider<OffGameView> viewProvider, Provider<OffGameInteractor> interactorProvider) {
    this.componentProvider = componentProvider;
    this.viewProvider = viewProvider;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public OffGameRouter get() {
    return router(componentProvider.get(), viewProvider.get(), interactorProvider.get());
  }

  public static OffGameBuilder_Module_RouterFactory create(
      Provider<OffGameBuilder.Component> componentProvider, Provider<OffGameView> viewProvider,
      Provider<OffGameInteractor> interactorProvider) {
    return new OffGameBuilder_Module_RouterFactory(componentProvider, viewProvider, interactorProvider);
  }

  public static OffGameRouter router(Object component, OffGameView view,
      OffGameInteractor interactor) {
    return Preconditions.checkNotNullFromProvides(OffGameBuilder.Module.router((OffGameBuilder.Component) component, view, interactor));
  }
}
