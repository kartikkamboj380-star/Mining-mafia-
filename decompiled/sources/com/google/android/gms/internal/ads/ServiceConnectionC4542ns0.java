package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.ns0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ServiceConnectionC4542ns0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5423us0 f31901a;

    /* synthetic */ ServiceConnectionC4542ns0(C5423us0 c5423us0, byte[] bArr) {
        Objects.requireNonNull(c5423us0);
        this.f31901a = c5423us0;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        C5423us0 c5423us0 = this.f31901a;
        c5423us0.i().a("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        c5423us0.h(new Runnable() { // from class: com.google.android.gms.internal.ads.ms0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                InterfaceC5673wr0 interfaceC5673wr0Y6 = AbstractBinderC5547vr0.y6(iBinder);
                ServiceConnectionC4542ns0 serviceConnectionC4542ns0 = this.f31583a;
                C5423us0 c5423us1 = serviceConnectionC4542ns0.f31901a;
                c5423us1.n(interfaceC5673wr0Y6);
                c5423us1.i().a("linkToDeath", new Object[0]);
                try {
                    IInterface iInterfaceM = c5423us1.m();
                    if (iInterfaceM == null) {
                        throw null;
                    }
                    iInterfaceM.asBinder().linkToDeath(c5423us1.l(), 0);
                    C5423us0 c5423us2 = serviceConnectionC4542ns0.f31901a;
                    c5423us2.k(false);
                    synchronized (c5423us2.j()) {
                        try {
                            Iterator it = c5423us2.j().iterator();
                            while (it.hasNext()) {
                                ((Runnable) it.next()).run();
                            }
                            c5423us2.j().clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (RemoteException e10) {
                    serviceConnectionC4542ns0.f31901a.i().d(e10, "linkToDeath failed", new Object[0]);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C5423us0 c5423us0 = this.f31901a;
        c5423us0.i().a("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        c5423us0.h(new Runnable() { // from class: com.google.android.gms.internal.ads.ls0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                C5423us0 c5423us1 = this.f31380a.f31901a;
                c5423us1.i().a("unlinkToDeath", new Object[0]);
                IInterface iInterfaceM = c5423us1.m();
                iInterfaceM.getClass();
                iInterfaceM.asBinder().unlinkToDeath(c5423us1.l(), 0);
                c5423us1.n(null);
                c5423us1.k(false);
            }
        });
    }
}
