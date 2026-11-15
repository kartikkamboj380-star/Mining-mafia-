package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2134Ng0 implements InterfaceC1771Gg0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static C2134Ng0 f21315d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f21316a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1511Bg0 f21317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C1719Fg0 f21318c;

    public C2134Ng0(C1563Cg0 c1563Cg0, C5903yg0 c5903yg0) {
    }

    public static C2134Ng0 a() {
        if (f21315d == null) {
            f21315d = new C2134Ng0(new C1563Cg0(), new C5903yg0());
        }
        return f21315d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1771Gg0
    public final void N(boolean z9) {
        if (z9) {
            C4646oh0.b().c();
        } else {
            C4646oh0.b().e();
        }
    }

    public final void b(Context context) {
        this.f21317b = new C1511Bg0(new Handler(), context, new C5651wg0(), this);
    }

    public final void c() {
        C1667Eg0.i().g(this);
        C1667Eg0.i().e();
        C4646oh0.b().c();
        this.f21317b.a();
    }

    public final void d() {
        C4646oh0.b().d();
        C1667Eg0.i().f();
        this.f21317b.b();
    }

    public final void e(float f10) {
        this.f21316a = f10;
        if (this.f21318c == null) {
            this.f21318c = C1719Fg0.a();
        }
        Iterator it = this.f21318c.f().iterator();
        while (it.hasNext()) {
            ((C4266lg0) it.next()).g().o(f10);
        }
    }

    public final float f() {
        return this.f21316a;
    }
}
