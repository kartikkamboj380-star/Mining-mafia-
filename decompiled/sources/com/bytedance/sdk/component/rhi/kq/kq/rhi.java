package com.bytedance.sdk.component.rhi.kq.kq;

import com.bytedance.sdk.component.rhi.kq.kq.oq.rjo;
import com.bytedance.sdk.component.rhi.kq.syt;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class rhi implements fou {
    private com.bytedance.sdk.component.rhi.kq.kq.oq.kq bob;
    private rjo csi;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq dgq;
    private com.bytedance.sdk.component.rhi.kq.kq.oq.oq fou;
    csi kq = syt.rjo().fou();
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq nn;
    private com.bytedance.sdk.component.rhi.kq.kq.oq.csi oq;
    private com.bytedance.sdk.component.rhi.kq.kq.oq.bob rhi;
    private com.bytedance.sdk.component.rhi.kq.kq.oq.rhi rjo;
    private Queue<String> suf;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq syt;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq ubx;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq vvw;
    private com.bytedance.sdk.component.rhi.kq.fou.oq.kq wki;

    public rhi(Queue<String> queue) {
        this.suf = queue;
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.kq()) {
            com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVarVvw = syt.rjo().vvw();
            this.syt = kqVarVvw;
            this.oq = new com.bytedance.sdk.component.rhi.kq.kq.oq.csi(kqVarVvw, queue);
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.csi()) {
            if (syt.rjo().nn() != null) {
                this.nn = syt.rjo().nn();
            } else {
                this.nn = syt.rjo().wki();
            }
            this.fou = new com.bytedance.sdk.component.rhi.kq.kq.oq.oq(this.nn, queue);
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.oq()) {
            com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVarWki = syt.rjo().wki();
            this.dgq = kqVarWki;
            this.bob = new com.bytedance.sdk.component.rhi.kq.kq.oq.kq(kqVarWki, queue);
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.bob()) {
            com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVarWki2 = syt.rjo().wki();
            this.ubx = kqVarWki2;
            this.csi = new rjo(kqVarWki2, queue);
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.fou()) {
            com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVarSuf = syt.rjo().suf();
            this.vvw = kqVarSuf;
            this.rhi = new com.bytedance.sdk.component.rhi.kq.kq.oq.bob(kqVarSuf, queue);
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.rhi()) {
            com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVarNze = syt.rjo().nze();
            this.wki = kqVarNze;
            this.rjo = new com.bytedance.sdk.component.rhi.kq.kq.oq.rhi(kqVarNze, queue);
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.fou
    public void kq(int i10, long j10) {
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.fou
    public void kq(com.bytedance.sdk.component.rhi.kq.fou.kq kqVar, int i10) {
        try {
            byte bFou = kqVar.fou();
            byte bCsi = kqVar.csi();
            if (bFou == 0 && bCsi == 1 && com.bytedance.sdk.component.rhi.kq.oq.kq.kq()) {
                this.oq.kq(kqVar);
                return;
            }
            if (bFou == 3 && bCsi == 2 && com.bytedance.sdk.component.rhi.kq.oq.kq.csi()) {
                this.fou.kq(kqVar);
                return;
            }
            if (bFou == 0 && bCsi == 2 && com.bytedance.sdk.component.rhi.kq.oq.kq.oq()) {
                this.bob.kq(kqVar);
                return;
            }
            if (bFou == 1 && bCsi == 2 && com.bytedance.sdk.component.rhi.kq.oq.kq.bob()) {
                this.csi.kq(kqVar);
                return;
            }
            if (bFou == 1 && bCsi == 3 && com.bytedance.sdk.component.rhi.kq.oq.kq.fou()) {
                this.rhi.kq(kqVar);
            } else if (bFou == 2 && bCsi == 3 && com.bytedance.sdk.component.rhi.kq.oq.kq.rhi()) {
                this.rjo.kq(kqVar);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.fou
    public void kq(int i10, List<com.bytedance.sdk.component.rhi.kq.fou.kq> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.rhi.kq.fou.kq kqVar = list.get(0);
        byte bCsi = kqVar.csi();
        byte bFou = kqVar.fou();
        if (bFou == 0 && bCsi == 1 && com.bytedance.sdk.component.rhi.kq.oq.kq.kq()) {
            this.oq.kq(i10, list);
            return;
        }
        if (bFou == 3 && bCsi == 2 && com.bytedance.sdk.component.rhi.kq.oq.kq.csi()) {
            this.fou.kq(i10, list);
            return;
        }
        if (bFou == 0 && bCsi == 2 && com.bytedance.sdk.component.rhi.kq.oq.kq.oq()) {
            this.bob.kq(i10, list);
            return;
        }
        if (bFou == 1 && bCsi == 2 && com.bytedance.sdk.component.rhi.kq.oq.kq.bob()) {
            this.csi.kq(i10, list);
            return;
        }
        if (bFou == 1 && bCsi == 3 && com.bytedance.sdk.component.rhi.kq.oq.kq.fou()) {
            this.rhi.kq(i10, list);
        } else if (bFou == 2 && bCsi == 3 && com.bytedance.sdk.component.rhi.kq.oq.kq.rhi()) {
            this.rjo.kq(i10, list);
        }
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.fou
    public List<com.bytedance.sdk.component.rhi.kq.fou.kq> kq(int i10, int i11, List<String> list) {
        List<com.bytedance.sdk.component.rhi.kq.fou.kq> listKq;
        List<com.bytedance.sdk.component.rhi.kq.fou.kq> listKq2;
        List<com.bytedance.sdk.component.rhi.kq.fou.kq> listKq3;
        List<com.bytedance.sdk.component.rhi.kq.fou.kq> listKq4;
        List<com.bytedance.sdk.component.rhi.kq.fou.kq> listKq5;
        List<com.bytedance.sdk.component.rhi.kq.fou.kq> listKq6;
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.kq() && this.oq.oq(i10, i11) && (listKq6 = this.oq.kq(i10, i11)) != null && listKq6.size() != 0) {
            com.bytedance.sdk.component.rhi.kq.bob.oq.kq(com.bytedance.sdk.component.rhi.kq.oq.fou.fou.wcx(), 1);
            return listKq6;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.csi() && this.fou.oq(i10, i11) && (listKq5 = this.fou.kq(i10, i11)) != null && listKq5.size() != 0) {
            return listKq5;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.oq() && this.bob.oq(i10, i11) && (listKq4 = this.bob.kq(i10, i11)) != null && listKq4.size() != 0) {
            com.bytedance.sdk.component.rhi.kq.bob.oq.kq(com.bytedance.sdk.component.rhi.kq.oq.fou.fou.gm(), 1);
            return listKq4;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.bob() && this.csi.oq(i10, i11) && (listKq3 = this.csi.kq(i10, i11)) != null && listKq3.size() != 0) {
            com.bytedance.sdk.component.rhi.kq.bob.oq.kq(com.bytedance.sdk.component.rhi.kq.oq.fou.fou.fax(), 1);
            return listKq3;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.fou() && this.rhi.oq(i10, i11) && (listKq2 = this.rhi.kq(i10, i11)) != null && listKq2.size() != 0) {
            com.bytedance.sdk.component.rhi.kq.bob.oq.kq(com.bytedance.sdk.component.rhi.kq.oq.fou.fou.mq(), 1);
            return listKq2;
        }
        if (!com.bytedance.sdk.component.rhi.kq.oq.kq.rhi() || !this.rjo.oq(i10, i11) || (listKq = this.rjo.kq(i10, i11)) == null || listKq.size() == 0) {
            return null;
        }
        return listKq;
    }

    @Override // com.bytedance.sdk.component.rhi.kq.kq.fou
    public boolean kq(int i10, boolean z9) {
        com.bytedance.sdk.component.rhi.kq.kq.oq.rhi rhiVar;
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar;
        com.bytedance.sdk.component.rhi.kq.kq.oq.bob bobVar;
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar2;
        rjo rjoVar;
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar3;
        com.bytedance.sdk.component.rhi.kq.kq.oq.kq kqVar4;
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar5;
        com.bytedance.sdk.component.rhi.kq.kq.oq.oq oqVar;
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar6;
        com.bytedance.sdk.component.rhi.kq.kq.oq.csi csiVar;
        com.bytedance.sdk.component.rhi.kq.fou.oq.kq kqVar7;
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.kq() && (csiVar = this.oq) != null && (kqVar7 = this.syt) != null && csiVar.oq(i10, kqVar7.kq())) {
            return true;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.csi() && (oqVar = this.fou) != null && (kqVar6 = this.nn) != null && oqVar.oq(i10, kqVar6.kq())) {
            return true;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.oq() && (kqVar4 = this.bob) != null && (kqVar5 = this.dgq) != null && kqVar4.oq(i10, kqVar5.kq())) {
            return true;
        }
        if (com.bytedance.sdk.component.rhi.kq.oq.kq.bob() && (rjoVar = this.csi) != null && (kqVar3 = this.ubx) != null && rjoVar.oq(i10, kqVar3.kq())) {
            return true;
        }
        if (!com.bytedance.sdk.component.rhi.kq.oq.kq.fou() || (bobVar = this.rhi) == null || (kqVar2 = this.vvw) == null || !bobVar.oq(i10, kqVar2.kq())) {
            return com.bytedance.sdk.component.rhi.kq.oq.kq.rhi() && (rhiVar = this.rjo) != null && (kqVar = this.wki) != null && rhiVar.oq(i10, kqVar.kq());
        }
        return true;
    }
}
