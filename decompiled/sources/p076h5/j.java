package p076h5;

import com.google.android.gms.common.util.DefaultClock;

/* JADX INFO: loaded from: classes2.dex */
final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f44772a;

    /* synthetic */ j(l lVar, i iVar) {
        this.f44772a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jA = this.f44772a.a();
        if (jA == -1 || DefaultClock.getInstance().currentTimeMillis() <= jA) {
            return;
        }
        l.f(this.f44772a.f44774a);
    }
}
