package com.uber.rib.root.loggedout;

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
final class DaggerLoggedOutBuilder_Component {
  private DaggerLoggedOutBuilder_Component() {
  }

  public static LoggedOutBuilder.Component.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements LoggedOutBuilder.Component.Builder {
    private LoggedOutInteractor interactor;

    private LoggedOutView view;

    private LoggedOutBuilder.ParentComponent parentComponent;

    @Override
    public Builder interactor(LoggedOutInteractor interactor) {
      this.interactor = Preconditions.checkNotNull(interactor);
      return this;
    }

    @Override
    public Builder view(LoggedOutView view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Builder parentComponent(LoggedOutBuilder.ParentComponent component) {
      this.parentComponent = Preconditions.checkNotNull(component);
      return this;
    }

    @Override
    public LoggedOutBuilder.Component build() {
      Preconditions.checkBuilderRequirement(interactor, LoggedOutInteractor.class);
      Preconditions.checkBuilderRequirement(view, LoggedOutView.class);
      Preconditions.checkBuilderRequirement(parentComponent, LoggedOutBuilder.ParentComponent.class);
      return new ComponentImpl(parentComponent, interactor, view);
    }
  }

  private static final class ComponentImpl implements LoggedOutBuilder.Component {
    private final LoggedOutBuilder.ParentComponent parentComponent;

    private final ComponentImpl componentImpl = this;

    private Provider<LoggedOutView> viewProvider;

    private Provider<LoggedOutInteractor.LoggedOutPresenter> presenterProvider;

    private Provider<LoggedOutBuilder.Component> componentProvider;

    private Provider<LoggedOutInteractor> interactorProvider;

    private Provider<LoggedOutRouter> routerProvider;

    private ComponentImpl(LoggedOutBuilder.ParentComponent parentComponentParam,
        LoggedOutInteractor interactorParam, LoggedOutView viewParam) {
      this.parentComponent = parentComponentParam;
      initialize(parentComponentParam, interactorParam, viewParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final LoggedOutBuilder.ParentComponent parentComponentParam,
        final LoggedOutInteractor interactorParam, final LoggedOutView viewParam) {
      this.viewProvider = InstanceFactory.create(viewParam);
      this.presenterProvider = DoubleCheck.provider((Provider) viewProvider);
      this.componentProvider = InstanceFactory.create((LoggedOutBuilder.Component) componentImpl);
      this.interactorProvider = InstanceFactory.create(interactorParam);
      this.routerProvider = DoubleCheck.provider(LoggedOutBuilder_Module_RouterFactory.create(componentProvider, viewProvider, interactorProvider));
    }

    @Override
    public void inject(LoggedOutInteractor interactor) {
      injectLoggedOutInteractor(interactor);
    }

    @Override
    public LoggedOutRouter loggedoutRouter() {
      return routerProvider.get();
    }

    private LoggedOutInteractor injectLoggedOutInteractor(LoggedOutInteractor instance) {
      Interactor_MembersInjector.injectInjectedPresenter(instance, presenterProvider.get());
      LoggedOutInteractor_MembersInjector.injectListener(instance, Preconditions.checkNotNullFromComponent(parentComponent.listener()));
      LoggedOutInteractor_MembersInjector.injectPresenter(instance, presenterProvider.get());
      return instance;
    }
  }
}
