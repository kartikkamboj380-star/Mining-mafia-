package O;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: renamed from: O.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C0841a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f3789a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f3790b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3791c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3792d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3793e = 0;

    C0841a0() {
    }

    private void b() {
        this.f3792d = 0;
        this.f3791c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f3792d;
        if (i10 < 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i11 = this.f3793e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f3790b[i11];
        while (true) {
            jArr = this.f3790b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f3792d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f3792d;
        if (i13 < 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            long j12 = jArr[i14];
            return j10 == j12 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f3789a[i14] / (j12 - j10);
        }
        float fAbs = 0.0f;
        int i15 = 0;
        for (int i16 = 0; i16 < this.f3792d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f3790b;
            long j13 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j13) {
                i15++;
                float f10 = f(fAbs);
                float f11 = this.f3789a[i18] / (this.f3790b[i18] - j13);
                fAbs += (f11 - f10) * Math.abs(f11);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f10) {
        return (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f3792d != 0 && eventTime - this.f3790b[this.f3793e] > 40) {
            b();
        }
        int i10 = (this.f3793e + 1) % 20;
        this.f3793e = i10;
        int i11 = this.f3792d;
        if (i11 != 20) {
            this.f3792d = i11 + 1;
        }
        this.f3789a[i10] = motionEvent.getAxisValue(26);
        this.f3790b[this.f3793e] = eventTime;
    }

    void c(int i10, float f10) {
        float fE = e() * i10;
        this.f3791c = fE;
        if (fE < (-Math.abs(f10))) {
            this.f3791c = -Math.abs(f10);
        } else if (this.f3791c > Math.abs(f10)) {
            this.f3791c = Math.abs(f10);
        }
    }

    float d(int i10) {
        return i10 != 26 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f3791c;
    }
}
