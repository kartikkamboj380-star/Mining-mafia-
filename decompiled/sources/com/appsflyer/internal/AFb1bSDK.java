package com.appsflyer.internal;

import android.content.Context;
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
/* JADX INFO: loaded from: classes.dex */
@Metadata
public interface AFb1bSDK {

    @NotNull
    public static final AFa1vSDK AFa1vSDK = AFa1vSDK.getRevenue;

    public static final class AFa1vSDK {
        static final /* synthetic */ AFa1vSDK getRevenue = new AFa1vSDK();
        private static long AFAdRevenueData = 500;

        private AFa1vSDK() {
        }

        public static long getRevenue() {
            return AFAdRevenueData;
        }
    }

    public interface AFa1zSDK {
        void getCurrencyIso4217Code();

        void getMediationNetwork(@NotNull AFh1oSDK aFh1oSDK);
    }

    void getMediationNetwork();

    void getMonetizationNetwork(@NotNull Context context, @NotNull AFa1zSDK aFa1zSDK);

    boolean getMonetizationNetwork();
}
