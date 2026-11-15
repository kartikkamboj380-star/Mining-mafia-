package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Tk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2453Tk extends E4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2401Sk f23604a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C2891ak f23606c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f23605b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B4.w f23607d = new B4.w();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f23608e = new ArrayList();

    public C2453Tk(InterfaceC2401Sk interfaceC2401Sk) {
        InterfaceC2763Zj c2659Xj;
        IBinder iBinder;
        this.f23604a = interfaceC2401Sk;
        C2891ak c2891ak = null;
        try {
            List listB = interfaceC2401Sk.b();
            if (listB != null) {
                for (Object obj : listB) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        c2659Xj = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        c2659Xj = iInterfaceQueryLocalInterface instanceof InterfaceC2763Zj ? (InterfaceC2763Zj) iInterfaceQueryLocalInterface : new C2659Xj(iBinder);
                    }
                    if (c2659Xj != null) {
                        this.f23605b.add(new C2891ak(c2659Xj));
                    }
                }
            }
        } catch (RemoteException e10) {
            L4.p.d("", e10);
        }
        try {
            List listM = this.f23604a.m();
            if (listM != null) {
                for (Object obj2 : listM) {
                    H4.I0 i0Y6 = obj2 instanceof IBinder ? H4.H0.y6((IBinder) obj2) : null;
                    if (i0Y6 != null) {
                        this.f23608e.add(new H4.J0(i0Y6));
                    }
                }
            }
        } catch (RemoteException e11) {
            L4.p.d("", e11);
        }
        try {
            InterfaceC2763Zj interfaceC2763ZjC = this.f23604a.c();
            if (interfaceC2763ZjC != null) {
                c2891ak = new C2891ak(interfaceC2763ZjC);
            }
        } catch (RemoteException e12) {
            L4.p.d("", e12);
        }
        this.f23606c = c2891ak;
        try {
            if (this.f23604a.a() != null) {
                new C2451Tj(this.f23604a.a());
            }
        } catch (RemoteException e13) {
            L4.p.d("", e13);
        }
    }

    @Override // E4.g
    public final String a() {
        try {
            return this.f23604a.zze();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final List b() {
        return this.f23605b;
    }

    @Override // E4.g
    public final String c() {
        try {
            return this.f23604a.zzg();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final E4.d d() {
        return this.f23606c;
    }

    @Override // E4.g
    public final String e() {
        try {
            return this.f23604a.zzi();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final String f() {
        try {
            return this.f23604a.d();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final Double g() {
        try {
            double dZzk = this.f23604a.zzk();
            if (dZzk == -1.0d) {
                return null;
            }
            return Double.valueOf(dZzk);
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final String h() {
        try {
            return this.f23604a.zzl();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final String i() {
        try {
            return this.f23604a.e();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }

    @Override // E4.g
    public final B4.w j() {
        try {
            InterfaceC2401Sk interfaceC2401Sk = this.f23604a;
            if (interfaceC2401Sk.zzn() != null) {
                this.f23607d.b(interfaceC2401Sk.zzn());
            }
        } catch (RemoteException e10) {
            L4.p.d("Exception occurred while getting video controller", e10);
        }
        return this.f23607d;
    }

    @Override // E4.g
    public final Object k() {
        try {
            com.google.android.gms.dynamic.a aVarQ = this.f23604a.q();
            if (aVarQ != null) {
                return com.google.android.gms.dynamic.b.h0(aVarQ);
            }
            return null;
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return null;
        }
    }
}
