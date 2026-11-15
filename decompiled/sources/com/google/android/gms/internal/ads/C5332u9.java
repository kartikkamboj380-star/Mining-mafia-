package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Optional;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.u9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5332u9 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public C5332u9(EnumC5206t9 enumC5206t9, EnumC4954r9 enumC4954r9, long j10) {
        int i10 = (((((~2143124030) & 85005376) | 430547086) + ((2143124030 & 878451808) | 1894615585)) - (-2031609844)) ^ (1747844822 % 1617876982);
        Locale locale = Locale.US;
        Object[] objArr = new Object[i10];
        objArr[0] = Long.valueOf(enumC5206t9.c());
        objArr[1] = Long.valueOf(enumC4954r9.c());
        int i11 = (((((~1434433518) & 1229726181) | 671269892) + ((1434433518 & 1096561121) | 546312716)) - 1772679974) ^ (1830539036 % 1290127955);
        Long lValueOf = Long.valueOf(j10);
        objArr[i11] = lValueOf;
        super(String.format(locale, K9.a("bk3t6gFTc30="), objArr));
        Optional.of(enumC4954r9);
        Optional.of(lValueOf);
    }

    public C5332u9(EnumC5206t9 enumC5206t9, Throwable th) {
        super(String.format(Locale.US, K9.a("bk0="), Long.valueOf(enumC5206t9.c())), th);
        Optional.empty();
        Optional.empty();
    }
}
