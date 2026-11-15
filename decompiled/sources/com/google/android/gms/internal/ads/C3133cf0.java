package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.util.Clock;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.cf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3133cf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2799a00 f27163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f27166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Context f27167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5137sb0 f27168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C5263tb0 f27169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Clock f27170h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C5138sc f27171i;

    public C3133cf0(C2799a00 c2799a00, L4.a aVar, String str, String str2, Context context, C5137sb0 c5137sb0, C5263tb0 c5263tb0, Clock clock, C5138sc c5138sc) {
        this.f27163a = c2799a00;
        this.f27164b = aVar.f3097a;
        this.f27165c = str;
        this.f27166d = str2;
        this.f27167e = context;
        this.f27168f = c5137sb0;
        this.f27169g = c5263tb0;
        this.f27170h = clock;
        this.f27171i = c5138sc;
    }

    public static String d(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return L4.m.j() ? "fakeForAdDebugLog" : str;
    }

    public final List a(C5011rb0 c5011rb0, C3502fb0 c3502fb0, List list) {
        return b(c5011rb0, c3502fb0, false, "", "", list, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    public final List b(C5011rb0 c5011rb0, C3502fb0 c3502fb0, boolean z9, String str, String str2, List list, C4337mF c4337mF, C1640Dt c1640Dt) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str3 = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION;
            boolean z10 = true;
            String strD = d(d(d((String) it.next(), "@gw_adlocid@", c5011rb0.f32990a.f31840a.f35798g), "@gw_adnetrefresh@", true != z9 ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION), "@gw_sdkver@", this.f27164b);
            if (c3502fb0 != null) {
                String strD2 = d(d(d(strD, "@gw_qdata@", c3502fb0.f28443y), "@gw_adnetid@", c3502fb0.f28441x), "@gw_allocid@", c3502fb0.f28439w);
                Context context = this.f27167e;
                strD = AbstractC2625Ws.a(strD2, context, c3502fb0.f28391W, c3502fb0.f28440w0);
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Ze)).booleanValue() && c3502fb0.f28403e == 4) {
                    G4.t.g();
                    if (true != K4.F0.l(context)) {
                        str3 = "0";
                    }
                    strD = d(strD, "@gw_aps@", str3);
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.lf)).booleanValue() && c1640Dt != null) {
                    int i10 = c1640Dt.f18295a;
                    String strD3 = d(strD, "@gw_is@", i10 >= 0 ? Integer.toString(i10) : "");
                    int i11 = c1640Dt.f18296b;
                    String strD4 = d(strD3, "@gw_fis@", i11 >= 0 ? Integer.toString(i11) : "");
                    int i12 = c1640Dt.f18297c;
                    strD = d(strD4, "@gw_sfis@", i12 >= 0 ? Integer.toString(i12) : "");
                }
            }
            C2799a00 c2799a00 = this.f27163a;
            String strD5 = d(d(d(d(strD, "@gw_adnetstatus@", c2799a00.g()), "@gw_ttr@", Long.toString(c2799a00.h(), 10)), "@gw_seqnum@", this.f27165c), "@gw_sessid@", this.f27166d);
            if (((Boolean) H4.B.c().d(AbstractC3892ii.jf)).booleanValue()) {
                strD5 = (c4337mF == null || c4337mF.a() <= 0) ? d(strD5, "@gw_placement_id@", "") : d(strD5, "@gw_placement_id@", Long.toString(c4337mF.a(), 10));
            }
            boolean z11 = false;
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29962s4)).booleanValue() && !TextUtils.isEmpty(str)) {
                z11 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z12 = !zIsEmpty;
            if (z11) {
                z10 = z12;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strD5);
            }
            if (this.f27171i.a(Uri.parse(strD5))) {
                Uri.Builder builderBuildUpon = Uri.parse(strD5).buildUpon();
                if (z11) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z10) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strD5 = builderBuildUpon.build().toString();
            }
            arrayList.add(strD5);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    public final List c(C3502fb0 c3502fb0, List list, InterfaceC1896Ir interfaceC1896Ir) {
        C5137sb0 c5137sb0;
        AbstractC2314Qs0 abstractC2314Qs0D;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.f27170h.currentTimeMillis();
        try {
            String strZzb = interfaceC1896Ir.zzb();
            String string = Integer.toString(interfaceC1896Ir.zzc());
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29973t4)).booleanValue()) {
                C5263tb0 c5263tb0 = this.f27169g;
                if (c5263tb0 == null) {
                    abstractC2314Qs0D = AbstractC2314Qs0.c();
                } else {
                    c5137sb0 = c5263tb0.f33429a;
                }
                str = (String) abstractC2314Qs0D.b(C3008bf0.f26891a).a("");
                str2 = (String) abstractC2314Qs0D.b(C2882af0.f26589a).a("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC2625Ws.a(d(d(d(d(d(d((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f27164b), this.f27167e, c3502fb0.f28391W, c3502fb0.f28440w0));
                }
                return arrayList;
            }
            c5137sb0 = this.f27168f;
            abstractC2314Qs0D = AbstractC2314Qs0.d(c5137sb0);
            str = (String) abstractC2314Qs0D.b(C3008bf0.f26891a).a("");
            str2 = (String) abstractC2314Qs0D.b(C2882af0.f26589a).a("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC2625Ws.a(d(d(d(d(d(d((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzb)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f27164b), this.f27167e, c3502fb0.f28391W, c3502fb0.f28440w0));
            }
            return arrayList;
        } catch (RemoteException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Unable to determine award type and amount.", e10);
            return arrayList;
        }
    }
}
