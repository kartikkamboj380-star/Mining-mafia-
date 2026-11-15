package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
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
public final class AFa1zSDK {

    @NotNull
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    public static final void getCurrencyIso4217Code(@NotNull AFc1fSDK aFc1fSDK, @NotNull AFc1kSDK aFc1kSDK) {
        int i10;
        Intrinsics.checkNotNullParameter(aFc1fSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1pSDK.getMonetizationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
            i10 = 23;
        } else {
            i10 = 18;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < i10 || appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
            AFLogger.afRDLog("OS SDK is=" + i11 + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i11 + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(aFc1fSDK.getCurrencyIso4217Code);
        if (aFKeystoreWrapper.getMediationNetwork()) {
            String revenue = aFKeystoreWrapper.getRevenue();
            synchronized (aFKeystoreWrapper.getMediationNetwork) {
                aFKeystoreWrapper.getMonetizationNetwork++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(revenue)));
                try {
                    synchronized (aFKeystoreWrapper.getMediationNetwork) {
                        aFKeystoreWrapper.getRevenue.deleteEntry(revenue);
                    }
                } catch (KeyStoreException e10) {
                    StringBuilder sb = new StringBuilder("Exception ");
                    sb.append(e10.getMessage());
                    sb.append(" occurred");
                    AFLogger.afErrorLog(sb.toString(), e10);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
        } else {
            aFKeystoreWrapper.AFAdRevenueData = AFb1iSDK.getCurrencyIso4217Code(aFc1kSDK.getCurrencyIso4217Code);
            aFKeystoreWrapper.getMonetizationNetwork = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getRevenue());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.AFAdRevenueData());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getCurrencyIso4217Code()));
    }

    @Nullable
    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    @Nullable
    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
