package com.uber.rib.root.loggedin;

import com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.loggedin.LoggedInBuilder.LoggedInScope")
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
public final class LoggedInBuilder_Module_TicTacToeListenerFactory implements Factory<TicTacToeInteractor.Listener> {
  private final Provider<LoggedInInteractor> interactorProvider;

  public LoggedInBuilder_Module_TicTacToeListenerFactory(
      Provider<LoggedInInteractor> interactorProvider) {
    this.interactorProvider = interactorProvider;
  }

  @Override
  public TicTacToeInteractor.Listener get() {
    return ticTacToeListener(interactorProvider.get());
  }

  public static LoggedInBuilder_Module_TicTacToeListenerFactory create(
      Provider<LoggedInInteractor> interactorProvider) {
    return new LoggedInBuilder_Module_TicTacToeListenerFactory(interactorProvider);
  }

  public static TicTacToeInteractor.Listener ticTacToeListener(LoggedInInteractor interactor) {
    return Preconditions.checkNotNullFromProvides(LoggedInBuilder.Module.ticTacToeListener(interactor));
  }
}
