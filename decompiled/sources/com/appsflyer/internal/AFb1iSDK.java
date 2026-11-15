package com.appsflyer.internal;

import java.security.SecureRandom;
import kotlin.Metadata;
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
public final class AFb1iSDK {

    @Nullable
    private static String AFAdRevenueData;

    @NotNull
    public static final AFb1iSDK INSTANCE = new AFb1iSDK();

    private AFb1iSDK() {
    }

    public static final synchronized void getCurrencyIso4217Code(@NotNull String str, @NotNull AFc1jSDK aFc1jSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFc1jSDK, "");
        AFAdRevenueData = str;
        aFc1jSDK.getRevenue("CUSTOM_INSTALL_ID_APPLIED", true);
        aFc1jSDK.getMediationNetwork("AF_INSTALLATION", str);
    }

    @NotNull
    public static final synchronized String getCurrencyIso4217Code(@NotNull AFc1jSDK aFc1jSDK) {
        String str;
        try {
            Intrinsics.checkNotNullParameter(aFc1jSDK, "");
            if (AFAdRevenueData == null) {
                String revenue = aFc1jSDK.getRevenue("AF_INSTALLATION", (String) null);
                if (revenue == null) {
                    revenue = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
                    aFc1jSDK.getMediationNetwork("AF_INSTALLATION", revenue);
                }
                AFAdRevenueData = revenue;
            }
            str = AFAdRevenueData;
            Intrinsics.c(str);
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
