package Q4;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.AbstractC2315Qt;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC4775pj;
import com.google.android.gms.internal.ads.WR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f4941a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f4942b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WR f4944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f4945e;

    k0(Context context, WR wr, ExecutorService executorService) {
        this.f4943c = context;
        this.f4944d = wr;
        this.f4945e = executorService;
    }

    private final void h(final boolean z9) {
        Map map = this.f4942b;
        Boolean boolValueOf = Boolean.valueOf(z9);
        if (map.containsKey(boolValueOf)) {
            return;
        }
        map.put(boolValueOf, new ArrayList());
        this.f4945e.submit(new Runnable() { // from class: Q4.h0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                this.f4928a.f(z9);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void e(boolean z9, boolean z10) throws Throwable {
        Throwable th;
        try {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("query_info_type", "requester_type_6");
                bundle.putBoolean("accept_3p_cookie", z9);
                Map map = this.f4941a;
                Boolean boolValueOf = Boolean.valueOf(z9);
                m0 m0Var = (m0) map.get(boolValueOf);
                int iD = 0;
                if (z10 && m0Var != null) {
                    try {
                        iD = m0Var.d() + 1;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                m0 m0Var2 = (m0) map.get(boolValueOf);
                final l0 l0Var = new l0(this, z9, iD, m0Var2 == null ? null : Boolean.valueOf(m0Var2.e()), this.f4944d);
                final AdRequest adRequestN = ((AdRequest.Builder) new AdRequest.Builder().d(AdMobAdapter.class, bundle)).n();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Bc)).booleanValue()) {
                    this.f4945e.submit(new Callable() { // from class: Q4.i0
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.f4931a.g(adRequestN, l0Var);
                        }
                    });
                } else {
                    T4.a.a(this.f4943c, B4.b.BANNER, adRequestN, l0Var);
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private final void j(m0 m0Var, Pair pair, boolean z9) {
        m0Var.f();
        T4.a aVarA = m0Var.a();
        if (aVarA != null) {
            ((T4.b) pair.first).b(aVarA);
        } else {
            ((T4.b) pair.first).a(m0Var.b());
        }
        AbstractC0928c.e(this.f4944d, null, "sgpcr", new Pair("se", "query_g"), new Pair("ad_format", B4.b.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(G4.t.o().currentTimeMillis() - ((Long) pair.second).longValue())), new Pair("sgpc_h", Boolean.toString(z9)), new Pair("sgpc_rs", Boolean.toString(m0Var.a() != null)));
    }

    public final synchronized void a() {
        h(true);
        h(false);
    }

    public final synchronized void b(final Object obj, T4.b bVar) {
        final Pair pair = new Pair(bVar, Long.valueOf(G4.t.o().currentTimeMillis()));
        AbstractC2315Qt.f22478f.execute(new Runnable() { // from class: Q4.j0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f4935a.d(obj, pair);
            }
        });
    }

    final synchronized void c(final boolean z9, m0 m0Var) {
        try {
            Map map = this.f4941a;
            Boolean boolValueOf = Boolean.valueOf(z9);
            m0 m0Var2 = (m0) map.get(boolValueOf);
            if (m0Var2 == null || m0Var2.c() || m0Var2.a() == null || m0Var.a() != null) {
                map.put(boolValueOf, m0Var);
            }
            long jLongValue = (m0Var.a() != null ? (Long) AbstractC4775pj.f32466f.e() : (Long) AbstractC4775pj.f32467g.e()).longValue();
            final boolean z10 = m0Var.a() == null;
            AbstractC2315Qt.f22476d.schedule(new Runnable() { // from class: Q4.g0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    this.f4922a.e(z9, z10);
                }
            }, jLongValue, TimeUnit.SECONDS);
            Map map2 = this.f4942b;
            List list = (List) map2.get(boolValueOf);
            map2.put(boolValueOf, new ArrayList());
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j(m0Var, (Pair) it.next(), false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    final /* synthetic */ void d(Object obj, Pair pair) {
        boolean zAcceptThirdPartyCookies = false;
        if (obj instanceof WebView) {
            CookieManager cookieManagerA = G4.t.j().a(this.f4943c);
            if (cookieManagerA != null) {
                zAcceptThirdPartyCookies = cookieManagerA.acceptThirdPartyCookies((WebView) obj);
            }
        }
        Map map = this.f4941a;
        Boolean boolValueOf = Boolean.valueOf(zAcceptThirdPartyCookies);
        m0 m0Var = (m0) map.get(boolValueOf);
        if (m0Var != null && !m0Var.c()) {
            j(m0Var, pair, true);
            return;
        }
        Map map2 = this.f4942b;
        List arrayList = (List) map2.get(boolValueOf);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(boolValueOf, arrayList);
        }
        arrayList.add(pair);
    }

    final /* synthetic */ void f(boolean z9) throws Throwable {
        e(z9, false);
    }

    final /* synthetic */ Object g(AdRequest adRequest, l0 l0Var) {
        T4.a.a(this.f4943c, B4.b.BANNER, adRequest, l0Var);
        return Boolean.TRUE;
    }
}
