package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.iV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3867iV extends AbstractC4747pV {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f29424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Executor f29425h;

    public C3867iV(Context context, Executor executor) {
        this.f29424g = context;
        this.f29425h = executor;
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
                c2575Vt.e(new Runnable() { // from class: com.google.android.gms.internal.ads.hV
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f29007a.a();
                    }
                }, AbstractC2315Qt.f22479g);
                AbstractC4747pV.b(this.f29424g, c2575Vt, this.f29425h);
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
                        this.f32405f.c().X0(this.f32404e, ((Boolean) H4.B.c().d(AbstractC3892ii.ve)).booleanValue() ? new BinderC4621oV(this.f32400a, this.f32404e) : new BinderC4495nV(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f32400a.c(new FV(1));
                    } catch (Throwable th) {
                        G4.t.l().j(th, "RemoteAdRequestClientTask.onConnected");
                        this.f32400a.c(new FV(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4747pV, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i10 = AbstractC0786o0.f2696b;
        L4.p.a("Cannot connect to remote service, fallback to local instance.");
        this.f32400a.c(new FV(1));
    }
}
