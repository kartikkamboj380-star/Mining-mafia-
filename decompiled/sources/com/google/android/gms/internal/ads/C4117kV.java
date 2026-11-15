package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.kV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4117kV extends AbstractC4747pV {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f30809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L4.a f30810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceC3991jV f30811i;

    C4117kV(Context context, L4.a aVar, InterfaceC3991jV interfaceC3991jV, C2621Wq c2621Wq) {
        this.f30809g = context;
        this.f30810h = aVar;
        this.f30811i = interfaceC3991jV;
    }

    public final void c() {
        synchronized (this.f32401b) {
            try {
                if (this.f32402c) {
                    return;
                }
                this.f32402c = true;
                C2569Vq c2569Vq = new C2569Vq(this.f30809g, G4.t.w().a(), this, this);
                this.f32405f = c2569Vq;
                c2569Vq.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.f32401b) {
            if (!this.f32403d) {
                this.f32403d = true;
                try {
                    this.f32405f.c().M(this.f30810h.f3097a);
                    this.f30811i.zza();
                } catch (RemoteException e10) {
                    this.f30811i.a(e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4747pV, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        super.onConnectionFailed(connectionResult);
        this.f30811i.a(new RemoteException("Connection failed: ".concat(String.valueOf(connectionResult.getErrorMessage()))));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4747pV, com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
        int i11 = AbstractC0786o0.f2696b;
        L4.p.a("Cannot connect to remote service, fallback to local instance.");
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 33);
        sb.append("Connection suspended with cause: ");
        sb.append(i10);
        this.f30811i.a(new RemoteException(sb.toString()));
    }
}
