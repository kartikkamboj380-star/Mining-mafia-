package H4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: H4.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0633s implements L4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C0633s f1429a = new C0633s();

    private /* synthetic */ C0633s() {
    }

    @Override // L4.r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof C0 ? (C0) iInterfaceQueryLocalInterface : new C0(iBinder);
    }
}
