package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
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
public final class AFc1pSDK implements AFc1jSDK {

    @NotNull
    private final AFc1eSDK<SharedPreferences> getMonetizationNetwork;

    @NotNull
    private final Lazy getRevenue;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1pSDK$3, reason: invalid class name */
    @Metadata
    static final class AnonymousClass3 extends kotlin.jvm.internal.m implements Function0<SharedPreferences> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: m_, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
        }
    }

    public AFc1pSDK(@NotNull AFc1eSDK<SharedPreferences> aFc1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        this.getMonetizationNetwork = aFc1eSDK;
        this.getRevenue = p129m8.g.a(new AnonymousClass3());
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final int getCurrencyIso4217Code(@Nullable String str, int i10) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getInt(str, i10);
        } catch (ClassCastException e10) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return i10;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getMediationNetwork(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        return ((SharedPreferences) this.getRevenue.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    @Nullable
    public final String getRevenue(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getString(str, str2);
        } catch (ClassCastException e10) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void AFAdRevenueData(@Nullable String str, int i10) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putInt(str, i10).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final long getMediationNetwork(@Nullable String str, long j10) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getLong(str, j10);
        } catch (ClassCastException e10) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return j10;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getCurrencyIso4217Code(@Nullable String str) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final boolean getRevenue(@Nullable String str) {
        try {
            return ((SharedPreferences) this.getRevenue.getValue()).getBoolean(str, false);
        } catch (ClassCastException e10) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, "Unexpected data type found for key " + str, e10, false, false, false, false, 120, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(@Nullable String str, boolean z9) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putBoolean(str, z9).apply();
    }

    @Override // com.appsflyer.internal.AFc1jSDK
    public final void getRevenue(@Nullable String str, long j10) {
        ((SharedPreferences) this.getRevenue.getValue()).edit().putLong(str, j10).apply();
    }
}
