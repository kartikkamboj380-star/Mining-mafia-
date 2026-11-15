package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ju0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1955Ju0 extends AbstractC1695Eu0 {
    public final C1955Ju0 b(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            boolean z9 = true;
            while (it.hasNext()) {
                if (!z9) {
                    sb.append(", ");
                }
                sb.append(it.next());
                z9 = false;
            }
            sb.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            AbstractC5301tu0 abstractC5301tu0W = (AbstractC5301tu0) a().get(obj);
            if (abstractC5301tu0W == null) {
                abstractC5301tu0W = AbstractC1903Iu0.w(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                a().put(obj, abstractC5301tu0W);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                AbstractC2472Tt0.a(obj, next);
                abstractC5301tu0W.a(next);
            }
        }
        return this;
    }

    public final C2058Lu0 c() {
        Map map = this.f18596a;
        if (map == null) {
            return C4294lu0.f31386h;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return C4294lu0.f31386h;
        }
        C1487Au0 c1487Au0 = new C1487Au0(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            AbstractC1903Iu0 abstractC1903Iu0S = AbstractC1903Iu0.s(((C1851Hu0) entry.getValue()).j());
            if (!abstractC1903Iu0S.isEmpty()) {
                c1487Au0.a(key, abstractC1903Iu0S);
                size += abstractC1903Iu0S.size();
            }
        }
        return new C2058Lu0(c1487Au0.c(), size, null);
    }
}
