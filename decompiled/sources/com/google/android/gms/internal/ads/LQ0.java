package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class LQ0 extends B9 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JY0 f20464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C5637wZ0 f20466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f20467i;

    private LQ0(int i10, Throwable th, int i11) {
        this(i10, th, null, i11, null, -1, null, 4, null, false);
    }

    public static LQ0 a(IOException iOException, int i10) {
        return new LQ0(0, iOException, i10);
    }

    public static LQ0 b(Throwable th, String str, int i10, JY0 jy0, int i11, C5637wZ0 c5637wZ0, boolean z9, int i12) {
        if (jy0 == null) {
            i11 = 4;
        }
        return new LQ0(1, th, null, i12, str, i10, jy0, i11, c5637wZ0, z9);
    }

    public static LQ0 c(RuntimeException runtimeException, int i10) {
        return new LQ0(2, runtimeException, i10);
    }

    final LQ0 d(C5637wZ0 c5637wZ0) {
        String message = getMessage();
        String str = AbstractC4634ob0.f32117a;
        return new LQ0(message, getCause(), this.f17515a, this.f20461c, this.f20462d, this.f20463e, this.f20464f, this.f20465g, c5637wZ0, this.f17516b, this.f20467i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private LQ0(int i10, Throwable th, String str, int i11, String str2, int i12, JY0 jy0, int i13, C5637wZ0 c5637wZ0, boolean z9) {
        String str3;
        int i14;
        String string;
        String str4;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            string = "Source error";
        } else if (i10 != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(jy0);
            String str5 = AbstractC4634ob0.f32117a;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 14 + String.valueOf(i12).length() + 9 + strValueOf.length() + 19 + str4.length());
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i14 = i12;
            sb.append(i14);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i11, i10, str3, i14, jy0, i13, c5637wZ0, SystemClock.elapsedRealtime(), z9);
    }

    private LQ0(String str, Throwable th, int i10, int i11, String str2, int i12, JY0 jy0, int i13, C5637wZ0 c5637wZ0, long j10, boolean z9) {
        boolean z10;
        super(str, th, i10, Bundle.EMPTY, j10);
        if (!z9) {
            z10 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z10 = true;
        } else {
            z10 = false;
        }
        AbstractC2418Ss0.a(z10);
        AbstractC2418Ss0.a(th != null);
        this.f20461c = i11;
        this.f20462d = str2;
        this.f20463e = i12;
        this.f20464f = jy0;
        this.f20465g = i13;
        this.f20466h = c5637wZ0;
        this.f20467i = z9;
    }
}
