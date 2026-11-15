package p240y;

import java.util.ArrayList;
import p230x.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends e {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ArrayList f50771w0 = new ArrayList();

    public abstract void K0();

    public void L0(e eVar) {
        this.f50771w0.remove(eVar);
        eVar.w0(null);
    }

    public void M0() {
        this.f50771w0.clear();
    }

    @Override // p240y.e
    public void Y() {
        this.f50771w0.clear();
        super.Y();
    }

    public void a(e eVar) {
        this.f50771w0.add(eVar);
        if (eVar.G() != null) {
            ((m) eVar.G()).L0(eVar);
        }
        eVar.w0(this);
    }

    @Override // p240y.e
    public void a0(c cVar) {
        super.a0(cVar);
        int size = this.f50771w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) this.f50771w0.get(i10)).a0(cVar);
        }
    }
}
