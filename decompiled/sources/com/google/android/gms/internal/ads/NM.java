package com.google.android.gms.internal.ads;

import H4.AbstractBinderC0588c1;
import H4.InterfaceC0591d1;
import H4.InterfaceC0600g1;
import android.os.RemoteException;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class NM extends AbstractBinderC0588c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21234a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0591d1 f21235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC2097Mo f21236c;

    public NM(InterfaceC0591d1 interfaceC0591d1, InterfaceC2097Mo interfaceC2097Mo) {
        this.f21235b = interfaceC0591d1;
        this.f21236c = interfaceC2097Mo;
    }

    @Override // H4.InterfaceC0591d1
    public final void B1(InterfaceC0600g1 interfaceC0600g1) {
        synchronized (this.f21234a) {
            try {
                InterfaceC0591d1 interfaceC0591d1 = this.f21235b;
                if (interfaceC0591d1 != null) {
                    interfaceC0591d1.B1(interfaceC0600g1);
                }
            } catch (Throwable th) {
                throw th;
            }
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
    public final float d() {
        InterfaceC2097Mo interfaceC2097Mo = this.f21236c;
        return interfaceC2097Mo != null ? interfaceC2097Mo.s() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
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
    public final float zzk() {
        InterfaceC2097Mo interfaceC2097Mo = this.f21236c;
        return interfaceC2097Mo != null ? interfaceC2097Mo.y() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // H4.InterfaceC0591d1
    public final boolean zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // H4.InterfaceC0591d1
    public final InterfaceC0600g1 zzo() {
        synchronized (this.f21234a) {
            try {
                InterfaceC0591d1 interfaceC0591d1 = this.f21235b;
                if (interfaceC0591d1 == null) {
                    return null;
                }
                return interfaceC0591d1.zzo();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
