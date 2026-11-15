package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5326u6[] f24202a;

    public V6(long j10, InterfaceC5326u6... interfaceC5326u6Arr) {
        this.f24202a = interfaceC5326u6Arr;
    }

    private static final InterfaceC5326u6 h(InterfaceC5326u6 interfaceC5326u6, Class cls, InterfaceC2470Ts0 interfaceC2470Ts0) {
        if (!cls.isAssignableFrom(interfaceC5326u6.getClass())) {
            return null;
        }
        InterfaceC5326u6 interfaceC5326u7 = (InterfaceC5326u6) cls.cast(interfaceC5326u6);
        if (interfaceC2470Ts0.zza(interfaceC5326u7)) {
            return interfaceC5326u7;
        }
        return null;
    }

    public final int a() {
        return this.f24202a.length;
    }

    public final InterfaceC5326u6 b(int i10) {
        return this.f24202a[i10];
    }

    public final InterfaceC5326u6 c(Class cls, InterfaceC2470Ts0 interfaceC2470Ts0) {
        for (InterfaceC5326u6 interfaceC5326u6 : this.f24202a) {
            InterfaceC5326u6 interfaceC5326u6H = h(interfaceC5326u6, cls, interfaceC2470Ts0);
            if (interfaceC5326u6H != null) {
                return interfaceC5326u6H;
            }
        }
        return null;
    }

    public final AbstractC5931yu0 d(Class cls) {
        int i10 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        for (InterfaceC5326u6 interfaceC5326u6 : this.f24202a) {
            if (cls.isAssignableFrom(interfaceC5326u6.getClass())) {
                c5553vu0.g((InterfaceC5326u6) cls.cast(interfaceC5326u6));
            }
        }
        return c5553vu0.j();
    }

    public final AbstractC5931yu0 e(Class cls, InterfaceC2470Ts0 interfaceC2470Ts0) {
        int i10 = AbstractC5931yu0.f35482c;
        C5553vu0 c5553vu0 = new C5553vu0();
        for (InterfaceC5326u6 interfaceC5326u6 : this.f24202a) {
            InterfaceC5326u6 interfaceC5326u6H = h(interfaceC5326u6, cls, interfaceC2470Ts0);
            if (interfaceC5326u6H != null) {
                c5553vu0.g(interfaceC5326u6H);
            }
        }
        return c5553vu0.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && V6.class == obj.getClass() && Arrays.equals(this.f24202a, ((V6) obj).f24202a);
    }

    public final V6 f(V6 v10) {
        return v10 == null ? this : g(v10.f24202a);
    }

    public final V6 g(InterfaceC5326u6... interfaceC5326u6Arr) {
        int length = interfaceC5326u6Arr.length;
        if (length == 0) {
            return this;
        }
        InterfaceC5326u6[] interfaceC5326u6Arr2 = this.f24202a;
        String str = AbstractC4634ob0.f32117a;
        int length2 = interfaceC5326u6Arr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC5326u6Arr2, length2 + length);
        System.arraycopy(interfaceC5326u6Arr, 0, objArrCopyOf, length2, length);
        return new V6(-9223372036854775807L, (InterfaceC5326u6[]) objArrCopyOf);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f24202a) * 31) + Long.hashCode(-9223372036854775807L);
    }

    public final String toString() {
        String string = Arrays.toString(this.f24202a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 8);
        sb.append("entries=");
        sb.append(string);
        sb.append("");
        return sb.toString();
    }

    public V6(List list) {
        this.f24202a = (InterfaceC5326u6[]) list.toArray(new InterfaceC5326u6[0]);
    }
}
