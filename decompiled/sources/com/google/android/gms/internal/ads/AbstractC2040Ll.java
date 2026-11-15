package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2040Ll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC2091Ml f20635a = C1988Kl.f20273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC2091Ml f20636b = C1520Bl.f17686a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC2091Ml f20637c = C1572Cl.f17931a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC2091Ml f20638d = new C5282tl();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC2091Ml f20639e = new C5408ul();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC2091Ml f20640f = C1832Hl.f19384a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC2091Ml f20641g = new C5534vl();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC2091Ml f20642h = new C5660wl();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC2091Ml f20643i = C1884Il.f19644a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final InterfaceC2091Ml f20644j = new C5786xl();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final InterfaceC2091Ml f20645k = new C5912yl();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final InterfaceC2091Ml f20646l = new C5806xv();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC2091Ml f20647m = new C5932yv();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC2091Ml f20648n = new C3521fl();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C3272dm f20649o = new C3272dm();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final InterfaceC2091Ml f20650p = new C6038zl();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC2091Ml f20651q = new C1468Al();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final InterfaceC2091Ml f20652r = new C3647gl();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final InterfaceC2091Ml f20653s = new C3773hl();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final InterfaceC2091Ml f20654t = new C3898il();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final InterfaceC2091Ml f20655u = new C4023jl();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final InterfaceC2091Ml f20656v = new C4149kl();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final InterfaceC2091Ml f20657w = new C4275ll();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final InterfaceC2091Ml f20658x = new C4401ml();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final InterfaceC2091Ml f20659y = new C4527nl();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final InterfaceC2091Ml f20660z = new C4653ol();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final InterfaceC2091Ml f20632A = new C4779pl();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final InterfaceC2091Ml f20633B = new C5030rl();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final InterfaceC2091Ml f20634C = new C5156sl();

    public static com.google.common.util.concurrent.p a(InterfaceC1750Fw interfaceC1750Fw, String str) {
        Uri uriD = Uri.parse(str);
        try {
            C5138sc c5138scN = interfaceC1750Fw.n();
            C1605Db0 c1605Db0W = interfaceC1750Fw.W();
            if (!((Boolean) H4.B.c().d(AbstractC3892ii.wd)).booleanValue() || c1605Db0W == null) {
                if (c5138scN != null && c5138scN.a(uriD)) {
                    uriD = c5138scN.d(uriD, interfaceC1750Fw.getContext(), interfaceC1750Fw.B(), interfaceC1750Fw.d());
                }
            } else if (c5138scN != null && c5138scN.a(uriD)) {
                uriD = c1605Db0W.a(uriD, interfaceC1750Fw.getContext(), interfaceC1750Fw.B(), interfaceC1750Fw.d());
            }
        } catch (C5264tc unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = AbstractC0786o0.f2696b;
            L4.p.f(strConcat);
        }
        Map map = new HashMap();
        if (interfaceC1750Fw.z() != null) {
            map = interfaceC1750Fw.z().f28440w0;
        }
        final String strB = AbstractC2625Ws.b(uriD, interfaceC1750Fw.getContext(), map);
        long jLongValue = ((Long) AbstractC4019jj.f30550e.e()).longValue();
        if (jLongValue <= 0 || jLongValue > 254715000) {
            return AbstractC5685wx0.a(strB);
        }
        AbstractC4678ox0 abstractC4678ox0B = AbstractC4678ox0.B(interfaceC1750Fw.j0());
        C1624Dl c1624Dl = C1624Dl.f18279a;
        InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22479g;
        return (AbstractC4678ox0) AbstractC5685wx0.g((AbstractC4678ox0) AbstractC5685wx0.k((AbstractC4678ox0) AbstractC5685wx0.g(abstractC4678ox0B, Throwable.class, c1624Dl, interfaceExecutorServiceC1805Gx0), new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.El
            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                String str2;
                String str3;
                Uri uri;
                String str4 = (String) obj;
                InterfaceC2091Ml interfaceC2091Ml = AbstractC2040Ll.f20635a;
                String strReplace = strB;
                if (str4 != null) {
                    if (((Boolean) AbstractC4019jj.f30551f.e()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i11 = 0; i11 < 3; i11++) {
                            if (host.endsWith(strArr[i11])) {
                                str2 = (String) AbstractC4019jj.f30546a.e();
                                str3 = (String) AbstractC4019jj.f30547b.e();
                                if (!TextUtils.isEmpty(str2)) {
                                    strReplace = strReplace.replace(str2, str4);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        str2 = (String) AbstractC4019jj.f30546a.e();
                        str3 = (String) AbstractC4019jj.f30547b.e();
                        if (!TextUtils.isEmpty(str2)) {
                            strReplace = strReplace.replace(str2, str4);
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(str3))) {
                                return uri.buildUpon().appendQueryParameter(str3, str4).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, interfaceExecutorServiceC1805Gx0), Throwable.class, new InterfaceC1899Is0() { // from class: com.google.android.gms.internal.ads.Fl
            @Override // com.google.android.gms.internal.ads.InterfaceC1899Is0
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                InterfaceC2091Ml interfaceC2091Ml = AbstractC2040Ll.f20635a;
                if (((Boolean) AbstractC4019jj.f30554i.e()).booleanValue()) {
                    G4.t.l().j(th, "prepareClickUrl.attestation2");
                }
                return strB;
            }
        }, interfaceExecutorServiceC1805Gx0);
    }

    public static InterfaceC2091Ml b(final InterfaceC4599oK interfaceC4599oK, final C2821aB c2821aB) {
        return new InterfaceC2091Ml() { // from class: com.google.android.gms.internal.ads.Gl
            @Override // com.google.android.gms.internal.ads.InterfaceC2091Ml
            public final /* synthetic */ void a(Object obj, Map map) {
                InterfaceC1750Fw interfaceC1750Fw = (InterfaceC1750Fw) obj;
                AbstractC2040Ll.c(map, interfaceC4599oK);
                final String str = (String) map.get("u");
                if (str == null) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.f("URL missing from click GMSG.");
                    return;
                }
                final C2821aB c2821aB2 = c2821aB;
                AbstractC4678ox0 abstractC4678ox0B = AbstractC4678ox0.B(AbstractC2040Ll.a(interfaceC1750Fw, str));
                InterfaceC3294dx0 interfaceC3294dx0 = new InterfaceC3294dx0() { // from class: com.google.android.gms.internal.ads.Jl
                    @Override // com.google.android.gms.internal.ads.InterfaceC3294dx0
                    public final /* synthetic */ com.google.common.util.concurrent.p zza(Object obj2) {
                        C2821aB c2821aB3;
                        String str2 = (String) obj2;
                        InterfaceC2091Ml interfaceC2091Ml = AbstractC2040Ll.f20635a;
                        return (((Boolean) H4.B.c().d(AbstractC3892ii.zb)).booleanValue() && (c2821aB3 = c2821aB2) != null && C2821aB.c(str)) ? c2821aB3.b(str2, C0654z.h()) : AbstractC5685wx0.a(str2);
                    }
                };
                InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0 = AbstractC2315Qt.f22473a;
                AbstractC5685wx0.r((AbstractC4678ox0) AbstractC5685wx0.j(abstractC4678ox0B, interfaceC3294dx0, interfaceExecutorServiceC1805Gx0), new C4905ql(interfaceC1750Fw), interfaceExecutorServiceC1805Gx0);
            }
        };
    }

    public static void c(Map map, InterfaceC4599oK interfaceC4599oK) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.jc)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION) && interfaceC4599oK != null) {
            interfaceC4599oK.t0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(InterfaceC5180sx interfaceC5180sx, Map map) {
        Intent uri;
        PackageManager packageManager = interfaceC5180sx.getContext().getPackageManager();
        try {
            try {
                JSONArray jSONArray = new JSONObject((String) map.get(JsonStorageKeyNames.DATA_KEY)).getJSONArray("intents");
                JSONObject jSONObject = new JSONObject();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        String strOptString = jSONObject2.optString("id");
                        String strOptString2 = jSONObject2.optString("u");
                        String strOptString3 = jSONObject2.optString("i");
                        String strOptString4 = jSONObject2.optString("m");
                        String strOptString5 = jSONObject2.optString("p");
                        String strOptString6 = jSONObject2.optString("c");
                        String strOptString7 = jSONObject2.optString("intent_url");
                        ResolveInfo resolveInfoResolveActivity = null;
                        if (TextUtils.isEmpty(strOptString7)) {
                            uri = null;
                        } else {
                            try {
                                uri = Intent.parseUri(strOptString7, 0);
                            } catch (URISyntaxException e10) {
                                String strValueOf = String.valueOf(strOptString7);
                                int i11 = AbstractC0786o0.f2696b;
                                L4.p.d("Error parsing the url: ".concat(strValueOf), e10);
                                uri = null;
                            }
                        }
                        if (uri == null) {
                            uri = new Intent();
                            if (!TextUtils.isEmpty(strOptString2)) {
                                uri.setData(Uri.parse(strOptString2));
                            }
                            if (!TextUtils.isEmpty(strOptString3)) {
                                uri.setAction(strOptString3);
                            }
                            if (!TextUtils.isEmpty(strOptString4)) {
                                uri.setType(strOptString4);
                            }
                            if (!TextUtils.isEmpty(strOptString5)) {
                                uri.setPackage(strOptString5);
                            }
                            if (!TextUtils.isEmpty(strOptString6)) {
                                String[] strArrSplit = strOptString6.split("/", 2);
                                if (strArrSplit.length == 2) {
                                    uri.setComponent(new ComponentName(strArrSplit[0], strArrSplit[1]));
                                }
                            }
                        }
                        Intent intent = uri;
                        try {
                            resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
                        } catch (NullPointerException e11) {
                            G4.t.l().j(e11, intent.toString());
                        }
                        try {
                            jSONObject.put(strOptString, resolveInfoResolveActivity != null);
                        } catch (JSONException e12) {
                            int i12 = AbstractC0786o0.f2696b;
                            L4.p.d("Error constructing openable urls response.", e12);
                        }
                    } catch (JSONException e13) {
                        int i13 = AbstractC0786o0.f2696b;
                        L4.p.d("Error parsing the intent data.", e13);
                    }
                }
                ((InterfaceC3274dn) interfaceC5180sx).p("openableIntents", jSONObject);
            } catch (JSONException unused) {
                ((InterfaceC3274dn) interfaceC5180sx).p("openableIntents", new JSONObject());
            }
        } catch (JSONException unused2) {
            ((InterfaceC3274dn) interfaceC5180sx).p("openableIntents", new JSONObject());
        }
    }
}
