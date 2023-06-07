package com.uber.rib.root.loggedin;

import com.uber.rib.root.RootView;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.loggedin.LoggedInBuilder.LoggedInScope")
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
public final class LoggedInBuilder_Module_RouterFactory implements Factory<LoggedInRouter> {
  private final Provider<LoggedInBuilder.Component> componentProvider;

  private final Provider<LoggedInInteractor> interactorProvider;

  private final Provider<RootView> rootViewProvider;

  public LoggedInBuilder_Module_RouterFactory(Provider<LoggedInBuilder.Component> componentProvider,
      Provider<LoggedInInteractor> interactorProvider, Provider<RootView> rootViewProvider) {
    this.componentProvider = componentProvider;
    this.interactorProvider = interactorProvider;
    this.rootViewProvider = rootViewProvider;
  }

  @Override
  public LoggedInRouter get() {
    return router(componentProvider.get(), interactorProvider.get(), rootViewProvider.get());
  }

  public static LoggedInBuilder_Module_RouterFactory create(
      Provider<LoggedInBuilder.Component> componentProvider,
      Provider<LoggedInInteractor> interactorProvider, Provider<RootView> rootViewProvider) {
    return new LoggedInBuilder_Module_RouterFactory(componentProvider, interactorProvider, rootViewProvider);
  }

  public static LoggedInRouter router(LoggedInBuilder.Component component,
      LoggedInInteractor interactor, RootView rootView) {
    return Preconditions.checkNotNullFromProvides(LoggedInBuilder.Module.router(component, interactor, rootView));
  }
}
