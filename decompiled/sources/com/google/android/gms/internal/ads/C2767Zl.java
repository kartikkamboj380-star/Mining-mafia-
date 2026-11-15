package com.google.android.gms.internal.ads;

import H4.C0654z;
import H4.InterfaceC0580a;
import J4.InterfaceC0739b;
import K4.AbstractC0786o0;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Zl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2767Zl implements InterfaceC2091Ml {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G4.b f26287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final QR f26288b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C2515Up f26290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C5884yX f26291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C2821aB f26292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5722xF f26293g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private L4.v f26289c = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InterfaceC0739b f26294h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f26295i = AbstractC2315Qt.f22479g;

    public C2767Zl(G4.b bVar, C2515Up c2515Up, C5884yX c5884yX, QR qr, C2821aB c2821aB, C5722xF c5722xF) {
        this.f26287a = bVar;
        this.f26290d = c2515Up;
        this.f26291e = c5884yX;
        this.f26288b = qr;
        this.f26292f = c2821aB;
        this.f26293g = c5722xF;
    }

    public static boolean b(Map map) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(map.get("custom_close"));
    }

    public static int c(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri d(Context context, C5138sc c5138sc, Uri uri, View view, Activity activity, C1605Db0 c1605Db0) {
        if (c5138sc != null) {
            try {
                if (!((Boolean) H4.B.c().d(AbstractC3892ii.wd)).booleanValue() || c1605Db0 == null) {
                    if (c5138sc.e(uri)) {
                        return c5138sc.d(uri, context, view, activity);
                    }
                } else if (c5138sc.e(uri)) {
                    return c1605Db0.a(uri, context, view, activity);
                }
            } catch (C5264tc unused) {
            } catch (Exception e10) {
                G4.t.l().j(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri e(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e10) {
            String strValueOf = String.valueOf(uri.toString());
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Error adding click uptime parameter to url: ".concat(strValueOf), e10);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:132:0x0369  */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void f(String str, InterfaceC0580a interfaceC0580a, Map map, String str2) {
        String str3;
        boolean zB;
        C5722xF c5722xF;
        InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) interfaceC0580a;
        C3502fb0 c3502fb0Z = interfaceC1750Fw.z();
        C3880ib0 c3880ib0M = interfaceC1750Fw.M();
        boolean zA = false;
        if (c3502fb0Z == null || c3880ib0M == null) {
            str3 = "";
            zB = false;
        } else {
            str3 = c3880ib0M.f29455b;
            zB = c3502fb0Z.b();
        }
        boolean z9 = (((Boolean) H4.B.c().d(AbstractC3892ii.ic)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        boolean z10 = ((Boolean) H4.B.c().d(AbstractC3892ii.ke)).booleanValue() && map.containsKey("ig_cl") && ((String) map.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (interfaceC1750Fw.r()) {
                int i10 = AbstractC0786o0.f2696b;
                L4.p.f("Cannot expand WebView that is already expanded.");
                return;
            } else {
                l(false);
                ((InterfaceC6062zx) interfaceC0580a).X0(b(map), c(map), z9);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            l(false);
            boolean z11 = ((Boolean) H4.B.c().d(AbstractC3892ii.sd)).booleanValue() && Objects.equals(map.get("is_allowed_for_lock_screen"), UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            if (str != null) {
                ((InterfaceC6062zx) interfaceC0580a).a1(b(map), c(map), str, z9, z11);
                return;
            } else {
                ((InterfaceC6062zx) interfaceC0580a).H0(b(map), c(map), (String) map.get("html"), (String) map.get("baseurl"), z9);
                return;
            }
        }
        Intent uri = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = interfaceC1750Fw.getContext();
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29555F5)).booleanValue()) {
                AbstractC0786o0.k("User opt out chrome custom tab.");
                g(10);
            } else {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f30039z5)).booleanValue()) {
                    String strC = p180s.c.c(context, null);
                    if (strC != null && !context.getPackageName().equals(strC)) {
                        zA = true;
                    }
                } else {
                    zA = C1982Ki.a(context);
                }
                if (zA) {
                    boolean z12 = z10;
                    boolean z13 = z9;
                    String str4 = str3;
                    l(true);
                    if (TextUtils.isEmpty(str)) {
                        int i11 = AbstractC0786o0.f2696b;
                        L4.p.f("Cannot open browser with null or empty url");
                        g(7);
                        return;
                    }
                    Uri uriE = e(d(interfaceC1750Fw.getContext(), interfaceC1750Fw.n(), Uri.parse(str), interfaceC1750Fw.B(), interfaceC1750Fw.d(), interfaceC1750Fw.W()));
                    if (zB && this.f26291e != null && i(interfaceC0580a, interfaceC1750Fw.getContext(), uriE.toString(), str4)) {
                        return;
                    }
                    this.f26294h = new C2611Wl(this);
                    InterfaceC6062zx interfaceC6062zx = (InterfaceC6062zx) interfaceC0580a;
                    String string = uriE.toString();
                    InterfaceC0739b interfaceC0739b = this.f26294h;
                    Bundle bundle = new Bundle();
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.f29545E5)).booleanValue()) {
                        if (map.containsKey("cct_init_h")) {
                            try {
                                bundle.putInt("h", Integer.parseInt((String) map.get("cct_init_h")));
                            } catch (NumberFormatException e10) {
                                AbstractC0786o0.l("Invalid cct initial height parameter.", e10);
                                G4.t.l().j(e10, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                        if (map.containsKey("cct_bp")) {
                            try {
                                bundle.putInt("cbp", Integer.parseInt((String) map.get("cct_bp")));
                            } catch (NumberFormatException e11) {
                                AbstractC0786o0.l("Invalid cct close button position parameter.", e11);
                                G4.t.l().j(e11, "OpenGmsgHandler.getChromeCustomTabConfigBundle");
                            }
                        }
                    }
                    interfaceC6062zx.I0(new J4.m(null, string, null, null, null, null, null, null, com.google.android.gms.dynamic.b.N0(interfaceC0739b).asBinder(), true, bundle), z13, z12, str4);
                    return;
                }
                g(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            k(interfaceC0580a, map, zB, str3, z9, z10);
            return;
        }
        boolean z14 = z10;
        boolean z15 = z9;
        String str5 = str3;
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            k(interfaceC0580a, map, zB, str5, z15, z14);
            return;
        }
        boolean z16 = zB;
        InterfaceC0580a interfaceC0580a2 = interfaceC0580a;
        Map map2 = map;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.B9)).booleanValue()) {
                l(true);
                String str6 = (String) map2.get("p");
                if (str6 == null) {
                    int i12 = AbstractC0786o0.f2696b;
                    L4.p.f("Package name missing from open app action.");
                    return;
                }
                if (z16 && this.f26291e != null && i(interfaceC0580a2, interfaceC1750Fw.getContext(), str6, str5)) {
                    return;
                }
                PackageManager packageManager = interfaceC1750Fw.getContext().getPackageManager();
                if (packageManager == null) {
                    int i13 = AbstractC0786o0.f2696b;
                    L4.p.f("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                    if (launchIntentForPackage != null) {
                        ((InterfaceC6062zx) interfaceC0580a2).I0(new J4.m(launchIntentForPackage, this.f26294h), z15, z14, str5);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        l(true);
        String str7 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str7)) {
            try {
                uri = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e12) {
                String strValueOf = String.valueOf(str7);
                int i14 = AbstractC0786o0.f2696b;
                L4.p.d("Error parsing the url: ".concat(strValueOf), e12);
            }
        }
        if (uri != null && uri.getData() != null) {
            Uri data = uri.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri uriE2 = e(d(interfaceC1750Fw.getContext(), interfaceC1750Fw.n(), data, interfaceC1750Fw.B(), interfaceC1750Fw.d(), interfaceC1750Fw.W()));
                if (TextUtils.isEmpty(uri.getType())) {
                    uri.setData(uriE2);
                } else if (((Boolean) H4.B.c().d(AbstractC3892ii.C9)).booleanValue()) {
                    uri.setDataAndType(uriE2, uri.getType());
                } else {
                    uri.setData(uriE2);
                }
            }
        }
        boolean z17 = ((Boolean) H4.B.c().d(AbstractC3892ii.X9)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) H4.B.c().d(AbstractC3892ii.pe)).booleanValue() && (c5722xF = this.f26293g) != null) {
            c5722xF.a();
        }
        HashMap map3 = new HashMap();
        if (z17) {
            C2663Xl c2663Xl = new C2663Xl(this, z15, interfaceC0580a2, map3, map2);
            interfaceC0580a2 = interfaceC0580a2;
            map2 = map2;
            this.f26294h = c2663Xl;
        } else {
            zA = z15;
        }
        if (uri != null) {
            if (!z16 || this.f26291e == null || !i(interfaceC0580a2, interfaceC1750Fw.getContext(), uri.getData().toString(), str5)) {
                ((InterfaceC6062zx) interfaceC0580a2).I0(new J4.m(uri, this.f26294h), zA, z14, str5);
                return;
            } else {
                if (z17) {
                    map3.put((String) map2.get("event_id"), Boolean.TRUE);
                    ((InterfaceC3274dn) interfaceC0580a2).b("openIntentAsync", map3);
                    return;
                }
                return;
            }
        }
        String string2 = !TextUtils.isEmpty(str) ? e(d(interfaceC1750Fw.getContext(), interfaceC1750Fw.n(), Uri.parse(str), interfaceC1750Fw.B(), interfaceC1750Fw.d(), interfaceC1750Fw.W())).toString() : str;
        if (!z16 || this.f26291e == null || !i(interfaceC0580a2, interfaceC1750Fw.getContext(), string2, str5)) {
            ((InterfaceC6062zx) interfaceC0580a2).I0(new J4.m((String) map2.get("i"), string2, (String) map2.get("m"), (String) map2.get("p"), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.f26294h), zA, z14, str5);
        } else if (z17) {
            map3.put((String) map2.get("event_id"), Boolean.TRUE);
            ((InterfaceC3274dn) interfaceC0580a2).b("openIntentAsync", map3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) H4.B.c().d(com.google.android.gms.internal.ads.AbstractC3892ii.R9)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) H4.B.c().d(com.google.android.gms.internal.ads.AbstractC3892ii.M9)).booleanValue() : ((java.lang.Boolean) H4.B.c().d(com.google.android.gms.internal.ads.AbstractC3892ii.L9)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean i(H4.InterfaceC0580a r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2767Zl.i(H4.a, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void j(Context context, String str, String str2) {
        C5884yX c5884yX = this.f26291e;
        c5884yX.j(str);
        QR qr = this.f26288b;
        if (qr != null) {
            KX.B6(context, qr, c5884yX, str, "dialog_not_shown", AbstractC1539Bu0.b("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0152  */
    /* JADX WARN: Code duplicated, block: B:9:0x0089  */
    private final void k(InterfaceC0580a interfaceC0580a, Map map, boolean z9, String str, boolean z10, boolean z11) {
        boolean z12;
        Uri uriBuild;
        InterfaceC1750Fw interfaceC1750Fw;
        Intent intentD;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo resolveInfoB;
        l(true);
        InterfaceC1750Fw interfaceC1750Fw2 = (InterfaceC1750Fw) interfaceC0580a;
        Context context = interfaceC1750Fw2.getContext();
        C5138sc c5138scN = interfaceC1750Fw2.n();
        View viewB = interfaceC1750Fw2.B();
        C1605Db0 c1605Db0W = interfaceC1750Fw2.W();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            interfaceC1750Fw = interfaceC1750Fw2;
            intentD = null;
        } else {
            Uri uriE = e(d(context, c5138scN, Uri.parse(str2), viewB, null, c1605Db0W));
            boolean z13 = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean z14 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                z12 = true;
            } else if (((Boolean) H4.B.c().d(AbstractC3892ii.f29996v5)).booleanValue()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if ("http".equalsIgnoreCase(uriE.getScheme())) {
                uriBuild = uriE.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
            } else {
                uriBuild = HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(uriE.getScheme()) ? uriE.buildUpon().scheme("http").build() : null;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentA = AbstractC2715Yl.a(uriE, context, c5138scN, viewB, c1605Db0W);
            Intent intentA2 = AbstractC2715Yl.a(uriBuild, context, c5138scN, viewB, c1605Db0W);
            if (z12) {
                G4.t.g();
                K4.F0.f0(context, intentA);
                G4.t.g();
                K4.F0.f0(context, intentA2);
            }
            ResolveInfo resolveInfoC = AbstractC2715Yl.c(intentA, arrayList, context, c5138scN, viewB, c1605Db0W);
            if (resolveInfoC != null) {
                intentD = AbstractC2715Yl.d(intentA, resolveInfoC, context, c5138scN, viewB, c1605Db0W);
            } else {
                if (intentA2 != null && (resolveInfoB = AbstractC2715Yl.b(intentA2, context, c5138scN, viewB, c1605Db0W)) != null) {
                    intentD = AbstractC2715Yl.d(intentA, resolveInfoB, context, c5138scN, viewB, c1605Db0W);
                    if (AbstractC2715Yl.b(intentD, context, c5138scN, viewB, c1605Db0W) == null) {
                    }
                }
                if (arrayList.isEmpty()) {
                    interfaceC1750Fw = interfaceC1750Fw2;
                } else if (!z14 || activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                    interfaceC1750Fw = interfaceC1750Fw2;
                    if (z13) {
                        intentD = AbstractC2715Yl.d(intentA, (ResolveInfo) arrayList.get(0), context, c5138scN, viewB, c1605Db0W);
                    }
                } else {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i10);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            while (true) {
                                int i11 = i10 + 1;
                                if (it.hasNext()) {
                                    interfaceC1750Fw = interfaceC1750Fw2;
                                    if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                        intentD = AbstractC2715Yl.d(intentA, resolveInfo, context, c5138scN, viewB, c1605Db0W);
                                    } else {
                                        interfaceC1750Fw2 = interfaceC1750Fw;
                                    }
                                } else {
                                    i10 = i11;
                                }
                            }
                        } else {
                            interfaceC1750Fw = interfaceC1750Fw2;
                            if (z13) {
                                intentD = AbstractC2715Yl.d(intentA, (ResolveInfo) arrayList.get(0), context, c5138scN, viewB, c1605Db0W);
                            }
                        }
                    }
                }
                intentD = intentA;
            }
            interfaceC1750Fw = interfaceC1750Fw2;
        }
        if (!z9 || this.f26291e == null || intentD == null || !i(interfaceC0580a, interfaceC1750Fw.getContext(), intentD.getData().toString(), str)) {
            try {
                ((InterfaceC6062zx) interfaceC0580a).I0(new J4.m(intentD, this.f26294h), z10, z11, str);
            } catch (ActivityNotFoundException e10) {
                String message = e10.getMessage();
                int i12 = AbstractC0786o0.f2696b;
                L4.p.f(message);
            }
        }
    }

    private final void l(boolean z9) {
        C2515Up c2515Up = this.f26290d;
        if (c2515Up != null) {
            c2515Up.i(z9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(int i10) {
        QR qr;
        String str;
        if (!((Boolean) H4.B.c().d(AbstractC3892ii.f30029y5)).booleanValue() || (qr = this.f26288b) == null) {
            return;
        }
        PR prA = qr.a();
        prA.c(HandleInvocationsFromAdViewer.KEY_ACTION, "cct_action");
        switch (i10) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        prA.c("cct_open_status", str);
        prA.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        C2821aB c2821aB;
        InterfaceC0580a interfaceC0580a = (InterfaceC0580a) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) interfaceC0580a;
        if (interfaceC1750Fw.z() != null) {
            map2 = interfaceC1750Fw.z().f28440w0;
        }
        String strA = AbstractC2625Ws.a(str, interfaceC1750Fw.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f("Action missing from an open GMSG.");
            return;
        }
        G4.b bVar = this.f26287a;
        if (bVar == null || bVar.b()) {
            AbstractC5685wx0.r((((Boolean) H4.B.c().d(AbstractC3892ii.zb)).booleanValue() && (c2821aB = this.f26292f) != null && C2821aB.c(strA)) ? c2821aB.b(strA, C0654z.h()) : AbstractC5685wx0.a(strA), new C2559Vl(this, map, interfaceC0580a, str2), this.f26295i);
        } else {
            bVar.c(strA);
        }
    }
}
