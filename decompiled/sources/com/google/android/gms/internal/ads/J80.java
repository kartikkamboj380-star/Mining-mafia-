package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class J80 implements InterfaceC4739pR {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f19769b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f19770a;

    public J80(Handler handler) {
        this.f19770a = handler;
    }

    static /* synthetic */ void l(C3822i80 c3822i80) {
        List list = f19769b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c3822i80);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static C3822i80 m() {
        C3822i80 c3822i80;
        List list = f19769b;
        synchronized (list) {
            try {
                c3822i80 = list.isEmpty() ? new C3822i80(null) : (C3822i80) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3822i80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final void E(int i10) {
        this.f19770a.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final OQ G(int i10) {
        Handler handler = this.f19770a;
        C3822i80 c3822i80M = m();
        c3822i80M.a(handler.obtainMessage(i10), this);
        return c3822i80M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean a(int i10, int i11) {
        return this.f19770a.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean b(int i10) {
        return this.f19770a.hasMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final OQ c(int i10, int i11, int i12) {
        Handler handler = this.f19770a;
        C3822i80 c3822i80M = m();
        c3822i80M.a(handler.obtainMessage(i10, i11, i12), this);
        return c3822i80M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean d(int i10, long j10) {
        return this.f19770a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean e(Runnable runnable, long j10) {
        return this.f19770a.postDelayed(runnable, 1000L);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean f(OQ oq) {
        return ((C3822i80) oq).b(this.f19770a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean g(Runnable runnable) {
        return this.f19770a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final void h(Object obj) {
        this.f19770a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final void i(Runnable runnable) {
        this.f19770a.removeCallbacks(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final OQ j(int i10, Object obj) {
        Handler handler = this.f19770a;
        C3822i80 c3822i80M = m();
        c3822i80M.a(handler.obtainMessage(i10, obj), this);
        return c3822i80M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final OQ k(int i10, int i11, int i12, Object obj) {
        Handler handler = this.f19770a;
        C3822i80 c3822i80M = m();
        c3822i80M.a(handler.obtainMessage(31, 0, 0, obj), this);
        return c3822i80M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final boolean x(int i10) {
        return this.f19770a.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4739pR
    public final Looper zza() {
        return this.f19770a.getLooper();
    }
}
