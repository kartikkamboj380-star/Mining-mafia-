package com.appsflyer.internal;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.collections.AbstractC7024j;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1pSDK {
    @NotNull
    public static final String AFAdRevenueData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return "[Exception Manager]: " + str;
    }

    @Nullable
    public static final Pair<Integer, Integer> getCurrencyIso4217Code(@NotNull String str) {
        String strA;
        String strA2;
        String strA3;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultA = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").a(str);
        if (matchResultA != null) {
            MatchGroup matchGroup = matchResultA.a().get(1);
            Integer intOrNull = (matchGroup == null || (strA3 = matchGroup.a()) == null) ? null : StringsKt.toIntOrNull(strA3);
            MatchGroup matchGroup2 = matchResultA.a().get(3);
            Integer intOrNull2 = (matchGroup2 == null || (strA2 = matchGroup2.a()) == null) ? null : StringsKt.toIntOrNull(strA2);
            MatchGroup matchGroup3 = matchResultA.a().get(4);
            Integer intOrNull3 = (matchGroup3 == null || (strA = matchGroup3.a()) == null) ? null : StringsKt.toIntOrNull(strA);
            if (intOrNull != null) {
                return p129m8.q.a(Integer.valueOf(intOrNull.intValue() * 1000000), Integer.valueOf(((intOrNull.intValue() + 1) * 1000000) - 1));
            }
            if (intOrNull2 != null && intOrNull3 != null) {
                return p129m8.q.a(Integer.valueOf((intOrNull2.intValue() * 1000000) + (intOrNull3.intValue() * 1000)), Integer.valueOf(((intOrNull2.intValue() * 1000000) + ((intOrNull3.intValue() + 1) * 1000)) - 1));
            }
        }
        return null;
    }

    public static final String getMediationNetwork(String str, String str2) throws NoSuchAlgorithmException {
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

    private static boolean getRevenue(@NotNull Object... objArr) {
        Intrinsics.checkNotNullParameter(objArr, "");
        return !AbstractC7024j.t(objArr, null);
    }

    @Nullable
    public static final Pair<Integer, Integer> getMediationNetwork(@NotNull String str) {
        String strA;
        String strA2;
        String strA3;
        String strA4;
        String strA5;
        String strA6;
        Intrinsics.checkNotNullParameter(str, "");
        MatchResult matchResultA = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").a(str);
        if (matchResultA != null) {
            MatchGroup matchGroup = matchResultA.a().get(1);
            Integer intOrNull = (matchGroup == null || (strA6 = matchGroup.a()) == null) ? null : StringsKt.toIntOrNull(strA6);
            MatchGroup matchGroup2 = matchResultA.a().get(2);
            Integer intOrNull2 = (matchGroup2 == null || (strA5 = matchGroup2.a()) == null) ? null : StringsKt.toIntOrNull(strA5);
            MatchGroup matchGroup3 = matchResultA.a().get(3);
            Integer intOrNull3 = (matchGroup3 == null || (strA4 = matchGroup3.a()) == null) ? null : StringsKt.toIntOrNull(strA4);
            MatchGroup matchGroup4 = matchResultA.a().get(4);
            Integer intOrNull4 = (matchGroup4 == null || (strA3 = matchGroup4.a()) == null) ? null : StringsKt.toIntOrNull(strA3);
            MatchGroup matchGroup5 = matchResultA.a().get(5);
            Integer intOrNull5 = (matchGroup5 == null || (strA2 = matchGroup5.a()) == null) ? null : StringsKt.toIntOrNull(strA2);
            MatchGroup matchGroup6 = matchResultA.a().get(6);
            Integer intOrNull6 = (matchGroup6 == null || (strA = matchGroup6.a()) == null) ? null : StringsKt.toIntOrNull(strA);
            Integer num = intOrNull6;
            if (getRevenue(intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6)) {
                Intrinsics.c(intOrNull);
                int iIntValue = intOrNull.intValue() * 1000000;
                Intrinsics.c(intOrNull2);
                int iIntValue2 = iIntValue + (intOrNull2.intValue() * 1000);
                Intrinsics.c(intOrNull3);
                Integer numValueOf = Integer.valueOf(iIntValue2 + intOrNull3.intValue());
                Intrinsics.c(intOrNull4);
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                Intrinsics.c(intOrNull5);
                int iIntValue4 = iIntValue3 + (intOrNull5.intValue() * 1000);
                Intrinsics.c(num);
                return p129m8.q.a(numValueOf, Integer.valueOf(iIntValue4 + num.intValue()));
            }
        }
        return null;
    }
}
