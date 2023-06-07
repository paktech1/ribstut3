package com.uber.rib.root.loggedin;

import com.uber.rib.root.loggedin.offgame.OffGameInteractor;
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
public final class LoggedInBuilder_Module_ListenerFactory implements Factory<OffGameInteractor.Listener> {
  private final Provider<LoggedInInteractor> interactorProvider;

  public LoggedInBuilder_Module_ListenerFactory(Provider<LoggedInInteractor> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  @Override
  public OffGameInteractor.Listener get() {
    return listener(interactorProvider.get());
  }

  public static LoggedInBuilder_Module_ListenerFactory create(
      Provider<LoggedInInteractor> interactorProvider) {
    return new LoggedInBuilder_Module_ListenerFactory(interactorProvider);
  }

  public static OffGameInteractor.Listener listener(LoggedInInteractor interactor) {
    return Preconditions.checkNotNullFromProvides(LoggedInBuilder.Module.listener(interactor));
  }
}
