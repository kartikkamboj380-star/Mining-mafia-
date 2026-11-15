package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3122ca {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C3122ca f27149d = new C3122ca(1.0f, 1.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27152c;

    static {
        String str = AbstractC4634ob0.f32117a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public C3122ca(float f10, float f11) {
        AbstractC2418Ss0.a(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AbstractC2418Ss0.a(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f27150a = f10;
        this.f27151b = f11;
        this.f27152c = Math.round(f10 * 1000.0f);
    }

    public final long a(long j10) {
        return j10 * ((long) this.f27152c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3122ca.class == obj.getClass()) {
            C3122ca c3122ca = (C3122ca) obj;
            if (this.f27150a == c3122ca.f27150a && this.f27151b == c3122ca.f27151b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f27150a) + 527) * 31) + Float.floatToRawIntBits(this.f27151b);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f27150a), Float.valueOf(this.f27151b)};
        String str = AbstractC4634ob0.f32117a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
