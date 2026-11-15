package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3106cS {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f27113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WR f27114f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27110b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27111c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27112d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0790q0 f27109a = G4.t.l().r();

    public C3106cS(String str, WR wr) {
        this.f27113e = str;
        this.f27114f = wr;
    }

    private final Map g() {
        Map mapJ = this.f27114f.j();
        mapJ.put("tms", Long.toString(G4.t.o().elapsedRealtime(), 10));
        mapJ.put(ScarConstants.TOKEN_ID_KEY, this.f27109a.v() ? "" : this.f27113e);
        return mapJ;
    }

    public final synchronized void a(String str) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29552F2)).booleanValue()) {
            Map mapG = g();
            mapG.put(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_init_started");
            mapG.put("ancn", str);
            this.f27110b.add(mapG);
        }
    }

    public final synchronized void b(String str) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29552F2)).booleanValue()) {
            Map mapG = g();
            mapG.put(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_init_finished");
            mapG.put("ancn", str);
            this.f27110b.add(mapG);
        }
    }

    public final synchronized void c(String str, String str2) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29552F2)).booleanValue()) {
            Map mapG = g();
            mapG.put(HandleInvocationsFromAdViewer.KEY_ACTION, "adapter_init_finished");
            mapG.put("ancn", str);
            mapG.put("rqe", str2);
            this.f27110b.add(mapG);
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29552F2)).booleanValue()) {
            Map mapG = g();
            mapG.put(HandleInvocationsFromAdViewer.KEY_ACTION, "aaia");
            mapG.put("aair", "MalformedJson");
            this.f27110b.add(mapG);
        }
    }

    public final synchronized void e() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29552F2)).booleanValue() && !this.f27111c) {
            Map mapG = g();
            mapG.put(HandleInvocationsFromAdViewer.KEY_ACTION, "init_started");
            this.f27110b.add(mapG);
            this.f27111c = true;
        }
    }

    public final synchronized void f() {
        try {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29552F2)).booleanValue() && !this.f27112d) {
                Map mapG = g();
                mapG.put(HandleInvocationsFromAdViewer.KEY_ACTION, "init_finished");
                List list = this.f27110b;
                list.add(mapG);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f27114f.b((Map) it.next());
                }
                this.f27112d = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
