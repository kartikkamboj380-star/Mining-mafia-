package K2;

import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;

/* JADX INFO: loaded from: classes.dex */
public class c extends a {
    private c(d0 d0Var, l0 l0Var, Q2.d dVar) {
        super(d0Var, l0Var, dVar);
    }

    public static p083i2.c H(d0 d0Var, l0 l0Var, Q2.d dVar) {
        if (V2.b.d()) {
            V2.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar = new c(d0Var, l0Var, dVar);
        if (V2.b.d()) {
            V2.b.b();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p083i2.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void h(p023c2.a aVar) {
        p023c2.a.x(aVar);
    }

    @Override // p083i2.a, p083i2.c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public p023c2.a a() {
        return p023c2.a.w((p023c2.a) super.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // K2.a
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void F(p023c2.a aVar, int i10, e0 e0Var) {
        super.F(p023c2.a.w(aVar), i10, e0Var);
    }
}
