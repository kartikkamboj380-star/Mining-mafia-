package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC6299q0;

/* JADX INFO: loaded from: classes2.dex */
public final class N5 extends AbstractC6530f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f37640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37641d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final M5 f37642e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final L5 f37643f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final I5 f37644g;

    N5(X2 x10) {
        super(x10);
        this.f37641d = true;
        this.f37642e = new M5(this);
        this.f37643f = new L5(this);
        this.f37644g = new I5(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f37640c == null) {
            this.f37640c = new HandlerC6299q0(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6530f2
    protected final boolean m() {
        return false;
    }

    final void o(boolean z9) {
        h();
        this.f37641d = z9;
    }

    final boolean p() {
        h();
        return this.f37641d;
    }

    final /* synthetic */ void r(long j10) {
        h();
        q();
        X2 x10 = this.f37374a;
        x10.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (x10.w().H(null, AbstractC6514d2.f37947V0)) {
            if (x10.w().N() || this.f37641d) {
                this.f37643f.a(j10);
            }
        } else if (x10.w().N() || x10.x().f37494t.a()) {
            this.f37643f.a(j10);
        }
        this.f37644g.a();
        M5 m10 = this.f37642e;
        N5 n10 = m10.f37628a;
        n10.h();
        if (n10.f37374a.g()) {
            m10.b(n10.f37374a.e().currentTimeMillis(), false);
        }
    }

    final /* synthetic */ void s(long j10) {
        h();
        q();
        X2 x10 = this.f37374a;
        x10.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f37644g.b(j10);
        if (x10.w().N()) {
            this.f37643f.b(j10);
        }
    }

    final /* synthetic */ Handler t() {
        return this.f37640c;
    }
}
