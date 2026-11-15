package K0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: K0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0751d implements androidx.work.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f2473a = K.h.a(Looper.getMainLooper());

    @Override // androidx.work.y
    public void a(Runnable runnable) {
        this.f2473a.removeCallbacks(runnable);
    }

    @Override // androidx.work.y
    public void b(long j10, Runnable runnable) {
        this.f2473a.postDelayed(runnable, j10);
    }
}
