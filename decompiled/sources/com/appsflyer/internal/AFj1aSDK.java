package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1aSDK {
    public static final String AFAdRevenueData(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        String str3 = "";
        for (byte b10 : bArrDigest) {
            String str4 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            Intrinsics.checkNotNullExpressionValue(str4, "");
            str3 = str3 + str4;
        }
        return str3;
    }

    public static final int AFAdRevenueData(@NotNull String str) {
        String strA;
        Integer intOrNull;
        String strA2;
        Integer intOrNull2;
        String strA3;
        Integer intOrNull3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultA = new Regex("(\\d+).(\\d+).(\\d+).*").a(str);
        if (matchResultA == null) {
            return -1;
        }
        MatchGroup matchGroup = matchResultA.a().get(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroup == null || (strA3 = matchGroup.a()) == null || (intOrNull3 = StringsKt.toIntOrNull(strA3)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroup2 = matchResultA.a().get(2);
        int iIntValue3 = iIntValue2 + (((matchGroup2 == null || (strA2 = matchGroup2.a()) == null || (intOrNull2 = StringsKt.toIntOrNull(strA2)) == null) ? 0 : intOrNull2.intValue()) * 1000);
        MatchGroup matchGroup3 = matchResultA.a().get(3);
        if (matchGroup3 != null && (strA = matchGroup3.a()) != null && (intOrNull = StringsKt.toIntOrNull(strA)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }
}
