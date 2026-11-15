package com.bytedance.sdk.component.kq;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class rhi {
    private final rjo kq;
    private final ubx rjo;
    private final com.bytedance.sdk.component.kq.kq syt;
    private final Map<String, oq> oq = new HashMap();
    private final sns<String, wcx> bob = new sns<>();
    private final Map<String, bob.oq> fou = new HashMap();
    private final List<suf> csi = new ArrayList();
    private final Set<bob> rhi = new HashSet();

    static final class kq {
        boolean kq;
        String oq;

        private kq(boolean z9, String str) {
            this.kq = z9;
            this.oq = str;
        }
    }

    rhi(dgq dgqVar, com.bytedance.sdk.component.kq.kq kqVar) {
        this.syt = kqVar;
        this.kq = dgqVar.fou;
        this.rjo = dgqVar.syt;
    }

    kq kq(suf sufVar, csi csiVar) {
        oq oqVar = this.oq.get(sufVar.fou);
        if (oqVar != null) {
            try {
                if (oqVar instanceof fou) {
                    sufVar.toString();
                    return kq(sufVar, (fou) oqVar, csiVar);
                }
            } catch (IllegalStateException unused) {
                sufVar.toString();
                this.csi.add(sufVar);
                return new kq(false, gm.kq());
            }
        }
        wcx wcxVarKq = this.bob.kq(sufVar.fou);
        if (wcxVarKq != null) {
            sufVar.toString();
            return kq(sufVar, wcxVarKq, csiVar);
        }
        bob.oq oqVar2 = this.fou.get(sufVar.fou);
        if (oqVar2 == null) {
            sufVar.toString();
            return null;
        }
        bob bobVarKq = oqVar2.kq();
        bobVarKq.kq(sufVar.fou);
        sufVar.toString();
        return kq(sufVar, bobVarKq, csiVar);
    }

    void kq(String str, fou<?, ?> fouVar) {
        fouVar.kq(str);
        this.oq.put(str, fouVar);
    }

    void kq(Set<String> set, wcx<?, ?> wcxVar) {
        wcxVar.kq(set);
        this.bob.kq(set, wcxVar);
        Objects.toString(set);
    }

    void kq(String str, bob.oq oqVar) {
        this.fou.put(str, oqVar);
    }

    void kq() {
        Iterator<bob> it = this.rhi.iterator();
        while (it.hasNext()) {
            it.next().csi();
        }
        this.rhi.clear();
        this.oq.clear();
        this.fou.clear();
        this.bob.kq();
    }

    private kq kq(suf sufVar, fou fouVar, csi csiVar) {
        return new kq(true, gm.kq(this.kq.kq(fouVar.kq(sufVar.fou, kq(sufVar.csi, (oq) fouVar), csiVar)), fouVar.oq()));
    }

    private kq kq(final suf sufVar, final bob bobVar, csi csiVar) {
        this.rhi.add(bobVar);
        bobVar.kq(kq(sufVar.csi, bobVar), csiVar, new bob.kq() { // from class: com.bytedance.sdk.component.kq.rhi.1
            @Override // com.bytedance.sdk.component.kq.bob.kq
            public void kq(Object obj) {
                if (rhi.this.syt == null) {
                    return;
                }
                rhi.this.syt.oq(gm.kq(rhi.this.kq.kq(obj), bobVar.oq()), sufVar);
                rhi.this.rhi.remove(bobVar);
            }

            @Override // com.bytedance.sdk.component.kq.bob.kq
            public void kq(Throwable th) {
                if (rhi.this.syt == null) {
                    return;
                }
                rhi.this.syt.oq(gm.kq(th), sufVar);
                rhi.this.rhi.remove(bobVar);
            }
        });
        return new kq(false, gm.kq());
    }

    private Object kq(String str, oq oqVar) {
        return this.kq.kq(str, kq(oqVar)[0]);
    }

    private static Type[] kq(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
