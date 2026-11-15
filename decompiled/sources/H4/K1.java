package H4;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class K1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ L1 f1236a;

    K1(L1 l10) {
        Objects.requireNonNull(l10);
        this.f1236a = l10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L1 l10 = this.f1236a;
        if (l10.y6() != null) {
            try {
                l10.y6().G(1);
            } catch (RemoteException e10) {
                L4.p.g("Could not notify onAdFailedToLoad event.", e10);
            }
        }
    }
}
