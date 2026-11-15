package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Rf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2339Rf implements BaseGmsClient.BaseConnectionCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1924Jf f22881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2575Vt f22882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2443Tf f22883c;

    C2339Rf(C2443Tf c2443Tf, C1924Jf c1924Jf, C2575Vt c2575Vt) {
        this.f22881a = c1924Jf;
        this.f22882b = c2575Vt;
        Objects.requireNonNull(c2443Tf);
        this.f22883c = c2443Tf;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        C2443Tf c2443Tf = this.f22883c;
        synchronized (c2443Tf.f()) {
            try {
                if (c2443Tf.d()) {
                    return;
                }
                c2443Tf.e(true);
                final C1872If c1872IfC = c2443Tf.c();
                if (c1872IfC == null) {
                    return;
                }
                InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22473a;
                final C1924Jf c1924Jf = this.f22881a;
                final C2575Vt c2575Vt = this.f22882b;
                final com.google.common.util.concurrent.p pVarJ0 = interfaceExecutorServiceC1805Gx0.j0(new Runnable() { // from class: com.google.android.gms.internal.ads.Qf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        C2575Vt c2575Vt2 = c2575Vt;
                        C1872If c1872If = c1872IfC;
                        C2339Rf c2339Rf = this.f22417a;
                        try {
                            C2028Lf c2028LfD = c1872If.d();
                            boolean zC = c1872If.c();
                            C1924Jf c1924Jf2 = c1924Jf;
                            C1768Gf c1768GfZ1 = zC ? c2028LfD.Z1(c1924Jf2) : c2028LfD.H1(c1924Jf2);
                            if (!c1768GfZ1.zza()) {
                                c2575Vt2.c(new RuntimeException("No entry contents."));
                                c2339Rf.f22883c.b();
                                return;
                            }
                            C2183Of c2183Of = new C2183Of(c2339Rf, c1768GfZ1.a(), 1);
                            int i10 = c2183Of.read();
                            if (i10 == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            c2183Of.unread(i10);
                            c2575Vt2.b(C2599Wf.a(c2183Of, c1768GfZ1.v(), c1768GfZ1.Q(), c1768GfZ1.N(), c1768GfZ1.J()));
                        } catch (RemoteException e10) {
                            e = e10;
                            int i11 = AbstractC0786o0.f2696b;
                            L4.p.d("Unable to obtain a cache service instance.", e);
                            c2575Vt2.c(e);
                            c2339Rf.f22883c.b();
                        } catch (IOException e11) {
                            e = e11;
                            int i12 = AbstractC0786o0.f2696b;
                            L4.p.d("Unable to obtain a cache service instance.", e);
                            c2575Vt2.c(e);
                            c2339Rf.f22883c.b();
                        }
                    }
                });
                c2575Vt.e(new Runnable() { // from class: com.google.android.gms.internal.ads.Pf
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (c2575Vt.isCancelled()) {
                            pVarJ0.cancel(true);
                        }
                    }
                }, AbstractC2315Qt.f22479g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i10) {
    }
}
