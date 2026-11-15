package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

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
public final class AFg1eSDK extends AFg1hSDK {

    @NotNull
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);

    public /* synthetic */ class AFa1uSDK {
        public static final /* synthetic */ int[] getMediationNetwork;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            try {
                iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            getMediationNetwork = iArr;
        }
    }

    @Metadata
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void AFAdRevenueData(AFLogger.LogLevel logLevel, AFg1cSDK aFg1cSDK, String str, Throwable th) {
        if (AFAdRevenueData(logLevel)) {
            String monetizationNetwork = getMonetizationNetwork(str, aFg1cSDK);
            int i10 = AFa1uSDK.getMediationNetwork[logLevel.ordinal()];
            if (i10 == 1) {
                Log.d("AppsFlyer_6.18.0", monetizationNetwork);
                return;
            }
            if (i10 == 2) {
                Log.i("AppsFlyer_6.18.0", monetizationNetwork);
                return;
            }
            if (i10 == 3) {
                Log.w("AppsFlyer_6.18.0", monetizationNetwork);
            } else if (i10 == 4) {
                Log.v("AppsFlyer_6.18.0", monetizationNetwork);
            } else {
                if (i10 != 5) {
                    return;
                }
                Log.e("AppsFlyer_6.18.0", monetizationNetwork, th);
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void d(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFAdRevenueData(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void e(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, @NotNull Throwable th, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z10) {
            AFAdRevenueData(AFLogger.LogLevel.ERROR, aFg1cSDK, str, th);
        } else if (z9) {
            AFAdRevenueData(AFLogger.LogLevel.DEBUG, aFg1cSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void force(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            return;
        }
        Log.d("AppsFlyer_6.18.0", withTag$SDK_prodRelease(str, aFg1cSDK));
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final boolean getShouldExtendMsg() {
        return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void i(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFAdRevenueData(AFLogger.LogLevel.INFO, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void v(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFAdRevenueData(AFLogger.LogLevel.VERBOSE, aFg1cSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1hSDK
    public final void w(@NotNull AFg1cSDK aFg1cSDK, @NotNull String str, boolean z9) {
        Intrinsics.checkNotNullParameter(aFg1cSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFAdRevenueData(AFLogger.LogLevel.WARNING, aFg1cSDK, str, null);
    }

    private static boolean AFAdRevenueData(AFLogger.LogLevel logLevel) {
        return logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
    }
}
