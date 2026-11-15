package com.appsflyer.internal;

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
    */
/* JADX INFO: loaded from: classes.dex */
@Metadata
public final class AFd1nSDK extends AFc1dSDK {

    @NotNull
    public AFc1kSDK AFAdRevenueData;

    @NotNull
    private final AFd1hSDK component4;
    private final boolean getRevenue;

    public /* synthetic */ AFd1nSDK(AFc1kSDK aFc1kSDK, byte[] bArr, Map map, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, bArr, (i11 & 4) != 0 ? null : map, (i11 & 8) != 0 ? 2000 : i10);
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NotNull
    public final AFd1hSDK AFAdRevenueData() {
        return this.component4;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    public final boolean getCurrencyIso4217Code() {
        return this.getRevenue;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NotNull
    public final String getMediationNetwork(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[RD]: " + str;
    }

    @Override // com.appsflyer.internal.AFc1dSDK
    @NotNull
    public final String getMonetizationNetwork() {
        AFj1kSDK aFj1kSDK = new AFj1kSDK(this.AFAdRevenueData, null, 2, null);
        return aFj1kSDK.AFAdRevenueData(aFj1kSDK.getMonetizationNetwork.getRevenue(AFj1kSDK.areAllFieldsValid));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private AFd1nSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull byte[] bArr, @Nullable Map<String, String> map, int i10) {
        super(bArr, map, i10);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFAdRevenueData = aFc1kSDK;
        this.component4 = AFd1hSDK.OCTET_STREAM;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFd1nSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull byte[] bArr) {
        this(aFc1kSDK, bArr, null, 0, 12, null);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(bArr, "");
    }
}
