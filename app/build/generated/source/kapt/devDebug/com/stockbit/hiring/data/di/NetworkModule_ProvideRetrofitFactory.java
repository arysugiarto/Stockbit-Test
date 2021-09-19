// Generated by Dagger (https://dagger.dev).
package com.stockbit.hiring.data.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> okHttpClientProvider;

  private final Provider<String> baseURLProvider;

  public NetworkModule_ProvideRetrofitFactory(Provider<OkHttpClient> okHttpClientProvider,
      Provider<String> baseURLProvider) {
    this.okHttpClientProvider = okHttpClientProvider;
    this.baseURLProvider = baseURLProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(okHttpClientProvider.get(), baseURLProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(
      Provider<OkHttpClient> okHttpClientProvider, Provider<String> baseURLProvider) {
    return new NetworkModule_ProvideRetrofitFactory(okHttpClientProvider, baseURLProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient okHttpClient, String baseURL) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideRetrofit(okHttpClient, baseURL));
  }
}
