package com.uber.rib.root.loggedin.offgame;

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
final class DaggerOffGameBuilder_Component {
  private DaggerOffGameBuilder_Component() {
  }

  public static OffGameBuilder.Component.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements OffGameBuilder.Component.Builder {
    private OffGameInteractor interactor;

    private OffGameView view;

    private OffGameBuilder.ParentComponent parentComponent;

    @Override
    public Builder interactor(OffGameInteractor interactor) {
      this.interactor = Preconditions.checkNotNull(interactor);
      return this;
    }

    @Override
    public Builder view(OffGameView view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Builder parentComponent(OffGameBuilder.ParentComponent component) {
      this.parentComponent = Preconditions.checkNotNull(component);
      return this;
    }

    @Override
    public OffGameBuilder.Component build() {
      Preconditions.checkBuilderRequirement(interactor, OffGameInteractor.class);
      Preconditions.checkBuilderRequirement(view, OffGameView.class);
      Preconditions.checkBuilderRequirement(parentComponent, OffGameBuilder.ParentComponent.class);
      return new ComponentImpl(parentComponent, interactor, view);
    }
  }

  private static final class ComponentImpl implements OffGameBuilder.Component {
    private final OffGameBuilder.ParentComponent parentComponent;

    private final ComponentImpl componentImpl = this;

    private Provider<OffGameView> viewProvider;

    private Provider<OffGameInteractor.OffGamePresenter> presenterProvider;

    private Provider<OffGameBuilder.Component> componentProvider;

    private Provider<OffGameInteractor> interactorProvider;

    private Provider<OffGameRouter> routerProvider;

    private ComponentImpl(OffGameBuilder.ParentComponent parentComponentParam,
        OffGameInteractor interactorParam, OffGameView viewParam) {
      this.parentComponent = parentComponentParam;
      initialize(parentComponentParam, interactorParam, viewParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final OffGameBuilder.ParentComponent parentComponentParam,
        final OffGameInteractor interactorParam, final OffGameView viewParam) {
      this.viewProvider = InstanceFactory.create(viewParam);
      this.presenterProvider = DoubleCheck.provider((Provider) viewProvider);
      this.componentProvider = InstanceFactory.create((OffGameBuilder.Component) componentImpl);
      this.interactorProvider = InstanceFactory.create(interactorParam);
      this.routerProvider = DoubleCheck.provider(OffGameBuilder_Module_RouterFactory.create(componentProvider, viewProvider, interactorProvider));
    }

    @Override
    public void inject(OffGameInteractor interactor) {
      injectOffGameInteractor(interactor);
    }

    @Override
    public OffGameRouter offgameRouter() {
      return routerProvider.get();
    }

    @CanIgnoreReturnValue
    private OffGameInteractor injectOffGameInteractor(OffGameInteractor instance) {
      Interactor_MembersInjector.injectInjectedPresenter(instance, presenterProvider.get());
      OffGameInteractor_MembersInjector.injectPlayerOne(instance, Preconditions.checkNotNullFromComponent(parentComponent.playerOne()));
      OffGameInteractor_MembersInjector.injectPlayerTwo(instance, Preconditions.checkNotNullFromComponent(parentComponent.playerTwo()));
      OffGameInteractor_MembersInjector.injectListener(instance, Preconditions.checkNotNullFromComponent(parentComponent.listener()));
      OffGameInteractor_MembersInjector.injectPresenter(instance, presenterProvider.get());
      OffGameInteractor_MembersInjector.injectScoreStream(instance, Preconditions.checkNotNullFromComponent(parentComponent.scoreStream()));
      return instance;
    }
  }
}
