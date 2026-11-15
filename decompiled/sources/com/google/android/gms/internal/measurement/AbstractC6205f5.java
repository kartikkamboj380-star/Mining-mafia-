package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6205f5 extends AbstractC6356w4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected C6179c6 zzc = C6179c6.a();

    private static final boolean A(AbstractC6205f5 abstractC6205f5, boolean z9) {
        byte bByteValue = ((Byte) abstractC6205f5.B(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zB = N5.a().b(abstractC6205f5.getClass()).b(abstractC6205f5);
        if (z9) {
            abstractC6205f5.B(2, true != zB ? null : abstractC6205f5, null);
        }
        return zB;
    }

    private final int h(Q5 q10) {
        return N5.a().b(getClass()).a(this);
    }

    static AbstractC6205f5 r(Class cls) {
        Map map = zzd;
        AbstractC6205f5 abstractC6205f5 = (AbstractC6205f5) map.get(cls);
        if (abstractC6205f5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC6205f5 = (AbstractC6205f5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC6205f5 != null) {
            return abstractC6205f5;
        }
        AbstractC6205f5 abstractC6205f6 = (AbstractC6205f5) ((AbstractC6205f5) AbstractC6233i6.h(cls)).B(6, null, null);
        if (abstractC6205f6 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC6205f6);
        return abstractC6205f6;
    }

    protected static void s(Class cls, AbstractC6205f5 abstractC6205f5) {
        abstractC6205f5.k();
        zzd.put(cls, abstractC6205f5);
    }

    protected static Object t(F5 f10, String str, Object[] objArr) {
        return new P5(f10, str, objArr);
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static InterfaceC6241j5 v() {
        return C6214g5.b();
    }

    protected static InterfaceC6250k5 w() {
        return C6330t5.b();
    }

    protected static InterfaceC6250k5 x(InterfaceC6250k5 interfaceC6250k5) {
        int size = interfaceC6250k5.size();
        return interfaceC6250k5.X(size + size);
    }

    protected static InterfaceC6259l5 y() {
        return O5.b();
    }

    protected static InterfaceC6259l5 z(InterfaceC6259l5 interfaceC6259l5) {
        int size = interfaceC6259l5.size();
        return interfaceC6259l5.X(size + size);
    }

    protected abstract Object B(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.F5
    public final int b() {
        if (j()) {
            int iH = h(null);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iH).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iH);
            throw new IllegalStateException(sb.toString());
        }
        int i10 = this.zzb & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iH2 = h(null);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & LinearLayoutManager.INVALID_OFFSET) | iH2;
            return iH2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iH2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iH2);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final void c(P4 p10) {
        N5.a().b(getClass()).h(this, Q4.D(p10));
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final /* synthetic */ E5 d() {
        return (AbstractC6187d5) B(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.G5
    public final /* synthetic */ F5 e() {
        return (AbstractC6205f5) B(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return N5.a().b(getClass()).e(this, (AbstractC6205f5) obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC6356w4
    final int f(Q5 q10) {
        if (j()) {
            int iA = q10.a(this);
            if (iA >= 0) {
                return iA;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(iA).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(iA);
            throw new IllegalStateException(sb.toString());
        }
        int i10 = this.zzb & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iA2 = q10.a(this);
        if (iA2 >= 0) {
            this.zzb = (this.zzb & LinearLayoutManager.INVALID_OFFSET) | iA2;
            return iA2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iA2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(iA2);
        throw new IllegalStateException(sb2.toString());
    }

    public final int hashCode() {
        if (j()) {
            return m();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iM = m();
        this.zza = iM;
        return iM;
    }

    public final boolean i() {
        return A(this, true);
    }

    final boolean j() {
        return (this.zzb & LinearLayoutManager.INVALID_OFFSET) != 0;
    }

    final void k() {
        this.zzb &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    final AbstractC6205f5 l() {
        return (AbstractC6205f5) B(4, null, null);
    }

    final int m() {
        return N5.a().b(getClass()).c(this);
    }

    protected final void n() {
        N5.a().b(getClass()).f(this);
        k();
    }

    protected final AbstractC6187d5 o() {
        return (AbstractC6187d5) B(5, null, null);
    }

    public final AbstractC6187d5 p() {
        AbstractC6187d5 abstractC6187d5 = (AbstractC6187d5) B(5, null, null);
        abstractC6187d5.q(this);
        return abstractC6187d5;
    }

    final void q(int i10) {
        this.zzb = (this.zzb & LinearLayoutManager.INVALID_OFFSET) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final String toString() {
        return H5.a(this, super.toString());
    }
}
