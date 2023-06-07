package com.uber.rib.core;

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
public final class Interactor_MembersInjector<P, R extends Router<?>> implements MembersInjector<Interactor<P, R>> {
  private final Provider<P> injectedPresenterProvider;

  public Interactor_MembersInjector(Provider<P> injectedPresenterProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
  }

  public static <P, R extends Router<?>> MembersInjector<Interactor<P, R>> create(
      Provider<P> injectedPresenterProvider) {
    return new Interactor_MembersInjector<P, R>(injectedPresenterProvider);
  }

  @Override
  public void injectMembers(Interactor<P, R> instance) {
    injectInjectedPresenter(instance, injectedPresenterProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.core.Interactor.injectedPresenter")
  public static <P, R extends Router<?>> void injectInjectedPresenter(Interactor<P, R> instance,
      P injectedPresenter) {
    instance.injectedPresenter = injectedPresenter;
  }
}
