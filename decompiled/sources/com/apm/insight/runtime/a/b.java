package com.apm.insight.runtime.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f13128a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f13129b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f13130c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f13131d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f13132e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f13133f = -1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static volatile b f13134z;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f13136B;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Application f13137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f13138h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f13144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f13145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f13146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f13147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f13148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f13149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f13150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f13151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f13152v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f13153w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<String> f13139i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<Long> f13140j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<String> f13141k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List<Long> f13142l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinkedList<a> f13143m = new LinkedList<>();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f13154x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f13155y = -1;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private int f13135A = 50;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f13157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f13158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f13159c;

        a(String str, String str2, long j10) {
            this.f13158b = str2;
            this.f13159c = j10;
            this.f13157a = str;
        }

        public final String toString() {
            return com.apm.insight.l.b.a().format(new Date(this.f13159c)) + " : " + this.f13157a + ' ' + this.f13158b;
        }
    }

    private b(@NonNull Application application) {
        this.f13138h = application;
        this.f13137g = application;
        if (application != null) {
            try {
                this.f13137g.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.apm.insight.runtime.a.b.1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                        b.this.f13144n = activity.getClass().getName();
                        b.this.f13145o = System.currentTimeMillis();
                        boolean unused = b.f13129b = bundle != null;
                        boolean unused2 = b.f13130c = true;
                        b.this.f13139i.add(b.this.f13144n);
                        b.this.f13140j.add(Long.valueOf(b.this.f13145o));
                        b bVar = b.this;
                        b.a(bVar, bVar.f13144n, b.this.f13145o, "onCreate");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) {
                        String name = activity.getClass().getName();
                        int iIndexOf = b.this.f13139i.indexOf(name);
                        if (iIndexOf >= 0 && iIndexOf < b.this.f13139i.size()) {
                            b.this.f13139i.remove(iIndexOf);
                            b.this.f13140j.remove(iIndexOf);
                        }
                        b.this.f13141k.add(name);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b.this.f13142l.add(Long.valueOf(jCurrentTimeMillis));
                        b.a(b.this, name, jCurrentTimeMillis, "onDestroy");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                        b.this.f13150t = activity.getClass().getName();
                        b.this.f13151u = System.currentTimeMillis();
                        b.l(b.this);
                        if (b.this.f13136B == 0) {
                            b.this.f13154x = false;
                            boolean unused = b.f13130c = false;
                            b.this.f13155y = SystemClock.uptimeMillis();
                        } else if (b.this.f13136B < 0) {
                            b.n(b.this);
                            b.this.f13154x = false;
                            boolean unused2 = b.f13130c = false;
                            b.this.f13155y = SystemClock.uptimeMillis();
                        }
                        b bVar = b.this;
                        b.a(bVar, bVar.f13150t, b.this.f13151u, "onPause");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                        b.this.f13148r = activity.getClass().getName();
                        b.this.f13149s = System.currentTimeMillis();
                        b.g(b.this);
                        if (!b.this.f13154x) {
                            if (b.f13128a) {
                                b.k();
                                int unused = b.f13131d = 1;
                                long unused2 = b.f13133f = b.this.f13149s;
                            }
                            if (!b.this.f13148r.equals(b.this.f13150t)) {
                                return;
                            }
                            if (b.f13130c && !b.f13129b) {
                                int unused3 = b.f13131d = 4;
                                long unused4 = b.f13133f = b.this.f13149s;
                                return;
                            } else if (!b.f13130c) {
                                int unused5 = b.f13131d = 3;
                                long unused6 = b.f13133f = b.this.f13149s;
                                return;
                            }
                        }
                        b.this.f13154x = true;
                        b bVar = b.this;
                        b.a(bVar, bVar.f13148r, b.this.f13149s, "onResume");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                        b.this.f13146p = activity.getClass().getName();
                        b.this.f13147q = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f13146p, b.this.f13147q, "onStart");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                        b.this.f13152v = activity.getClass().getName();
                        b.this.f13153w = System.currentTimeMillis();
                        b bVar = b.this;
                        b.a(bVar, bVar.f13152v, b.this.f13153w, "onStop");
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    static /* synthetic */ int g(b bVar) {
        int i10 = bVar.f13136B;
        bVar.f13136B = i10 + 1;
        return i10;
    }

    static /* synthetic */ int l(b bVar) {
        int i10 = bVar.f13136B;
        bVar.f13136B = i10 - 1;
        return i10;
    }

    static /* synthetic */ int n(b bVar) {
        bVar.f13136B = 0;
        return 0;
    }

    static /* synthetic */ boolean k() {
        f13128a = false;
        return false;
    }

    private JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f13139i;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f13139i.size(); i10++) {
                try {
                    jSONArray.put(a(this.f13139i.get(i10), this.f13140j.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    private JSONArray o() {
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f13141k;
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < this.f13141k.size(); i10++) {
                try {
                    jSONArray.put(a(this.f13141k.get(i10), this.f13142l.get(i10).longValue()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        if (com.apm.insight.e.w()) {
            try {
                jSONObject.put("last_create_activity", a(this.f13144n, this.f13145o));
                jSONObject.put("last_start_activity", a(this.f13146p, this.f13147q));
                jSONObject.put("last_resume_activity", a(this.f13148r, this.f13149s));
                jSONObject.put("last_pause_activity", a(this.f13150t, this.f13151u));
                jSONObject.put("last_stop_activity", a(this.f13152v, this.f13153w));
                jSONObject.put("alive_activities", n());
                jSONObject.put("finish_activities", o());
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    @NonNull
    public final String h() {
        return String.valueOf(this.f13148r);
    }

    public final JSONArray i() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(this.f13143m);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jSONArray.put(((a) obj).toString());
        }
        return jSONArray;
    }

    public final boolean f() {
        return this.f13154x;
    }

    public static long c() {
        return f13133f;
    }

    public static b d() {
        if (f13134z == null) {
            synchronized (b.class) {
                try {
                    if (f13134z == null) {
                        f13134z = new b(com.apm.insight.e.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13134z;
    }

    public final long e() {
        return SystemClock.uptimeMillis() - this.f13155y;
    }

    public static int b() {
        int i10 = f13131d;
        if (i10 == 1) {
            return f13132e ? 2 : 1;
        }
        return i10;
    }

    public static void a() {
        f13132e = true;
    }

    private static JSONObject a(String str, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, str);
            jSONObject.put("time", j10);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    static /* synthetic */ void a(b bVar, String str, long j10, String str2) {
        a aVar;
        if (com.apm.insight.e.w()) {
            try {
                if (bVar.f13143m.size() >= bVar.f13135A) {
                    aVar = bVar.f13143m.poll();
                    if (aVar != null) {
                        bVar.f13143m.add(aVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar == null) {
                    aVar = new a(str, str2, j10);
                    bVar.f13143m.add(aVar);
                }
                aVar.f13158b = str2;
                aVar.f13157a = str;
                aVar.f13159c = j10;
            } catch (Throwable unused) {
            }
        }
    }
}
