package com.uber.rib.root;

import com.uber.rib.root.loggedout.LoggedOutInteractor;
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
public final class RootBuilder_Module_LoggedOutListenerFactory implements Factory<LoggedOutInteractor.Listener> {
  private final Provider<RootInteractor> rootInteractorProvider;

  public RootBuilder_Module_LoggedOutListenerFactory(
      Provider<RootInteractor> rootInteractorProvider) {
    this.rootInteractorProvider = rootInteractorProvider;
  }

  @Override
  public LoggedOutInteractor.Listener get() {
    return loggedOutListener(rootInteractorProvider.get());
  }

  public static RootBuilder_Module_LoggedOutListenerFactory create(
      Provider<RootInteractor> rootInteractorProvider) {
    return new RootBuilder_Module_LoggedOutListenerFactory(rootInteractorProvider);
  }

  public static LoggedOutInteractor.Listener loggedOutListener(RootInteractor rootInteractor) {
    return Preconditions.checkNotNullFromProvides(RootBuilder.Module.loggedOutListener(rootInteractor));
  }
}
