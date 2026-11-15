package Q0;

import T0.o;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ConnectivityManager f4794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f4795g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            Intrinsics.checkNotNullParameter(network, "network");
            Intrinsics.checkNotNullParameter(capabilities, "capabilities");
            q.e().a(k.f4797a, "Network capabilities changed: " + capabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f4794f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "network");
            q.e().a(k.f4797a, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f4794f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, U0.b taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        Intrinsics.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f4794f = (ConnectivityManager) systemService;
        this.f4795g = new a();
    }

    @Override // Q0.h
    public void h() {
        try {
            q.e().a(k.f4797a, "Registering network callback");
            o.a(this.f4794f, this.f4795g);
        } catch (IllegalArgumentException e10) {
            q.e().d(k.f4797a, "Received exception while registering network callback", e10);
        } catch (SecurityException e11) {
            q.e().d(k.f4797a, "Received exception while registering network callback", e11);
        }
    }

    @Override // Q0.h
    public void i() {
        try {
            q.e().a(k.f4797a, "Unregistering network callback");
            T0.m.c(this.f4794f, this.f4795g);
        } catch (IllegalArgumentException e10) {
            q.e().d(k.f4797a, "Received exception while unregistering network callback", e10);
        } catch (SecurityException e11) {
            q.e().d(k.f4797a, "Received exception while unregistering network callback", e11);
        }
    }

    @Override // Q0.h
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public O0.b e() {
        return k.c(this.f4794f);
    }
}
