package com.google.android.gms.internal.ads;

import K4.InterfaceC0790q0;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class XE implements IH, AK {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6019zb0 f25167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L4.a f25168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC0790q0 f25169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3485fT f25170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final RunnableC4262le0 f25171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BT f25172g;

    public XE(Context context, C6019zb0 c6019zb0, L4.a aVar, InterfaceC0790q0 interfaceC0790q0, C3485fT c3485fT, RunnableC4262le0 runnableC4262le0, BT bt) {
        this.f25166a = context;
        this.f25167b = c6019zb0;
        this.f25168c = aVar;
        this.f25169d = interfaceC0790q0;
        this.f25170e = c3485fT;
        this.f25171f = runnableC4262le0;
        this.f25172g = bt;
    }

    private final void b() {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29684S4)).booleanValue()) {
            InterfaceC0790q0 interfaceC0790q0 = this.f25169d;
            Context context = this.f25166a;
            L4.a aVar = this.f25168c;
            C6019zb0 c6019zb0 = this.f25167b;
            RunnableC4262le0 runnableC4262le0 = this.f25171f;
            BT bt = this.f25172g;
            G4.t.p().b(context, aVar, c6019zb0.f35798g, interfaceC0790q0.zzi(), runnableC4262le0, bt.t());
        }
        this.f25170e.c();
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void D0(C5420ur c5420ur) {
        b();
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void a(Q4.M m10) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29694T4)).booleanValue()) {
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.IH
    public final void i(C5011rb0 c5011rb0) {
    }

    @Override // com.google.android.gms.internal.ads.AK
    public final void k(String str) {
    }
}
