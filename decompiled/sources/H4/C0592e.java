package H4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: H4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0592e implements L4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C0592e f1269a = new C0592e();

    private /* synthetic */ C0592e() {
    }

    @Override // L4.r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
        return iInterfaceQueryLocalInterface instanceof W0 ? (W0) iInterfaceQueryLocalInterface : new W0(iBinder);
    }
}
