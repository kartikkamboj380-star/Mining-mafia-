package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class Y4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Y4 f36547d = new Y4(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Y5 f36548a = new U5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f36549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36550c;

    private Y4() {
    }

    static void c(P4 p10, EnumC6269m6 enumC6269m6, int i10, Object obj) {
        if (enumC6269m6 == EnumC6269m6.f36768l) {
            F5 f10 = (F5) obj;
            AbstractC6268m5.d(f10);
            p10.i(i10, 3);
            f10.c(p10);
            p10.i(i10, 4);
            return;
        }
        p10.i(i10, enumC6269m6.d());
        EnumC6278n6 enumC6278n6 = EnumC6278n6.INT;
        switch (enumC6269m6.ordinal()) {
            case 0:
                p10.A(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                p10.y(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                p10.z(((Long) obj).longValue());
                break;
            case 3:
                p10.z(((Long) obj).longValue());
                break;
            case 4:
                p10.w(((Integer) obj).intValue());
                break;
            case 5:
                p10.A(((Long) obj).longValue());
                break;
            case 6:
                p10.y(((Integer) obj).intValue());
                break;
            case 7:
                p10.v(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof K4)) {
                    p10.C((String) obj);
                } else {
                    p10.r((K4) obj);
                }
                break;
            case 9:
                ((F5) obj).c(p10);
                break;
            case 10:
                p10.u((F5) obj);
                break;
            case 11:
                if (!(obj instanceof K4)) {
                    byte[] bArr = (byte[]) obj;
                    p10.s(bArr, 0, bArr.length);
                } else {
                    p10.r((K4) obj);
                }
                break;
            case 12:
                p10.x(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC6223h5)) {
                    p10.w(((Integer) obj).intValue());
                } else {
                    p10.w(((InterfaceC6223h5) obj).zza());
                }
                break;
            case 14:
                p10.y(((Integer) obj).intValue());
                break;
            case 15:
                p10.A(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                p10.x((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                p10.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    static int d(EnumC6269m6 enumC6269m6, int i10, Object obj) {
        int iE = P4.E(i10 << 3);
        if (enumC6269m6 == EnumC6269m6.f36768l) {
            AbstractC6268m5.d((F5) obj);
            iE += iE;
        }
        return iE + e(enumC6269m6, obj);
    }

    static int e(EnumC6269m6 enumC6269m6, Object obj) {
        int iD;
        int iE;
        EnumC6269m6 enumC6269m7 = EnumC6269m6.f36759c;
        EnumC6278n6 enumC6278n6 = EnumC6278n6.INT;
        switch (enumC6269m6.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                int i10 = P4.f36457d;
                return 8;
            case 1:
                ((Float) obj).getClass();
                int i11 = P4.f36457d;
                return 4;
            case 2:
                return P4.a(((Long) obj).longValue());
            case 3:
                return P4.a(((Long) obj).longValue());
            case 4:
                return P4.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                int i12 = P4.f36457d;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                int i13 = P4.f36457d;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                int i14 = P4.f36457d;
                return 1;
            case 8:
                if (!(obj instanceof K4)) {
                    return P4.b((String) obj);
                }
                int i15 = P4.f36457d;
                iD = ((K4) obj).d();
                iE = P4.E(iD);
                break;
                break;
            case 9:
                return ((F5) obj).b();
            case 10:
                return P4.c((F5) obj);
            case 11:
                if (!(obj instanceof K4)) {
                    int i16 = P4.f36457d;
                    iD = ((byte[]) obj).length;
                    iE = P4.E(iD);
                } else {
                    int i17 = P4.f36457d;
                    iD = ((K4) obj).d();
                    iE = P4.E(iD);
                }
                break;
            case 12:
                return P4.E(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC6223h5 ? P4.a(((InterfaceC6223h5) obj).zza()) : P4.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                int i18 = P4.f36457d;
                return 4;
            case 15:
                ((Long) obj).getClass();
                int i19 = P4.f36457d;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return P4.E((iIntValue >> 31) ^ (iIntValue + iIntValue));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return P4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iE + iD;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[RETURN] */
    private static final void f(X4 x10, Object obj) {
        boolean z9;
        x10.zzb();
        byte[] bArr = AbstractC6268m5.f36752b;
        obj.getClass();
        EnumC6269m6 enumC6269m6 = EnumC6269m6.f36759c;
        EnumC6278n6 enumC6278n6 = EnumC6278n6.INT;
        switch (r0.c()) {
            case INT:
                z9 = obj instanceof Integer;
                if (z9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case LONG:
                z9 = obj instanceof Long;
                if (z9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case FLOAT:
                z9 = obj instanceof Float;
                if (z9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case DOUBLE:
                z9 = obj instanceof Double;
                if (z9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case BOOLEAN:
                z9 = obj instanceof Boolean;
                if (z9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case STRING:
                z9 = obj instanceof String;
                if (z9) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof K4) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof InterfaceC6223h5)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            case MESSAGE:
                if (obj instanceof F5) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(x10.zza()), x10.zzb().c(), obj.getClass().getName()));
        }
    }

    public final void a() {
        if (this.f36549b) {
            return;
        }
        Y5 y9 = this.f36548a;
        int iC = y9.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Object value = y9.e(i10).getValue();
            if (value instanceof AbstractC6205f5) {
                ((AbstractC6205f5) value).n();
            }
        }
        Iterator it = y9.f().iterator();
        while (it.hasNext()) {
            Object value2 = ((Map.Entry) it.next()).getValue();
            if (value2 instanceof AbstractC6205f5) {
                ((AbstractC6205f5) value2).n();
            }
        }
        y9.a();
        this.f36549b = true;
    }

    public final void b(X4 x10, Object obj) {
        if (!x10.zzd()) {
            f(x10, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                f(x10, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        this.f36548a.put(x10, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        Y4 y9 = new Y4();
        Y5 y10 = this.f36548a;
        int iC = y10.c();
        for (int i10 = 0; i10 < iC; i10++) {
            Map.Entry entryE = y10.e(i10);
            p070h.w.a(((V5) entryE).c());
            y9.b(null, entryE.getValue());
        }
        for (Map.Entry entry : y10.f()) {
            p070h.w.a(entry.getKey());
            y9.b(null, entry.getValue());
        }
        y9.f36550c = this.f36550c;
        return y9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Y4) {
            return this.f36548a.equals(((Y4) obj).f36548a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36548a.hashCode();
    }

    private Y4(boolean z9) {
        a();
        a();
    }
}
