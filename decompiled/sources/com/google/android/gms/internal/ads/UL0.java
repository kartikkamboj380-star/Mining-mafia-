package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.CodedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class UL0 extends AbstractC3093cL0 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, UL0> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected C2972bN0 zzt = C2972bN0.a();

    protected static UL0 A(UL0 ul0, AbstractC5231tL0 abstractC5231tL0) throws C3598gM0 {
        HL0 hl0 = HL0.f19274c;
        int i10 = AbstractC3722hL0.f28900a;
        UL0 ul0B = B(ul0, abstractC5231tL0, HL0.f19274c);
        b0(ul0B);
        return ul0B;
    }

    protected static UL0 B(UL0 ul0, AbstractC5231tL0 abstractC5231tL0, HL0 hl0) throws C3598gM0 {
        UL0 ul0C0 = c0(ul0, abstractC5231tL0, hl0);
        b0(ul0C0);
        return ul0C0;
    }

    protected static UL0 C(UL0 ul0, byte[] bArr) throws C3598gM0 {
        int length = bArr.length;
        HL0 hl0 = HL0.f19274c;
        int i10 = AbstractC3722hL0.f28900a;
        UL0 ul0A0 = a0(ul0, bArr, 0, length, HL0.f19274c);
        b0(ul0A0);
        return ul0A0;
    }

    protected static UL0 D(UL0 ul0, byte[] bArr, HL0 hl0) throws C3598gM0 {
        UL0 ul0A0 = a0(ul0, bArr, 0, bArr.length, hl0);
        b0(ul0A0);
        return ul0A0;
    }

    protected static UL0 E(UL0 ul0, InputStream inputStream) throws C3598gM0 {
        AbstractC5609wL0 abstractC5609wL0D = AbstractC5609wL0.d(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE);
        HL0 hl0 = HL0.f19274c;
        int i10 = AbstractC3722hL0.f28900a;
        UL0 ul0Z = z(ul0, abstractC5609wL0D, HL0.f19274c);
        b0(ul0Z);
        return ul0Z;
    }

    protected static UL0 F(UL0 ul0, InputStream inputStream, HL0 hl0) throws C3598gM0 {
        UL0 ul0Z = z(ul0, AbstractC5609wL0.d(inputStream, CodedOutputStream.DEFAULT_BUFFER_SIZE), hl0);
        b0(ul0Z);
        return ul0Z;
    }

    static UL0 T(Class cls) {
        UL0 ul0 = zzd.get(cls);
        if (ul0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                ul0 = zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (ul0 != null) {
            return ul0;
        }
        UL0 ul0F = ((UL0) AbstractC3726hN0.j(cls)).f();
        if (ul0F == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, ul0F);
        return ul0F;
    }

    protected static void U(Class cls, UL0 ul0) {
        ul0.q();
        zzd.put(cls, ul0);
    }

    protected static Object V(InterfaceC5863yM0 interfaceC5863yM0, String str, Object[] objArr) {
        return new JM0(interfaceC5863yM0, str, objArr);
    }

    private int X(PM0 pm0) {
        if (pm0 != null) {
            return pm0.a(this);
        }
        return HM0.a().b(getClass()).a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(UL0 ul0, boolean z9) {
        byte bByteValue = ((Byte) ul0.Y(TL0.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zF = HM0.a().b(ul0.getClass()).f(ul0);
        if (z9) {
            ul0.Y(TL0.SET_MEMOIZED_IS_INITIALIZED, true != zF ? null : ul0, null);
        }
        return zF;
    }

    private static UL0 a0(UL0 ul0, byte[] bArr, int i10, int i11, HL0 hl0) throws C3598gM0 {
        if (i11 == 0) {
            return ul0;
        }
        UL0 ul0L = ul0.L();
        try {
            PM0 pm0B = HM0.a().b(ul0L.getClass());
            pm0B.i(ul0L, bArr, i10, i10 + i11, new C3848iL0(hl0));
            pm0B.b(ul0L);
            return ul0L;
        } catch (ZM0 e10) {
            throw e10.a();
        } catch (C3598gM0 e11) {
            if (e11.b()) {
                throw new C3598gM0(e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C3598gM0) {
                throw ((C3598gM0) e12.getCause());
            }
            throw new C3598gM0(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3598gM0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static UL0 b0(UL0 ul0) throws C3598gM0 {
        if (ul0 == null || ul0.b()) {
            return ul0;
        }
        throw ul0.m().a();
    }

    private static UL0 c0(UL0 ul0, AbstractC5231tL0 abstractC5231tL0, HL0 hl0) throws C3598gM0 {
        AbstractC5609wL0 abstractC5609wL0S = abstractC5231tL0.s();
        UL0 ul0Z = z(ul0, abstractC5609wL0S, hl0);
        abstractC5609wL0S.l(0);
        return ul0Z;
    }

    static Object s(Method method, Object obj, Object... objArr) {
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

    protected static ZL0 t() {
        return VL0.b();
    }

    protected static ZL0 u(ZL0 zl0) {
        int size = zl0.size();
        return zl0.x(size + size);
    }

    protected static InterfaceC3095cM0 v() {
        return C4226lM0.d();
    }

    protected static InterfaceC3095cM0 w(InterfaceC3095cM0 interfaceC3095cM0) {
        int size = interfaceC3095cM0.size();
        return interfaceC3095cM0.x(size + size);
    }

    protected static InterfaceC3221dM0 x() {
        return IM0.b();
    }

    protected static InterfaceC3221dM0 y(InterfaceC3221dM0 interfaceC3221dM0) {
        int size = interfaceC3221dM0.size();
        return interfaceC3221dM0.x(size + size);
    }

    static UL0 z(UL0 ul0, AbstractC5609wL0 abstractC5609wL0, HL0 hl0) throws C3598gM0 {
        UL0 ul0L = ul0.L();
        try {
            PM0 pm0B = HM0.a().b(ul0L.getClass());
            pm0B.h(ul0L, C5735xL0.N(abstractC5609wL0), hl0);
            pm0B.b(ul0L);
            return ul0L;
        } catch (ZM0 e10) {
            throw e10.a();
        } catch (C3598gM0 e11) {
            if (e11.b()) {
                throw new C3598gM0(e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C3598gM0) {
                throw ((C3598gM0) e12.getCause());
            }
            throw new C3598gM0(e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C3598gM0) {
                throw ((C3598gM0) e13.getCause());
            }
            throw e13;
        }
    }

    void G(int i10) {
        this.zzq = i10;
    }

    void H() {
        this.zzq = 0;
    }

    boolean I() {
        return r() == 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5989zM0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final UL0 f() {
        return (UL0) Y(TL0.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5863yM0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final QL0 g() {
        return (QL0) Y(TL0.NEW_BUILDER, null, null);
    }

    UL0 L() {
        return (UL0) Y(TL0.NEW_MUTABLE_INSTANCE, null, null);
    }

    int M() {
        return HM0.a().b(getClass()).c(this);
    }

    protected void O() {
        HM0.a().b(getClass()).b(this);
        q();
    }

    protected final QL0 P() {
        return (QL0) Y(TL0.NEW_BUILDER, null, null);
    }

    public final QL0 Q() {
        QL0 ql0 = (QL0) Y(TL0.NEW_BUILDER, null, null);
        ql0.x(this);
        return ql0;
    }

    void R() {
        k(Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    Object S() {
        return Y(TL0.BUILD_MESSAGE_INFO, null, null);
    }

    protected abstract Object Y(TL0 tl0, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.InterfaceC5989zM0
    public final boolean b() {
        return Z(this, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5863yM0
    public void d(CL0 cl0) {
        HM0.a().b(getClass()).g(this, DL0.D(cl0));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5863yM0
    public int e() {
        return l(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return HM0.a().b(getClass()).e(this, (UL0) obj);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5863yM0
    public final FM0 h() {
        return (FM0) Y(TL0.GET_PARSER, null, null);
    }

    public int hashCode() {
        if (p()) {
            return M();
        }
        if (I()) {
            G(M());
        }
        return r();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3093cL0
    int j() {
        return this.zzc & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3093cL0
    void k(int i10) {
        if (i10 >= 0) {
            this.zzc = i10 | (this.zzc & Integer.MIN_VALUE);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i10);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3093cL0
    int l(PM0 pm0) {
        if (!p()) {
            if (j() != Integer.MAX_VALUE) {
                return j();
            }
            int iX = X(pm0);
            k(iX);
            return iX;
        }
        int iX2 = X(pm0);
        if (iX2 >= 0) {
            return iX2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iX2).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(iX2);
        throw new IllegalStateException(sb.toString());
    }

    boolean p() {
        return (this.zzc & Integer.MIN_VALUE) != 0;
    }

    void q() {
        this.zzc &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    int r() {
        return this.zzq;
    }

    public String toString() {
        return AM0.a(this, super.toString());
    }
}
