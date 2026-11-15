package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

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
public final class AFc1bSDK {

    @NotNull
    public static final AFa1tSDK AFa1tSDK = new AFa1tSDK(null);
    int AFAdRevenueData;

    @NotNull
    final String getMediationNetwork;

    @NotNull
    public String getMonetizationNetwork;

    @NotNull
    public String getRevenue;

    @Metadata
    public static final class AFa1tSDK {
        private AFa1tSDK() {
        }

        @Nullable
        public static AFc1bSDK AFAdRevenueData(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<String> listSplit$default = StringsKt.split$default(str, new String[]{"\n"}, false, 0, 6, null);
            if (listSplit$default.size() != 4) {
                return null;
            }
            String strAFAdRevenueData = null;
            String strAFAdRevenueData2 = null;
            String strAFAdRevenueData3 = null;
            Integer numValueOf = null;
            for (String str2 : listSplit$default) {
                if (StringsKt.J(str2, "label=", false, 2, null)) {
                    strAFAdRevenueData = AFAdRevenueData(str2, "label=");
                } else if (StringsKt.J(str2, "hashName=", false, 2, null)) {
                    strAFAdRevenueData2 = AFAdRevenueData(str2, "hashName=");
                } else if (!StringsKt.J(str2, "stackTrace=", false, 2, null)) {
                    if (!StringsKt.J(str2, "c=", false, 2, null)) {
                        break;
                    }
                    String strSubstring = str2.substring(2);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.U0(strSubstring).toString()));
                } else {
                    strAFAdRevenueData3 = AFAdRevenueData(str2, "stackTrace=");
                }
            }
            if (getMediationNetwork(numValueOf, strAFAdRevenueData, strAFAdRevenueData2, strAFAdRevenueData3)) {
                return null;
            }
            Intrinsics.c(strAFAdRevenueData);
            Intrinsics.c(strAFAdRevenueData2);
            Intrinsics.c(strAFAdRevenueData3);
            Intrinsics.c(numValueOf);
            return new AFc1bSDK(strAFAdRevenueData, strAFAdRevenueData2, strAFAdRevenueData3, numValueOf.intValue());
        }

        private static boolean getMediationNetwork(Integer num, String... strArr) {
            boolean z9 = num == null;
            int length = strArr.length;
            for (int i10 = 0; i10 < 3; i10++) {
                String str = strArr[i10];
                z9 = z9 || str == null || str.length() == 0;
            }
            return z9;
        }

        public /* synthetic */ AFa1tSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFAdRevenueData(String str, String str2) {
            String strSubstring = str.substring(str2.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            String string = StringsKt.U0(strSubstring).toString();
            Intrinsics.checkNotNullParameter(string, "");
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Intrinsics.checkNotNullParameter(bytes, "");
            byte[] bArrDecode = Base64.decode(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
            return new String(bArrDecode, charset);
        }
    }

    public AFc1bSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.getRevenue = str;
        this.getMediationNetwork = str2;
        this.getMonetizationNetwork = str3;
        this.AFAdRevenueData = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) obj;
        return Intrinsics.b(this.getRevenue, aFc1bSDK.getRevenue) && Intrinsics.b(this.getMediationNetwork, aFc1bSDK.getMediationNetwork) && Intrinsics.b(this.getMonetizationNetwork, aFc1bSDK.getMonetizationNetwork) && this.AFAdRevenueData == aFc1bSDK.AFAdRevenueData;
    }

    @NotNull
    public final JSONObject getMonetizationNetwork() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", this.getRevenue);
        jSONObject.put("hash_name", this.getMediationNetwork);
        jSONObject.put("st", this.getMonetizationNetwork);
        jSONObject.put("c", String.valueOf(this.AFAdRevenueData));
        return jSONObject;
    }

    @NotNull
    public final String getRevenue() {
        String str = this.getRevenue;
        Intrinsics.checkNotNullParameter(str, "");
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMediationNetwork;
        Intrinsics.checkNotNullParameter(str2, "");
        byte[] bytes2 = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "");
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.getMonetizationNetwork;
        Intrinsics.checkNotNullParameter(str3, "");
        byte[] bytes3 = str3.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes3, "");
        return "label=" + strEncodeToString + "\nhashName=" + strEncodeToString2 + "\nstackTrace=" + Base64.encodeToString(bytes3, 2) + "\nc=" + this.AFAdRevenueData;
    }

    public final int hashCode() {
        return (((((this.getRevenue.hashCode() * 31) + this.getMediationNetwork.hashCode()) * 31) + this.getMonetizationNetwork.hashCode()) * 31) + Integer.hashCode(this.AFAdRevenueData);
    }

    @NotNull
    public final String toString() {
        return "ExceptionInfo(label=" + this.getRevenue + ", hashName=" + this.getMediationNetwork + ", stackTrace=" + this.getMonetizationNetwork + ", counter=" + this.AFAdRevenueData + ")";
    }

    public /* synthetic */ AFc1bSDK(String str, String str2, String str3, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 1 : i10);
    }
}
