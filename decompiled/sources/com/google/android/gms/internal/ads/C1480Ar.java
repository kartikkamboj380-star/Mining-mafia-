package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1480Ar {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1480Ar f17414e = new C1480Ar(null, new C2797a[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2797a f17415f = new C2797a(0).b(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2797a[] f17419d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17417b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17416a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17418c = 0;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    private C1480Ar(Object obj, C2797a[] c2797aArr, long j10, long j11, int i10) {
        this.f17419d = c2797aArr;
    }

    public final C2797a a(int i10) {
        return i10 < 0 ? f17415f : this.f17419d[i10];
    }

    public final boolean b(int i10) {
        a(-1);
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1480Ar.class == obj.getClass() && Arrays.equals(this.f17419d, ((C1480Ar) obj).f17419d);
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f17419d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
