package com.uber.rib.root.loggedin;

import com.uber.rib.core.EmptyPresenter;
import com.uber.rib.core.Interactor_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@QualifierMetadata("com.uber.rib.root.loggedin.LoggedInBuilder.LoggedInInternal")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoggedInInteractor_MembersInjector implements MembersInjector<LoggedInInteractor> {
  private final Provider<EmptyPresenter> injectedPresenterProvider;

  private final Provider<MutableScoreStream> scoreStreamProvider;

  public LoggedInInteractor_MembersInjector(Provider<EmptyPresenter> injectedPresenterProvider,
      Provider<MutableScoreStream> scoreStreamProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.scoreStreamProvider = scoreStreamProvider;
  }

  public static MembersInjector<LoggedInInteractor> create(
      Provider<EmptyPresenter> injectedPresenterProvider,
      Provider<MutableScoreStream> scoreStreamProvider) {
    return new LoggedInInteractor_MembersInjector(injectedPresenterProvider, scoreStreamProvider);
  }

  @Override
  public void injectMembers(LoggedInInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectScoreStream(instance, scoreStreamProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.LoggedInInteractor.scoreStream")
  @LoggedInBuilder.LoggedInInternal
  public static void injectScoreStream(LoggedInInteractor instance, Object scoreStream) {
    instance.scoreStream = (MutableScoreStream) scoreStream;
  }
}
