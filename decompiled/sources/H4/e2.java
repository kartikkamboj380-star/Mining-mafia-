package H4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class e2 implements L4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ e2 f1270a = new e2();

    private /* synthetic */ e2() {
    }

    @Override // L4.r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof X ? (X) iInterfaceQueryLocalInterface : new X(iBinder);
    }
}
