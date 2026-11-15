package C5;

import H5.b;
import android.content.Context;
import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f377f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f382e;

    public a(Context context) {
        this(b.b(context, p186s5.a.f48642x, false), p256z5.a.b(context, p186s5.a.f48641w, 0), p256z5.a.b(context, p186s5.a.f48640v, 0), p256z5.a.b(context, p186s5.a.f48637s, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return F.a.k(i10, 255) == this.f381d;
    }

    public float a(float f10) {
        float f11 = this.f382e;
        return (f11 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = p256z5.a.j(F.a.k(i10, 255), this.f379b, fA);
        if (fA > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i11 = this.f380c) != 0) {
            iJ = p256z5.a.i(iJ, F.a.k(i11, f377f));
        }
        return F.a.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f378a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f378a;
    }

    public a(boolean z9, int i10, int i11, int i12, float f10) {
        this.f378a = z9;
        this.f379b = i10;
        this.f380c = i11;
        this.f381d = i12;
        this.f382e = f10;
    }
}
