package com.dooboolab.rniap;

import com.facebook.react.bridge.Promise;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.dooboolab.rniap.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1245c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1245c f13659a = new C1245c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap f13660b = new HashMap();

    private C1245c() {
    }

    public final void a(String key, Promise promise) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(promise, "promise");
        HashMap map = f13660b;
        Object arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(key, arrayList);
        }
        ((List) arrayList).add(promise);
    }

    public final void b() {
        HashMap map = f13660b;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            CollectionsKt.w(arrayList, (Iterable) ((Map.Entry) it.next()).getValue());
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            AbstractC1246d.c((Promise) obj, "E_CONNECTION_CLOSED", "Connection has been closed", null);
        }
        f13660b.clear();
    }

    public final void c(String key, String code, String str, Exception exc) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(code, "code");
        List list = (List) f13660b.get(key);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1246d.c((Promise) it.next(), code, str, exc);
            }
        }
        f13660b.remove(key);
    }

    public final void d(String key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        List list = (List) f13660b.get(key);
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC1246d.d((Promise) it.next(), obj);
            }
        }
        f13660b.remove(key);
    }
}
