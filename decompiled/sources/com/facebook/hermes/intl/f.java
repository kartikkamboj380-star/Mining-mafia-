package com.facebook.hermes.intl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static HashMap a(List list, Object obj, List list2) {
        Object obj2;
        Object objO;
        Object objR;
        HashMap map = new HashMap();
        e.a aVarF = B2.d.h(B2.d.a(obj, "localeMatcher")).equals("lookup") ? e.f((String[]) list.toArray(new String[list.size()])) : e.c((String[]) list.toArray(new String[list.size()]));
        HashSet<String> hashSet = new HashSet();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object objB = B2.d.b();
            if (!aVarF.f13914b.isEmpty() && aVarF.f13914b.containsKey(str)) {
                String str2 = (String) aVarF.f13914b.get(str);
                if (str2.isEmpty()) {
                    obj2 = objB;
                    obj2 = objB;
                    objR = str2;
                    objR = B2.d.r("true");
                }
                obj2 = objB;
                obj2 = objB;
                objR = str2;
                hashSet.add(str);
                obj2 = objR;
            }
            obj2 = objB;
            obj2 = objB;
            obj2 = objB;
            Object obj3 = obj2;
            if (B2.d.g(obj).containsKey(str)) {
                Object objA = B2.d.a(obj, str);
                if (B2.d.m(objA) && B2.d.h(objA).isEmpty()) {
                    objO = objA;
                    objO = objA;
                    objO = B2.d.o(true);
                }
                objO = objA;
                objO = objA;
                objO = objA;
                obj3 = obj2;
                if (!B2.d.n(objO) && !objO.equals(obj2)) {
                    obj3 = obj2;
                    hashSet.remove(str);
                    obj3 = objO;
                }
            }
            obj3 = obj2;
            boolean zJ = B2.d.j(obj3);
            Object objF = obj3;
            if (!zJ) {
                objF = B2.j.f(str, obj3);
            }
            if (!B2.d.m(objF) || B2.j.c(str, B2.d.h(objF), aVarF.f13913a)) {
                map.put(str, objF);
            } else {
                map.put(str, B2.d.b());
            }
        }
        for (String str3 : hashSet) {
            ArrayList arrayList = new ArrayList();
            String strH = B2.d.h(B2.j.f(str3, B2.d.r((String) aVarF.f13914b.get(str3))));
            if (!B2.d.m(strH) || B2.j.c(str3, B2.d.h(strH), aVarF.f13913a)) {
                arrayList.add(strH);
                aVarF.f13913a.f(str3, arrayList);
            }
        }
        map.put("locale", aVarF.f13913a);
        return map;
    }
}
