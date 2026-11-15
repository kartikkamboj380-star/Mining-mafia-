package com.google.android.gms.internal.auth;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static volatile K f35938g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f35942k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final I f35943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f35944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f35945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f35946d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f35947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f35937f = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReference f35939h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final O f35940i = new O(D.f35908a);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f35941j = new AtomicInteger();

    /* synthetic */ M(I i10, String str, Object obj, boolean z9, L l10) {
        if (i10.f35919a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f35943a = i10;
        this.f35944b = str;
        this.f35945c = obj;
    }

    public static void c() {
        f35941j.incrementAndGet();
    }

    public static void d(final Context context) {
        if (f35938g != null || context == null) {
            return;
        }
        Object obj = f35937f;
        synchronized (obj) {
            try {
                if (f35938g == null) {
                    synchronized (obj) {
                        try {
                            K k10 = f35938g;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (k10 == null || k10.a() != context) {
                                C6116q.c();
                                N.b();
                                C6136x.d();
                                f35938g = new C6107n(context, Z.a(new U() { // from class: com.google.android.gms.internal.auth.C
                                    @Override // com.google.android.gms.internal.auth.U
                                    public final Object zza() {
                                        Context context2 = context;
                                        int i10 = M.f35942k;
                                        return AbstractC6139y.a(context2);
                                    }
                                }));
                                f35941j.incrementAndGet();
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

    abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[PHI: r2
      0x003e: PHI (r2v1 com.google.android.gms.internal.auth.S) = (r2v0 com.google.android.gms.internal.auth.S), (r2v5 com.google.android.gms.internal.auth.S) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x009a A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b4 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    public final Object b() {
        String strA;
        C6116q c6116qA;
        Object objA;
        String str;
        String strB;
        Object objJ;
        int i10 = f35941j.get();
        if (this.f35946d < i10) {
            synchronized (this) {
                try {
                    if (this.f35946d < i10) {
                        K k10 = f35938g;
                        S sC = S.c();
                        Object objA2 = null;
                        if (k10 != null) {
                            sC = (S) k10.b().zza();
                            if (sC.b()) {
                                r rVar = (r) sC.a();
                                I i11 = this.f35943a;
                                strA = rVar.a(i11.f35919a, null, i11.f35921c, this.f35944b);
                            } else {
                                strA = null;
                            }
                        } else {
                            strA = null;
                        }
                        if (k10 == null) {
                            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                        }
                        Uri uri = this.f35943a.f35919a;
                        if (uri != null) {
                            if (AbstractC6141z.a(k10.a(), uri)) {
                                c6116qA = C6116q.a(k10.a().getContentResolver(), this.f35943a.f35919a, new Runnable() { // from class: com.google.android.gms.internal.auth.B
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        M.c();
                                    }
                                });
                            }
                            if (c6116qA != null || (objJ = c6116qA.j(this.f35944b)) == null) {
                                objA = null;
                            } else {
                                objA = a(objJ);
                            }
                            if (objA == null) {
                                if (!this.f35943a.f35922d) {
                                    C6136x c6136xA = C6136x.a(k10.a());
                                    if (this.f35943a.f35922d) {
                                        str = null;
                                    } else {
                                        str = this.f35944b;
                                    }
                                    strB = c6136xA.j(str);
                                    if (strB != null) {
                                        objA2 = a(strB);
                                    }
                                }
                                if (objA2 == null) {
                                    objA = this.f35945c;
                                } else {
                                    objA = objA2;
                                }
                            }
                            if (sC.b()) {
                                if (strA == null) {
                                    objA = this.f35945c;
                                } else {
                                    objA = a(strA);
                                }
                            }
                            this.f35947e = objA;
                            this.f35946d = i10;
                        } else {
                            N.a(k10.a(), null, new Runnable() { // from class: com.google.android.gms.internal.auth.B
                                @Override // java.lang.Runnable
                                public final void run() {
                                    M.c();
                                }
                            });
                        }
                        c6116qA = null;
                        if (c6116qA != null) {
                            objA = null;
                        } else {
                            objA = null;
                        }
                        if (objA == null) {
                            if (!this.f35943a.f35922d) {
                                C6136x c6136xA2 = C6136x.a(k10.a());
                                if (this.f35943a.f35922d) {
                                    str = null;
                                } else {
                                    str = this.f35944b;
                                }
                                strB = c6136xA2.j(str);
                                if (strB != null) {
                                    objA2 = a(strB);
                                }
                            }
                            if (objA2 == null) {
                                objA = this.f35945c;
                            } else {
                                objA = objA2;
                            }
                        }
                        if (sC.b()) {
                            if (strA == null) {
                                objA = this.f35945c;
                            } else {
                                objA = a(strA);
                            }
                        }
                        this.f35947e = objA;
                        this.f35946d = i10;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f35947e;
    }
}
