package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
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
    	at jadx.plugins.kotlin.metadata.pass.KotlinMetadataDecompilePass.visit(KotlinMetadataDecompilePass.kt:31)
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class ReactInstanceManagerInspectorTarget implements AutoCloseable {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final HybridData mHybridData;

    @Metadata
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public interface TargetDelegate {
        @NotNull
        Map<String, String> getMetadata();

        void loadNetworkResource(@NotNull String str, @NotNull InspectorNetworkRequestListener inspectorNetworkRequestListener);

        void onReload();

        void onSetPausedInDebuggerMessage(@Nullable String str);
    }

    static {
        p064g3.b.a("ReactInstanceManagerInspectorTarget", p064g3.a.WARNING);
        BridgeSoLoader.staticInit();
    }

    public ReactInstanceManagerInspectorTarget(@NotNull TargetDelegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.mHybridData = initHybrid(new Executor() { // from class: com.facebook.react.bridge.w
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ReactInstanceManagerInspectorTarget.mHybridData$lambda$0(runnable);
            }
        }, delegate);
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(Executor executor, TargetDelegate targetDelegate);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mHybridData$lambda$0(Runnable runnable) {
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            Intrinsics.c(runnable);
            UiThreadUtil.runOnUiThread(runnable);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final native void sendDebuggerResumeCommand();
}
