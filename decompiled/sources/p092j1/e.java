package p092j1;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
final class e implements d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ConnectivityManager f45420c;

    public e(ConnectivityManager connectivityManager) {
        this.f45420c = connectivityManager;
    }

    @Override // p092j1.d
    public boolean c() {
        NetworkCapabilities networkCapabilities = this.f45420c.getNetworkCapabilities(this.f45420c.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
