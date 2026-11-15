package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4998rV extends AbstractC4747pV {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f32911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f32912h;

    C4998rV(Context context, Executor executor) {
        this.f32911g = context;
        this.f32912h = executor;
        this.f32405f = new C2569Vq(context, G4.t.w().a(), this, this);
    }

    public final com.google.common.util.concurrent.p c(C5420ur c5420ur) {
        synchronized (this.f32401b) {
            try {
                if (this.f32402c) {
                    return this.f32400a;
                }
                this.f32402c = true;
                this.f32404e = c5420ur;
                this.f32405f.checkAvailabilityAndConnect();
                C2575Vt c2575Vt = this.f32400a;
                c2575Vt.e(new Runnable() { // from class: com.google.android.gms.internal.ads.qV
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f32648a.a();
                    }
                }, AbstractC2315Qt.f22479g);
                AbstractC4747pV.b(this.f32911g, c2575Vt, this.f32912h);
                return c2575Vt;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f32401b) {
            try {
                if (!this.f32403d) {
                    this.f32403d = true;
                    try {
                        this.f32405f.c().b2(this.f32404e, ((Boolean) H4.B.c().d(AbstractC3892ii.ve)).booleanValue() ? new BinderC4621oV(this.f32400a, this.f32404e) : new BinderC4495nV(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f32400a.c(new FV(1));
                    } catch (Throwable th) {
                        G4.t.l().j(th, "RemoteSignalsClientTask.onConnected");
                        this.f32400a.c(new FV(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
