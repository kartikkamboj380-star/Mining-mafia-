package V5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: V5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class ServiceConnectionC0968e implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0969f f6103a;

    /* synthetic */ ServiceConnectionC0968e(C0969f c0969f, AbstractC0967d abstractC0967d) {
        this.f6103a = c0969f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6103a.f6106b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f6103a.c().post(new C0965b(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6103a.f6106b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f6103a.c().post(new C0966c(this));
    }
}
