package com.appsflyer.internal;

import java.util.LinkedHashMap;
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
public final class AFa1jSDK {

    @NotNull
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    @Nullable
    final AFa1gSDK AFAdRevenueData;

    @NotNull
    final Map<String, Object> getMonetizationNetwork;

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        @NotNull
        public static AFa1jSDK getCurrencyIso4217Code(@NotNull AFa1gSDK aFa1gSDK) {
            Intrinsics.checkNotNullParameter(aFa1gSDK, "");
            return new AFa1jSDK(new LinkedHashMap(), aFa1gSDK, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static AFa1jSDK getMediationNetwork(@NotNull AFh1sSDK aFh1sSDK) {
            Intrinsics.checkNotNullParameter(aFh1sSDK, "");
            Map<String, Object> map = aFh1sSDK.AFAdRevenueData;
            Intrinsics.checkNotNullExpressionValue(map, "");
            return new AFa1jSDK(map, null, 2, 0 == true ? 1 : 0);
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFa1jSDK(Map<String, Object> map, AFa1gSDK aFa1gSDK) {
        this.getMonetizationNetwork = map;
        this.AFAdRevenueData = aFa1gSDK;
    }

    @NotNull
    public static final AFa1jSDK getRevenue(@NotNull AFh1sSDK aFh1sSDK) {
        return AFa1ySDK.getMediationNetwork(aFh1sSDK);
    }

    public final boolean getCurrencyIso4217Code(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.getMonetizationNetwork.containsKey(str);
    }

    public final void getMediationNetwork(@NotNull String str, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getMonetizationNetwork.put(str, obj);
        AFa1gSDK aFa1gSDK = this.AFAdRevenueData;
        if (aFa1gSDK != null) {
            aFa1gSDK.getMonetizationNetwork(this.getMonetizationNetwork);
        }
    }

    @NotNull
    public static final AFa1jSDK getMediationNetwork(@NotNull AFa1gSDK aFa1gSDK) {
        return AFa1ySDK.getCurrencyIso4217Code(aFa1gSDK);
    }

    /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? null : aFa1gSDK);
    }

    public /* synthetic */ AFa1jSDK(Map map, AFa1gSDK aFa1gSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFa1gSDK);
    }
}
