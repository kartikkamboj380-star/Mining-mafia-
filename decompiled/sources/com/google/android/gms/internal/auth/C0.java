package com.google.android.gms.internal.auth;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 extends AbstractC6072b0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C6120r1 zzc = C6120r1.a();

    static C0 b(Class cls) {
        Map map = zzb;
        C0 c10 = (C0) map.get(cls);
        if (c10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c10 = (C0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (c10 != null) {
            return c10;
        }
        C0 c11 = (C0) ((C0) A1.e(cls)).m(6, null, null);
        if (c11 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, c11);
        return c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static com.google.android.gms.internal.auth.C0 d(com.google.android.gms.internal.auth.C0 r3, byte[] r4) throws com.google.android.gms.internal.auth.H0 {
        /*
            int r0 = r4.length
            com.google.android.gms.internal.auth.v0 r1 = com.google.android.gms.internal.auth.C6131v0.f36160b
            r2 = 0
            com.google.android.gms.internal.auth.C0 r3 = n(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.m(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            java.lang.Class r1 = r3.getClass()
            com.google.android.gms.internal.auth.h1 r2 = com.google.android.gms.internal.auth.C6091h1.a()
            com.google.android.gms.internal.auth.k1 r1 = r2.b(r1)
            boolean r1 = r1.e(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.m(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.o1 r4 = new com.google.android.gms.internal.auth.o1
            r4.<init>(r3)
            com.google.android.gms.internal.auth.H0 r4 = r4.a()
            r4.e(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0.d(com.google.android.gms.internal.auth.C0, byte[]):com.google.android.gms.internal.auth.C0");
    }

    protected static E0 e() {
        return C6094i1.b();
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object g(Z0 z9, String str, Object[] objArr) {
        return new C6097j1(z9, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void j(Class cls, C0 c10) {
        c10.i();
        zzb.put(cls, c10);
    }

    private static C0 n(C0 c10, byte[] bArr, int i10, int i11, C6131v0 c6131v0) throws H0 {
        C0 c0C = c10.c();
        try {
            InterfaceC6100k1 interfaceC6100k1B = C6091h1.a().b(c0C.getClass());
            interfaceC6100k1B.c(c0C, bArr, 0, i11, new C6081e0(c6131v0));
            interfaceC6100k1B.a(c0C);
            return c0C;
        } catch (H0 e10) {
            e10.e(c0C);
            throw e10;
        } catch (C6112o1 e11) {
            H0 h0A = e11.a();
            h0A.e(c0C);
            throw h0A;
        } catch (IOException e12) {
            if (e12.getCause() instanceof H0) {
                throw ((H0) e12.getCause());
            }
            H0 h10 = new H0(e12);
            h10.e(c0C);
            throw h10;
        } catch (IndexOutOfBoundsException unused) {
            H0 h0F = H0.f();
            h0F.e(c0C);
            throw h0F;
        }
    }

    final int a() {
        return C6091h1.a().b(getClass()).zza(this);
    }

    final C0 c() {
        return (C0) m(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C6091h1.a().b(getClass()).b(this, (C0) obj);
    }

    protected final void h() {
        C6091h1.a().b(getClass()).a(this);
        i();
    }

    public final int hashCode() {
        if (l()) {
            return a();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iA = a();
        this.zza = iA;
        return iA;
    }

    final void i() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final void k(int i10) {
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final boolean l() {
        return (this.zzd & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    protected abstract Object m(int i10, Object obj, Object obj2);

    public final String toString() {
        return AbstractC6073b1.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC6070a1
    public final /* synthetic */ Z0 zze() {
        return (C0) m(6, null, null);
    }
}
