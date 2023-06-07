package com.uber.rib.root.loggedin.tictactoe;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.loggedin.tictactoe.TicTacToeBuilder.TicTacToeScope")
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
public final class TicTacToeBuilder_Module_RouterFactory implements Factory<TicTacToeRouter> {
  private final Provider<TicTacToeBuilder.Component> componentProvider;

  private final Provider<TicTacToeView> viewProvider;

  private final Provider<TicTacToeInteractor> interactorProvider;

  public TicTacToeBuilder_Module_RouterFactory(
      Provider<TicTacToeBuilder.Component> componentProvider, Provider<TicTacToeView> viewProvider,
      Provider<TicTacToeInteractor> interactorProvider) {
    this.componentProvider = componentProvider;
    this.viewProvider = viewProvider;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public TicTacToeRouter get() {
    return router(componentProvider.get(), viewProvider.get(), interactorProvider.get());
  }

  public static TicTacToeBuilder_Module_RouterFactory create(
      Provider<TicTacToeBuilder.Component> componentProvider, Provider<TicTacToeView> viewProvider,
      Provider<TicTacToeInteractor> interactorProvider) {
    return new TicTacToeBuilder_Module_RouterFactory(componentProvider, viewProvider, interactorProvider);
  }

  public static TicTacToeRouter router(Object component, TicTacToeView view,
      TicTacToeInteractor interactor) {
    return Preconditions.checkNotNullFromProvides(TicTacToeBuilder.Module.router((TicTacToeBuilder.Component) component, view, interactor));
  }
}
