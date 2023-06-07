package com.uber.rib.root.loggedin;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("com.uber.rib.root.loggedin.LoggedInBuilder.LoggedInScope")
@QualifierMetadata({
    "com.uber.rib.root.loggedin.LoggedInBuilder.LoggedInInternal",
    "javax.inject.Named"
})
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoggedInBuilder_Module_MutableScoreStreamFactory implements Factory<MutableScoreStream> {
  private final Provider<String> playerOneProvider;

  private final Provider<String> playerTwoProvider;

  public LoggedInBuilder_Module_MutableScoreStreamFactory(Provider<String> playerOneProvider,
      Provider<String> playerTwoProvider) {
    this.playerOneProvider = playerOneProvider;
    this.playerTwoProvider = playerTwoProvider;
  }

  @Override
  public MutableScoreStream get() {
    return mutableScoreStream(playerOneProvider.get(), playerTwoProvider.get());
  }

  public static LoggedInBuilder_Module_MutableScoreStreamFactory create(
      Provider<String> playerOneProvider, Provider<String> playerTwoProvider) {
    return new LoggedInBuilder_Module_MutableScoreStreamFactory(playerOneProvider, playerTwoProvider);
  }

  public static MutableScoreStream mutableScoreStream(String playerOne, String playerTwo) {
    return Preconditions.checkNotNullFromProvides(LoggedInBuilder.Module.mutableScoreStream(playerOne, playerTwo));
  }
}
