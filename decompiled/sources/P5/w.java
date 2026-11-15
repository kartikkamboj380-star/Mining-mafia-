package P5;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class w extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ IBinder f4710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f4711c;

    w(z zVar, IBinder iBinder) {
        this.f4711c = zVar;
        this.f4710b = iBinder;
    }

    @Override // P5.q
    public final void a() {
        this.f4711c.f4713a.f4683m = j.h0(this.f4710b);
        A.q(this.f4711c.f4713a);
        this.f4711c.f4713a.f4677g = false;
        Iterator it = this.f4711c.f4713a.f4674d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f4711c.f4713a.f4674d.clear();
    }
}
