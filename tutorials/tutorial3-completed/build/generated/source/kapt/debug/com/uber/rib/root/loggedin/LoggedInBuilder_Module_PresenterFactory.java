package com.uber.rib.root.loggedin;

import com.uber.rib.core.EmptyPresenter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class LoggedInBuilder_Module_PresenterFactory implements Factory<EmptyPresenter> {
  @Override
  public EmptyPresenter get() {
    return presenter();
  }

  public static LoggedInBuilder_Module_PresenterFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static EmptyPresenter presenter() {
    return Preconditions.checkNotNullFromProvides(LoggedInBuilder.Module.presenter());
  }

  private static final class InstanceHolder {
    private static final LoggedInBuilder_Module_PresenterFactory INSTANCE = new LoggedInBuilder_Module_PresenterFactory();
  }
}
