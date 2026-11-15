package p250z;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    m f50833d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f50835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f50836g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f50830a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f50831b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50832c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f50834e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f50837h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f50838i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f50839j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List f50840k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List f50841l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(m mVar) {
        this.f50833d = mVar;
    }

    @Override // p250z.d
    public void a(d dVar) {
        Iterator it = this.f50841l.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f50839j) {
                return;
            }
        }
        this.f50832c = true;
        d dVar2 = this.f50830a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f50831b) {
            this.f50833d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : this.f50841l) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.f50839j) {
            g gVar = this.f50838i;
            if (gVar != null) {
                if (!gVar.f50839j) {
                    return;
                } else {
                    this.f50835f = this.f50837h * gVar.f50836g;
                }
            }
            d(fVar.f50836g + this.f50835f);
        }
        d dVar3 = this.f50830a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f50840k.add(dVar);
        if (this.f50839j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f50841l.clear();
        this.f50840k.clear();
        this.f50839j = false;
        this.f50836g = 0;
        this.f50832c = false;
        this.f50831b = false;
    }

    public void d(int i10) {
        if (this.f50839j) {
            return;
        }
        this.f50839j = true;
        this.f50836g = i10;
        for (d dVar : this.f50840k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50833d.f50866b.r());
        sb.append(":");
        sb.append(this.f50834e);
        sb.append("(");
        sb.append(this.f50839j ? Integer.valueOf(this.f50836g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f50841l.size());
        sb.append(":d=");
        sb.append(this.f50840k.size());
        sb.append(">");
        return sb.toString();
    }
}
