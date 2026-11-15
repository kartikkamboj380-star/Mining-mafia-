package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JB implements InterfaceC5520ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC1750Fw f19794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f19795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5336uB f19796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f19797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19798e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f19799f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5714xB f19800g = new C5714xB();

    public JB(Executor executor, C5336uB c5336uB, Clock clock) {
        this.f19795b = executor;
        this.f19796c = c5336uB;
        this.f19797d = clock;
    }

    private final void j() {
        try {
            final JSONObject jSONObjectZzb = this.f19796c.zzb(this.f19800g);
            if (this.f19794a != null) {
                this.f19795b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.IB
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f19493a.i(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            AbstractC0786o0.l("Failed to call video active view js", e10);
        }
    }

    public final void b(InterfaceC1750Fw interfaceC1750Fw) {
        this.f19794a = interfaceC1750Fw;
    }

    public final void e() {
        this.f19798e = false;
    }

    public final void g() {
        this.f19798e = true;
        j();
    }

    public final void h(boolean z9) {
        this.f19799f = z9;
    }

    final /* synthetic */ void i(JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(string.length() + 31);
        sb.append("Calling AFMA_updateActiveView(");
        sb.append(string);
        sb.append(")");
        String string2 = sb.toString();
        int i10 = AbstractC0786o0.f2696b;
        L4.p.a(string2);
        this.f19794a.zzb("AFMA_updateActiveView", jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5520ve
    public final void s0(C5394ue c5394ue) {
        boolean z9 = this.f19799f ? false : c5394ue.f33869j;
        C5714xB c5714xB = this.f19800g;
        c5714xB.f34754a = z9;
        c5714xB.f34757d = this.f19797d.elapsedRealtime();
        c5714xB.f34759f = c5394ue;
        if (this.f19798e) {
            j();
        }
    }
}
