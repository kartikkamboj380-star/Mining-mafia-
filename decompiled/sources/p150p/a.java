package p150p;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f47720e = new HashMap();

    @Override // p150p.b
    protected b.c b(Object obj) {
        return (b.c) this.f47720e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f47720e.containsKey(obj);
    }

    @Override // p150p.b
    public Object i(Object obj, Object obj2) {
        b.c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f47726b;
        }
        this.f47720e.put(obj, g(obj, obj2));
        return null;
    }

    @Override // p150p.b
    public Object j(Object obj) {
        Object objJ = super.j(obj);
        this.f47720e.remove(obj);
        return objJ;
    }

    public Map.Entry k(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f47720e.get(obj)).f47728d;
        }
        return null;
    }
}
