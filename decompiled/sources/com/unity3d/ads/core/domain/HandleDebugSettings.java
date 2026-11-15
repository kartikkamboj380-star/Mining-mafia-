package com.unity3d.ads.core.domain;

import android.webkit.WebView;
import com.unity3d.ads.core.log.LogLevel;
import com.unity3d.ads.core.log.Logger;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public final class HandleDebugSettings {

    @NotNull
    private final Logger logger;

    public HandleDebugSettings(@NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(@NotNull NativeConfigurationOuterClass.DebugSettings debugSettings) {
        Intrinsics.checkNotNullParameter(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(LogLevel.TRACE);
        }
        WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
