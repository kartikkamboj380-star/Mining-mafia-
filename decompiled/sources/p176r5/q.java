package p176r5;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
final class q implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48304a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L f48306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f48309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Exception f48310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f48311h;

    public q(int i10, L l10) {
        this.f48305b = i10;
        this.f48306c = l10;
    }

    private final void b() {
        int i10 = this.f48307d + this.f48308e + this.f48309f;
        int i11 = this.f48305b;
        if (i10 == i11) {
            if (this.f48310g == null) {
                if (this.f48311h) {
                    this.f48306c.u();
                    return;
                } else {
                    this.f48306c.q(null);
                    return;
                }
            }
            L l10 = this.f48306c;
            int i12 = this.f48308e;
            StringBuilder sb = new StringBuilder(String.valueOf(i12).length() + 8 + String.valueOf(i11).length() + 24);
            sb.append(i12);
            sb.append(" out of ");
            sb.append(i11);
            sb.append(" underlying tasks failed");
            l10.s(new ExecutionException(sb.toString(), this.f48310g));
        }
    }

    @Override // p176r5.InterfaceC7088e
    public final void a() {
        synchronized (this.f48304a) {
            this.f48309f++;
            this.f48311h = true;
            b();
        }
    }

    @Override // p176r5.InterfaceC7089f
    public final void onFailure(Exception exc) {
        synchronized (this.f48304a) {
            this.f48308e++;
            this.f48310g = exc;
            b();
        }
    }

    @Override // p176r5.InterfaceC7090g
    public final void onSuccess(Object obj) {
        synchronized (this.f48304a) {
            this.f48307d++;
            b();
        }
    }
}
