package com.uber.rib.root.loggedin.tictactoe;

import java.lang.String;

public class TestTicTacToeInteractor {
  private TestTicTacToeInteractor() {
  }

  public static TicTacToeInteractor create(final Board board,
      final TicTacToeInteractor.Listener listener,
      final TicTacToeInteractor.TicTacToePresenter presenter, final String playerOne,
      final String playerTwo) {
    TicTacToeInteractor interactor = new TicTacToeInteractor();
    interactor.board = board;
    interactor.listener = listener;
    interactor.presenter = presenter;
    interactor.playerOne = playerOne;
    interactor.playerTwo = playerTwo;
    return interactor;
  }
}
