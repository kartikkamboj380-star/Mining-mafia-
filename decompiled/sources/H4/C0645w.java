package H4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C2505Uk;
import com.google.android.gms.internal.ads.C2557Vk;
import com.google.android.gms.internal.ads.C4537nq;
import com.google.android.gms.internal.ads.C4667os;
import com.google.android.gms.internal.ads.InterfaceC2309Qq;
import com.google.android.gms.internal.ads.InterfaceC3033bs;
import com.google.android.gms.internal.ads.InterfaceC3268dk;
import com.google.android.gms.internal.ads.InterfaceC4033jq;
import com.google.android.gms.internal.ads.InterfaceC4291lt;
import com.google.android.gms.internal.ads.InterfaceC4915qq;
import com.google.android.gms.internal.ads.InterfaceC5666wo;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: renamed from: H4.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0645w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f2 f1443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d2 f1444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final G1 f1445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2505Uk f1446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C4537nq f1447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2557Vk f1448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private InterfaceC2309Qq f1449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g2 f1450h;

    public C0645w(f2 f2Var, d2 d2Var, G1 g10, C2505Uk c2505Uk, C4667os c4667os, C4537nq c4537nq, C2557Vk c2557Vk, g2 g2Var) {
        this.f1443a = f2Var;
        this.f1444b = d2Var;
        this.f1445c = g10;
        this.f1446d = c2505Uk;
        this.f1447e = c4537nq;
        this.f1448f = c2557Vk;
        this.f1450h = g2Var;
    }

    static /* synthetic */ void k(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(HandleInvocationsFromAdViewer.KEY_ACTION, "no_ads_fallback");
        bundle.putString("flow", str);
        C0654z.a().q(context, C0654z.g().f3097a, "gmob-apps", bundle, true);
    }

    public final W a(Context context, m2 m2Var, String str, InterfaceC5666wo interfaceC5666wo) {
        return (W) new C0613l(this, context, m2Var, str, interfaceC5666wo).d(context, false);
    }

    public final W b(Context context, m2 m2Var, String str, InterfaceC5666wo interfaceC5666wo) {
        return (W) new C0619n(this, context, m2Var, str, interfaceC5666wo).d(context, false);
    }

    public final S c(Context context, String str, InterfaceC5666wo interfaceC5666wo) {
        return (S) new C0625p(this, context, str, interfaceC5666wo).d(context, false);
    }

    public final InterfaceC0608j0 d(Context context, InterfaceC5666wo interfaceC5666wo) {
        return (InterfaceC0608j0) new r(this, context, interfaceC5666wo).d(context, false);
    }

    public final InterfaceC3268dk e(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC3268dk) new C0642v(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final InterfaceC3033bs f(Context context, String str, InterfaceC5666wo interfaceC5666wo) {
        return (InterfaceC3033bs) new C0583b(this, context, str, interfaceC5666wo).d(context, false);
    }

    public final InterfaceC4915qq g(Activity activity) {
        C0589d c0589d = new C0589d(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            L4.p.c("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC4915qq) c0589d.d(activity, booleanExtra);
    }

    public final V0 h(Context context, InterfaceC5666wo interfaceC5666wo) {
        return (V0) new C0595f(this, context, interfaceC5666wo).d(context, false);
    }

    public final InterfaceC4291lt i(Context context, InterfaceC5666wo interfaceC5666wo) {
        return (InterfaceC4291lt) new C0601h(this, context, interfaceC5666wo).d(context, false);
    }

    public final InterfaceC4033jq j(Context context, InterfaceC5666wo interfaceC5666wo) {
        return (InterfaceC4033jq) new C0607j(this, context, interfaceC5666wo).d(context, false);
    }

    final /* synthetic */ f2 l() {
        return this.f1443a;
    }

    final /* synthetic */ d2 m() {
        return this.f1444b;
    }

    final /* synthetic */ G1 n() {
        return this.f1445c;
    }

    final /* synthetic */ C2505Uk o() {
        return this.f1446d;
    }

    final /* synthetic */ C4537nq p() {
        return this.f1447e;
    }

    final /* synthetic */ InterfaceC2309Qq q() {
        return this.f1449g;
    }

    final /* synthetic */ void r(InterfaceC2309Qq interfaceC2309Qq) {
        this.f1449g = interfaceC2309Qq;
    }

    final /* synthetic */ g2 s() {
        return this.f1450h;
    }
}
