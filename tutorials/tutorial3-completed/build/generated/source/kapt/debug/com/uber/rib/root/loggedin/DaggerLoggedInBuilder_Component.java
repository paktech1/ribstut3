package com.uber.rib.root.loggedin;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.uber.rib.core.EmptyPresenter;
import com.uber.rib.core.Interactor_MembersInjector;
import com.uber.rib.root.RootView;
import com.uber.rib.root.loggedin.offgame.OffGameInteractor;
import com.uber.rib.root.loggedin.tictactoe.TicTacToeInteractor;
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
public final class DaggerLoggedInBuilder_Component {
  private DaggerLoggedInBuilder_Component() {
  }

  public static LoggedInBuilder.Component.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements LoggedInBuilder.Component.Builder {
    private LoggedInInteractor interactor;

    private LoggedInBuilder.ParentComponent parentComponent;

    private String playerOne;

    private String playerTwo;

    @Override
    public Builder interactor(LoggedInInteractor interactor) {
      this.interactor = Preconditions.checkNotNull(interactor);
      return this;
    }

    @Override
    public Builder parentComponent(LoggedInBuilder.ParentComponent component) {
      this.parentComponent = Preconditions.checkNotNull(component);
      return this;
    }

    @Override
    public Builder playerOne(String playerOne) {
      this.playerOne = Preconditions.checkNotNull(playerOne);
      return this;
    }

    @Override
    public Builder playerTwo(String playerTwo) {
      this.playerTwo = Preconditions.checkNotNull(playerTwo);
      return this;
    }

    @Override
    public LoggedInBuilder.Component build() {
      Preconditions.checkBuilderRequirement(interactor, LoggedInInteractor.class);
      Preconditions.checkBuilderRequirement(parentComponent, LoggedInBuilder.ParentComponent.class);
      Preconditions.checkBuilderRequirement(playerOne, String.class);
      Preconditions.checkBuilderRequirement(playerTwo, String.class);
      return new ComponentImpl(parentComponent, interactor, playerOne, playerTwo);
    }
  }

  private static final class ComponentImpl implements LoggedInBuilder.Component {
    private final String playerOne;

    private final String playerTwo;

    private final ComponentImpl componentImpl = this;

    private Provider<EmptyPresenter> presenterProvider;

    private Provider<String> playerOneProvider;

    private Provider<String> playerTwoProvider;

    private Provider<MutableScoreStream> mutableScoreStreamProvider;

    private Provider<LoggedInBuilder.Component> componentProvider;

    private Provider<LoggedInInteractor> interactorProvider;

    private Provider<RootView> rootViewProvider;

    private Provider<LoggedInRouter> routerProvider;

    private Provider<OffGameInteractor.Listener> listenerProvider;

    private Provider<TicTacToeInteractor.Listener> ticTacToeListenerProvider;

    private ComponentImpl(LoggedInBuilder.ParentComponent parentComponentParam,
        LoggedInInteractor interactorParam, String playerOneParam, String playerTwoParam) {
      this.playerOne = playerOneParam;
      this.playerTwo = playerTwoParam;
      initialize(parentComponentParam, interactorParam, playerOneParam, playerTwoParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoggedInBuilder.ParentComponent parentComponentParam,
        final LoggedInInteractor interactorParam, final String playerOneParam,
        final String playerTwoParam) {
      this.presenterProvider = DoubleCheck.provider(LoggedInBuilder_Module_PresenterFactory.create());
      this.playerOneProvider = InstanceFactory.create(playerOneParam);
      this.playerTwoProvider = InstanceFactory.create(playerTwoParam);
      this.mutableScoreStreamProvider = DoubleCheck.provider(LoggedInBuilder_Module_MutableScoreStreamFactory.create(playerOneProvider, playerTwoProvider));
      this.componentProvider = InstanceFactory.create((LoggedInBuilder.Component) componentImpl);
      this.interactorProvider = InstanceFactory.create(interactorParam);
      this.rootViewProvider = new RootViewProvider(parentComponentParam);
      this.routerProvider = DoubleCheck.provider(LoggedInBuilder_Module_RouterFactory.create(componentProvider, interactorProvider, rootViewProvider));
      this.listenerProvider = DoubleCheck.provider(LoggedInBuilder_Module_ListenerFactory.create(interactorProvider));
      this.ticTacToeListenerProvider = DoubleCheck.provider(LoggedInBuilder_Module_TicTacToeListenerFactory.create(interactorProvider));
    }

    @Override
    public void inject(LoggedInInteractor interactor) {
      injectLoggedInInteractor(interactor);
    }

    @Override
    public LoggedInRouter loggedinRouter() {
      return routerProvider.get();
    }

    @Override
    public String playerOne() {
      return playerOne;
    }

    @Override
    public String playerTwo() {
      return playerTwo;
    }

    @Override
    public OffGameInteractor.Listener listener() {
      return listenerProvider.get();
    }

    @Override
    public ScoreStream scoreStream() {
      return mutableScoreStreamProvider.get();
    }

    @Override
    public TicTacToeInteractor.Listener ticTacToeListener() {
      return ticTacToeListenerProvider.get();
    }

    @CanIgnoreReturnValue
    private LoggedInInteractor injectLoggedInInteractor(LoggedInInteractor instance) {
      Interactor_MembersInjector.injectInjectedPresenter(instance, presenterProvider.get());
      LoggedInInteractor_MembersInjector.injectScoreStream(instance, mutableScoreStreamProvider.get());
      return instance;
    }

    private static final class RootViewProvider implements Provider<RootView> {
      private final LoggedInBuilder.ParentComponent parentComponent;

      RootViewProvider(LoggedInBuilder.ParentComponent parentComponent) {
        this.parentComponent = parentComponent;
      }

      @Override
      public RootView get() {
        return Preconditions.checkNotNullFromComponent(parentComponent.rootView());
      }
    }
  }
}
