package p158p7;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import p178r7.h;
import p198t7.b;
import p198t7.c;
import p208u7.g;
import p238x7.a;

/* JADX INFO: loaded from: classes3.dex */
public class l extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f47957k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f47958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f47959b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f47961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p198t7.a f47962e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f47965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f47966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47967j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f47960c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47963f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47964g = false;

    l(c cVar, d dVar) {
        this.f47959b = cVar;
        this.f47958a = dVar;
        String string = UUID.randomUUID().toString();
        this.f47965h = string;
        k(null);
        this.f47962e = (dVar.c() == e.HTML || dVar.c() == e.JAVASCRIPT) ? new b(string, dVar.j()) : new c(string, dVar.f(), dVar.g());
        this.f47962e.t();
        p178r7.c.e().b(this);
        this.f47962e.h(cVar);
    }

    private void e() {
        if (this.f47966i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void g() {
        if (this.f47967j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void i(View view) {
        Collection<l> collectionC = p178r7.c.e().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (l lVar : collectionC) {
            if (lVar != this && lVar.h() == view) {
                lVar.f47961d.clear();
            }
        }
    }

    private void k(View view) {
        this.f47961d = new a(view);
    }

    @Override // p158p7.b
    public void b() {
        if (this.f47964g) {
            return;
        }
        this.f47961d.clear();
        u();
        this.f47964g = true;
        p().p();
        p178r7.c.e().d(this);
        p().l();
        this.f47962e = null;
    }

    @Override // p158p7.b
    public void c(View view) {
        if (this.f47964g) {
            return;
        }
        g.b(view, "AdView is null");
        if (h() == view) {
            return;
        }
        k(view);
        p().a();
        i(view);
    }

    @Override // p158p7.b
    public void d() {
        if (this.f47963f) {
            return;
        }
        this.f47963f = true;
        p178r7.c.e().f(this);
        this.f47962e.b(h.d().c());
        this.f47962e.e(p178r7.a.a().c());
        this.f47962e.i(this, this.f47958a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(List list) {
        if (l()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View h() {
        return (View) this.f47961d.get();
    }

    public List j() {
        return this.f47960c;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return this.f47963f && !this.f47964g;
    }

    public boolean n() {
        return this.f47964g;
    }

    public String o() {
        return this.f47965h;
    }

    public p198t7.a p() {
        return this.f47962e;
    }

    public boolean q() {
        return this.f47959b.b();
    }

    public boolean r() {
        return this.f47963f;
    }

    void s() {
        e();
        p().q();
        this.f47966i = true;
    }

    void t() {
        g();
        p().s();
        this.f47967j = true;
    }

    public void u() {
        if (this.f47964g) {
            return;
        }
        this.f47960c.clear();
    }
}
