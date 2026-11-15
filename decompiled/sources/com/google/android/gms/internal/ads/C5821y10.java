package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.y10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5821y10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f35221a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f35222b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f35223c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f35224d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f35225e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f35226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f35227g;

    C5821y10(Executor executor) {
        this.f35226f = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void h() {
        this.f35222b.clear();
        this.f35221a.clear();
        this.f35225e.clear();
        this.f35224d.clear();
        l();
        j();
        k();
    }

    private final synchronized void j() {
        JSONObject jSONObjectG;
        if (!((Boolean) AbstractC4901qj.f32717f.e()).booleanValue()) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.f29949r2)).booleanValue() && (jSONObjectG = G4.t.l().r().zzi().g()) != null) {
                try {
                    JSONArray jSONArray = jSONObjectG.getJSONArray("signal_adapters");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        Bundle bundleP = p(jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY));
                        String strOptString = jSONObject.optString("adapter_class_name");
                        boolean zOptBoolean = jSONObject.optBoolean("render", false);
                        boolean zOptBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(strOptString)) {
                            this.f35222b.put(strOptString, new C10(strOptString, zOptBoolean2, zOptBoolean, true, bundleP));
                        }
                    }
                } catch (JSONException e10) {
                    AbstractC0786o0.l("Malformed config loading JSON.", e10);
                }
            }
        }
    }

    private final synchronized void k() {
        JSONObject jSONObjectG;
        try {
            if (!((Boolean) AbstractC4901qj.f32713b.e()).booleanValue()) {
                if (((Boolean) H4.B.c().d(AbstractC3892ii.f29960s2)).booleanValue() && (jSONObjectG = G4.t.l().r().zzi().g()) != null) {
                    try {
                        JSONArray jSONArray = jSONObjectG.getJSONArray("adapter_settings");
                        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String strOptString = jSONObject.optString("adapter_class_name");
                            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("permission_set");
                            if (!TextUtils.isEmpty(strOptString) && jSONArrayOptJSONArray != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                                    boolean zOptBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                    boolean zOptBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                    boolean zOptBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                    String strOptString2 = jSONObject2.optString("platform");
                                    C10 c10 = new C10(strOptString, zOptBoolean2, zOptBoolean, zOptBoolean3, new Bundle());
                                    if (strOptString2.equals("ADMOB")) {
                                        this.f35224d.put(strOptString, c10);
                                    } else if (strOptString2.equals("AD_MANAGER")) {
                                        this.f35225e.put(strOptString, c10);
                                    }
                                }
                            }
                        }
                    } catch (JSONException e10) {
                        AbstractC0786o0.l("Malformed config loading JSON.", e10);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void l() {
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectG = G4.t.l().r().zzi().g();
            if (jSONObjectG != null) {
                try {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectG.optJSONArray("ad_unit_id_settings");
                    this.f35227g = jSONObjectG.optJSONObject("ad_unit_patterns");
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                            String lowerCase = ((Boolean) H4.B.c().d(AbstractC3892ii.sc)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String strOptString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                                    arrayList.addAll(m(jSONArrayOptJSONArray.getJSONObject(i11), strOptString));
                                }
                            }
                            n(strOptString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e10) {
                    AbstractC0786o0.l("Malformed config loading JSON.", e10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List m(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle bundleP = p(jSONObject.optJSONObject(JsonStorageKeyNames.DATA_KEY));
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (jSONArrayOptJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i10, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        String str2 = (String) arrayList2.get(i11);
                        e(str2);
                        if (((A10) this.f35221a.get(str2)) != null) {
                            arrayList.add(new A10(str2, str, bundleP));
                        }
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    private final synchronized void n(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.f35223c;
            Map map2 = (Map) map.get(str);
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put(str, map2);
            List arrayList = (List) map2.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            map2.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized AbstractC1539Bu0 o(String str) {
        HashMap map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(G4.t.l().r().zzi().d())) {
                boolean zMatches = Pattern.matches((String) H4.B.c().d(AbstractC3892ii.f29764a4), str);
                boolean zMatches2 = Pattern.matches((String) H4.B.c().d(AbstractC3892ii.f29775b4), str);
                if (zMatches) {
                    map = new HashMap(this.f35225e);
                } else if (zMatches2) {
                    map = new HashMap(this.f35224d);
                }
                return AbstractC1539Bu0.c(map);
            }
            return AbstractC1539Bu0.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle p(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle.putString(next, jSONObject.optString(next, ""));
            }
        }
        return bundle;
    }

    public final void a() {
        G4.t.l().r().P0(new Runnable() { // from class: com.google.android.gms.internal.ads.x10
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34711a.f();
            }
        });
        this.f35226f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.v10
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33973a.g();
            }
        });
    }

    public final synchronized Map b() {
        if (TextUtils.isEmpty(G4.t.l().r().zzi().d())) {
            return AbstractC1539Bu0.a();
        }
        return AbstractC1539Bu0.c(this.f35222b);
    }

    public final synchronized Map c(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(G4.t.l().r().zzi().d()) && (map = (Map) this.f35223c.get(str)) != null) {
                List<A10> list = (List) map.get(str2);
                if (list == null) {
                    String strA = KQ.a(this.f35227g, str2, str);
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.sc)).booleanValue()) {
                        strA = strA.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(strA);
                }
                if (list != null) {
                    HashMap map2 = new HashMap();
                    for (A10 a10 : list) {
                        String str3 = a10.f17226a;
                        if (!map2.containsKey(str3)) {
                            map2.put(str3, new ArrayList());
                        }
                        ((List) map2.get(str3)).add(a10.f17227b);
                    }
                    return AbstractC1539Bu0.c(map2);
                }
            }
            return AbstractC1539Bu0.a();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map d(String str, String str2) {
        HashMap map;
        try {
            Map mapC = c(str, str2);
            AbstractC1539Bu0 abstractC1539Bu0O = o(str2);
            map = new HashMap();
            for (Map.Entry entry : mapC.entrySet()) {
                String str3 = (String) entry.getKey();
                if (abstractC1539Bu0O.containsKey(str3)) {
                    C10 c10 = (C10) abstractC1539Bu0O.get(str3);
                    List list = (List) entry.getValue();
                    map.put(str3, new C10(str3, c10.f17770b, c10.f17771c, c10.f17772d, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            AbstractC2112Mv0 abstractC2112Mv0A = abstractC1539Bu0O.entrySet().a();
            while (abstractC2112Mv0A.hasNext()) {
                Map.Entry entry2 = (Map.Entry) abstractC2112Mv0A.next();
                String str4 = (String) entry2.getKey();
                if (!map.containsKey(str4) && ((C10) entry2.getValue()).f17772d) {
                    map.put(str4, (C10) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return map;
    }

    public final synchronized void e(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.f35221a;
            if (!map.containsKey(str)) {
                map.put(str, new A10(str, "", new Bundle()));
            }
        }
    }

    final /* synthetic */ void f() {
        this.f35226f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.w10
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f34454a.h();
            }
        });
    }
}
