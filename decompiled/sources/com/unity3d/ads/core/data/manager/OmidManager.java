package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p158p7.c;
import p158p7.d;
import p158p7.f;
import p158p7.h;
import p158p7.j;
import p158p7.k;

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
public interface OmidManager {
    void activate(@NotNull Context context);

    @NotNull
    p158p7.a createAdEvents(@NotNull p158p7.b bVar);

    @NotNull
    p158p7.b createAdSession(@NotNull c cVar, @NotNull d dVar);

    @NotNull
    c createAdSessionConfiguration(@NotNull f fVar, @NotNull h hVar, @NotNull j jVar, @NotNull j jVar2, boolean z9);

    @NotNull
    d createHtmlAdSessionContext(@Nullable k kVar, @Nullable WebView webView, @Nullable String str, @Nullable String str2);

    @NotNull
    d createJavaScriptAdSessionContext(@Nullable k kVar, @Nullable WebView webView, @Nullable String str, @Nullable String str2);

    @NotNull
    String getVersion();

    boolean isActive();
}
