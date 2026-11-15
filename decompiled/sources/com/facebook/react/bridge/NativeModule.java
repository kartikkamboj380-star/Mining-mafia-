package com.facebook.react.bridge;

import com.horcrux.svg.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@p024c3.a
public interface NativeModule {
    @Deprecated
    default boolean canOverrideExistingModule() {
        return false;
    }

    String getName();

    void initialize();

    void invalidate();

    @Deprecated(forRemoval = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED, since = "Use invalidate method instead")
    default void onCatalystInstanceDestroy() {
    }
}
