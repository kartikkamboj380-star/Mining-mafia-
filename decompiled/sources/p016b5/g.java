package p016b5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p141o0.a;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends a implements SignInConnectionListener {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Semaphore f11604o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set f11605p;

    public g(Context context, Set set) {
        super(context);
        this.f11604o = new Semaphore(0);
        this.f11605p = set;
    }

    @Override // p141o0.a
    public final /* bridge */ /* synthetic */ Object G() {
        Iterator it = this.f11605p.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i10++;
            }
        }
        try {
            this.f11604o.tryAcquire(i10, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.f11604o.release();
    }

    @Override // p141o0.c
    protected final void r() {
        this.f11604o.drainPermits();
        h();
    }
}
