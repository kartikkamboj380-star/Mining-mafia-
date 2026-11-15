package com.apm.insight.runtime;

import android.content.Context;
import com.unity3d.ads.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f13191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Long> f13192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13194d;

    public f(Context context) {
        this.f13192b = null;
        this.f13193c = 50;
        this.f13194d = 100;
        this.f13191a = context;
        this.f13192b = b();
        this.f13193c = a.a(this.f13193c, "custom_event_settings", "npth_simple_setting", "crash_limit_issue");
        this.f13194d = a.a(this.f13194d, "custom_event_settings", "npth_simple_setting", "crash_limit_all");
    }

    private HashMap<String, Long> b() {
        File fileH = com.apm.insight.l.j.h(this.f13191a);
        HashMap<String, Long> map = new HashMap<>();
        map.put("time", Long.valueOf(System.currentTimeMillis()));
        try {
            JSONArray jSONArrayA = com.apm.insight.l.f.a(fileH.getAbsolutePath());
            if (!com.apm.insight.a.a(jSONArrayA)) {
                Long lDecode = Long.decode(jSONArrayA.optString(0, null));
                if (System.currentTimeMillis() - lDecode.longValue() > 86400000) {
                    File fileG = com.apm.insight.l.j.g(this.f13191a);
                    fileH.renameTo(new File(fileG, String.valueOf(System.currentTimeMillis())));
                    String[] list = fileG.list();
                    if (list != null && list.length > 5) {
                        Arrays.sort(list);
                        new File(fileG, list[0]).delete();
                        return map;
                    }
                } else {
                    map.put("time", lDecode);
                    for (int i10 = 1; i10 < jSONArrayA.length(); i10++) {
                        String[] strArrSplit = jSONArrayA.optString(i10, "").split(" ");
                        if (strArrSplit.length == 2) {
                            map.put(strArrSplit[0], Long.decode(strArrSplit[1]));
                        }
                    }
                }
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            com.apm.insight.c.a();
            j.a(th, "NPTH_CATCH");
        }
        return map;
    }

    public final void a() throws Throwable {
        HashMap<String, Long> map = this.f13192b;
        Long lRemove = map.remove("time");
        if (lRemove == null) {
            com.apm.insight.c.a();
            j.a(new RuntimeException("err times, no time"), "NPTH_CATCH");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lRemove);
        sb.append('\n');
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(' ');
            sb.append(entry.getValue());
            sb.append('\n');
        }
        try {
            com.apm.insight.l.f.a(com.apm.insight.l.j.h(this.f13191a), sb.toString(), false);
        } catch (IOException unused) {
        }
    }

    public final boolean a(String str) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        return com.apm.insight.l.c.AnonymousClass1.a(this.f13192b, str, 1L).longValue() < ((long) this.f13193c) && com.apm.insight.l.c.AnonymousClass1.a(this.f13192b, "all", 1L).longValue() < ((long) this.f13194d);
    }
}
