package com.uber.rib.root.loggedout;

import com.uber.rib.core.Interactor_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LoggedOutInteractor_MembersInjector implements MembersInjector<LoggedOutInteractor> {
  private final Provider<LoggedOutInteractor.LoggedOutPresenter> injectedPresenterProvider;

  private final Provider<LoggedOutInteractor.Listener> listenerProvider;

  private final Provider<LoggedOutInteractor.LoggedOutPresenter> presenterProvider;

  public LoggedOutInteractor_MembersInjector(
      Provider<LoggedOutInteractor.LoggedOutPresenter> injectedPresenterProvider,
      Provider<LoggedOutInteractor.Listener> listenerProvider,
      Provider<LoggedOutInteractor.LoggedOutPresenter> presenterProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.listenerProvider = listenerProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<LoggedOutInteractor> create(
      Provider<LoggedOutInteractor.LoggedOutPresenter> injectedPresenterProvider,
      Provider<LoggedOutInteractor.Listener> listenerProvider,
      Provider<LoggedOutInteractor.LoggedOutPresenter> presenterProvider) {
    return new LoggedOutInteractor_MembersInjector(injectedPresenterProvider, listenerProvider, presenterProvider);
  }

  @Override
  public void injectMembers(LoggedOutInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectListener(instance, listenerProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedout.LoggedOutInteractor.listener")
  public static void injectListener(LoggedOutInteractor instance,
      LoggedOutInteractor.Listener listener) {
    instance.listener = listener;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedout.LoggedOutInteractor.presenter")
  public static void injectPresenter(LoggedOutInteractor instance, Object presenter) {
    instance.presenter = (LoggedOutInteractor.LoggedOutPresenter) presenter;
  }
}
