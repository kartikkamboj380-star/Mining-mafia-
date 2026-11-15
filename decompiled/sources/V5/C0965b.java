package V5;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: V5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0965b extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f6100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC0968e f6101c;

    C0965b(ServiceConnectionC0968e serviceConnectionC0968e, IBinder iBinder) {
        this.f6101c = serviceConnectionC0968e;
        this.f6100b = iBinder;
    }

    @Override // V5.F
    public final void b() {
        this.f6101c.f6103a.f6118n = (IInterface) this.f6101c.f6103a.f6113i.a(this.f6100b);
        C0969f.r(this.f6101c.f6103a);
        this.f6101c.f6103a.f6111g = false;
        Iterator it = this.f6101c.f6103a.f6108d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f6101c.f6103a.f6108d.clear();
    }
}
