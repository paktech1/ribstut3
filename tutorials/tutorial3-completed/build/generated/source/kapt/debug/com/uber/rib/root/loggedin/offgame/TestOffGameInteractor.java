package com.uber.rib.root.loggedin.offgame;

import com.uber.rib.root.loggedin.ScoreStream;
import java.lang.String;

public class TestOffGameInteractor {
  private TestOffGameInteractor() {
  }

  public static OffGameInteractor create(final String playerOne, final String playerTwo,
      final OffGameInteractor.Listener listener, final OffGameInteractor.OffGamePresenter presenter,
      final ScoreStream scoreStream) {
    OffGameInteractor interactor = new OffGameInteractor();
    interactor.playerOne = playerOne;
    interactor.playerTwo = playerTwo;
    interactor.listener = listener;
    interactor.presenter = presenter;
    interactor.scoreStream = scoreStream;
    return interactor;
  }
}
