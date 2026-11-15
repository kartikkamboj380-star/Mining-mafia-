package K4;

import android.content.Context;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.AbstractC3319e9;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.B8;
import com.google.android.gms.internal.ads.C2575Vt;
import com.google.android.gms.internal.ads.C3695h8;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static B8 f2627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f2628b = new Object();

    /* JADX WARN: Code duplicated, block: B:16:0x0036 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0010, B:9:0x0014, B:11:0x001d, B:13:0x002f, B:17:0x003b, B:16:0x0036, B:18:0x003d), top: B:22:0x0010 }] */
    public N(Context context) {
        B8 b8A;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f2628b) {
            try {
                if (f2627a == null) {
                    AbstractC3892ii.a(context);
                    if (ClientLibraryUtils.isPackageSide()) {
                        b8A = AbstractC3319e9.a(context, null);
                    } else {
                        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29930p5)).booleanValue()) {
                            b8A = C0799z.b(context);
                        } else {
                            b8A = AbstractC3319e9.a(context, null);
                        }
                    }
                    f2627a = b8A;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.common.util.concurrent.p a(String str) {
        C2575Vt c2575Vt = new C2575Vt();
        f2627a.b(new M(str, null, c2575Vt));
        return c2575Vt;
    }

    public final com.google.common.util.concurrent.p b(int i10, String str, Map map, byte[] bArr) {
        K k10 = new K(null);
        I i11 = new I(this, str, k10);
        L4.m mVar = new L4.m(null);
        J j10 = new J(this, i10, str, k10, i11, bArr, map, mVar);
        if (L4.m.j()) {
            try {
                mVar.b(str, "GET", j10.n(), j10.o());
            } catch (C3695h8 e10) {
                String message = e10.getMessage();
                int i12 = AbstractC0786o0.f2696b;
                L4.p.f(message);
            }
        }
        f2627a.b(j10);
        return k10;
    }
}
