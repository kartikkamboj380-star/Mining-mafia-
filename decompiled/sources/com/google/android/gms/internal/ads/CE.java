package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CE implements IH, AK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AbstractC4539nr f17825a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f17827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RunnableC4262le0 f17828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L4.a f17829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f17830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17831g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f17832h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17826b = new AtomicBoolean();

    CE(Context context, RunnableC4262le0 runnableC4262le0, L4.a aVar, Executor executor) {
        this.f17827c = context;
        this.f17828d = runnableC4262le0;
        this.f17829e = aVar;
        this.f17830f = executor;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void a(Q4.M m10) {
        b();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    public final void b() {
        AbstractC4539nr abstractC4539nr;
        int i10;
        C2899ao c2899aoB;
        if (!this.f17826b.getAndSet(true)) {
            if (((Boolean) AbstractC4145kj.f30874o.e()).booleanValue()) {
                i10 = 2;
            } else {
                i10 = 3;
                if (!((Boolean) AbstractC4145kj.f30875p.e()).booleanValue()) {
                    if (((Boolean) AbstractC4145kj.f30873n.e()).booleanValue()) {
                        try {
                            String strOptString = new JSONObject(G4.t.l().r().zzi().d()).optString("local_flag_write");
                            if (TextUtils.equals(strOptString, "client")) {
                                i10 = 2;
                            } else if (!TextUtils.equals(strOptString, "service")) {
                                i10 = 1;
                            }
                        } catch (JSONException unused) {
                        }
                    } else {
                        i10 = 1;
                    }
                }
            }
            int i11 = i10 - 1;
            if (i11 == 1) {
                c2899aoB = G4.t.v().b(this.f17827c, L4.a.a(), this.f17828d);
            } else if (i11 == 2) {
                c2899aoB = G4.t.v().a(this.f17827c, L4.a.a(), this.f17828d);
            }
            InterfaceC2511Un interfaceC2511Un = AbstractC2667Xn.f25386a;
            this.f17825a = new C4917qr(this.f17827c, c2899aoB.a("google.afma.sdkConstants.getSdkConstants", interfaceC2511Un, interfaceC2511Un), this.f17829e, this.f17830f);
            this.f17831g = true;
        }
        if (this.f17831g && (abstractC4539nr = this.f17825a) != null) {
            com.google.common.util.concurrent.p pVarB = abstractC4539nr.b();
            if (!this.f17832h && ((Boolean) AbstractC3015bj.f26904i.e()).booleanValue()) {
                pVarB.e(new Runnable() { // from class: com.google.android.gms.internal.ads.BE
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.f17538a.c();
                    }
                }, this.f17830f);
            }
            AbstractC2471Tt.a(pVarB, "persistFlagsClient");
        }
    }

    final /* synthetic */ void c() {
        AbstractC2447Th.e(this.f17827c);
        this.f17832h = true;
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void k(String str) {
        b();
    }
}
