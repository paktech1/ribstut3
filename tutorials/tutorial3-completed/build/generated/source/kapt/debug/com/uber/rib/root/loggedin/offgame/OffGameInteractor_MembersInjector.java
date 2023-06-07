package com.uber.rib.root.loggedin.offgame;

import com.uber.rib.core.Interactor_MembersInjector;
import com.uber.rib.root.loggedin.ScoreStream;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Named;
import javax.inject.Provider;

@QualifierMetadata("javax.inject.Named")
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

  private final Provider<String> playerOneProvider;

  private final Provider<String> playerTwoProvider;

  private final Provider<OffGameInteractor.Listener> listenerProvider;

  private final Provider<OffGameInteractor.OffGamePresenter> presenterProvider;

  private final Provider<ScoreStream> scoreStreamProvider;

  public OffGameInteractor_MembersInjector(
      Provider<OffGameInteractor.OffGamePresenter> injectedPresenterProvider,
      Provider<String> playerOneProvider, Provider<String> playerTwoProvider,
      Provider<OffGameInteractor.Listener> listenerProvider,
      Provider<OffGameInteractor.OffGamePresenter> presenterProvider,
      Provider<ScoreStream> scoreStreamProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.playerOneProvider = playerOneProvider;
    this.playerTwoProvider = playerTwoProvider;
    this.listenerProvider = listenerProvider;
    this.presenterProvider = presenterProvider;
    this.scoreStreamProvider = scoreStreamProvider;
  }

  public static MembersInjector<OffGameInteractor> create(
      Provider<OffGameInteractor.OffGamePresenter> injectedPresenterProvider,
      Provider<String> playerOneProvider, Provider<String> playerTwoProvider,
      Provider<OffGameInteractor.Listener> listenerProvider,
      Provider<OffGameInteractor.OffGamePresenter> presenterProvider,
      Provider<ScoreStream> scoreStreamProvider) {
    return new OffGameInteractor_MembersInjector(injectedPresenterProvider, playerOneProvider, playerTwoProvider, listenerProvider, presenterProvider, scoreStreamProvider);
  }

  @Override
  public void injectMembers(OffGameInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectPlayerOne(instance, playerOneProvider.get());
    injectPlayerTwo(instance, playerTwoProvider.get());
    injectListener(instance, listenerProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectScoreStream(instance, scoreStreamProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.offgame.OffGameInteractor.playerOne")
  @Named("player_one")
  public static void injectPlayerOne(OffGameInteractor instance, String playerOne) {
    instance.playerOne = playerOne;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.offgame.OffGameInteractor.playerTwo")
  @Named("player_two")
  public static void injectPlayerTwo(OffGameInteractor instance, String playerTwo) {
    instance.playerTwo = playerTwo;
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

  @InjectedFieldSignature("com.uber.rib.root.loggedin.offgame.OffGameInteractor.scoreStream")
  public static void injectScoreStream(OffGameInteractor instance, ScoreStream scoreStream) {
    instance.scoreStream = scoreStream;
  }
}
