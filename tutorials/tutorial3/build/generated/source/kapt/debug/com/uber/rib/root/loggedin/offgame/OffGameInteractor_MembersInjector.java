package com.uber.rib.root.loggedin.offgame;

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
public final class OffGameInteractor_MembersInjector implements MembersInjector<OffGameInteractor> {
  private final Provider<OffGameInteractor.OffGamePresenter> injectedPresenterProvider;

  private final Provider<OffGameInteractor.Listener> listenerProvider;

  private final Provider<OffGameInteractor.OffGamePresenter> presenterProvider;

  public OffGameInteractor_MembersInjector(
      Provider<OffGameInteractor.OffGamePresenter> injectedPresenterProvider,
      Provider<OffGameInteractor.Listener> listenerProvider,
      Provider<OffGameInteractor.OffGamePresenter> presenterProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.listenerProvider = listenerProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<OffGameInteractor> create(
      Provider<OffGameInteractor.OffGamePresenter> injectedPresenterProvider,
      Provider<OffGameInteractor.Listener> listenerProvider,
      Provider<OffGameInteractor.OffGamePresenter> presenterProvider) {
    return new OffGameInteractor_MembersInjector(injectedPresenterProvider, listenerProvider, presenterProvider);
  }

  @Override
  public void injectMembers(OffGameInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectListener(instance, listenerProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.offgame.OffGameInteractor.listener")
  public static void injectListener(OffGameInteractor instance,
      OffGameInteractor.Listener listener) {
    instance.listener = listener;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.offgame.OffGameInteractor.presenter")
  public static void injectPresenter(OffGameInteractor instance, Object presenter) {
    instance.presenter = (OffGameInteractor.OffGamePresenter) presenter;
  }
}
