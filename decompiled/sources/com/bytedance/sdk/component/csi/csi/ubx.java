package com.bytedance.sdk.component.csi.csi;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends kq {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public void kq(com.bytedance.sdk.component.csi.bob.bob bobVar) {
        com.bytedance.sdk.component.csi.bob.bob bobVar2;
        final com.bytedance.sdk.component.csi.bob.rhi rhiVarWcx = bobVar.wcx();
        com.bytedance.sdk.component.csi.fou fouVarFou = rhiVarWcx.fou();
        bobVar.kq(false);
        try {
            com.bytedance.sdk.component.csi.rhi rhiVarKq = fouVarFou.kq(new com.bytedance.sdk.component.csi.oq.oq(bobVar.kq(), bobVar.wki(), bobVar.suf(), bobVar.mq()));
            int iOq = rhiVarKq.oq();
            bobVar.kq(rhiVarKq.kq());
            bobVar2 = 200;
            try {
                if (rhiVarKq.oq() != 200) {
                    String.valueOf(rhiVarKq);
                    Object objBob = rhiVarKq.bob();
                    kq(iOq, rhiVarKq.fou(), objBob instanceof Throwable ? (Throwable) objBob : null, bobVar);
                    return;
                }
                final byte[] bArr = (byte[]) rhiVarKq.bob();
                bobVar.kq(new oq(bArr, rhiVarKq));
                final String strDgq = bobVar.dgq();
                final com.bytedance.sdk.component.csi.oq oqVarGm = bobVar.gm();
                if (oqVarGm.csi()) {
                    rhiVarWcx.oq(bobVar.gm()).kq(strDgq, bArr);
                }
                final com.bytedance.sdk.component.csi.bob.bob bobVar3 = bobVar;
                try {
                    rhiVarWcx.rjo().submit(new Runnable() { // from class: com.bytedance.sdk.component.csi.csi.ubx.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (oqVarGm.rjo()) {
                                rhiVarWcx.bob(bobVar3.gm()).kq(strDgq, bArr);
                            }
                        }
                    });
                    return;
                } catch (Throwable th) {
                    th = th;
                    bobVar2 = bobVar3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            bobVar2 = bobVar;
        }
        kq(1004, "net request failed!", th, bobVar2);
    }

    private void kq(int i10, String str, Throwable th, com.bytedance.sdk.component.csi.bob.bob bobVar) {
        bobVar.kq(new syt(i10, str, th));
    }

    @Override // com.bytedance.sdk.component.csi.csi.dgq
    public String kq() {
        return "net_request";
    }
}
