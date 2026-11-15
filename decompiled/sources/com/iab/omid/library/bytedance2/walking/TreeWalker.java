package com.iab.omid.library.bytedance2.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.bytedance2.utils.f;
import com.iab.omid.library.bytedance2.utils.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class TreeWalker implements com.iab.omid.library.bytedance2.processor.a.InterfaceC0385a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static TreeWalker f41822i = new TreeWalker();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static Handler f41823j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static Handler f41824k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Runnable f41825l = new b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Runnable f41826m = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41828b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f41834h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<TreeWalkerTimeLogger> f41827a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f41829c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<com.iab.omid.library.bytedance2.weakreference.a> f41830d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.a f41832f = new com.iab.omid.library.bytedance2.walking.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.processor.b f41831e = new com.iab.omid.library.bytedance2.processor.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.walking.b f41833g = new com.iab.omid.library.bytedance2.walking.b(new com.iab.omid.library.bytedance2.walking.async.c());

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i10, long j10);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i10, long j10);
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.this.f41833g.b();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeWalker.getInstance().l();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TreeWalker.f41824k != null) {
                TreeWalker.f41824k.post(TreeWalker.f41825l);
                TreeWalker.f41824k.postDelayed(TreeWalker.f41826m, 200L);
            }
        }
    }

    TreeWalker() {
    }

    private void d() {
        a(f.b() - this.f41834h);
    }

    private void e() {
        this.f41828b = 0;
        this.f41830d.clear();
        this.f41829c = false;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
        while (it.hasNext()) {
            if (it.next().e()) {
                this.f41829c = true;
                break;
            }
        }
        this.f41834h = f.b();
    }

    public static TreeWalker getInstance() {
        return f41822i;
    }

    private void i() {
        if (f41824k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f41824k = handler;
            handler.post(f41825l);
            f41824k.postDelayed(f41826m, 200L);
        }
    }

    private void k() {
        Handler handler = f41824k;
        if (handler != null) {
            handler.removeCallbacks(f41826m);
            f41824k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        e();
        f();
        d();
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f41827a.contains(treeWalkerTimeLogger)) {
            return;
        }
        this.f41827a.add(treeWalkerTimeLogger);
    }

    void f() {
        TreeWalker treeWalker;
        this.f41832f.e();
        long jB = f.b();
        com.iab.omid.library.bytedance2.processor.a aVarA = this.f41831e.a();
        if (this.f41832f.b().size() > 0) {
            for (String str : this.f41832f.b()) {
                JSONObject jSONObjectA = aVarA.a(null);
                a(str, this.f41832f.a(str), jSONObjectA);
                com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA);
                HashSet<String> hashSet = new HashSet<>();
                hashSet.add(str);
                this.f41833g.a(jSONObjectA, hashSet, jB);
            }
        }
        if (this.f41832f.c().size() > 0) {
            JSONObject jSONObjectA2 = aVarA.a(null);
            treeWalker = this;
            treeWalker.a(null, aVarA, jSONObjectA2, com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, false);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA2);
            treeWalker.f41833g.b(jSONObjectA2, treeWalker.f41832f.c(), jB);
            if (treeWalker.f41829c) {
                Iterator<com.iab.omid.library.bytedance2.adsession.a> it = com.iab.omid.library.bytedance2.internal.c.c().a().iterator();
                while (it.hasNext()) {
                    it.next().a(treeWalker.f41830d);
                }
            }
        } else {
            treeWalker = this;
            treeWalker.f41833g.b();
        }
        treeWalker.f41832f.a();
    }

    public void g() {
        k();
    }

    public void h() {
        i();
    }

    public void j() {
        g();
        this.f41827a.clear();
        f41823j.post(new a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f41827a.contains(treeWalkerTimeLogger)) {
            this.f41827a.remove(treeWalkerTimeLogger);
        }
    }

    private void a(long j10) {
        if (this.f41827a.size() > 0) {
            for (TreeWalkerTimeLogger treeWalkerTimeLogger : this.f41827a) {
                treeWalkerTimeLogger.onTreeProcessed(this.f41828b, TimeUnit.NANOSECONDS.toMillis(j10));
                if (treeWalkerTimeLogger instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) treeWalkerTimeLogger).onTreeProcessedNano(this.f41828b, j10);
                }
            }
        }
    }

    private boolean b(View view, JSONObject jSONObject) {
        String strD = this.f41832f.d(view);
        if (strD == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, strD);
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, Boolean.valueOf(this.f41832f.f(view)));
        this.f41832f.d();
        return true;
    }

    private void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, com.iab.omid.library.bytedance2.walking.c cVar, boolean z9) {
        aVar.a(view, jSONObject, this, cVar == com.iab.omid.library.bytedance2.walking.c.PARENT_VIEW, z9);
    }

    @Override // com.iab.omid.library.bytedance2.processor.a.InterfaceC0385a
    public void a(View view, com.iab.omid.library.bytedance2.processor.a aVar, JSONObject jSONObject, boolean z9) {
        com.iab.omid.library.bytedance2.walking.c cVarE;
        TreeWalker treeWalker;
        if (h.d(view) && (cVarE = this.f41832f.e(view)) != com.iab.omid.library.bytedance2.walking.c.UNDERLYING_VIEW) {
            JSONObject jSONObjectA = aVar.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
            if (b(view, jSONObjectA)) {
                treeWalker = this;
            } else {
                boolean z10 = z9 || a(view, jSONObjectA);
                if (this.f41829c && cVarE == com.iab.omid.library.bytedance2.walking.c.OBSTRUCTION_VIEW && !z10) {
                    this.f41830d.add(new com.iab.omid.library.bytedance2.weakreference.a(view));
                }
                treeWalker = this;
                treeWalker.a(view, aVar, jSONObjectA, cVarE, z10);
            }
            treeWalker.f41828b++;
        }
    }

    private void a(String str, View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.processor.a aVarB = this.f41831e.b();
        String strB = this.f41832f.b(str);
        if (strB != null) {
            JSONObject jSONObjectA = aVarB.a(view);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObjectA, str);
            com.iab.omid.library.bytedance2.utils.c.b(jSONObjectA, strB);
            com.iab.omid.library.bytedance2.utils.c.a(jSONObject, jSONObjectA);
        }
    }

    private boolean a(View view, JSONObject jSONObject) {
        com.iab.omid.library.bytedance2.walking.a.C0387a c0387aC = this.f41832f.c(view);
        if (c0387aC == null) {
            return false;
        }
        com.iab.omid.library.bytedance2.utils.c.a(jSONObject, c0387aC);
        return true;
    }
}
