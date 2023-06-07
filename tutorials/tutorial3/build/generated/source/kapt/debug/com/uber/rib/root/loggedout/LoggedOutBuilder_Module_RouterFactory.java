package com.uber.rib.root.loggedout;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.loggedout.LoggedOutBuilder.LoggedOutScope")
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
public final class LoggedOutBuilder_Module_RouterFactory implements Factory<LoggedOutRouter> {
  private final Provider<LoggedOutBuilder.Component> componentProvider;

  private final Provider<LoggedOutView> viewProvider;

  private final Provider<LoggedOutInteractor> interactorProvider;

  public LoggedOutBuilder_Module_RouterFactory(
      Provider<LoggedOutBuilder.Component> componentProvider, Provider<LoggedOutView> viewProvider,
      Provider<LoggedOutInteractor> interactorProvider) {
    this.componentProvider = componentProvider;
    this.viewProvider = viewProvider;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public LoggedOutRouter get() {
    return router(componentProvider.get(), viewProvider.get(), interactorProvider.get());
  }

  public static LoggedOutBuilder_Module_RouterFactory create(
      Provider<LoggedOutBuilder.Component> componentProvider, Provider<LoggedOutView> viewProvider,
      Provider<LoggedOutInteractor> interactorProvider) {
    return new LoggedOutBuilder_Module_RouterFactory(componentProvider, viewProvider, interactorProvider);
  }

  public static LoggedOutRouter router(Object component, LoggedOutView view,
      LoggedOutInteractor interactor) {
    return Preconditions.checkNotNullFromProvides(LoggedOutBuilder.Module.router((LoggedOutBuilder.Component) component, view, interactor));
  }
}
