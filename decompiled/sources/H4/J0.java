package H4;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final I0 f1234b;

    public J0(I0 i10) {
        String strZze;
        this.f1234b = i10;
        try {
            strZze = i10.zze();
        } catch (RemoteException e10) {
            L4.p.d("", e10);
            strZze = null;
        }
        this.f1233a = strZze;
    }

    public final String toString() {
        return this.f1233a;
    }
}
