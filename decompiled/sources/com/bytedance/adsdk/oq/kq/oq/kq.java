package com.bytedance.adsdk.oq.kq.oq;

import android.view.animation.Interpolator;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class kq<K, A> {
    protected com.bytedance.adsdk.oq.rjo.oq<A> bob;
    private final bob<K> csi;
    final List<InterfaceC0222kq> kq = new ArrayList(1);
    private boolean fou = false;
    protected float oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private A rhi = null;
    private float rjo = -1.0f;
    private float syt = -1.0f;

    private interface bob<T> {
        float bob();

        float fou();

        boolean kq();

        boolean kq(float f10);

        com.bytedance.adsdk.oq.rjo.kq<T> oq();

        boolean oq(float f10);
    }

    private static final class csi<T> implements bob<T> {
        private final com.bytedance.adsdk.oq.rjo.kq<T> kq;
        private float oq = -1.0f;

        csi(List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> list) {
            this.kq = list.get(0);
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public float bob() {
            return this.kq.bob();
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public float fou() {
            return this.kq.fou();
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean kq() {
            return false;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public com.bytedance.adsdk.oq.rjo.kq<T> oq() {
            return this.kq;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean kq(float f10) {
            return !this.kq.csi();
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean oq(float f10) {
            if (this.oq == f10) {
                return true;
            }
            this.oq = f10;
            return false;
        }
    }

    private static final class fou<T> implements bob<T> {
        private final List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> kq;
        private com.bytedance.adsdk.oq.rjo.kq<T> bob = null;
        private float fou = -1.0f;
        private com.bytedance.adsdk.oq.rjo.kq<T> oq = bob(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

        fou(List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> list) {
            this.kq = list;
        }

        private com.bytedance.adsdk.oq.rjo.kq<T> bob(float f10) {
            List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> list = this.kq;
            com.bytedance.adsdk.oq.rjo.kq<T> kqVar = list.get(list.size() - 1);
            if (f10 >= kqVar.bob()) {
                return kqVar;
            }
            for (int size = this.kq.size() - 2; size > 0; size--) {
                com.bytedance.adsdk.oq.rjo.kq<T> kqVar2 = this.kq.get(size);
                if (this.oq != kqVar2 && kqVar2.kq(f10)) {
                    return kqVar2;
                }
            }
            return this.kq.get(0);
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public float fou() {
            List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> list = this.kq;
            return list.get(list.size() - 1).fou();
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean kq() {
            return false;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public com.bytedance.adsdk.oq.rjo.kq<T> oq() {
            return this.oq;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean kq(float f10) {
            if (this.oq.kq(f10)) {
                return !this.oq.csi();
            }
            this.oq = bob(f10);
            return true;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean oq(float f10) {
            com.bytedance.adsdk.oq.rjo.kq<T> kqVar = this.bob;
            com.bytedance.adsdk.oq.rjo.kq<T> kqVar2 = this.oq;
            if (kqVar == kqVar2 && this.fou == f10) {
                return true;
            }
            this.bob = kqVar2;
            this.fou = f10;
            return false;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public float bob() {
            return this.kq.get(0).bob();
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.oq.kq.oq.kq$kq, reason: collision with other inner class name */
    public interface InterfaceC0222kq {
        void kq();
    }

    private static final class oq<T> implements bob<T> {
        private oq() {
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public float bob() {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public float fou() {
            return 1.0f;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean kq() {
            return true;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public com.bytedance.adsdk.oq.rjo.kq<T> oq() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean kq(float f10) {
            return false;
        }

        @Override // com.bytedance.adsdk.oq.kq.oq.kq.bob
        public boolean oq(float f10) {
            throw new IllegalStateException("not implemented");
        }
    }

    kq(List<? extends com.bytedance.adsdk.oq.rjo.kq<K>> list) {
        this.csi = kq(list);
    }

    private float dgq() {
        if (this.rjo == -1.0f) {
            this.rjo = this.csi.bob();
        }
        return this.rjo;
    }

    protected com.bytedance.adsdk.oq.rjo.kq<K> bob() {
        com.bytedance.adsdk.oq.csi.kq("BaseKeyframeAnimation#getCurrentKeyframe");
        com.bytedance.adsdk.oq.rjo.kq<K> kqVarOq = this.csi.oq();
        com.bytedance.adsdk.oq.csi.oq("BaseKeyframeAnimation#getCurrentKeyframe");
        return kqVarOq;
    }

    protected float csi() {
        com.bytedance.adsdk.oq.rjo.kq<K> kqVarBob = bob();
        return (kqVarBob == null || kqVarBob.csi()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : kqVarBob.bob.getInterpolation(fou());
    }

    float fou() {
        if (this.fou) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        com.bytedance.adsdk.oq.rjo.kq<K> kqVarBob = bob();
        return kqVarBob.csi() ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (this.oq - kqVarBob.bob()) / (kqVarBob.fou() - kqVarBob.bob());
    }

    abstract A kq(com.bytedance.adsdk.oq.rjo.kq<K> kqVar, float f10);

    public void kq() {
        this.fou = true;
    }

    public void oq() {
        for (int i10 = 0; i10 < this.kq.size(); i10++) {
            this.kq.get(i10).kq();
        }
    }

    float rhi() {
        if (this.syt == -1.0f) {
            this.syt = this.csi.fou();
        }
        return this.syt;
    }

    public A rjo() {
        float fFou = fou();
        if (this.bob == null && this.csi.oq(fFou)) {
            return this.rhi;
        }
        com.bytedance.adsdk.oq.rjo.kq<K> kqVarBob = bob();
        Interpolator interpolator = kqVarBob.fou;
        A aKq = (interpolator == null || kqVarBob.csi == null) ? kq(kqVarBob, csi()) : kq(kqVarBob, fFou, interpolator.getInterpolation(fFou), kqVarBob.csi.getInterpolation(fFou));
        this.rhi = aKq;
        return aKq;
    }

    public float syt() {
        return this.oq;
    }

    public void kq(InterfaceC0222kq interfaceC0222kq) {
        this.kq.add(interfaceC0222kq);
    }

    public void kq(float f10) {
        if (this.csi.kq()) {
            return;
        }
        if (f10 < dgq()) {
            f10 = dgq();
        } else if (f10 > rhi()) {
            f10 = rhi();
        }
        if (f10 == this.oq) {
            return;
        }
        this.oq = f10;
        if (this.csi.kq(f10)) {
            oq();
        }
    }

    protected A kq(com.bytedance.adsdk.oq.rjo.kq<K> kqVar, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> bob<T> kq(List<? extends com.bytedance.adsdk.oq.rjo.kq<T>> list) {
        if (list.isEmpty()) {
            return new oq();
        }
        if (list.size() == 1) {
            return new csi(list);
        }
        return new fou(list);
    }
}
