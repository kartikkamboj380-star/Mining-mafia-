package p037d6;

import D6.d;
import android.content.Context;
import android.os.Bundle;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.B1;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p007a6.f;
import p136n5.H;
import p136n5.t;

/* JADX INFO: loaded from: classes.dex */
public class b implements p037d6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile p037d6.a f43152c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final p126m5.a f43153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Map f43154b;

    class a implements p037d6.a.InterfaceC0411a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f43156b;

        a(b bVar, String str) {
            this.f43155a = str;
            Objects.requireNonNull(bVar);
            this.f43156b = bVar;
        }
    }

    b(p126m5.a aVar) {
        Preconditions.checkNotNull(aVar);
        this.f43153a = aVar;
        this.f43154b = new ConcurrentHashMap();
    }

    public static p037d6.a h(f fVar, Context context, d dVar) {
        Preconditions.checkNotNull(fVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f43152c == null) {
            synchronized (b.class) {
                try {
                    if (f43152c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.y()) {
                            dVar.c(p007a6.b.class, d.f43158a, c.f43157a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.x());
                        }
                        f43152c = new b(B1.s(context, bundle).t());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f43152c;
    }

    static /* synthetic */ void i(D6.a aVar) {
        boolean z9 = ((p007a6.b) aVar.a()).f7285a;
        synchronized (b.class) {
            ((b) Preconditions.checkNotNull(f43152c)).f43153a.i(z9);
        }
    }

    private final boolean j(String str) {
        if (str.isEmpty()) {
            return false;
        }
        Map map = this.f43154b;
        return map.containsKey(str) && map.get(str) != null;
    }

    @Override // p037d6.a
    public p037d6.a.InterfaceC0411a a(String str, d6.a.b bVar) {
        Object fVar;
        Preconditions.checkNotNull(bVar);
        if (com.google.firebase.analytics.connector.internal.b.a(str) && !j(str)) {
            p126m5.a aVar = this.f43153a;
            if ("fiam".equals(str)) {
                fVar = new com.google.firebase.analytics.connector.internal.d(aVar, bVar);
            } else {
                fVar = "clx".equals(str) ? new com.google.firebase.analytics.connector.internal.f(aVar, bVar) : null;
            }
            if (fVar != null) {
                this.f43154b.put(str, fVar);
                return new a(this, str);
            }
        }
        return null;
    }

    @Override // p037d6.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.e(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f43153a.e(str, str2, bundle);
        }
    }

    @Override // p037d6.a
    public void c(String str, String str2, Object obj) {
        if (com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, str2)) {
            this.f43153a.h(str, str2, obj);
        }
    }

    @Override // p037d6.a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || com.google.firebase.analytics.connector.internal.b.b(str2, bundle)) {
            this.f43153a.a(str, str2, bundle);
        }
    }

    @Override // p037d6.a
    public void d(d6.a.c cVar) {
        String str;
        int i10 = com.google.firebase.analytics.connector.internal.b.f39984g;
        if (cVar == null || (str = cVar.f43137a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f43139c;
        if ((obj == null || H.b(obj) != null) && com.google.firebase.analytics.connector.internal.b.a(str) && com.google.firebase.analytics.connector.internal.b.d(str, cVar.f43138b)) {
            String str2 = cVar.f43147k;
            if (str2 == null || (com.google.firebase.analytics.connector.internal.b.b(str2, cVar.f43148l) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f43147k, cVar.f43148l))) {
                String str3 = cVar.f43144h;
                if (str3 == null || (com.google.firebase.analytics.connector.internal.b.b(str3, cVar.f43145i) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f43144h, cVar.f43145i))) {
                    String str4 = cVar.f43142f;
                    if (str4 == null || (com.google.firebase.analytics.connector.internal.b.b(str4, cVar.f43143g) && com.google.firebase.analytics.connector.internal.b.e(str, cVar.f43142f, cVar.f43143g))) {
                        p126m5.a aVar = this.f43153a;
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f43137a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f43138b;
                        if (str6 != null) {
                            bundle.putString(MediationMetaData.KEY_NAME, str6);
                        }
                        Object obj2 = cVar.f43139c;
                        if (obj2 != null) {
                            t.a(bundle, obj2);
                        }
                        String str7 = cVar.f43140d;
                        if (str7 != null) {
                            bundle.putString("trigger_event_name", str7);
                        }
                        bundle.putLong("trigger_timeout", cVar.f43141e);
                        String str8 = cVar.f43142f;
                        if (str8 != null) {
                            bundle.putString("timed_out_event_name", str8);
                        }
                        Bundle bundle2 = cVar.f43143g;
                        if (bundle2 != null) {
                            bundle.putBundle("timed_out_event_params", bundle2);
                        }
                        String str9 = cVar.f43144h;
                        if (str9 != null) {
                            bundle.putString("triggered_event_name", str9);
                        }
                        Bundle bundle3 = cVar.f43145i;
                        if (bundle3 != null) {
                            bundle.putBundle("triggered_event_params", bundle3);
                        }
                        bundle.putLong("time_to_live", cVar.f43146j);
                        String str10 = cVar.f43147k;
                        if (str10 != null) {
                            bundle.putString("expired_event_name", str10);
                        }
                        Bundle bundle4 = cVar.f43148l;
                        if (bundle4 != null) {
                            bundle.putBundle("expired_event_params", bundle4);
                        }
                        bundle.putLong("creation_timestamp", cVar.f43149m);
                        bundle.putBoolean(AppStateModule.APP_STATE_ACTIVE, cVar.f43150n);
                        bundle.putLong("triggered_timestamp", cVar.f43151o);
                        aVar.g(bundle);
                    }
                }
            }
        }
    }

    @Override // p037d6.a
    public Map e(boolean z9) {
        return this.f43153a.d(null, null, z9);
    }

    @Override // p037d6.a
    public int f(String str) {
        return this.f43153a.c(str);
    }

    @Override // p037d6.a
    public List g(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f43153a.b(str, str2)) {
            int i10 = com.google.firebase.analytics.connector.internal.b.f39984g;
            Preconditions.checkNotNull(bundle);
            d6.a.c cVar = new d6.a.c();
            cVar.f43137a = (String) Preconditions.checkNotNull((String) t.b(bundle, "origin", String.class, null));
            cVar.f43138b = (String) Preconditions.checkNotNull((String) t.b(bundle, MediationMetaData.KEY_NAME, String.class, null));
            cVar.f43139c = t.b(bundle, "value", Object.class, null);
            cVar.f43140d = (String) t.b(bundle, "trigger_event_name", String.class, null);
            cVar.f43141e = ((Long) t.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            cVar.f43142f = (String) t.b(bundle, "timed_out_event_name", String.class, null);
            cVar.f43143g = (Bundle) t.b(bundle, "timed_out_event_params", Bundle.class, null);
            cVar.f43144h = (String) t.b(bundle, "triggered_event_name", String.class, null);
            cVar.f43145i = (Bundle) t.b(bundle, "triggered_event_params", Bundle.class, null);
            cVar.f43146j = ((Long) t.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            cVar.f43147k = (String) t.b(bundle, "expired_event_name", String.class, null);
            cVar.f43148l = (Bundle) t.b(bundle, "expired_event_params", Bundle.class, null);
            cVar.f43150n = ((Boolean) t.b(bundle, AppStateModule.APP_STATE_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f43149m = ((Long) t.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            cVar.f43151o = ((Long) t.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }
}
