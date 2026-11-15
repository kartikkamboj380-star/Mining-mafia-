package com.facebook.react.internal.turbomodule.core;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.soloader.SoLoader;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
public abstract class TurboModuleManagerDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @p024c3.a
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

    static {
        SoLoader.t("turbomodulejsijni");
    }

    protected TurboModuleManagerDelegate() {
        maybeLoadOtherSoLibraries();
        this.mHybridData = initHybrid();
    }

    private static /* synthetic */ void getMHybridData$annotations() {
    }

    @NotNull
    public List<String> getEagerInitModuleNames() {
        return CollectionsKt.i();
    }

    @Nullable
    public NativeModule getLegacyModule(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return null;
    }

    @Nullable
    public abstract TurboModule getModule(@NotNull String str);

    @NotNull
    protected abstract HybridData initHybrid();

    protected final synchronized void maybeLoadOtherSoLibraries() {
    }

    public boolean unstable_isLegacyModuleRegistered(@NotNull String moduleName) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        return false;
    }

    public abstract boolean unstable_isModuleRegistered(@NotNull String str);

    public boolean unstable_shouldEnableLegacyModuleInterop() {
        return false;
    }

    protected TurboModuleManagerDelegate(@NotNull HybridData hybridData) {
        Intrinsics.checkNotNullParameter(hybridData, "hybridData");
        maybeLoadOtherSoLibraries();
        this.mHybridData = hybridData;
    }
}
