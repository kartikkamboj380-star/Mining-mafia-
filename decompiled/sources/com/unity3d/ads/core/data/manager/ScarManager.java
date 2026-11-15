package com.unity3d.ads.core.data.manager;

import L8.InterfaceC0804e;
import U7.c;
import android.content.Context;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes3.dex */
@Metadata
public interface ScarManager {
    @Nullable
    Object getSignals(@Nullable List<? extends AdFormatOuterClass.AdFormat> list, @NotNull p169q8.b bVar);

    @Nullable
    Object getVersion(@NotNull p169q8.b bVar);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i10, @NotNull p169q8.b bVar);

    @NotNull
    InterfaceC0804e loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull c cVar, @NotNull UnityBannerSize unityBannerSize, @NotNull String str);

    @NotNull
    InterfaceC0804e show(@NotNull String str, @NotNull String str2);
}
