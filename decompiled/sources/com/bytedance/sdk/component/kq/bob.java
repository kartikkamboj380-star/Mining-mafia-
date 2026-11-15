package com.bytedance.sdk.component.kq;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob<P, R> extends com.bytedance.sdk.component.kq.oq<P, R> {
    private csi bob;
    private boolean kq = true;
    private kq oq;

    interface kq {
        void kq(Object obj);

        void kq(Throwable th);
    }

    public interface oq {
        bob kq();
    }

    private boolean rhi() {
        if (this.kq) {
            return true;
        }
        syt.kq(new IllegalStateException("Jsb async call already finished: " + kq() + ", hashcode: " + hashCode()));
        return false;
    }

    protected final void bob() {
        kq((Throwable) null);
    }

    void csi() {
        fou();
    }

    protected void fou() {
        this.kq = false;
        this.bob = null;
    }

    @Override // com.bytedance.sdk.component.kq.oq
    public /* bridge */ /* synthetic */ String kq() {
        return super.kq();
    }

    protected abstract void kq(P p10, csi csiVar);

    protected final void kq(R r10) {
        if (rhi()) {
            this.oq.kq(r10);
            fou();
        }
    }

    protected final void kq(Throwable th) {
        if (rhi()) {
            this.oq.kq(th);
            fou();
        }
    }

    void kq(P p10, csi csiVar, kq kqVar) {
        this.bob = csiVar;
        this.oq = kqVar;
        kq(p10, csiVar);
    }
}
