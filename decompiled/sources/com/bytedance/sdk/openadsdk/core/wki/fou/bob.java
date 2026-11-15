package com.bytedance.sdk.openadsdk.core.wki.fou;

import com.bykv.vk.openvk.kq.kq.oq.bob.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bob extends b {
    private final kq fou;
    private final List<oq> kq = Collections.synchronizedList(new ArrayList());
    private int oq = 1;
    private int bob = 1;

    public interface oq extends A1.b.a {
        @Override // A1.b.a
        /* synthetic */ void bob(A1.b bVar);

        @Override // A1.b.a
        /* synthetic */ void csi(A1.b bVar);

        @Override // A1.b.a
        /* synthetic */ void fou(A1.b bVar);

        void kq(int i10, int i11);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, int i10);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, int i10, int i11);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, int i10, int i11, int i12);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, long j10);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, long j10, long j11);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, com.bykv.vk.openvk.kq.kq.kq.bob.b bVar2);

        @Override // A1.b.a
        /* synthetic */ void kq(A1.b bVar, boolean z9);

        @Override // A1.b.a
        /* synthetic */ void oq(A1.b bVar);

        @Override // A1.b.a
        /* synthetic */ void oq(A1.b bVar, int i10);
    }

    public bob() {
        kq kqVar = new kq();
        this.fou = kqVar;
        super.kq(kqVar);
        kq(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
    }

    static /* synthetic */ int kq(bob bobVar) {
        int i10 = bobVar.bob;
        bobVar.bob = i10 + 1;
        return i10;
    }

    public int mq() {
        return this.bob;
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.b
    public long sns() {
        return super.sns() * ((long) this.oq);
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.b
    public long wcx() {
        long jWcx = super.wcx();
        return this.oq == 1 ? jWcx : jWcx + (((long) (this.bob - 1)) * super.sns());
    }

    private class kq implements A1.b.a {
        private kq() {
        }

        @Override // A1.b.a
        public void bob(A1.b bVar) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).bob(bVar);
            }
        }

        @Override // A1.b.a
        public void csi(A1.b bVar) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).csi(bVar);
            }
        }

        @Override // A1.b.a
        public void fou(A1.b bVar) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).fou(bVar);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar) {
            bob.kq(bob.this);
            if (bob.this.bob > bob.this.oq) {
                Iterator it = bob.this.kq.iterator();
                while (it.hasNext()) {
                    ((oq) it.next()).kq(bVar);
                }
            } else {
                Iterator it2 = bob.this.kq.iterator();
                while (it2.hasNext()) {
                    ((oq) it2.next()).kq(bob.this.bob, bob.this.oq);
                }
                bob.this.dgq();
            }
        }

        @Override // A1.b.a
        public void oq(A1.b bVar) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).oq(bVar);
            }
        }

        @Override // A1.b.a
        public void oq(A1.b bVar, int i10) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).oq(bVar, i10);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, long j10) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, j10);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, com.bykv.vk.openvk.kq.kq.kq.bob.b bVar2) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, bVar2);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, boolean z9) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, z9);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, int i10, int i11) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, i10, i11);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, int i10, int i11, int i12) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, i10, i11, i12);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, int i10) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, i10);
            }
        }

        @Override // A1.b.a
        public void kq(A1.b bVar, long j10, long j11) {
            Iterator it = bob.this.kq.iterator();
            while (it.hasNext()) {
                ((oq) it.next()).kq(bVar, j10, j11);
            }
        }
    }

    public void bob(int i10) {
        this.oq = Math.max(1, i10);
    }

    @Override // com.bykv.vk.openvk.kq.kq.oq.bob.b
    public void kq(A1.b.a aVar) {
        if (!(aVar instanceof oq)) {
            super.kq(aVar);
        } else {
            if (this.kq.contains(aVar)) {
                return;
            }
            this.kq.add((oq) aVar);
        }
    }
}
