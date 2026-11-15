package com.unity3d.ads.core.domain;

import I8.AbstractC0675j;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.collections.E;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p129m8.m;
import p129m8.n;

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
public final class GetCachedAsset {

    @NotNull
    private final CacheRepository cacheRepository;

    @NotNull
    private final CacheWebViewAssets cacheWebViewAssets;

    @NotNull
    private final Context context;

    public GetCachedAsset(@NotNull CacheRepository cacheRepository, @NotNull Context context, @NotNull CacheWebViewAssets cacheWebViewAssets) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    private final WebResourceResponse getBundledAsset(Uri uri) {
        String strH0 = StringsKt.H0(String.valueOf(uri.getPath()), "/", null, 2, null);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strH0);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strH0), null, inputStreamOpen);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    private final WebResourceResponse getCachedAsset(Uri uri) {
        Object objB;
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) AbstractC0675j.b(null, new GetCachedAsset$getCachedAsset$result$1(this, StringsKt.L0(string, "/", null, 2, null), null), 1, null);
        if (!(cacheResult instanceof CacheResult.Success)) {
            return getNotFoundResponse();
        }
        File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
        if (file == null) {
            return null;
        }
        try {
            m.a aVar = m.f46450b;
            objB = m.b(new FileInputStream(file));
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        if (m.f(objB)) {
            objB = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objB;
        if (fileInputStream == null) {
            return null;
        }
        String filePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "filePath");
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(filePath), null, fileInputStream);
    }

    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", "utf-8", TTAdConstant.DEEPLINK_FALLBACK_CODE, "Not Found", E.g(), new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object objB;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('/');
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        sb.append(StringsKt.L0(StringsKt.P0(string, "?", null, 2, null), "/", null, 2, null));
        String string2 = sb.toString();
        File file = this.cacheWebViewAssets.getCached().get(string2);
        if (file == null) {
            return null;
        }
        try {
            m.a aVar = m.f46450b;
            objB = m.b(new FileInputStream(file));
        } catch (Throwable th) {
            m.a aVar2 = m.f46450b;
            objB = m.b(n.a(th));
        }
        if (m.f(objB)) {
            objB = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objB;
        if (fileInputStream == null) {
            return null;
        }
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(string2), null, fileInputStream);
    }

    @Nullable
    public final WebResourceResponse invoke(@NotNull Uri uri, @NotNull String webviewType) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(webviewType, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, webviewType);
    }
}
