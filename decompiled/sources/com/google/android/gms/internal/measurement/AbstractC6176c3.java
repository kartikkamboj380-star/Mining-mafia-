package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6176c3 {
    public static InterfaceC6289p a(Object obj) {
        if (obj == null) {
            return InterfaceC6289p.f36809y;
        }
        if (obj instanceof String) {
            return new C6324t((String) obj);
        }
        if (obj instanceof Double) {
            return new C6226i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C6226i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C6226i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C6208g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C6199f c6199f = new C6199f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c6199f.p(c6199f.l(), a(it.next()));
            }
            return c6199f;
        }
        C6262m c6262m = new C6262m();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC6289p interfaceC6289pA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c6262m.d((String) string, interfaceC6289pA);
            }
        }
        return c6262m;
    }

    public static InterfaceC6289p b(I3 i10) {
        if (i10 == null) {
            return InterfaceC6289p.f36808x;
        }
        int iM = i10.M() - 1;
        if (iM == 1) {
            return i10.E() ? new C6324t(i10.F()) : InterfaceC6289p.f36807E;
        }
        if (iM == 2) {
            return i10.I() ? new C6226i(Double.valueOf(i10.K())) : new C6226i(null);
        }
        if (iM == 3) {
            return i10.G() ? new C6208g(Boolean.valueOf(i10.H())) : new C6208g(null);
        }
        if (iM != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listC = i10.C();
        ArrayList arrayList = new ArrayList();
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(b((I3) it.next()));
        }
        return new C6298q(i10.D(), arrayList);
    }
}
