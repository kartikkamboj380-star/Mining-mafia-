package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2797a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f26369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C4819q4[] f26370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f26371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f26372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String[] f26373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AbstractC2022Lc[] f26374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f26375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f26376j;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
    }

    public C2797a(long j10) {
        this(0L, -1, -1, new int[0], new C4819q4[0], new long[0], 0L, false, new String[0], new AbstractC2022Lc[0], false);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f26371e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final C2797a b(int i10) {
        int[] iArr = this.f26371e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f26372f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        C4819q4[] c4819q4Arr = (C4819q4[]) Arrays.copyOf(this.f26370d, 0);
        String[] strArr = (String[]) Arrays.copyOf(this.f26373g, 0);
        AbstractC2022Lc[] abstractC2022LcArr = this.f26374h;
        return new C2797a(0L, 0, -1, iArrCopyOf, c4819q4Arr, jArrCopyOf, 0L, false, strArr, (AbstractC2022Lc[]) Arrays.copyOf(abstractC2022LcArr, Math.max(0, abstractC2022LcArr.length)), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C2797a.class == obj.getClass()) {
            C2797a c2797a = (C2797a) obj;
            if (this.f26368b == c2797a.f26368b && Arrays.equals(this.f26370d, c2797a.f26370d) && Arrays.equals(this.f26371e, c2797a.f26371e) && Arrays.equals(this.f26372f, c2797a.f26372f) && Arrays.equals(this.f26373g, c2797a.f26373g) && Arrays.equals(this.f26374h, c2797a.f26374h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.f26368b * 31) - 1) * 961) + Arrays.hashCode(this.f26370d)) * 31) + Arrays.hashCode(this.f26371e)) * 31) + Arrays.hashCode(this.f26372f)) * 29791) + Arrays.hashCode(this.f26373g)) * 31) + Arrays.hashCode(this.f26374h)) * 31;
    }

    private C2797a(long j10, int i10, int i11, int[] iArr, C4819q4[] c4819q4Arr, long[] jArr, long j11, boolean z9, String[] strArr, AbstractC2022Lc[] abstractC2022LcArr, boolean z10) {
        Uri uri;
        int length = iArr.length;
        int length2 = c4819q4Arr.length;
        int i12 = 0;
        AbstractC2418Ss0.a(length == length2);
        AbstractC2418Ss0.a(length == abstractC2022LcArr.length);
        this.f26367a = 0L;
        this.f26368b = i10;
        this.f26371e = iArr;
        this.f26370d = c4819q4Arr;
        this.f26372f = jArr;
        this.f26375i = 0L;
        this.f26376j = false;
        this.f26369c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f26369c;
            if (i12 >= uriArr.length) {
                this.f26373g = strArr;
                this.f26374h = abstractC2022LcArr;
                return;
            }
            C4819q4 c4819q4 = c4819q4Arr[i12];
            if (c4819q4 == null) {
                uri = null;
            } else {
                C4563o2 c4563o2 = c4819q4.f32557b;
                c4563o2.getClass();
                uri = c4563o2.f31932a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }
}
