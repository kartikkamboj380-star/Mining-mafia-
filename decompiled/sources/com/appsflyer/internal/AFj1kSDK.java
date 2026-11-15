package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
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
public final class AFj1kSDK {

    @NotNull
    public static final String AFAdRevenueData;

    @NotNull
    public static final String areAllFieldsValid;

    @NotNull
    public static final String component1;

    @NotNull
    public static final String component2;

    @NotNull
    public static final String component3;

    @NotNull
    public static final String component4;

    @NotNull
    private static final String copy;

    @NotNull
    public static final String getCurrencyIso4217Code;

    @NotNull
    public static final AFa1uSDK getMediationNetwork = new AFa1uSDK(null);

    @NotNull
    public static final String getRevenue;

    @NotNull
    private final AFc1kSDK copydefault;

    @NotNull
    public final AFj1bSDK getMonetizationNetwork;

    @Metadata
    public static final class AFa1uSDK {
        private AFa1uSDK() {
        }

        public /* synthetic */ AFa1uSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String str = AFa1tSDK.AFAdRevenueData + "/androidevent?app_id=";
        copy = str;
        getCurrencyIso4217Code = "https://%sattr.%s/api/v" + str;
        AFAdRevenueData = "https://%sadrevenue.%s/api/v2/generic/v6.18.0/android?app_id=";
        getRevenue = "https://%sconversions.%s/api/v" + str;
        component2 = "https://%slaunches.%s/api/v" + str;
        component4 = "https://%sinapps.%s/api/v" + str;
        component3 = "https://%sregister.%s/api/v" + str;
        component1 = "https://%svalidate.%s/api/v" + str;
        areAllFieldsValid = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
    }

    private AFj1kSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull AFj1bSDK aFj1bSDK) {
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFj1bSDK, "");
        this.copydefault = aFc1kSDK;
        this.getMonetizationNetwork = aFj1bSDK;
    }

    public static String getMediationNetwork(String str, boolean z9) {
        return str + (!z9 ? "&buildnumber=6.18.0" : "");
    }

    public final String AFAdRevenueData(String str) {
        return str + this.copydefault.getRevenue.getCurrencyIso4217Code.getPackageName();
    }

    @NotNull
    public final String getCurrencyIso4217Code(@Nullable String str, @Nullable String str2) {
        String packageName = this.copydefault.getRevenue.getCurrencyIso4217Code.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        String strComponent1 = this.copydefault.component1();
        if (strComponent1 != null && !StringsKt.b0(strComponent1)) {
            strComponent1 = "-" + StringsKt.U0(strComponent1).toString();
        }
        if (strComponent1 == null) {
            strComponent1 = "";
        }
        String string = StringsKt.U0(strComponent1).toString();
        Uri.Builder builderAppendPath = Uri.parse(this.getMonetizationNetwork.getRevenue("https://%sdlsdk.%s/v1.0/android/")).buildUpon().appendPath(packageName + string);
        Intrinsics.checkNotNullExpressionValue(builderAppendPath, "");
        if (str == null || str2 == null) {
            String str3 = str == null ? "devKey" : "timestamp";
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, str3 + " is null at attempt to generate ddl event url", new IllegalStateException(str3 + " is null"), true, false, false, true);
        } else {
            builderAppendPath.appendQueryParameter("af_sig", AFj1jSDK.getCurrencyIso4217Code(str2 + str, str));
        }
        String string2 = builderAppendPath.appendQueryParameter("sdk_version", AFa1tSDK.AFAdRevenueData).build().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "");
        return string2;
    }

    public final String getRevenue(String str, boolean z9) {
        String str2;
        if (z9) {
            return str;
        }
        String strComponent1 = this.copydefault.component1();
        if (strComponent1 != null) {
            str2 = "&channel=" + strComponent1;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return str + str2;
    }

    public /* synthetic */ AFj1kSDK(AFc1kSDK aFc1kSDK, AFj1bSDK aFj1bSDK, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFc1kSDK, (i10 & 2) != 0 ? new AFj1fSDK() : aFj1bSDK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AFj1kSDK(@NotNull AFc1kSDK aFc1kSDK) {
        this(aFc1kSDK, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
    }
}
