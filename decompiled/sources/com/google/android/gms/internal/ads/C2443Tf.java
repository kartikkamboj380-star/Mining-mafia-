package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2443Tf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1872If f23587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f23588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f23589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f23590d = new Object();

    C2443Tf(Context context) {
        this.f23589c = context;
    }

    final Future a(C1924Jf c1924Jf) {
        C2131Nf c2131Nf = new C2131Nf(this);
        C2339Rf c2339Rf = new C2339Rf(this, c1924Jf, c2131Nf);
        C2391Sf c2391Sf = new C2391Sf(this, c2131Nf);
        synchronized (this.f23590d) {
            C1872If c1872If = new C1872If(this.f23589c, G4.t.w().a(), c2339Rf, c2391Sf);
            this.f23587a = c1872If;
            c1872If.checkAvailabilityAndConnect();
        }
        return c2131Nf;
    }

    final /* synthetic */ void b() {
        synchronized (this.f23590d) {
            try {
                C1872If c1872If = this.f23587a;
                if (c1872If == null) {
                    return;
                }
                c1872If.disconnect();
                this.f23587a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ C1872If c() {
        return this.f23587a;
    }

    final /* synthetic */ boolean d() {
        return this.f23588b;
    }

    final /* synthetic */ void e(boolean z9) {
        this.f23588b = true;
    }

    final /* synthetic */ Object f() {
        return this.f23590d;
    }
}
