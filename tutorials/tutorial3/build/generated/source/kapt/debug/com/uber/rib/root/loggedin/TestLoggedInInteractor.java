package com.uber.rib.root.loggedin;

public class TestLoggedInInteractor {
  private TestLoggedInInteractor() {
  }

  public static LoggedInInteractor create() {
    LoggedInInteractor interactor = new LoggedInInteractor();
    return interactor;
  }
}
