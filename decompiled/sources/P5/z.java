package P5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class z implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ A f4713a;

    /* synthetic */ z(A a10, y yVar) {
        this.f4713a = a10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f4713a.f4672b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        A a10 = this.f4713a;
        a10.c().post(new w(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4713a.f4672b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        A a10 = this.f4713a;
        a10.c().post(new x(this));
    }
}
