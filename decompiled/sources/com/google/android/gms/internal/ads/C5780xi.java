package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.xi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5780xi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f34988a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f34989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f34990c;

    public C5780xi(boolean z9, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f34989b = linkedHashMap;
        this.f34990c = new Object();
        linkedHashMap.put(HandleInvocationsFromAdViewer.KEY_ACTION, "make_wv");
        linkedHashMap.put("ad_format", str2);
    }

    public static final C5402ui f() {
        return new C5402ui(G4.t.o().elapsedRealtime(), null, null);
    }

    public final void a(C5780xi c5780xi) {
        synchronized (this.f34990c) {
        }
    }

    public final boolean b(C5402ui c5402ui, long j10, String... strArr) {
        synchronized (this.f34990c) {
            this.f34988a.add(new C5402ui(j10, strArr[0], c5402ui));
        }
        return true;
    }

    public final C5654wi c() {
        C5654wi c5654wi;
        boolean zBooleanValue = ((Boolean) H4.B.c().d(AbstractC3892ii.f30004w2)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap();
        synchronized (this.f34990c) {
            try {
                List<C5402ui> list = this.f34988a;
                for (C5402ui c5402ui : list) {
                    long jA = c5402ui.a();
                    String strB = c5402ui.b();
                    C5402ui c5402uiC = c5402ui.c();
                    if (c5402uiC != null && jA > 0) {
                        long jA2 = jA - c5402uiC.a();
                        sb.append(strB);
                        sb.append('.');
                        sb.append(jA2);
                        sb.append(',');
                        if (zBooleanValue) {
                            if (map.containsKey(Long.valueOf(c5402uiC.a()))) {
                                StringBuilder sb2 = (StringBuilder) map.get(Long.valueOf(c5402uiC.a()));
                                sb2.append('+');
                                sb2.append(strB);
                            } else {
                                map.put(Long.valueOf(c5402uiC.a()), new StringBuilder(strB));
                            }
                        }
                    }
                }
                list.clear();
                String string = null;
                if (!TextUtils.isEmpty(null)) {
                    sb.append((String) null);
                } else if (sb.length() > 0) {
                    sb.setLength(sb.length() - 1);
                }
                StringBuilder sb3 = new StringBuilder();
                if (zBooleanValue) {
                    for (Map.Entry entry : map.entrySet()) {
                        sb3.append((CharSequence) entry.getValue());
                        sb3.append('.');
                        sb3.append(G4.t.o().currentTimeMillis() + (((Long) entry.getKey()).longValue() - G4.t.o().elapsedRealtime()));
                        sb3.append(',');
                    }
                    if (sb3.length() > 0) {
                        sb3.setLength(sb3.length() - 1);
                    }
                    string = sb3.toString();
                }
                c5654wi = new C5654wi(sb.toString(), string);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c5654wi;
    }

    public final void d(String str, String str2) {
        C4521ni c4521niD;
        if (TextUtils.isEmpty(str2) || (c4521niD = G4.t.l().d()) == null) {
            return;
        }
        synchronized (this.f34990c) {
            AbstractC5276ti abstractC5276tiD = c4521niD.d(str);
            Map map = this.f34989b;
            map.put(str, abstractC5276tiD.a((String) map.get(str), str2));
        }
    }

    public final Map e() {
        Map map;
        synchronized (this.f34990c) {
            G4.t.l().d();
            map = this.f34989b;
        }
        return map;
    }
}
