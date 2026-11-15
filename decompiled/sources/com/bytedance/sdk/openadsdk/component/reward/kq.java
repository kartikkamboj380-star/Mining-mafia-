package com.bytedance.sdk.openadsdk.component.reward;

import B1.b;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bykv.vk.openvk.kq.kq.kq.bob.a;
import com.bytedance.sdk.component.utils.ibd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.jhe;
import com.bytedance.sdk.openadsdk.core.model.ha;
import com.bytedance.sdk.openadsdk.core.model.ou;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.mq;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq<L, A> {
    protected com.bytedance.sdk.component.syt.syt fou;
    protected final Context kq;
    protected final AtomicBoolean oq = new AtomicBoolean(false);
    protected final List<kq<L, A>.fou> bob = Collections.synchronizedList(new ArrayList());
    private final ibd.kq csi = new ibd.kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.2
        @Override // com.bytedance.sdk.component.utils.ibd.kq
        public void kq(Context context, Intent intent, boolean z9, int i10) {
            if (z9) {
                kq kqVar = kq.this;
                if (kqVar.fou == null) {
                    kqVar.fou = new oq("net connect task", kqVar.bob);
                    com.bytedance.sdk.component.utils.dgq.kq().post(kq.this.fou);
                }
            }
        }
    };

    protected class bob {
        protected final AtomicInteger bob;
        protected final com.bytedance.sdk.openadsdk.core.model.kq fou;
        protected final kq<L, A>.C0264kq kq;
        protected final AtomicBoolean oq;

        private int kq() {
            if (!this.fou.csi()) {
                return 0;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.fou.fou().size(); i11++) {
                uml umlVar = this.fou.fou().get(i11);
                if (umlVar != null && !ha.bob(umlVar) && umlVar.job() != null) {
                    i10++;
                }
            }
            return i10;
        }

        private bob(kq<L, A>.C0264kq c0264kq, com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
            this.oq = new AtomicBoolean(false);
            this.kq = c0264kq;
            this.fou = kqVar;
            this.bob = new AtomicInteger(kq());
        }

        public void kq(int i10, String str) {
            if (this.bob.decrementAndGet() > 0 || !this.oq.compareAndSet(false, true)) {
                return;
            }
            this.kq.kq(i10, str);
            com.bytedance.sdk.openadsdk.mxq.bob.kq("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.mxq.oq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.bob.1
                @Override // com.bytedance.sdk.openadsdk.mxq.oq
                public com.bytedance.sdk.openadsdk.mxq.kq.bob kq() throws JSONException {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", bob.this.fou.oq());
                    return com.bytedance.sdk.openadsdk.mxq.kq.fou.oq().kq("choose_ad_load_error").oq(jSONObject.toString());
                }
            });
        }

        public void kq(A a10) {
            this.bob.decrementAndGet();
            if (this.kq == null || !this.oq.compareAndSet(false, true)) {
                return;
            }
            this.kq.kq(a10);
        }
    }

    protected class fou extends com.bytedance.sdk.component.syt.syt {
        final com.bytedance.sdk.openadsdk.core.model.kq bob;
        final uml kq;
        final AdSlot oq;

        public fou(uml umlVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
            super("VideoPreloadTask");
            this.kq = umlVar;
            this.oq = adSlot;
            this.bob = kqVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            uml umlVar = this.kq;
            if (umlVar == null || umlVar.job() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.wki.kq.oq oqVarKq = uml.kq(CacheDirFactory.getICacheDir(this.kq.mku()).kq(), this.kq);
            oqVarKq.kq("material_meta", this.kq);
            oqVarKq.kq("ad_slot", this.oq);
            com.bytedance.sdk.openadsdk.core.wki.csi.kq.kq(oqVarKq, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.fou.1
                @Override // B1.a.InterfaceC0008a
                public void kq(a aVar, int i10, String str) {
                }

                @Override // B1.a.InterfaceC0008a
                public void kq(a aVar, int i10) {
                    suf sufVarKq = kq.this.kq();
                    fou fouVar = fou.this;
                    sufVarKq.kq(fouVar.oq, fouVar.bob);
                }
            });
        }
    }

    protected class oq extends com.bytedance.sdk.component.syt.syt {
        private final List<kq<L, A>.fou> oq;

        public oq(String str, List<kq<L, A>.fou> list) {
            super(str);
            this.oq = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<kq<L, A>.fou> list = this.oq;
            if (list == null || list.isEmpty()) {
                kq.this.fou = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.oq);
            this.oq.clear();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                try {
                    ((fou) obj).run();
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.fax.kq("BVL", "continue download task error", e10);
                }
            }
            kq.this.fou = null;
        }
    }

    protected kq(Context context) {
        this.kq = context == null ? com.bytedance.sdk.openadsdk.core.sns.kq() : context.getApplicationContext();
        bob();
    }

    private void bob(final AdSlot adSlot) {
        if (kq().oq(adSlot.getCodeId(), false) != null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.sns.bob().kq(adSlot, kq(adSlot, true), oq(), new jhe.kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.3
            @Override // com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(int i10, String str) {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar, com.bytedance.sdk.openadsdk.core.model.bob bobVar) {
                if (kqVar.fou() == null || kqVar.fou().isEmpty()) {
                    return;
                }
                kq kqVar2 = kq.this;
                kq.this.kq(kqVar, kqVar2.kq(kqVar2.kq, kqVar, adSlot), adSlot, true, (Object) null);
            }
        });
    }

    private void fou(final AdSlot adSlot, final L l10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.sns.bob().kq(adSlot, kq(adSlot, false), oq(), new jhe.kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.6
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(int i10, String str) {
                Object obj = l10;
                if (obj != null) {
                    kq.this.kq(obj, i10, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar, com.bytedance.sdk.openadsdk.core.model.bob bobVar) {
                com.bytedance.sdk.openadsdk.core.model.kq kqVar2;
                if (kqVar.fou() != null && !kqVar.fou().isEmpty()) {
                    kq kqVar3 = kq.this;
                    Object objKq = kqVar3.kq(kqVar3.kq, kqVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.mq.kq.fou.kq().kq(kqVar.fou().isEmpty() ? null : kqVar.fou().get(0));
                        com.bytedance.sdk.openadsdk.mxq.bob.kq(kqVar.rhi(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l10 == null || com.bytedance.sdk.openadsdk.core.sns.fou().rs() != 0) {
                        kqVar2 = kqVar;
                    } else {
                        kq.this.kq(adSlot, kqVar, l10, objKq, false);
                        kqVar2 = kqVar;
                        objKq = objKq;
                    }
                    kq.this.kq(kqVar2, objKq, adSlot, false, l10);
                    return;
                }
                Object obj = l10;
                if (obj != null) {
                    kq.this.kq(obj, -3, com.bytedance.sdk.openadsdk.core.syt.kq(-3));
                    bobVar.kq(-3);
                    bobVar.bob(kq.this.rhi());
                    com.bytedance.sdk.openadsdk.core.model.bob.kq(bobVar);
                }
            }
        });
    }

    private void oq(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.sns.bob().kq(adSlot, kq(adSlot, true), oq(), (com.bytedance.sdk.openadsdk.core.fax) new mq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.1
            boolean kq = false;

            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(int i10, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.fax
            public String kq() {
                return kq.this.kq().kq(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.fax
            public boolean kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
                boolean zKq = kq.this.kq().kq(kqVar);
                this.kq = zKq;
                return zKq;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar, com.bytedance.sdk.openadsdk.core.model.bob bobVar) {
                if (this.kq || kqVar.fou() == null || kqVar.fou().isEmpty()) {
                    return;
                }
                kq kqVar2 = kq.this;
                kq.this.kq(kqVar, kqVar2.kq(kqVar2.kq, kqVar, adSlot), adSlot, true, (Object) null);
            }
        });
    }

    public void csi() {
        try {
            kq().kq();
        } catch (Throwable unused) {
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.fou != null) {
            try {
                com.bytedance.sdk.component.utils.dgq.kq().removeCallbacks(this.fou);
            } catch (Throwable unused) {
            }
            this.fou = null;
        }
        fou();
    }

    protected abstract suf kq();

    protected abstract A kq(Context context, com.bytedance.sdk.openadsdk.core.model.kq kqVar, AdSlot adSlot);

    protected abstract Object kq(A a10);

    protected abstract void kq(L l10, int i10, String str);

    protected abstract void kq(L l10, Object obj);

    protected abstract int oq();

    protected abstract void oq(A a10);

    protected abstract int rhi();

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.reward.kq$kq, reason: collision with other inner class name */
    protected class C0264kq {
        protected final L bob;
        protected final boolean fou;
        protected final AdSlot kq;
        protected final com.bytedance.sdk.openadsdk.core.model.kq oq;

        public C0264kq(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kq kqVar, L l10, boolean z9) {
            this.kq = adSlot;
            this.oq = kqVar;
            this.bob = l10;
            this.fou = z9;
        }

        public void kq(int i10, String str) {
            L l10 = this.bob;
            if (l10 != null) {
                kq.this.kq(l10, i10, str);
            }
        }

        public void kq(A a10) {
            kq.this.kq(this.kq, this.oq, this.bob, a10, this.fou);
        }
    }

    private void oq(final AdSlot adSlot, final L l10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.sns.bob().kq(adSlot, kq(adSlot, false), oq(), (com.bytedance.sdk.openadsdk.core.fax) new mq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.4
            boolean kq = false;

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(int i10, String str) {
                Object obj = l10;
                if (obj != null) {
                    kq.this.kq(obj, i10, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.jhe.kq
            public void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar, com.bytedance.sdk.openadsdk.core.model.bob bobVar) {
                com.bytedance.sdk.openadsdk.core.model.kq kqVar2;
                if (kqVar.fou() != null && !kqVar.fou().isEmpty()) {
                    kq kqVar3 = kq.this;
                    Object objKq = kqVar3.kq(kqVar3.kq, kqVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.mq.kq.fou.kq().kq(kqVar.fou().isEmpty() ? null : kqVar.fou().get(0));
                        com.bytedance.sdk.openadsdk.mxq.bob.kq(kqVar.rhi(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l10 == null || com.bytedance.sdk.openadsdk.core.sns.fou().rs() != 0) {
                        kqVar2 = kqVar;
                    } else {
                        kq.this.kq(adSlot, kqVar, l10, objKq, this.kq);
                        kqVar2 = kqVar;
                        objKq = objKq;
                    }
                    kq.this.kq(kqVar2, objKq, adSlot, false, l10);
                    return;
                }
                Object obj = l10;
                if (obj != null) {
                    kq.this.kq(obj, -3, com.bytedance.sdk.openadsdk.core.syt.kq(-3));
                    bobVar.kq(-3);
                    bobVar.bob(kq.this.rhi());
                    com.bytedance.sdk.openadsdk.core.model.bob.kq(bobVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.fax
            public String kq() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strKq = kq.this.kq().kq(adSlot.getCodeId(), true);
                TextUtils.isEmpty(strKq);
                if (TextUtils.isEmpty(strKq)) {
                    return null;
                }
                return strKq;
            }

            @Override // com.bytedance.sdk.openadsdk.core.mq, com.bytedance.sdk.openadsdk.core.fax
            public boolean kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
                this.kq = kq.this.kq().kq(kqVar);
                return this.kq;
            }
        });
    }

    public void kq(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.utils.oq.kq()) {
            oq(adSlot);
        } else {
            bob(adSlot);
        }
    }

    private void bob(AdSlot adSlot, L l10) {
        com.bytedance.sdk.openadsdk.core.model.kq kqVarOq;
        if (TextUtils.isEmpty(adSlot.getBidAdm()) && (kqVarOq = kq().oq(adSlot.getCodeId(), true)) != null && kqVarOq.csi()) {
            kq(adSlot, kqVarOq, l10);
        } else {
            fou(adSlot, l10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fou(AdSlot adSlot) {
        kq().kq(adSlot.getCodeId());
    }

    protected void fou() {
        if (this.oq.get()) {
            this.oq.set(false);
            try {
                ibd.kq(this.csi);
            } catch (Exception unused) {
            }
        }
    }

    public void kq(AdSlot adSlot, L l10) {
        if (com.bytedance.sdk.openadsdk.utils.oq.kq()) {
            Objects.toString(adSlot);
            Objects.toString(l10);
            oq(adSlot, l10);
        } else {
            Objects.toString(adSlot);
            Objects.toString(l10);
            bob(adSlot, l10);
        }
    }

    protected void bob() {
        if (this.oq.get()) {
            return;
        }
        this.oq.set(true);
        ibd.kq(this.csi, this.kq);
    }

    private void kq(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.kq kqVar, L l10) {
        uml umlVarRhi = kqVar.rhi();
        for (uml umlVar : kqVar.fou()) {
            if (umlVar.clh() == null) {
                umlVar.kq(adSlot);
            }
        }
        A aKq = kq(this.kq, kqVar, adSlot);
        if (!ha.bob(umlVarRhi)) {
            oq(aKq);
        }
        if (l10 != null) {
            com.bytedance.sdk.openadsdk.core.vvw.bob.fou.kq(kqVar);
            if (com.bytedance.sdk.openadsdk.core.sns.fou().rs() == 0) {
                kq(adSlot, kqVar, (Object) l10, (Object) aKq, true);
            }
            kq<L, A>.bob bobVar = new bob(new C0264kq(adSlot, kqVar, l10, true), kqVar);
            for (int i10 = 0; i10 < kqVar.fou().size(); i10++) {
                kq(kqVar.fou().get(i10), adSlot, bobVar, aKq);
                if (kqVar.nn()) {
                    break;
                }
            }
        }
        for (final int i11 = 0; i11 < kqVar.fou().size(); i11++) {
            com.bytedance.sdk.openadsdk.core.wki.bob.kq.kq().kq(kqVar.fou().get(i11), new com.bytedance.sdk.openadsdk.core.wki.bob.kq.InterfaceC0293kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.5
                @Override // com.bytedance.sdk.openadsdk.core.wki.bob.kq.InterfaceC0293kq
                public void kq(boolean z9) {
                    com.bytedance.sdk.component.utils.fax.kq("BVL", "onCachedResponse: i=" + i11 + ", isSuccess=" + z9);
                }
            });
        }
    }

    protected void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar, A a10, AdSlot adSlot, boolean z9, L l10) {
        if (!z9) {
            com.bytedance.sdk.openadsdk.suf.kq.kq().kq(kqVar.rhi());
        }
        kq<L, A> kqVar2 = this;
        AdSlot adSlot2 = adSlot;
        kq<L, A>.bob bobVar = new bob(kqVar2.new C0264kq(adSlot2, kqVar, l10, false), kqVar);
        kq(kqVar);
        int i10 = 0;
        while (i10 < kqVar.fou().size()) {
            uml umlVar = kqVar.fou().get(i10);
            int iUi = umlVar.ui();
            if (i10 == 0 && iUi == 43) {
                umlVar.job().C(0);
            }
            A a11 = a10;
            boolean z10 = z9;
            AdSlot adSlot3 = adSlot2;
            kqVar2.kq(kqVar, umlVar, a11, adSlot3, z10, bobVar);
            adSlot2 = adSlot3;
            if (kqVar.nn() && iUi != 43) {
                return;
            }
            i10++;
            kqVar2 = this;
            a10 = a11;
            z9 = z10;
        }
    }

    protected void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar) {
        ou ouVarVvw = kqVar.vvw();
        int iMxq = kqVar.nn() ? 10 : 1;
        if (ouVarVvw != null) {
            iMxq = ouVarVvw.mxq();
        }
        for (final int i10 = 0; i10 < kqVar.fou().size() && i10 < iMxq; i10++) {
            com.bytedance.sdk.openadsdk.core.wki.bob.kq.kq().kq(kqVar.fou().get(i10), new com.bytedance.sdk.openadsdk.core.wki.bob.kq.InterfaceC0293kq() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.7
                @Override // com.bytedance.sdk.openadsdk.core.wki.bob.kq.InterfaceC0293kq
                public void kq(boolean z9) {
                    com.bytedance.sdk.component.utils.fax.kq("BVL", "onCachedResponse: i=" + i10 + ", isSuccess=" + z9);
                }
            });
        }
    }

    private boolean kq(boolean z9, uml umlVar, AdSlot adSlot) {
        if (z9) {
            return !ha.bob(umlVar) && uml.csi(umlVar) && com.bytedance.sdk.openadsdk.core.sns.fou().ebt(adSlot.getCodeId()).fou == 1 && !com.bytedance.sdk.component.utils.wcx.fou(this.kq);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kq(kq<L, A>.bob bobVar) {
        return bobVar != null && com.bytedance.sdk.openadsdk.core.sns.fou().rs() == 1;
    }

    private void kq(uml umlVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.kq kqVar, final A a10, final boolean z9, final kq<L, A>.bob bobVar) {
        com.bytedance.sdk.openadsdk.core.wki.kq.oq oqVarKq = uml.kq(CacheDirFactory.getICacheDir(umlVar.mku()).kq(), umlVar);
        oqVarKq.kq("material_meta", umlVar);
        oqVarKq.kq("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.wki.csi.kq.kq(oqVarKq, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // B1.a.InterfaceC0008a
            public void kq(a aVar, int i10) {
                kq.this.oq(a10);
                if (z9) {
                    kq.this.kq().kq(adSlot, kqVar);
                } else if (kq.this.kq(bobVar)) {
                    bobVar.kq(a10);
                }
            }

            @Override // B1.a.InterfaceC0008a
            public void kq(a aVar, int i10, String str) {
                if (kq.this.kq(bobVar)) {
                    bobVar.kq(i10, str);
                }
            }
        });
    }

    protected void kq(com.bytedance.sdk.openadsdk.core.model.kq kqVar, uml umlVar, A a10, AdSlot adSlot, boolean z9, kq<L, A>.bob bobVar) {
        A a11;
        kq<L, A>.bob bobVar2;
        if (kq(z9, umlVar, adSlot)) {
            kq((fou) new fou(umlVar, adSlot, kqVar));
            return;
        }
        boolean zKq = kq((bob) bobVar);
        if (ha.bob(umlVar)) {
            a11 = a10;
            bobVar2 = bobVar;
            if (z9) {
                kq().kq(adSlot, kqVar);
            }
        } else if (!uml.csi(umlVar)) {
            a11 = a10;
            bobVar2 = bobVar;
            if (z9) {
                kq().kq(adSlot, kqVar);
            }
        } else {
            if (umlVar.job() == null) {
                return;
            }
            a11 = a10;
            bobVar2 = bobVar;
            kq(umlVar, adSlot, kqVar, a11, z9, bobVar2);
            zKq = false;
        }
        if (zKq) {
            bobVar2.kq(a11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    private void kq(uml umlVar, AdSlot adSlot, final kq<L, A>.bob bobVar, final A a10) {
        boolean z9;
        boolean z10 = false;
        if (bobVar != null) {
            z9 = com.bytedance.sdk.openadsdk.core.sns.fou().rs() == 1;
        }
        if (ha.bob(umlVar) || !uml.csi(umlVar)) {
            z10 = z9;
        } else {
            com.bytedance.sdk.openadsdk.core.wki.kq.oq oqVarKq = uml.kq(CacheDirFactory.getICacheDir(umlVar.mku()).kq(), umlVar);
            oqVarKq.kq("material_meta", umlVar);
            oqVarKq.kq("ad_slot", adSlot);
            com.bytedance.sdk.openadsdk.core.wki.csi.kq.kq(oqVarKq, new b() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.9
                /* JADX WARN: Multi-variable type inference failed */
                @Override // B1.a.InterfaceC0008a
                public void kq(a aVar, int i10) {
                    if (bobVar == null || com.bytedance.sdk.openadsdk.core.sns.fou().rs() != 1) {
                        return;
                    }
                    bobVar.kq(a10);
                }

                @Override // B1.a.InterfaceC0008a
                public void kq(a aVar, int i10, String str) {
                    if (bobVar == null || com.bytedance.sdk.openadsdk.core.sns.fou().rs() != 1) {
                        return;
                    }
                    bobVar.kq(i10, str);
                }
            });
        }
        if (z10) {
            bobVar.kq(a10);
        }
    }

    protected void kq(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.kq kqVar, L l10, A a10, final boolean z9) {
        com.bytedance.sdk.openadsdk.core.suf.oq().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.kq.10
            @Override // java.lang.Runnable
            public void run() {
                if (z9) {
                    kq.this.fou(adSlot);
                } else {
                    kq.this.kq().kq(adSlot, kqVar);
                    kq.this.fou(adSlot);
                }
            }
        });
        if (l10 != null) {
            kq(l10, kq(a10));
        }
    }

    protected void kq(kq<L, A>.fou fouVar) {
        if (fouVar == null) {
            return;
        }
        if (this.bob.size() > 0) {
            this.bob.remove(0);
        }
        this.bob.add(fouVar);
    }

    protected com.bytedance.sdk.openadsdk.core.model.ibd kq(AdSlot adSlot, boolean z9) {
        com.bytedance.sdk.openadsdk.core.model.ibd ibdVar = new com.bytedance.sdk.openadsdk.core.model.ibd();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.sns.fou().vvw(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd())) {
            ibdVar.dgq = 2;
        }
        if (oq() == 7) {
            ibdVar.oq = z9 ? 2 : 1;
            return ibdVar;
        }
        ibdVar.bob = z9 ? 2 : 1;
        return ibdVar;
    }

    public void kq(String str, uml umlVar) {
        kq().kq(str, umlVar);
    }
}
