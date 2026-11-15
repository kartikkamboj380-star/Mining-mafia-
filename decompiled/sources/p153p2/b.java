package p153p2;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class b extends p153p2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f47755b = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f47759f = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f47757d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList f47758e = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f47756c = new Handler(Looper.getMainLooper());

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (b.this.f47755b) {
                ArrayList arrayList = b.this.f47758e;
                b bVar = b.this;
                bVar.f47758e = bVar.f47757d;
                b.this.f47757d = arrayList;
            }
            int size = b.this.f47758e.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((p153p2.a.InterfaceC0513a) b.this.f47758e.get(i10)).release();
            }
            b.this.f47758e.clear();
        }
    }

    @Override // p153p2.a
    public void a(p153p2.a.InterfaceC0513a interfaceC0513a) {
        synchronized (this.f47755b) {
            this.f47757d.remove(interfaceC0513a);
        }
    }

    @Override // p153p2.a
    public void d(p153p2.a.InterfaceC0513a interfaceC0513a) {
        if (!p153p2.a.c()) {
            interfaceC0513a.release();
            return;
        }
        synchronized (this.f47755b) {
            try {
                if (this.f47757d.contains(interfaceC0513a)) {
                    return;
                }
                this.f47757d.add(interfaceC0513a);
                boolean z9 = true;
                if (this.f47757d.size() != 1) {
                    z9 = false;
                }
                if (z9) {
                    this.f47756c.post(this.f47759f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
