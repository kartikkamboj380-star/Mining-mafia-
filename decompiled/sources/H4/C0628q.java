package H4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: H4.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0628q implements L4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C0628q f1417a = new C0628q();

    private /* synthetic */ C0628q() {
    }

    @Override // L4.r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return iInterfaceQueryLocalInterface instanceof C0611k0 ? (C0611k0) iInterfaceQueryLocalInterface : new C0611k0(iBinder);
    }
}
