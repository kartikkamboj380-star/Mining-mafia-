package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class UiThreadUtil {

    @NotNull
    public static final UiThreadUtil INSTANCE = new UiThreadUtil();

    @NotNull
    private static final Lazy mainHandler$delegate = p129m8.g.b(p129m8.j.NONE, new Function0() { // from class: com.facebook.react.bridge.C
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UiThreadUtil.mainHandler_delegate$lambda$0();
        }
    });

    private UiThreadUtil() {
    }

    public static final void assertNotOnUiThread() {
        if (p084i3.a.f45066b) {
            SoftAssertions.assertCondition(!isOnUiThread(), "Expected not to run on UI thread!");
        }
    }

    public static final void assertOnUiThread() {
        if (p084i3.a.f45066b) {
            SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
        }
    }

    private final Handler getMainHandler() {
        return (Handler) mainHandler$delegate.getValue();
    }

    @NotNull
    public static final Handler getUiThreadHandler() {
        return INSTANCE.getMainHandler();
    }

    public static final boolean isOnUiThread() {
        return Intrinsics.b(Looper.getMainLooper().getThread(), Thread.currentThread());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler mainHandler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    public static final void removeOnUiThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        INSTANCE.getMainHandler().removeCallbacks(runnable);
    }

    public static final boolean runOnUiThread(@NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return INSTANCE.getMainHandler().postDelayed(runnable, 0L);
    }

    public static final boolean runOnUiThread(@NotNull Runnable runnable, long j10) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return INSTANCE.getMainHandler().postDelayed(runnable, j10);
    }
}
