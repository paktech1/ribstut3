package com.uber.rib.root;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.uber.rib.core.Interactor_MembersInjector;
import com.uber.rib.root.loggedout.LoggedOutInteractor;
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
final class DaggerRootBuilder_Component {
  private DaggerRootBuilder_Component() {
  }

  public static RootBuilder.Component.Builder builder() {
    return new Builder();
  }

  private static final class Builder implements RootBuilder.Component.Builder {
    private RootInteractor interactor;

    private RootView view;

    private RootBuilder.ParentComponent parentComponent;

    @Override
    public Builder interactor(RootInteractor interactor) {
      this.interactor = Preconditions.checkNotNull(interactor);
      return this;
    }

    @Override
    public Builder view(RootView view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Builder parentComponent(RootBuilder.ParentComponent component) {
      this.parentComponent = Preconditions.checkNotNull(component);
      return this;
    }

    @Override
    public RootBuilder.Component build() {
      Preconditions.checkBuilderRequirement(interactor, RootInteractor.class);
      Preconditions.checkBuilderRequirement(view, RootView.class);
      Preconditions.checkBuilderRequirement(parentComponent, RootBuilder.ParentComponent.class);
      return new ComponentImpl(parentComponent, interactor, view);
    }
  }

  private static final class ComponentImpl implements RootBuilder.Component {
    private final RootView view;

    private final ComponentImpl componentImpl = this;

    private Provider<RootView> viewProvider;

    private Provider<RootInteractor.RootPresenter> presenterProvider;

    private Provider<RootInteractor> interactorProvider;

    private Provider<LoggedOutInteractor.Listener> loggedOutListenerProvider;

    private Provider<RootBuilder.Component> componentProvider;

    private Provider<RootRouter> routerProvider;

    private ComponentImpl(RootBuilder.ParentComponent parentComponentParam,
        RootInteractor interactorParam, RootView viewParam) {
      this.view = viewParam;
      initialize(parentComponentParam, interactorParam, viewParam);

    }

    @SuppressWarnings("unchecked")
    private void initialize(final RootBuilder.ParentComponent parentComponentParam,
        final RootInteractor interactorParam, final RootView viewParam) {
      this.viewProvider = InstanceFactory.create(viewParam);
      this.presenterProvider = DoubleCheck.provider((Provider) viewProvider);
      this.interactorProvider = InstanceFactory.create(interactorParam);
      this.loggedOutListenerProvider = DoubleCheck.provider(RootBuilder_Module_LoggedOutListenerFactory.create(interactorProvider));
      this.componentProvider = InstanceFactory.create((RootBuilder.Component) componentImpl);
      this.routerProvider = DoubleCheck.provider(RootBuilder_Module_RouterFactory.create(componentProvider, viewProvider, interactorProvider));
    }

    @Override
    public void inject(RootInteractor interactor) {
      injectRootInteractor(interactor);
    }

    @Override
    public LoggedOutInteractor.Listener listener() {
      return loggedOutListenerProvider.get();
    }

    @Override
    public RootView rootView() {
      return view;
    }

    @Override
    public RootRouter rootRouter() {
      return routerProvider.get();
    }

    @CanIgnoreReturnValue
    private RootInteractor injectRootInteractor(RootInteractor instance) {
      Interactor_MembersInjector.injectInjectedPresenter(instance, presenterProvider.get());
      RootInteractor_MembersInjector.injectPresenter(instance, presenterProvider.get());
      return instance;
    }
  }
}
