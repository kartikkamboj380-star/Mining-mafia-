package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2986bU0 implements InterfaceC4244lV0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC4166kt0 f26826h = ZT0.f26200a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Random f26827i = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC4118kV0 f26831d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f26833f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2337Re f26828a = new C2337Re();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4891qe f26829b = new C4891qe();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f26830c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AbstractC5270tf f26832e = AbstractC5270tf.f33438a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f26834g = -1;

    public C2986bU0(InterfaceC4166kt0 interfaceC4166kt0) {
    }

    private final void l(RS0 rs0) {
        if (rs0.f22810b.g()) {
            String str = this.f26833f;
            if (str != null) {
                C2860aU0 c2860aU0 = (C2860aU0) this.f26830c.get(str);
                c2860aU0.getClass();
                m(c2860aU0);
                return;
            }
            return;
        }
        C2860aU0 c2860aU1 = (C2860aU0) this.f26830c.get(this.f26833f);
        int i10 = rs0.f22811c;
        C5637wZ0 c5637wZ0 = rs0.f22812d;
        this.f26833f = o(i10, c5637wZ0).e();
        g(rs0);
        if (c5637wZ0 == null || !c5637wZ0.b()) {
            return;
        }
        if (c2860aU1 != null) {
            if (c2860aU1.g() == c5637wZ0.f34597d && c2860aU1.h() != null) {
                C5637wZ0 c5637wZ0H = c2860aU1.h();
                if (c5637wZ0H.f34595b == c5637wZ0.f34595b) {
                    C5637wZ0 c5637wZ0H2 = c2860aU1.h();
                    if (c5637wZ0H2.f34596c == c5637wZ0.f34596c) {
                        return;
                    }
                }
            }
        }
        o(i10, new C5637wZ0(c5637wZ0.f34594a, c5637wZ0.f34597d));
    }

    private final void m(C2860aU0 c2860aU0) {
        if (c2860aU0.g() != -1 && c2860aU0.i()) {
            this.f26834g = c2860aU0.g();
        }
        this.f26833f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final long i() {
        C2860aU0 c2860aU0 = (C2860aU0) this.f26830c.get(this.f26833f);
        return (c2860aU0 == null || c2860aU0.g() == -1) ? this.f26834g + 1 : c2860aU0.g();
    }

    private final C2860aU0 o(int i10, C5637wZ0 c5637wZ0) {
        HashMap map = this.f26830c;
        long j10 = Long.MAX_VALUE;
        C2860aU0 c2860aU0 = null;
        for (C2860aU0 c2860aU1 : map.values()) {
            c2860aU1.c(i10, c5637wZ0);
            if (c2860aU1.b(i10, c5637wZ0)) {
                long jG = c2860aU1.g();
                if (jG == -1 || jG < j10) {
                    c2860aU0 = c2860aU1;
                    j10 = jG;
                } else if (jG == j10) {
                    String str = AbstractC4634ob0.f32117a;
                    if (c2860aU0.h() != null && c2860aU1.h() != null) {
                        c2860aU0 = c2860aU1;
                    }
                }
            }
        }
        if (c2860aU0 != null) {
            return c2860aU0;
        }
        String strP = p();
        C2860aU0 c2860aU2 = new C2860aU0(this, strP, i10, c5637wZ0);
        map.put(strP, c2860aU2);
        return c2860aU2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String p() {
        byte[] bArr = new byte[12];
        f26827i.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final synchronized void a(RS0 rs0, int i10) {
        try {
            if (this.f26831d == null) {
                throw null;
            }
            Iterator it = this.f26830c.values().iterator();
            while (it.hasNext()) {
                C2860aU0 c2860aU0 = (C2860aU0) it.next();
                if (c2860aU0.d(rs0)) {
                    it.remove();
                    boolean zEquals = c2860aU0.e().equals(this.f26833f);
                    if (zEquals) {
                        m(c2860aU0);
                    }
                    if (c2860aU0.i()) {
                        boolean z9 = false;
                        if (i10 == 0 && zEquals && c2860aU0.k()) {
                            z9 = true;
                        }
                        this.f26831d.n(rs0, c2860aU0.e(), z9);
                    }
                }
            }
            l(rs0);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final synchronized String b() {
        return this.f26833f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final synchronized String c(AbstractC5270tf abstractC5270tf, C5637wZ0 c5637wZ0) {
        return o(abstractC5270tf.o(c5637wZ0.f34594a, this.f26829b).f32697c, c5637wZ0).e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final void d(InterfaceC4118kV0 interfaceC4118kV0) {
        this.f26831d = interfaceC4118kV0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final synchronized void e(RS0 rs0) {
        InterfaceC4118kV0 interfaceC4118kV0;
        try {
            String str = this.f26833f;
            if (str != null) {
                C2860aU0 c2860aU0 = (C2860aU0) this.f26830c.get(str);
                if (c2860aU0 == null) {
                    throw null;
                }
                m(c2860aU0);
            }
            Iterator it = this.f26830c.values().iterator();
            while (it.hasNext()) {
                C2860aU0 c2860aU1 = (C2860aU0) it.next();
                it.remove();
                if (c2860aU1.i() && (interfaceC4118kV0 = this.f26831d) != null) {
                    interfaceC4118kV0.n(rs0, c2860aU1.e(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final synchronized void f(RS0 rs0) {
        try {
            if (this.f26831d == null) {
                throw null;
            }
            AbstractC5270tf abstractC5270tf = this.f26832e;
            this.f26832e = rs0.f22810b;
            Iterator it = this.f26830c.values().iterator();
            while (it.hasNext()) {
                C2860aU0 c2860aU0 = (C2860aU0) it.next();
                if (!c2860aU0.a(abstractC5270tf, this.f26832e) || c2860aU0.d(rs0)) {
                    it.remove();
                    if (c2860aU0.e().equals(this.f26833f)) {
                        m(c2860aU0);
                    }
                    if (c2860aU0.i()) {
                        this.f26831d.n(rs0, c2860aU0.e(), false);
                    }
                }
            }
            l(rs0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x004d A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0071 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0090 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001b, B:17:0x0027, B:19:0x0033, B:21:0x003b, B:23:0x0043, B:25:0x004d, B:28:0x0056, B:30:0x005c, B:32:0x0071, B:33:0x008a, B:35:0x0090, B:36:0x0093, B:38:0x009f, B:40:0x00a5, B:46:0x00b6), top: B:49:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC4244lV0
    public final synchronized void g(RS0 rs0) {
        int i10;
        C2860aU0 c2860aU0O;
        Object obj;
        int i11;
        C2860aU0 c2860aU0O2;
        try {
            if (this.f26831d == null) {
                throw null;
            }
            AbstractC5270tf abstractC5270tf = rs0.f22810b;
            if (!abstractC5270tf.g()) {
                C5637wZ0 c5637wZ0 = rs0.f22812d;
                if (c5637wZ0 != null) {
                    long j10 = c5637wZ0.f34597d;
                    if (j10 == -1 || j10 >= i()) {
                        C2860aU0 c2860aU0 = (C2860aU0) this.f26830c.get(this.f26833f);
                        if (c2860aU0 == null || c2860aU0.g() != -1 || c2860aU0.f() == rs0.f22811c) {
                            i10 = rs0.f22811c;
                            c2860aU0O = o(i10, c5637wZ0);
                            if (this.f26833f == null) {
                                this.f26833f = c2860aU0O.e();
                            }
                            if (c5637wZ0 != null && c5637wZ0.b()) {
                                obj = c5637wZ0.f34594a;
                                long j11 = c5637wZ0.f34597d;
                                i11 = c5637wZ0.f34595b;
                                c2860aU0O2 = o(i10, new C5637wZ0(obj, j11, i11));
                                if (!c2860aU0O2.i()) {
                                    c2860aU0O2.j(true);
                                    C4891qe c4891qe = this.f26829b;
                                    abstractC5270tf.o(obj, c4891qe);
                                    c4891qe.c(i11);
                                    Math.max(0L, AbstractC4634ob0.L(0L) + AbstractC4634ob0.L(0L));
                                }
                            }
                            if (!c2860aU0O.i()) {
                                c2860aU0O.j(true);
                            }
                            if (c2860aU0O.e().equals(this.f26833f) && !c2860aU0O.k()) {
                                c2860aU0O.l(true);
                                this.f26831d.h(rs0, c2860aU0O.e());
                            }
                        }
                    }
                } else {
                    i10 = rs0.f22811c;
                    c2860aU0O = o(i10, c5637wZ0);
                    if (this.f26833f == null) {
                        this.f26833f = c2860aU0O.e();
                    }
                    if (c5637wZ0 != null) {
                        obj = c5637wZ0.f34594a;
                        long j12 = c5637wZ0.f34597d;
                        i11 = c5637wZ0.f34595b;
                        c2860aU0O2 = o(i10, new C5637wZ0(obj, j12, i11));
                        if (!c2860aU0O2.i()) {
                            c2860aU0O2.j(true);
                            C4891qe c4891qe2 = this.f26829b;
                            abstractC5270tf.o(obj, c4891qe2);
                            c4891qe2.c(i11);
                            Math.max(0L, AbstractC4634ob0.L(0L) + AbstractC4634ob0.L(0L));
                        }
                    }
                    if (!c2860aU0O.i()) {
                        c2860aU0O.j(true);
                    }
                    if (c2860aU0O.e().equals(this.f26833f)) {
                        c2860aU0O.l(true);
                        this.f26831d.h(rs0, c2860aU0O.e());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ C2337Re j() {
        return this.f26828a;
    }

    final /* synthetic */ C4891qe k() {
        return this.f26829b;
    }
}
