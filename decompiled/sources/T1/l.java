package T1;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class l implements S1.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f5694i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static l f5695j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f5696k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private S1.d f5697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f5698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f5699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f5700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f5701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f5702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private S1.c.a f5703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f5704h;

    private l() {
    }

    public static l a() {
        synchronized (f5694i) {
            try {
                l lVar = f5695j;
                if (lVar == null) {
                    return new l();
                }
                f5695j = lVar.f5704h;
                lVar.f5704h = null;
                f5696k--;
                return lVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void c() {
        this.f5697a = null;
        this.f5698b = null;
        this.f5699c = 0L;
        this.f5700d = 0L;
        this.f5701e = 0L;
        this.f5702f = null;
        this.f5703g = null;
    }

    public void b() {
        synchronized (f5694i) {
            try {
                if (f5696k < 5) {
                    c();
                    f5696k++;
                    l lVar = f5695j;
                    if (lVar != null) {
                        this.f5704h = lVar;
                    }
                    f5695j = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public l d(S1.d dVar) {
        this.f5697a = dVar;
        return this;
    }

    public l e(long j10) {
        this.f5700d = j10;
        return this;
    }

    public l f(long j10) {
        this.f5701e = j10;
        return this;
    }

    public l g(S1.c.a aVar) {
        this.f5703g = aVar;
        return this;
    }

    public l h(IOException iOException) {
        this.f5702f = iOException;
        return this;
    }

    public l i(long j10) {
        this.f5699c = j10;
        return this;
    }

    public l j(String str) {
        this.f5698b = str;
        return this;
    }
}
