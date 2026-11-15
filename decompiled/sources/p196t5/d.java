package p196t5;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f49677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f49679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f49680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49681e;

    public d(long j10, long j11) {
        this.f49679c = null;
        this.f49680d = 0;
        this.f49681e = 1;
        this.f49677a = j10;
        this.f49678b = j11;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f49680d = valueAnimator.getRepeatCount();
        dVar.f49681e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f49671b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f49672c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f49673d : interpolator;
    }

    public long b() {
        return this.f49677a;
    }

    public long c() {
        return this.f49678b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f49679c;
        return timeInterpolator != null ? timeInterpolator : a.f49671b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f49680d;
    }

    public int g() {
        return this.f49681e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f49680d = 0;
        this.f49681e = 1;
        this.f49677a = j10;
        this.f49678b = j11;
        this.f49679c = timeInterpolator;
    }
}
