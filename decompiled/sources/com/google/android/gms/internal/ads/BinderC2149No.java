package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0600g1;
import android.os.RemoteException;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC2149No extends AbstractBinderC0588c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21341a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile InterfaceC0600g1 f21342b;

    @Override // H4.InterfaceC0591d1
    public final void B1(InterfaceC0600g1 interfaceC0600g1) {
        synchronized (this.f21341a) {
            this.f21342b = interfaceC0600g1;
        }
    }

    @Override // H4.InterfaceC0591d1
    public final void Z(boolean z9) throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final void a() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final void b() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final boolean c() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final float d() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final float e() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final boolean h() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final void zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final int zzi() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final float zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final InterfaceC0600g1 zzo() {
        InterfaceC0600g1 interfaceC0600g1;
        synchronized (this.f21341a) {
            interfaceC0600g1 = this.f21342b;
        }
        return interfaceC0600g1;
    }
}
