package com.appsflyer.internal;

import com.appsflyer.AppsFlyerLib;
import java.util.Map;
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
public final class AFd1qSDK extends AFc1dSDK {

    @NotNull
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);

    @NotNull
    public static String getRevenue = "https://%smonitorsdk.%s/remote-debug/exception-manager";

    @NotNull
    private final AFd1hSDK AFAdRevenueData;

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFd1qSDK(@NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        super(bArr, map, i10);
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFAdRevenueData = AFd1hSDK.JSON;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NotNull
    public final AFd1hSDK AFAdRevenueData() {
        return this.AFAdRevenueData;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NotNull
    public final String getMediationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AFd1pSDK.AFAdRevenueData(str);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NotNull
    public final String getMonetizationNetwork() {
        String str = String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), com.appsflyer.internal.AFa1tSDK.getMediationNetwork().getHostName());
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
