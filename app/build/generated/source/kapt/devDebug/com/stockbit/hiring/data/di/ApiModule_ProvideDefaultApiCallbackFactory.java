// Generated by Dagger (https://dagger.dev).
package com.stockbit.hiring.data.di;

import com.stockbit.hiring.data.remote.api.ExampleServiceCallback;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideDefaultApiCallbackFactory implements Factory<ExampleServiceCallback> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideDefaultApiCallbackFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ExampleServiceCallback get() {
    return provideDefaultApiCallback(retrofitProvider.get());
  }

  public static ApiModule_ProvideDefaultApiCallbackFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideDefaultApiCallbackFactory(retrofitProvider);
  }

  public static ExampleServiceCallback provideDefaultApiCallback(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ApiModule.INSTANCE.provideDefaultApiCallback(retrofit));
  }
}
