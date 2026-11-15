package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonReader;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class HS extends AbstractBinderC4655om {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final KS f19292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FS f19293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19294c = new HashMap();

    HS(KS ks, FS fs) {
        this.f19292a = ks;
        this.f19293b = fs;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0081  */
    private static H4.h2 y6(Map map) {
        H4.i2 i2Var = new H4.i2();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return i2Var.a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                switch (jsonReader.nextName()) {
                    case "extras":
                        jsonReader.beginObject();
                        Bundle bundle = new Bundle();
                        while (jsonReader.hasNext()) {
                            bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                        }
                        jsonReader.endObject();
                        i2Var.b(bundle);
                        break;
                    case "keywords":
                        jsonReader.beginArray();
                        ArrayList arrayList = new ArrayList();
                        while (jsonReader.hasNext()) {
                            arrayList.add(jsonReader.nextString());
                        }
                        jsonReader.endArray();
                        i2Var.c(arrayList);
                        break;
                    case "isTestDevice":
                        i2Var.d(jsonReader.nextBoolean());
                        break;
                    case "tagForChildDirectedTreatment":
                        if (!jsonReader.nextBoolean()) {
                            i2Var.e(0);
                            break;
                        } else {
                            i2Var.e(1);
                            break;
                        }
                        break;
                    case "tagForUnderAgeOfConsent":
                        if (!jsonReader.nextBoolean()) {
                            i2Var.f(0);
                            break;
                        } else {
                            i2Var.f(1);
                            break;
                        }
                        break;
                    case "maxAdContentRating":
                        String strNextString = jsonReader.nextString();
                        if (!B4.t.f256f.contains(strNextString)) {
                            break;
                        } else {
                            i2Var.g(strNextString);
                            break;
                        }
                        break;
                    case "httpTimeoutMillis":
                        i2Var.h(jsonReader.nextInt());
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.a("Ad Request json was malformed, parsing ended early.");
        }
        H4.h2 h2VarA = i2Var.a();
        Bundle bundle2 = h2VarA.f1303m;
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle3 == null) {
            bundle3 = h2VarA.f1293c;
            bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle3);
        }
        return new H4.h2(h2VarA.f1291a, h2VarA.f1292b, bundle3, h2VarA.f1294d, h2VarA.f1295e, h2VarA.f1296f, h2VarA.f1297g, h2VarA.f1298h, h2VarA.f1299i, h2VarA.f1300j, h2VarA.f1301k, h2VarA.f1302l, bundle2, h2VarA.f1304v, h2VarA.f1305w, h2VarA.f1278G, h2VarA.f1279H, h2VarA.f1280I, h2VarA.f1281J, h2VarA.f1282K, h2VarA.f1283L, h2VarA.f1284M, h2VarA.f1285N, h2VarA.f1286O, h2VarA.f1287P, h2VarA.f1288Q, h2VarA.f1289R);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4781pm
    public final void b() {
        this.f19294c.clear();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4781pm
    public final void k(String str) {
        byte b10;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.tb)).booleanValue()) {
            AbstractC0786o0.k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            G4.t.g();
            Map mapV = K4.F0.v(uri);
            String str2 = (String) mapV.get(HandleInvocationsFromAdViewer.KEY_ACTION);
            if (TextUtils.isEmpty(str2)) {
                L4.p.a("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals(MobileAdsBridgeBase.initializeMethodName)) {
                    b10 = 0;
                } else {
                    b10 = -1;
                }
            } else if (str2.equals("dispose_all")) {
                b10 = 1;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                this.f19294c.clear();
                this.f19293b.a();
                return;
            }
            if (b10 == 1) {
                Map map = this.f19294c;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((BS) it.next()).zzc();
                }
                map.clear();
                return;
            }
            String str3 = (String) mapV.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j10 = Long.parseLong(str3);
                switch (str2) {
                    case "create_interstitial_ad":
                        Map map2 = this.f19294c;
                        if (map2.size() >= ((Integer) H4.B.c().d(AbstractC3892ii.ub)).intValue()) {
                            L4.p.f("Could not create H5 ad, too many existing objects");
                            this.f19293b.c(j10);
                            break;
                        } else {
                            Long lValueOf = Long.valueOf(j10);
                            if (!map2.containsKey(lValueOf)) {
                                String str4 = (String) mapV.get("ad_unit");
                                if (!TextUtils.isEmpty(str4)) {
                                    CS csZzc = this.f19292a.zzc();
                                    csZzc.a(j10);
                                    csZzc.j(str4);
                                    map2.put(lValueOf, csZzc.zza().zza());
                                    this.f19293b.b(j10);
                                    StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 39 + String.valueOf(str4).length());
                                    sb.append("Created H5 interstitial #");
                                    sb.append(j10);
                                    sb.append(" with ad unit ");
                                    sb.append(str4);
                                    AbstractC0786o0.k(sb.toString());
                                } else {
                                    L4.p.f("Could not create H5 ad, missing ad unit id");
                                    this.f19293b.c(j10);
                                }
                            } else {
                                L4.p.a("Could not create H5 ad, object ID already exists");
                                this.f19293b.c(j10);
                            }
                            break;
                        }
                        break;
                    case "load_interstitial_ad":
                        BS bs = (BS) this.f19294c.get(Long.valueOf(j10));
                        if (bs == null) {
                            L4.p.a("Could not load H5 ad, object ID does not exist");
                            this.f19293b.d(j10);
                            break;
                        } else {
                            bs.a(y6(mapV));
                            break;
                        }
                        break;
                    case "show_interstitial_ad":
                        BS bs2 = (BS) this.f19294c.get(Long.valueOf(j10));
                        if (bs2 == null) {
                            L4.p.a("Could not show H5 ad, object ID does not exist");
                            this.f19293b.d(j10);
                            break;
                        } else {
                            bs2.zzb();
                            break;
                        }
                        break;
                    case "create_rewarded_ad":
                        Map map3 = this.f19294c;
                        if (map3.size() >= ((Integer) H4.B.c().d(AbstractC3892ii.ub)).intValue()) {
                            L4.p.f("Could not create H5 ad, too many existing objects");
                            this.f19293b.c(j10);
                            break;
                        } else {
                            Long lValueOf2 = Long.valueOf(j10);
                            if (!map3.containsKey(lValueOf2)) {
                                String str5 = (String) mapV.get("ad_unit");
                                if (!TextUtils.isEmpty(str5)) {
                                    CS csZzc2 = this.f19292a.zzc();
                                    csZzc2.a(j10);
                                    csZzc2.j(str5);
                                    map3.put(lValueOf2, csZzc2.zza().zzb());
                                    this.f19293b.b(j10);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35 + String.valueOf(str5).length());
                                    sb2.append("Created H5 rewarded #");
                                    sb2.append(j10);
                                    sb2.append(" with ad unit ");
                                    sb2.append(str5);
                                    AbstractC0786o0.k(sb2.toString());
                                } else {
                                    L4.p.f("Could not create H5 ad, missing ad unit id");
                                    this.f19293b.c(j10);
                                }
                            } else {
                                L4.p.a("Could not create H5 ad, object ID already exists");
                                this.f19293b.c(j10);
                            }
                            break;
                        }
                        break;
                    case "load_rewarded_ad":
                        BS bs3 = (BS) this.f19294c.get(Long.valueOf(j10));
                        if (bs3 == null) {
                            L4.p.a("Could not load H5 ad, object ID does not exist");
                            this.f19293b.j(j10);
                            break;
                        } else {
                            bs3.a(y6(mapV));
                            break;
                        }
                        break;
                    case "show_rewarded_ad":
                        BS bs4 = (BS) this.f19294c.get(Long.valueOf(j10));
                        if (bs4 == null) {
                            L4.p.a("Could not show H5 ad, object ID does not exist");
                            this.f19293b.j(j10);
                            break;
                        } else {
                            bs4.zzb();
                            break;
                        }
                        break;
                    case "dispose":
                        Map map4 = this.f19294c;
                        Long lValueOf3 = Long.valueOf(j10);
                        BS bs5 = (BS) map4.get(lValueOf3);
                        if (bs5 == null) {
                            L4.p.a("Could not dispose H5 ad, object ID does not exist");
                            break;
                        } else {
                            bs5.zzc();
                            map4.remove(lValueOf3);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 16);
                            sb3.append("Disposed H5 ad #");
                            sb3.append(j10);
                            AbstractC0786o0.k(sb3.toString());
                            break;
                        }
                        break;
                    default:
                        L4.p.a("H5 gmsg contained invalid action: ".concat(str2));
                        break;
                }
            } catch (NullPointerException | NumberFormatException unused) {
                L4.p.a("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }
}
