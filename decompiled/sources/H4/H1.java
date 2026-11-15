package H4;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class H1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ I1 f1231a;

    H1(I1 i10) {
        Objects.requireNonNull(i10);
        this.f1231a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J1 j10 = this.f1231a.f1232a;
        if (j10.z6() != null) {
            try {
                j10.z6().G(1);
            } catch (RemoteException e10) {
                L4.p.g("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
