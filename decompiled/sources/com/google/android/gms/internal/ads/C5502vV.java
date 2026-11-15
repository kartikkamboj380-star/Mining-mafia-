package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.vV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5502vV extends AbstractC4747pV {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f34082g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f34083h = 1;

    C5502vV(Context context) {
        this.f32405f = new C2569Vq(context, G4.t.w().a(), this, this);
    }

    public final com.google.common.util.concurrent.p c(C5420ur c5420ur) {
        synchronized (this.f32401b) {
            try {
                int i10 = this.f34083h;
                if (i10 != 1 && i10 != 2) {
                    return AbstractC5685wx0.c(new FV(2));
                }
                if (this.f32402c) {
                    return this.f32400a;
                }
                this.f34083h = 2;
                this.f32402c = true;
                this.f32404e = c5420ur;
                this.f32405f.checkAvailabilityAndConnect();
                C2575Vt c2575Vt = this.f32400a;
                c2575Vt.e(new Runnable() { // from class: com.google.android.gms.internal.ads.uV
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f33831a.a();
                    }
                }, AbstractC2315Qt.f22479g);
                return c2575Vt;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.common.util.concurrent.p d(String str) {
        synchronized (this.f32401b) {
            try {
                int i10 = this.f34083h;
                if (i10 != 1 && i10 != 3) {
                    return AbstractC5685wx0.c(new FV(2));
                }
                if (this.f32402c) {
                    return this.f32400a;
                }
                this.f34083h = 3;
                this.f32402c = true;
                this.f34082g = str;
                this.f32405f.checkAvailabilityAndConnect();
                C2575Vt c2575Vt = this.f32400a;
                c2575Vt.e(new Runnable() { // from class: com.google.android.gms.internal.ads.tV
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f33421a.a();
                    }
                }, AbstractC2315Qt.f22479g);
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
                        int i10 = this.f34083h;
                        if (i10 == 2) {
                            this.f32405f.c().K1(this.f32404e, ((Boolean) H4.B.c().d(AbstractC3892ii.ve)).booleanValue() ? new BinderC4621oV(this.f32400a, this.f32404e) : new BinderC4495nV(this));
                        } else if (i10 == 3) {
                            this.f32405f.c().G3(this.f34082g, ((Boolean) H4.B.c().d(AbstractC3892ii.ve)).booleanValue() ? new BinderC4621oV(this.f32400a, this.f32404e) : new BinderC4495nV(this));
                        } else {
                            this.f32400a.c(new FV(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f32400a.c(new FV(1));
                    } catch (Throwable th) {
                        G4.t.l().j(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
