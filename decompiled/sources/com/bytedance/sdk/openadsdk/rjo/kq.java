package com.bytedance.sdk.openadsdk.rjo;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.net.Response;
import com.bykv.vk.openvk.preload.geckox.utils.CloseableUtils;
import com.bytedance.sdk.component.oq.kq.bob;
import com.bytedance.sdk.component.oq.kq.csi;
import com.bytedance.sdk.component.oq.kq.dgq;
import com.bytedance.sdk.component.oq.kq.rhi;
import com.bytedance.sdk.component.oq.kq.suf;
import com.bytedance.sdk.component.oq.kq.ubx;
import com.bytedance.sdk.component.oq.kq.vvw;
import com.bytedance.sdk.component.oq.kq.wki;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class kq implements INetWork {
    protected ubx kq;
    protected ubx oq;

    public kq() {
        ubx.kq kqVar = new ubx.kq();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.kq = kqVar.kq(10L, timeUnit).oq(10L, timeUnit).bob(10L, timeUnit).kq();
        this.oq = new ubx.kq().kq(10L, timeUnit).oq(30L, timeUnit).bob(30L, timeUnit).kq();
    }

    private Map<String, String> kq(rhi rhiVar) {
        if (rhiVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < rhiVar.kq(); i10++) {
            map.put(rhiVar.kq(i10), rhiVar.oq(i10));
        }
        return map;
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doGet(String str) {
        suf sufVarOq = this.kq.kq(new vvw.kq().kq().oq(str).kq("gecko").oq()).oq();
        return new Response(kq(sufVarOq.rjo()), sufVarOq.bob() == 200 ? sufVarOq.rhi().oq() : null, sufVarOq.bob(), sufVarOq.csi());
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, List<Pair<String, String>> list) {
        csi.kq kqVar = new csi.kq();
        if (list != null) {
            for (Pair<String, String> pair : list) {
                kqVar.kq((String) pair.first, (String) pair.second);
            }
        }
        suf sufVarOq = this.kq.kq(new vvw.kq().oq(str).kq((wki) kqVar.kq()).kq("gecko").oq()).oq();
        return new Response(kq(sufVarOq.rjo()), sufVarOq.bob() == 200 ? sufVarOq.rhi().oq() : null, sufVarOq.bob(), sufVarOq.csi());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0044: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:69), block:B:12:0x0044 */
    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void downloadFile(String str, long j10, BufferOutputStream bufferOutputStream) throws Throwable {
        Exception e10;
        Closeable closeable;
        Closeable closeable2 = null;
        int i10 = 0;
        try {
            try {
                try {
                    suf sufVarOq = this.oq.kq(new vvw.kq().kq().kq("gecko").oq(str).oq()).oq();
                    int iBob = sufVarOq.bob();
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(sufVarOq.rhi().bob());
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int i11 = bufferedInputStream.read(bArr, 0, 2048);
                                if (i11 == -1) {
                                    CloseableUtils.close(bufferedInputStream);
                                    return;
                                }
                                bufferOutputStream.write(bArr, 0, i11);
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            i10 = iBob;
                            throw new RuntimeException("downloadFile failed, code: " + i10 + ", url:" + str + ", caused by:" + e10.getMessage(), e10);
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                    }
                } catch (Throwable th) {
                    th = th;
                    closeable2 = closeable;
                    CloseableUtils.close(closeable2);
                    throw th;
                }
            } catch (Exception e13) {
                e10 = e13;
            }
        } catch (Throwable th2) {
            th = th2;
            CloseableUtils.close(closeable2);
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public void syncDoGet(final String str) {
        this.kq.kq(new vvw.kq().kq().oq(str).kq("gecko").oq()).kq(new bob() { // from class: com.bytedance.sdk.openadsdk.rjo.kq.1
            @Override // com.bytedance.sdk.component.oq.kq.bob
            public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar, suf sufVar) {
            }

            @Override // com.bytedance.sdk.component.oq.kq.bob
            public void kq(com.bytedance.sdk.component.oq.kq.oq oqVar, IOException iOException) {
            }
        });
    }

    @Override // com.bykv.vk.openvk.preload.geckox.net.INetWork
    public Response doPost(String str, String str2) {
        suf sufVarOq = this.kq.kq(new vvw.kq().oq(str).kq(wki.kq(dgq.kq("application/json; charset=utf-8"), str2)).kq("gecko").oq()).oq();
        return new Response(kq(sufVarOq.rjo()), sufVarOq.bob() == 200 ? sufVarOq.rhi().oq() : null, sufVarOq.bob(), sufVarOq.csi());
    }
}
