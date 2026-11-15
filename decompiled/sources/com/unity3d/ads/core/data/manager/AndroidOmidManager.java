package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
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
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        p148o7.a.a(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public p158p7.a createAdEvents(@NotNull p158p7.b adSession) {
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        p158p7.a aVarA = p158p7.a.a(adSession);
        Intrinsics.checkNotNullExpressionValue(aVarA, "createAdEvents(adSession)");
        return aVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public p158p7.b createAdSession(@NotNull c adSessionConfiguration, @NotNull d context) {
        Intrinsics.checkNotNullParameter(adSessionConfiguration, "adSessionConfiguration");
        Intrinsics.checkNotNullParameter(context, "context");
        p158p7.b bVarA = p158p7.b.a(adSessionConfiguration, context);
        Intrinsics.checkNotNullExpressionValue(bVarA, "createAdSession(adSessionConfiguration, context)");
        return bVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public c createAdSessionConfiguration(@NotNull f creativeType, @NotNull h impressionType, @NotNull j owner, @NotNull j mediaEventsOwner, boolean z9) {
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Intrinsics.checkNotNullParameter(impressionType, "impressionType");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(mediaEventsOwner, "mediaEventsOwner");
        c cVarA = c.a(creativeType, impressionType, owner, mediaEventsOwner, z9);
        Intrinsics.checkNotNullExpressionValue(cVarA, "createAdSessionConfigura…VerificationScripts\n    )");
        return cVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public d createHtmlAdSessionContext(@Nullable k kVar, @Nullable WebView webView, @Nullable String str, @Nullable String str2) {
        d dVarA = d.a(kVar, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(dVarA, "createHtmlAdSessionConte…customReferenceData\n    )");
        return dVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public d createJavaScriptAdSessionContext(@Nullable k kVar, @Nullable WebView webView, @Nullable String str, @Nullable String str2) {
        d dVarB = d.b(kVar, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(dVarB, "createJavascriptAdSessio…customReferenceData\n    )");
        return dVarB;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public String getVersion() {
        String strB = p148o7.a.b();
        Intrinsics.checkNotNullExpressionValue(strB, "getVersion()");
        return strB;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return p148o7.a.c();
    }
}
