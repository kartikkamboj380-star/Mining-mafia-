package com.unity3d.ads.adplayer;

import kotlin.Metadata;
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
public final class WebViewAdPlayerKt {

    @NotNull
    private static final String[] SHOW_EVENTS = {ExposedFunctionLocation.STARTED, ExposedFunctionLocation.CLICKED, ExposedFunctionLocation.COMPLETED, ExposedFunctionLocation.FAILED, ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT, ExposedFunctionLocation.LEFT_APPLICATION};

    @NotNull
    private static final String[] LOAD_EVENTS = {ExposedFunctionLocation.LOAD_COMPLETE, ExposedFunctionLocation.LOAD_ERROR};
}
