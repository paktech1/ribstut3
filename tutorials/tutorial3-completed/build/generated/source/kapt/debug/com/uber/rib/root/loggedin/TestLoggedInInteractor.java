package com.uber.rib.root.loggedin;

public class TestLoggedInInteractor {
  private TestLoggedInInteractor() {
  }

  public static LoggedInInteractor create(final MutableScoreStream scoreStream) {
    LoggedInInteractor interactor = new LoggedInInteractor();
    interactor.scoreStream = scoreStream;
    return interactor;
  }
}
