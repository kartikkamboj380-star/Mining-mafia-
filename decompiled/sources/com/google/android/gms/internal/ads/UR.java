package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class UR implements InterfaceC2180Od0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JR f24004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f24005c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24003a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f24006d = new HashMap();

    public UR(JR jr, Set set, Clock clock) {
        this.f24004b = jr;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            TR tr = (TR) it.next();
            this.f24006d.put(tr.c(), tr);
        }
        this.f24005c = clock;
    }

    private final void a(EnumC1817Hd0 enumC1817Hd0, boolean z9) {
        TR tr = (TR) this.f24006d.get(enumC1817Hd0);
        if (tr == null) {
            return;
        }
        String str = true != z9 ? "f." : "s.";
        Map map = this.f24003a;
        EnumC1817Hd0 enumC1817Hd0B = tr.b();
        if (map.containsKey(enumC1817Hd0B)) {
            long jElapsedRealtime = this.f24005c.elapsedRealtime() - ((Long) map.get(enumC1817Hd0B)).longValue();
            JR jr = this.f24004b;
            String strA = tr.a();
            Map mapC = jr.c();
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(jElapsedRealtime);
            mapC.put("label.".concat(strA), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void K(EnumC1817Hd0 enumC1817Hd0, String str) {
        this.f24003a.put(enumC1817Hd0, Long.valueOf(this.f24005c.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void N(EnumC1817Hd0 enumC1817Hd0, String str) {
        Map map = this.f24003a;
        if (map.containsKey(enumC1817Hd0)) {
            long jElapsedRealtime = this.f24005c.elapsedRealtime() - ((Long) map.get(enumC1817Hd0)).longValue();
            this.f24004b.c().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f24006d.containsKey(enumC1817Hd0)) {
            a(enumC1817Hd0, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void j(EnumC1817Hd0 enumC1817Hd0, String str, Throwable th) {
        Map map = this.f24003a;
        if (map.containsKey(enumC1817Hd0)) {
            long jElapsedRealtime = this.f24005c.elapsedRealtime() - ((Long) map.get(enumC1817Hd0)).longValue();
            this.f24004b.c().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.f24006d.containsKey(enumC1817Hd0)) {
            a(enumC1817Hd0, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2180Od0
    public final void u(EnumC1817Hd0 enumC1817Hd0, String str) {
    }
}
