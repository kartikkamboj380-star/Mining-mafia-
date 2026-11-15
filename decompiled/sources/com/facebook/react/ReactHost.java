package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: Error in decompile pass: KotlinMetadataDecompile
    java.lang.IllegalArgumentException: Provided Metadata instance does not have metadataVersion in it and therefore is malformed and cannot be read.
    	at kotlin.metadata.jvm.internal.JvmReadUtils.checkMetadataVersionForRead(JvmReadUtils.kt:79)
    	at kotlin.metadata.jvm.internal.JvmReadUtils.readMetadataImpl$kotlin_metadata_jvm(JvmReadUtils.kt:46)
    	at kotlin.metadata.jvm.KotlinClassMetadata$Companion.readLenient(KotlinClassMetadata.kt:418)
    	at jadx.plugins.kotlin.metadata.utils.KotlinMetadataExtKt.getKotlinClassMetadata(KotlinMetadataExt.kt:68)
    	at jadx.plugins.kotlin.metadata.utils.KmClassWrapper$Companion.getWrapper(KmClassWrapper.kt:31)
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:33)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public interface ReactHost {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ p174r3.a destroy$default(ReactHost reactHost, String str, Exception exc, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: destroy");
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: com.facebook.react.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ReactHost.destroy$lambda$0(((Boolean) obj2).booleanValue());
                }
            };
        }
        return reactHost.destroy(str, exc, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit destroy$lambda$0(boolean z9) {
        return Unit.f45918a;
    }

    void addBeforeDestroyListener(@NotNull Function0<Unit> function0);

    void addReactInstanceEventListener(@NotNull InterfaceC1412z interfaceC1412z);

    @NotNull
    p184s3.a createSurface(@NotNull Context context, @NotNull String str, @Nullable Bundle bundle);

    @NotNull
    p174r3.a destroy(@NotNull String str, @Nullable Exception exc);

    @NotNull
    p174r3.a destroy(@NotNull String str, @Nullable Exception exc, @NotNull Function1<? super Boolean, Unit> function1);

    @Nullable
    ReactContext getCurrentReactContext();

    @Nullable
    p124m3.e getDevSupportManager();

    @NotNull
    LifecycleState getLifecycleState();

    @NotNull
    ComponentCallbacks2C1309j getMemoryPressureRouter();

    @Nullable
    ReactQueueConfiguration getReactQueueConfiguration();

    void invalidate();

    void onActivityResult(@NotNull Activity activity, int i10, int i11, @Nullable Intent intent);

    boolean onBackPressed();

    void onConfigurationChanged(@NotNull Context context);

    void onHostDestroy();

    void onHostDestroy(@Nullable Activity activity);

    void onHostLeaveHint(@Nullable Activity activity);

    void onHostPause();

    void onHostPause(@Nullable Activity activity);

    void onHostResume(@Nullable Activity activity);

    void onHostResume(@Nullable Activity activity, @Nullable D3.a aVar);

    void onNewIntent(@NotNull Intent intent);

    void onWindowFocusChange(boolean z9);

    @NotNull
    p174r3.a reload(@NotNull String str);

    void removeBeforeDestroyListener(@NotNull Function0<Unit> function0);

    void removeReactInstanceEventListener(@NotNull InterfaceC1412z interfaceC1412z);

    @NotNull
    p174r3.a start();
}
