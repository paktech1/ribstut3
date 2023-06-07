package com.uber.rib.root.loggedin.tictactoe;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.uber.rib.core.Interactor_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
final class DaggerTicTacToeBuilder_Component {
  private DaggerTicTacToeBuilder_Component() {
  }

  public static TicTacToeBuilder.Component.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements TicTacToeBuilder.Component.Builder {
    private TicTacToeInteractor interactor;

    private TicTacToeView view;

    private TicTacToeBuilder.ParentComponent parentComponent;

    @Override
    public Builder interactor(TicTacToeInteractor interactor) {
      this.interactor = Preconditions.checkNotNull(interactor);
      return this;
    }

    @Override
    public Builder view(TicTacToeView view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Builder parentComponent(TicTacToeBuilder.ParentComponent component) {
      this.parentComponent = Preconditions.checkNotNull(component);
      return this;
    }

    @Override
    public TicTacToeBuilder.Component build() {
      Preconditions.checkBuilderRequirement(interactor, TicTacToeInteractor.class);
      Preconditions.checkBuilderRequirement(view, TicTacToeView.class);
      Preconditions.checkBuilderRequirement(parentComponent, TicTacToeBuilder.ParentComponent.class);
      return new ComponentImpl(parentComponent, interactor, view);
    }
  }

  private static final class ComponentImpl implements TicTacToeBuilder.Component {
    private final TicTacToeBuilder.ParentComponent parentComponent;

    private final ComponentImpl componentImpl = this;

    private Provider<TicTacToeView> viewProvider;

    private Provider<TicTacToeInteractor.TicTacToePresenter> presenterProvider;

    private Provider<TicTacToeBuilder.Component> componentProvider;

    private Provider<TicTacToeInteractor> interactorProvider;

    private Provider<TicTacToeRouter> routerProvider;

    private ComponentImpl(TicTacToeBuilder.ParentComponent parentComponentParam,
        TicTacToeInteractor interactorParam, TicTacToeView viewParam) {
      this.parentComponent = parentComponentParam;
      initialize(parentComponentParam, interactorParam, viewParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final TicTacToeBuilder.ParentComponent parentComponentParam,
        final TicTacToeInteractor interactorParam, final TicTacToeView viewParam) {
      this.viewProvider = InstanceFactory.create(viewParam);
      this.presenterProvider = DoubleCheck.provider((Provider) viewProvider);
      this.componentProvider = InstanceFactory.create((TicTacToeBuilder.Component) componentImpl);
      this.interactorProvider = InstanceFactory.create(interactorParam);
      this.routerProvider = DoubleCheck.provider(TicTacToeBuilder_Module_RouterFactory.create(componentProvider, viewProvider, interactorProvider));
    }

    @Override
    public void inject(TicTacToeInteractor interactor) {
      injectTicTacToeInteractor(interactor);
    }

    @Override
    public TicTacToeRouter tictactoeRouter() {
      return routerProvider.get();
    }

    @CanIgnoreReturnValue
    private TicTacToeInteractor injectTicTacToeInteractor(TicTacToeInteractor instance) {
      Interactor_MembersInjector.injectInjectedPresenter(instance, presenterProvider.get());
      TicTacToeInteractor_MembersInjector.injectBoard(instance, new Board());
      TicTacToeInteractor_MembersInjector.injectListener(instance, Preconditions.checkNotNullFromComponent(parentComponent.ticTacToeListener()));
      TicTacToeInteractor_MembersInjector.injectPresenter(instance, presenterProvider.get());
      TicTacToeInteractor_MembersInjector.injectPlayerOne(instance, Preconditions.checkNotNullFromComponent(parentComponent.playerOne()));
      TicTacToeInteractor_MembersInjector.injectPlayerTwo(instance, Preconditions.checkNotNullFromComponent(parentComponent.playerTwo()));
      return instance;
    }
  }
}
