package com.uber.rib.root.loggedin.tictactoe;

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
public final class TicTacToeInteractor_MembersInjector implements MembersInjector<TicTacToeInteractor> {
  private final Provider<TicTacToeInteractor.TicTacToePresenter> injectedPresenterProvider;

  private final Provider<Board> boardProvider;

  private final Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider;

  public TicTacToeInteractor_MembersInjector(
      Provider<TicTacToeInteractor.TicTacToePresenter> injectedPresenterProvider,
      Provider<Board> boardProvider,
      Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider) {
    this.injectedPresenterProvider = injectedPresenterProvider;
    this.boardProvider = boardProvider;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<TicTacToeInteractor> create(
      Provider<TicTacToeInteractor.TicTacToePresenter> injectedPresenterProvider,
      Provider<Board> boardProvider,
      Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider) {
    return new TicTacToeInteractor_MembersInjector(injectedPresenterProvider, boardProvider, presenterProvider);
  }

  @Override
  public void injectMembers(TicTacToeInteractor instance) {
    Interactor_MembersInjector.injectInjectedPresenter(instance, injectedPresenterProvider.get());
    injectBoard(instance, boardProvider.get());
    injectPresenter(instance, presenterProvider.get());
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.board")
  public static void injectBoard(TicTacToeInteractor instance, Object board) {
    instance.board = (Board) board;
  }

  @InjectedFieldSignature("com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor.presenter")
  public static void injectPresenter(TicTacToeInteractor instance, Object presenter) {
    instance.presenter = (TicTacToeInteractor.TicTacToePresenter) presenter;
  }
}
