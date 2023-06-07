package com.uber.rib.root.loggedin.tictactoe;

import com.uber.rib.core.Interactor_MembersInjector;
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
public final class TicTacToeInteractor_MembersInjector implements MembersInjector<TicTacToeInteractor> {
  private final Provider<TicTacToeInteractor.TicTacToePresenter> injectedPresenterProvider;

  private final Provider<Board> boardProvider;

  private final Provider<TicTacToeInteractor.Listener> listenerProvider;

  private final Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider;

  private final Provider<String> playerOneProvider;

  private final Provider<String> playerTwoProvider;

  public TicTacToeInteractor_MembersInjector(
      Provider<TicTacToeInteractor.TicTacToePresenter> injectedPresenterProvider,
      Provider<Board> boardProvider, Provider<TicTacToeInteractor.Listener> listenerProvider,
      Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider,
      Provider<String> playerOneProvider, Provider<String> playerTwoProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.boardProvider = boardProvider;
    this.listenerProvider = listenerProvider;
    this.presenterProvider = presenterProvider;
    this.playerOneProvider = playerOneProvider;
    this.playerTwoProvider = playerTwoProvider;
  }

  public static MembersInjector<TicTacToeInteractor> create(
      Provider<TicTacToeInteractor.TicTacToePresenter> injectedPresenterProvider,
      Provider<Board> boardProvider, Provider<TicTacToeInteractor.Listener> listenerProvider,
      Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider,
      Provider<String> playerOneProvider, Provider<String> playerTwoProvider) {
    return new TicTacToeInteractor_MembersInjector(injectedPresenterProvider, boardProvider, listenerProvider, presenterProvider, playerOneProvider, playerTwoProvider);
  }

  @Override
  public void injectMembers(TicTacToeInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectBoard(instance, boardProvider.get());
    injectListener(instance, listenerProvider.get());
    injectPresenter(instance, presenterProvider.get());
    injectPlayerOne(instance, playerOneProvider.get());
    injectPlayerTwo(instance, playerTwoProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.board")
  public static void injectBoard(TicTacToeInteractor instance, Object board) {
    instance.board = (Board) board;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.listener")
  public static void injectListener(TicTacToeInteractor instance,
      TicTacToeInteractor.Listener listener) {
    instance.listener = listener;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.presenter")
  public static void injectPresenter(TicTacToeInteractor instance, Object presenter) {
    instance.presenter = (TicTacToeInteractor.TicTacToePresenter) presenter;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.playerOne")
  @Named("player_one")
  public static void injectPlayerOne(TicTacToeInteractor instance, String playerOne) {
    instance.playerOne = playerOne;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.playerTwo")
  @Named("player_two")
  public static void injectPlayerTwo(TicTacToeInteractor instance, String playerTwo) {
    instance.playerTwo = playerTwo;
  }
}
