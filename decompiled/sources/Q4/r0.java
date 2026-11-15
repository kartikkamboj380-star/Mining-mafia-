package Q4;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC2315Qt;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.JR;
import com.google.android.gms.internal.ads.WR;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WR f4985h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f4986i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f4983f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayDeque f4984g = new ArrayDeque();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4978a = ((Integer) H4.B.c().d(AbstractC3892ii.f29657P7)).intValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4979b = ((Long) H4.B.c().d(AbstractC3892ii.f29667Q7)).longValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f4980c = ((Boolean) H4.B.c().d(AbstractC3892ii.f29707U7)).booleanValue();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f4981d = ((Boolean) H4.B.c().d(AbstractC3892ii.f29697T7)).booleanValue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f4982e = Collections.synchronizedMap(new o0(this));

    public r0(WR wr) {
        this.f4985h = wr;
    }

    private final synchronized void i() {
        long jCurrentTimeMillis = G4.t.o().currentTimeMillis();
        try {
            Iterator it = this.f4982e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ((p0) entry.getValue()).f4968a.longValue() <= this.f4979b) {
                    break;
                }
                this.f4984g.add(new Pair((String) entry.getKey(), ((p0) entry.getValue()).f4969b));
                it.remove();
                throw th;
            }
        } catch (ConcurrentModificationException e10) {
            G4.t.l().j(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private final synchronized void j(final JR jr) {
        if (this.f4980c) {
            ArrayDeque arrayDeque = this.f4984g;
            final ArrayDeque arrayDequeClone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.f4983f;
            final ArrayDeque arrayDequeClone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            AbstractC2315Qt.f22473a.execute(new Runnable() { // from class: Q4.q0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f4973a.f(jr, arrayDequeClone, arrayDequeClone2);
                }
            });
        }
    }

    private final void k(JR jr, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(jr.c());
            this.f4986i = concurrentHashMap;
            concurrentHashMap.put(HandleInvocationsFromAdViewer.KEY_ACTION, "ev");
            this.f4986i.put("e_r", str);
            this.f4986i.put("e_id", (String) pair2.first);
            if (this.f4981d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(AbstractC0928c.b(jSONObject.getJSONObject(HandleInvocationsFromAdViewer.KEY_EXTRAS).getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                l(this.f4986i, "e_type", (String) pair.first);
                l(this.f4986i, "e_agent", (String) pair.second);
            }
            this.f4985h.b(this.f4986i);
        }
    }

    private static final void l(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public final synchronized void a(String str, String str2, JR jr) {
        this.f4982e.put(str, new p0(Long.valueOf(G4.t.o().currentTimeMillis()), str2, new HashSet()));
        i();
        j(jr);
    }

    public final synchronized String b(String str, JR jr) {
        p0 p0Var = (p0) this.f4982e.get(str);
        jr.c().put("request_id", str);
        if (p0Var == null) {
            jr.c().put("mhit", "false");
            return null;
        }
        jr.c().put("mhit", "true");
        return p0Var.f4969b;
    }

    public final synchronized void c(String str) {
        this.f4982e.remove(str);
    }

    public final synchronized boolean d(String str, String str2) {
        p0 p0Var = (p0) this.f4982e.get(str);
        return p0Var != null && p0Var.f4970c.contains(str2);
    }

    public final synchronized boolean e(String str, String str2, int i10) {
        p0 p0Var = (p0) this.f4982e.get(str);
        if (p0Var == null) {
            return false;
        }
        Set set = p0Var.f4970c;
        set.add(str2);
        return set.size() < i10;
    }

    final /* synthetic */ void f(JR jr, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        k(jr, arrayDeque, "to");
        k(jr, arrayDeque2, "of");
    }

    final /* synthetic */ int g() {
        return this.f4978a;
    }

    final /* synthetic */ ArrayDeque h() {
        return this.f4983f;
    }
}
