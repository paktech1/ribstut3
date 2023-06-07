package com.uber.rib.root;

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
public final class RootInteractor_MembersInjector implements MembersInjector<RootInteractor> {
  private final Provider<RootInteractor.RootPresenter> injectedPresenterProvider;

  private final Provider<RootInteractor.RootPresenter> presenterProvider;

  public RootInteractor_MembersInjector(
      Provider<RootInteractor.RootPresenter> injectedPresenterProvider,
      Provider<RootInteractor.RootPresenter> presenterProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<RootInteractor> create(
      Provider<RootInteractor.RootPresenter> injectedPresenterProvider,
      Provider<RootInteractor.RootPresenter> presenterProvider) {
    return new RootInteractor_MembersInjector(injectedPresenterProvider, presenterProvider);
  }

  @Override
  public void injectMembers(RootInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.RootInteractor.presenter")
  public static void injectPresenter(RootInteractor instance, Object presenter) {
    instance.presenter = (RootInteractor.RootPresenter) presenter;
  }
}
