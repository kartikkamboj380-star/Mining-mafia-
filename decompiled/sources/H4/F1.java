package H4;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2607Wj;
import com.google.android.gms.internal.ads.InterfaceC5154sk;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class F1 implements B4.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2607Wj f1228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B4.w f1229b = new B4.w();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC5154sk f1230c;

    public F1(InterfaceC2607Wj interfaceC2607Wj, InterfaceC5154sk interfaceC5154sk) {
        this.f1228a = interfaceC2607Wj;
        this.f1230c = interfaceC5154sk;
    }

    @Override // B4.l
    public final boolean a() {
        try {
            return this.f1228a.zzk();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return false;
        }
    }

    @Override // B4.l
    public final float b() {
        try {
            return this.f1228a.zze();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public final InterfaceC2607Wj c() {
        return this.f1228a;
    }

    @Override // B4.l
    public final float getDuration() {
        try {
            return this.f1228a.c();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // B4.l
    public final B4.w getVideoController() {
        try {
            InterfaceC2607Wj interfaceC2607Wj = this.f1228a;
            if (interfaceC2607Wj.d() != null) {
                this.f1229b.b(interfaceC2607Wj.d());
            }
        } catch (RemoteException e10) {
            L4.p.d("Exception occurred while getting video controller", e10);
        }
        return this.f1229b;
    }

    @Override // B4.l
    public final boolean zza() {
        try {
            return this.f1228a.zzl();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            return false;
        }
    }

    @Override // B4.l
    public final InterfaceC5154sk zzb() {
        return this.f1230c;
    }
}
