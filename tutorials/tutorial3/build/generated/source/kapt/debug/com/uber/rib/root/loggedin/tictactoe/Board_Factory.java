package com.uber.rib.root.loggedin.tictactoe;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
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
public final class Board_Factory implements Factory<Board> {
  @Override
  public Board get() {
    return newInstance();
  }

  public static Board_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Board newInstance() {
    return new Board();
  }

  private static final class InstanceHolder {
    private static final Board_Factory INSTANCE = new Board_Factory();
  }
}
