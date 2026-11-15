package com.google.android.gms.internal.play_billing;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6445p0 extends AbstractC6483z {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C6481y1 zzc = C6481y1.c();

    static AbstractC6445p0 i(Class cls) {
        Map map = zzb;
        AbstractC6445p0 abstractC6445p0 = (AbstractC6445p0) map.get(cls);
        if (abstractC6445p0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6445p0 = (AbstractC6445p0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC6445p0 != null) {
            return abstractC6445p0;
        }
        AbstractC6445p0 abstractC6445p1 = (AbstractC6445p0) ((AbstractC6445p0) H1.j(cls)).w(6, null, null);
        if (abstractC6445p1 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC6445p1);
        return abstractC6445p1;
    }

    protected static AbstractC6445p0 l(AbstractC6445p0 abstractC6445p0, byte[] bArr, C6401e0 c6401e0) throws A0 {
        AbstractC6445p0 abstractC6445p0Y = y(abstractC6445p0, bArr, 0, bArr.length, c6401e0);
        if (abstractC6445p0Y == null || abstractC6445p0Y.j()) {
            return abstractC6445p0Y;
        }
        A0 a0A = new C6473w1(abstractC6445p0Y).a();
        a0A.f(abstractC6445p0Y);
        throw a0A;
    }

    protected static InterfaceC6464u0 m() {
        return C6449q0.d();
    }

    protected static InterfaceC6472w0 n() {
        return C6402e1.b();
    }

    static Object o(Method method, Object obj, Object... objArr) {
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

    protected static Object p(V0 v10, String str, Object[] objArr) {
        return new C6406f1(v10, str, objArr);
    }

    protected static void s(Class cls, AbstractC6445p0 abstractC6445p0) {
        abstractC6445p0.r();
        zzb.put(cls, abstractC6445p0);
    }

    protected static final boolean u(AbstractC6445p0 abstractC6445p0, boolean z9) {
        byte bByteValue = ((Byte) abstractC6445p0.w(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = C6398d1.a().b(abstractC6445p0.getClass()).b(abstractC6445p0);
        if (z9) {
            abstractC6445p0.w(2, true != zB ? null : abstractC6445p0, null);
        }
        return zB;
    }

    private final int x(InterfaceC6410g1 interfaceC6410g1) {
        return C6398d1.a().b(getClass()).zza(this);
    }

    private static AbstractC6445p0 y(AbstractC6445p0 abstractC6445p0, byte[] bArr, int i10, int i11, C6401e0 c6401e0) throws A0 {
        if (i11 == 0) {
            return abstractC6445p0;
        }
        AbstractC6445p0 abstractC6445p0K = abstractC6445p0.k();
        try {
            InterfaceC6410g1 interfaceC6410g1B = C6398d1.a().b(abstractC6445p0K.getClass());
            interfaceC6410g1B.c(abstractC6445p0K, bArr, 0, i11, new D(c6401e0));
            interfaceC6410g1B.a(abstractC6445p0K);
            return abstractC6445p0K;
        } catch (A0 e10) {
            e10.f(abstractC6445p0K);
            throw e10;
        } catch (C6473w1 e11) {
            A0 a0A = e11.a();
            a0A.f(abstractC6445p0K);
            throw a0A;
        } catch (IOException e12) {
            if (e12.getCause() instanceof A0) {
                throw ((A0) e12.getCause());
            }
            A0 a10 = new A0(e12);
            a10.f(abstractC6445p0K);
            throw a10;
        } catch (IndexOutOfBoundsException unused) {
            A0 a0G = A0.g();
            a0G.f(abstractC6445p0K);
            throw a0G;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final /* synthetic */ U0 B() {
        return (AbstractC6437n0) w(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC6483z
    final int a(InterfaceC6410g1 interfaceC6410g1) {
        if (v()) {
            int iZza = interfaceC6410g1.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iZza);
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iZza2 = interfaceC6410g1.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | iZza2;
            return iZza2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iZza2);
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final int b() {
        if (v()) {
            int iX = x(null);
            if (iX >= 0) {
                return iX;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iX);
        }
        int i10 = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iX2 = x(null);
        if (iX2 >= 0) {
            this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | iX2;
            return iX2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iX2);
    }

    @Override // com.google.android.gms.internal.play_billing.W0
    public final /* synthetic */ V0 c() {
        return (AbstractC6445p0) w(6, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.V0
    public final void d(Z z9) {
        C6398d1.a().b(getClass()).e(this, C6385a0.w(z9));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C6398d1.a().b(getClass()).d(this, (AbstractC6445p0) obj);
    }

    final int f() {
        return C6398d1.a().b(getClass()).zzb(this);
    }

    protected final AbstractC6437n0 g() {
        return (AbstractC6437n0) w(5, null, null);
    }

    public final AbstractC6437n0 h() {
        AbstractC6437n0 abstractC6437n0 = (AbstractC6437n0) w(5, null, null);
        abstractC6437n0.f(this);
        return abstractC6437n0;
    }

    public final int hashCode() {
        if (v()) {
            return f();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iF = f();
        this.zza = iF;
        return iF;
    }

    public final boolean j() {
        return u(this, true);
    }

    final AbstractC6445p0 k() {
        return (AbstractC6445p0) w(4, null, null);
    }

    protected final void q() {
        C6398d1.a().b(getClass()).a(this);
        r();
    }

    final void r() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final void t(int i10) {
        this.zzd = (this.zzd & LinearLayoutManager.INVALID_OFFSET) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final String toString() {
        return X0.a(this, super.toString());
    }

    final boolean v() {
        return (this.zzd & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    protected abstract Object w(int i10, Object obj, Object obj2);
}
