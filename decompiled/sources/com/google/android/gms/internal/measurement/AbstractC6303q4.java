package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6303q4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f36857g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile AbstractC6258l4 f36858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicInteger f36859i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f36860j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final C6249k4 f36861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f36862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f36863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f36864d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f36865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f36866f;

    static {
        new AtomicReference();
        X5.j.i(C6285o4.f36802a, "BuildInfo must be non-null");
        f36859i = new AtomicInteger();
    }

    /* synthetic */ AbstractC6303q4(C6249k4 c6249k4, String str, Object obj, boolean z9, byte[] bArr) {
        if (c6249k4.f36734a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f36861a = c6249k4;
        this.f36862b = str;
        this.f36863c = obj;
        this.f36866f = false;
    }

    public static void b(final Context context) {
        if (f36858h != null || context == null) {
            return;
        }
        Object obj = f36857g;
        synchronized (obj) {
            try {
                if (f36858h == null) {
                    synchronized (obj) {
                        try {
                            AbstractC6258l4 abstractC6258l4 = f36858h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (abstractC6258l4 == null || abstractC6258l4.a() != context) {
                                if (abstractC6258l4 != null) {
                                    V3.e();
                                    C6320s4.c();
                                    C6168b4.d();
                                }
                                f36858h = new R3(context, X5.n.a(new X5.m() { // from class: com.google.android.gms.internal.measurement.p4
                                    @Override // X5.m
                                    public final /* synthetic */ Object get() {
                                        int i10 = AbstractC6303q4.f36860j;
                                        return AbstractC6177c4.a(context);
                                    }
                                }));
                                f36859i.incrementAndGet();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c() {
        f36859i.incrementAndGet();
    }

    abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 X5.g) = (r2v0 X5.g), (r2v0 X5.g), (r2v7 X5.g) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object d() {
        String strA;
        Y3 y3B;
        String strC;
        Object objK;
        int i10 = f36859i.get();
        if (this.f36864d < i10) {
            synchronized (this) {
                try {
                    if (this.f36864d < i10) {
                        AbstractC6258l4 abstractC6258l4 = f36858h;
                        X5.g gVarA = X5.g.a();
                        Object objA = null;
                        if (abstractC6258l4 == null || abstractC6258l4.b() == null) {
                            strA = null;
                        } else {
                            gVarA = (X5.g) ((X5.m) X5.j.h(abstractC6258l4.b())).get();
                            if (gVarA.c()) {
                                W3 w10 = (W3) gVarA.b();
                                C6249k4 c6249k4 = this.f36861a;
                                strA = w10.a(c6249k4.f36734a, null, c6249k4.f36736c, this.f36862b);
                            } else {
                                strA = null;
                            }
                        }
                        X5.j.o(abstractC6258l4 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        C6249k4 c6249k5 = this.f36861a;
                        Uri uri = c6249k5.f36734a;
                        if (uri != null) {
                            y3B = AbstractC6195e4.a(abstractC6258l4.a(), uri) ? V3.b(abstractC6258l4.a().getContentResolver(), uri, RunnableC6276n4.f36784a) : null;
                        } else {
                            y3B = C6320s4.b(abstractC6258l4.a(), (String) X5.j.h(null), RunnableC6267m4.f36750a);
                        }
                        Object objA2 = (y3B == null || (objK = y3B.k(this.f36862b)) == null) ? null : a(objK);
                        if (objA2 == null) {
                            if (!c6249k5.f36737d && (strC = C6168b4.b(abstractC6258l4.a()).k(this.f36862b)) != null) {
                                objA = a(strC);
                            }
                            objA2 = objA == null ? this.f36863c : objA;
                        }
                        if (gVarA.c()) {
                            objA2 = strA == null ? this.f36863c : a(strA);
                        }
                        this.f36865e = objA2;
                        this.f36864d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f36865e;
    }
}
