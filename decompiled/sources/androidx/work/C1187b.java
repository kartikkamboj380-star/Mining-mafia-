package androidx.work;

import K0.C0751d;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.work.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1187b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f11202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f11203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final D f11204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l f11205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final y f11206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final N.a f11207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final N.a f11208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f11209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f11210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f11211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f11212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f11213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f11214m;

    /* JADX INFO: renamed from: androidx.work.b$a */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f11215a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11216b;

        a(boolean z9) {
            this.f11216b = z9;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f11216b ? "WM.task-" : "androidx.work-") + this.f11215a.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    public static final class C0180b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f11218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        D f11219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        l f11220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f11221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        y f11222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        N.a f11223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        N.a f11224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        String f11225h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f11226i = 4;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f11227j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f11228k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f11229l = 20;

        public C1187b a() {
            return new C1187b(this);
        }
    }

    C1187b(C0180b c0180b) {
        Executor executor = c0180b.f11218a;
        if (executor == null) {
            this.f11202a = a(false);
        } else {
            this.f11202a = executor;
        }
        Executor executor2 = c0180b.f11221d;
        if (executor2 == null) {
            this.f11214m = true;
            this.f11203b = a(true);
        } else {
            this.f11214m = false;
            this.f11203b = executor2;
        }
        D d10 = c0180b.f11219b;
        if (d10 == null) {
            this.f11204c = D.c();
        } else {
            this.f11204c = d10;
        }
        l lVar = c0180b.f11220c;
        if (lVar == null) {
            this.f11205d = l.c();
        } else {
            this.f11205d = lVar;
        }
        y yVar = c0180b.f11222e;
        if (yVar == null) {
            this.f11206e = new C0751d();
        } else {
            this.f11206e = yVar;
        }
        this.f11210i = c0180b.f11226i;
        this.f11211j = c0180b.f11227j;
        this.f11212k = c0180b.f11228k;
        this.f11213l = c0180b.f11229l;
        this.f11207f = c0180b.f11223f;
        this.f11208g = c0180b.f11224g;
        this.f11209h = c0180b.f11225h;
    }

    private Executor a(boolean z9) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z9));
    }

    private ThreadFactory b(boolean z9) {
        return new a(z9);
    }

    public String c() {
        return this.f11209h;
    }

    public Executor d() {
        return this.f11202a;
    }

    public N.a e() {
        return this.f11207f;
    }

    public l f() {
        return this.f11205d;
    }

    public int g() {
        return this.f11212k;
    }

    public int h() {
        return this.f11213l;
    }

    public int i() {
        return this.f11211j;
    }

    public int j() {
        return this.f11210i;
    }

    public y k() {
        return this.f11206e;
    }

    public N.a l() {
        return this.f11208g;
    }

    public Executor m() {
        return this.f11203b;
    }

    public D n() {
        return this.f11204c;
    }
}
