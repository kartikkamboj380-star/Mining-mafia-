package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.rY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5004rY {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C3880ib0 f32974d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C3502fb0 f32975e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private H4.q2 f32976f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f32972b = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32971a = Collections.synchronizedList(new ArrayList());

    public C5004rY(String str) {
        this.f32973c = str;
    }

    private final synchronized void j(C3502fb0 c3502fb0, int i10) {
        Map map = this.f32972b;
        String strL = l(c3502fb0);
        if (map.containsKey(strL)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject jSONObject = c3502fb0.f28437v;
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                bundle.putString(next, jSONObject.getString(next));
            } catch (JSONException unused) {
            }
        }
        H4.q2 q2Var = new H4.q2(c3502fb0.f28369E, 0L, null, bundle, c3502fb0.f28371F, c3502fb0.f28373G, c3502fb0.f28375H, c3502fb0.f28377I);
        try {
            this.f32971a.add(i10, q2Var);
        } catch (IndexOutOfBoundsException e10) {
            G4.t.l().j(e10, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.f32972b.put(strL, q2Var);
    }

    private final void k(C3502fb0 c3502fb0, long j10, H4.Z0 z9, boolean z10) {
        Map map = this.f32972b;
        String strL = l(c3502fb0);
        if (map.containsKey(strL)) {
            if (this.f32975e == null) {
                this.f32975e = c3502fb0;
            }
            H4.q2 q2Var = (H4.q2) map.get(strL);
            q2Var.f1419b = j10;
            q2Var.f1420c = z9;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29577H7)).booleanValue() && z10) {
                this.f32976f = q2Var;
            }
        }
    }

    private static String l(C3502fb0 c3502fb0) {
        return ((Boolean) H4.B.c().d(AbstractC3892ii.f29995v4)).booleanValue() ? c3502fb0.f28426p0 : c3502fb0.f28439w;
    }

    public final void a(C3880ib0 c3880ib0) {
        this.f32974d = c3880ib0;
    }

    public final void b(C3502fb0 c3502fb0) {
        j(c3502fb0, this.f32971a.size());
    }

    public final synchronized void c(String str, List list) {
        Map map = this.f32972b;
        if (map.containsKey(str)) {
            H4.q2 q2Var = (H4.q2) map.get(str);
            List list2 = this.f32971a;
            int iIndexOf = list2.indexOf(q2Var);
            try {
                list2.remove(iIndexOf);
            } catch (IndexOutOfBoundsException e10) {
                G4.t.l().j(e10, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.f32972b.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j((C3502fb0) it.next(), iIndexOf);
                iIndexOf++;
            }
        }
    }

    public final void d(C3502fb0 c3502fb0, long j10, H4.Z0 z9) {
        k(c3502fb0, j10, null, true);
    }

    public final void e(C3502fb0 c3502fb0, long j10, H4.Z0 z9) {
        k(c3502fb0, j10, z9, false);
    }

    public final RF f() {
        return new RF(this.f32975e, "", this, this.f32974d, this.f32973c);
    }

    public final H4.q2 g() {
        return this.f32976f;
    }

    public final List h() {
        return this.f32971a;
    }

    public final void i(C3502fb0 c3502fb0) {
        Map map = this.f32972b;
        Object obj = map.get(l(c3502fb0));
        List list = this.f32971a;
        int iIndexOf = list.indexOf(obj);
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            iIndexOf = list.indexOf(this.f32976f);
        }
        if (iIndexOf < 0 || iIndexOf >= map.size()) {
            return;
        }
        this.f32976f = (H4.q2) list.get(iIndexOf);
        while (true) {
            iIndexOf++;
            if (iIndexOf >= list.size()) {
                return;
            }
            H4.q2 q2Var = (H4.q2) list.get(iIndexOf);
            q2Var.f1419b = 0L;
            q2Var.f1420c = null;
        }
    }
}
