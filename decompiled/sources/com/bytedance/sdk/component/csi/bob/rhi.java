package com.bytedance.sdk.component.csi.bob;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.csi.fax;
import com.bytedance.sdk.component.csi.mq;
import com.bytedance.sdk.component.csi.sns;
import com.bytedance.sdk.component.csi.vvw;
import com.bytedance.sdk.component.csi.wcx;
import com.bytedance.sdk.component.csi.wki;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private final wki oq;
    private com.bytedance.sdk.component.csi.fou rhi;
    private vvw rjo;
    private ExecutorService syt;
    private Map<String, List<bob>> kq = new ConcurrentHashMap();
    private Map<String, sns> bob = new HashMap();
    private Map<String, wcx> fou = new HashMap();
    private Map<String, com.bytedance.sdk.component.csi.bob> csi = new HashMap();

    public rhi(Context context, wki wkiVar) {
        this.oq = (wki) rjo.kq(wkiVar);
        com.bytedance.sdk.component.csi.bob.kq.kq.kq(context, wkiVar.syt());
    }

    private wcx csi(com.bytedance.sdk.component.csi.oq oqVar) {
        wcx wcxVarRhi = this.oq.rhi();
        return wcxVarRhi != null ? wcxVarRhi : com.bytedance.sdk.component.csi.bob.kq.oq.csi.kq(oqVar.oq());
    }

    private com.bytedance.sdk.component.csi.fou dgq() {
        com.bytedance.sdk.component.csi.fou fouVarFou = this.oq.fou();
        return fouVarFou == null ? new com.bytedance.sdk.component.csi.oq.kq() : fouVarFou;
    }

    private sns fou(com.bytedance.sdk.component.csi.oq oqVar) {
        sns snsVarCsi = this.oq.csi();
        return snsVarCsi != null ? com.bytedance.sdk.component.csi.bob.kq.oq.kq.kq(snsVarCsi) : com.bytedance.sdk.component.csi.bob.kq.oq.kq.kq(oqVar.oq());
    }

    private vvw nn() {
        vvw vvwVarKq = this.oq.kq();
        return vvwVarKq != null ? vvwVarKq : com.bytedance.sdk.component.csi.kq.oq.kq();
    }

    private com.bytedance.sdk.component.csi.bob rhi(com.bytedance.sdk.component.csi.oq oqVar) {
        com.bytedance.sdk.component.csi.bob bobVarRjo = this.oq.rjo();
        return bobVarRjo != null ? bobVarRjo : new com.bytedance.sdk.component.csi.bob.kq.kq.oq(oqVar.syt(), oqVar.kq(), rjo());
    }

    private ExecutorService ubx() {
        ExecutorService executorServiceOq = this.oq.oq();
        return executorServiceOq != null ? executorServiceOq : com.bytedance.sdk.component.csi.kq.bob.kq();
    }

    public Collection<com.bytedance.sdk.component.csi.bob> bob() {
        return this.csi.values();
    }

    public Collection<sns> kq() {
        return this.bob.values();
    }

    public Collection<wcx> oq() {
        return this.fou.values();
    }

    public ExecutorService rjo() {
        ExecutorService executorServiceKq;
        fax faxVarBob = this.oq.bob();
        if (faxVarBob != null && (executorServiceKq = faxVarBob.kq()) != null) {
            return executorServiceKq;
        }
        if (this.syt == null) {
            this.syt = ubx();
        }
        return this.syt;
    }

    public Map<String, List<bob>> syt() {
        return this.kq;
    }

    public com.bytedance.sdk.component.csi.bob bob(com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar == null) {
            oqVar = com.bytedance.sdk.component.csi.bob.kq.kq.nn();
        }
        String string = oqVar.syt().toString();
        com.bytedance.sdk.component.csi.bob bobVar = this.csi.get(string);
        if (bobVar != null) {
            return bobVar;
        }
        com.bytedance.sdk.component.csi.bob bobVarRhi = rhi(oqVar);
        this.csi.put(string, bobVarRhi);
        return bobVarRhi;
    }

    public sns kq(com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar == null) {
            oqVar = com.bytedance.sdk.component.csi.bob.kq.kq.nn();
        }
        String string = oqVar.syt().toString();
        sns snsVar = this.bob.get(string);
        if (snsVar != null) {
            return snsVar;
        }
        sns snsVarFou = fou(oqVar);
        this.bob.put(string, snsVarFou);
        return snsVarFou;
    }

    public wcx oq(com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar == null) {
            oqVar = com.bytedance.sdk.component.csi.bob.kq.kq.nn();
        }
        String string = oqVar.syt().toString();
        wcx wcxVar = this.fou.get(string);
        if (wcxVar != null) {
            return wcxVar;
        }
        wcx wcxVarCsi = csi(oqVar);
        this.fou.put(string, wcxVarCsi);
        return wcxVarCsi;
    }

    public mq csi() {
        wki wkiVar = this.oq;
        if (wkiVar != null) {
            return wkiVar.dgq();
        }
        return null;
    }

    public vvw rhi() {
        if (this.rjo == null) {
            this.rjo = nn();
        }
        return this.rjo;
    }

    public com.bytedance.sdk.component.csi.fou fou() {
        if (this.rhi == null) {
            this.rhi = dgq();
        }
        return this.rhi;
    }

    public com.bytedance.sdk.component.csi.bob kq(String str) {
        return bob(com.bytedance.sdk.component.csi.bob.kq.kq.kq(new File(str)));
    }

    public com.bytedance.sdk.component.csi.bob.oq.kq kq(bob bobVar) {
        ImageView.ScaleType scaleTypeFou = bobVar.fou();
        if (scaleTypeFou == null) {
            scaleTypeFou = com.bytedance.sdk.component.csi.bob.oq.kq.kq;
        }
        ImageView.ScaleType scaleType = scaleTypeFou;
        Bitmap.Config configUbx = bobVar.ubx();
        if (configUbx == null) {
            configUbx = com.bytedance.sdk.component.csi.bob.oq.kq.oq;
        }
        return new com.bytedance.sdk.component.csi.bob.oq.kq(bobVar.oq(), bobVar.bob(), scaleType, configUbx, bobVar.rhi(), bobVar.rjo());
    }
}
