package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2805a3 extends AbstractC3056c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f26393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f26394d;

    public C2805a3() {
        super(new F1());
        this.f26392b = -9223372036854775807L;
        this.f26393c = new long[0];
        this.f26394d = new long[0];
    }

    private static Double g(P10 p10) {
        return Double.valueOf(Double.longBitsToDouble(p10.d()));
    }

    private static String h(P10 p10) {
        int iS = p10.S();
        int iF = p10.F();
        p10.J(iS);
        return new String(p10.H(), iF, iS);
    }

    private static HashMap i(P10 p10) {
        int iH = p10.h();
        HashMap map = new HashMap(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            String strH = h(p10);
            Object objJ = j(p10, p10.R());
            if (objJ != null) {
                map.put(strH, objJ);
            }
        }
        return map;
    }

    private static Object j(P10 p10, int i10) {
        if (i10 == 0) {
            return g(p10);
        }
        if (i10 == 1) {
            return Boolean.valueOf(p10.R() == 1);
        }
        if (i10 == 2) {
            return h(p10);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return i(p10);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) g(p10).doubleValue());
                p10.J(2);
                return date;
            }
            int iH = p10.h();
            ArrayList arrayList = new ArrayList(iH);
            for (int i11 = 0; i11 < iH; i11++) {
                Object objJ = j(p10, p10.R());
                if (objJ != null) {
                    arrayList.add(objJ);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strH = h(p10);
            int iR = p10.R();
            if (iR == 9) {
                return map;
            }
            Object objJ2 = j(p10, iR);
            if (objJ2 != null) {
                map.put(strH, objJ2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3056c3
    protected final boolean a(P10 p10) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3056c3
    protected final boolean b(P10 p10, long j10) {
        if (p10.R() == 2 && "onMetaData".equals(h(p10)) && p10.C() != 0 && p10.R() == 8) {
            HashMap mapI = i(p10);
            Object obj = mapI.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f26392b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapI.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f26393c = new long[size];
                    this.f26394d = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f26393c = new long[0];
                            this.f26394d = new long[0];
                            break;
                        }
                        this.f26393c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f26394d[i10] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }

    public final long d() {
        return this.f26392b;
    }

    public final long[] e() {
        return this.f26393c;
    }

    public final long[] f() {
        return this.f26394d;
    }
}
