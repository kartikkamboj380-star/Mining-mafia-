package H4;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: H4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C0622o implements L4.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C0622o f1408a = new C0622o();

    private /* synthetic */ C0622o() {
    }

    @Override // L4.r
    public final /* synthetic */ Object zza(Object obj) {
        IBinder iBinder = (IBinder) obj;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof T ? (T) iInterfaceQueryLocalInterface : new T(iBinder);
    }
}
