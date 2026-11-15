package Q2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f4814a;

    public c(Set set) {
        this.f4814a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                this.f4814a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th) {
        Z1.a.n("ForwardingRequestListener", str, th);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void a(String str, String str2) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).a(str, str2);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // Q2.e
    public void b(U2.b bVar, Object obj, String str, boolean z9) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).b(bVar, obj, str, z9);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean c(String str) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((e) this.f4814a.get(i10)).c(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void d(String str, String str2, Map map) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).d(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void e(String str, String str2, Throwable th, Map map) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).e(str, str2, th, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // Q2.e
    public void f(U2.b bVar, String str, boolean z9) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).f(bVar, str, z9);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void g(String str, String str2, Map map) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).g(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, boolean z9) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).h(str, str2, z9);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // Q2.e
    public void i(U2.b bVar, String str, Throwable th, boolean z9) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).i(bVar, str, th, z9);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void j(String str, String str2, String str3) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).j(str, str2, str3);
            } catch (Exception e10) {
                l("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // Q2.e
    public void k(String str) {
        int size = this.f4814a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f4814a.get(i10)).k(str);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    public c(e... eVarArr) {
        this.f4814a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f4814a.add(eVar);
            }
        }
    }
}
