package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B2 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(InterfaceC6289p interfaceC6289p) {
        if (interfaceC6289p == null) {
            return false;
        }
        Double dZzd = interfaceC6289p.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static M e(String str) {
        M mC = null;
        if (str != null && !str.isEmpty()) {
            mC = M.c(Integer.parseInt(str));
        }
        if (mC != null) {
            return mC;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(InterfaceC6289p interfaceC6289p, InterfaceC6289p interfaceC6289p2) {
        if (!interfaceC6289p.getClass().equals(interfaceC6289p2.getClass())) {
            return false;
        }
        if ((interfaceC6289p instanceof C6333u) || (interfaceC6289p instanceof C6271n)) {
            return true;
        }
        if (interfaceC6289p instanceof C6226i) {
            if (Double.isNaN(interfaceC6289p.zzd().doubleValue()) || Double.isNaN(interfaceC6289p2.zzd().doubleValue())) {
                return false;
            }
            return interfaceC6289p.zzd().equals(interfaceC6289p2.zzd());
        }
        if (interfaceC6289p instanceof C6324t) {
            return interfaceC6289p.zzc().equals(interfaceC6289p2.zzc());
        }
        if (interfaceC6289p instanceof C6208g) {
            return interfaceC6289p.zze().equals(interfaceC6289p2.zze());
        }
        return interfaceC6289p == interfaceC6289p2;
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return ((long) g(d10)) & 4294967295L;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object j(InterfaceC6289p interfaceC6289p) {
        if (InterfaceC6289p.f36809y.equals(interfaceC6289p)) {
            return null;
        }
        if (InterfaceC6289p.f36808x.equals(interfaceC6289p)) {
            return "";
        }
        if (interfaceC6289p instanceof C6262m) {
            return k((C6262m) interfaceC6289p);
        }
        if (!(interfaceC6289p instanceof C6199f)) {
            return !interfaceC6289p.zzd().isNaN() ? interfaceC6289p.zzd() : interfaceC6289p.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C6199f) interfaceC6289p).iterator();
        while (it.hasNext()) {
            Object objJ = j((InterfaceC6289p) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(C6262m c6262m) {
        HashMap map = new HashMap();
        for (String str : c6262m.c()) {
            Object objJ = j(c6262m.Q(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(C6157a2 c6157a2) {
        int iG = g(c6157a2.h("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c6157a2.e("runtime.counter", new C6226i(Double.valueOf(iG)));
        return iG;
    }
}
