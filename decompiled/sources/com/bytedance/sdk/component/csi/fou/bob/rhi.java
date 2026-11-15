package com.bytedance.sdk.component.csi.fou.bob;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.csi.fax;
import com.bytedance.sdk.component.csi.mq;
import com.bytedance.sdk.component.csi.sns;
import com.bytedance.sdk.component.csi.wcx;
import com.bytedance.sdk.component.csi.wki;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private volatile sns bob;
    private Context dgq;
    private volatile wcx fou;
    private final wki oq;
    private com.bytedance.sdk.component.csi.fou rhi;
    private ExecutorService rjo;
    private ExecutorService syt;
    private Map<String, List<bob>> kq = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.csi.bob> csi = new ConcurrentHashMap();

    public rhi(Context context, wki wkiVar) {
        this.oq = (wki) rjo.kq(wkiVar);
        this.dgq = context;
        com.bytedance.sdk.component.csi.fou.bob.kq.oq.kq(context, wkiVar.syt());
    }

    private com.bytedance.sdk.component.csi.bob fou(com.bytedance.sdk.component.csi.oq oqVar) {
        com.bytedance.sdk.component.csi.bob bobVarRjo = this.oq.rjo();
        return bobVarRjo != null ? bobVarRjo : new com.bytedance.sdk.component.csi.fou.bob.kq.kq.oq(oqVar.syt(), oqVar.kq());
    }

    private com.bytedance.sdk.component.csi.fou nn() {
        com.bytedance.sdk.component.csi.fou fouVarFou = this.oq.fou();
        return fouVarFou == null ? new com.bytedance.sdk.component.csi.oq.kq() : fouVarFou;
    }

    private ExecutorService ubx() {
        ExecutorService executorServiceOq = this.oq.oq();
        return executorServiceOq != null ? executorServiceOq : com.bytedance.sdk.component.csi.fou.kq.oq.kq();
    }

    public Collection<com.bytedance.sdk.component.csi.bob> bob() {
        return this.csi.values();
    }

    public ExecutorService csi() {
        ExecutorService executorServiceKq;
        fax faxVarBob = this.oq.bob();
        if (faxVarBob != null && (executorServiceKq = faxVarBob.kq()) != null) {
            return executorServiceKq;
        }
        if (this.rjo == null) {
            this.rjo = ubx();
        }
        return this.rjo;
    }

    public Map<String, List<bob>> dgq() {
        return this.kq;
    }

    public Context kq() {
        return this.dgq;
    }

    public wcx oq() {
        return this.fou;
    }

    public mq rhi() {
        wki wkiVar = this.oq;
        if (wkiVar != null) {
            return wkiVar.dgq();
        }
        return null;
    }

    public boolean rjo() {
        wki wkiVar = this.oq;
        if (wkiVar != null) {
            return wkiVar.nn();
        }
        return false;
    }

    public ExecutorService syt() {
        ExecutorService executorServiceOq;
        fax faxVarBob = this.oq.bob();
        if (faxVarBob != null && (executorServiceOq = faxVarBob.oq()) != null) {
            return executorServiceOq;
        }
        if (this.syt == null) {
            this.syt = com.bytedance.sdk.component.csi.fou.kq.oq.kq();
        }
        return this.syt;
    }

    public com.bytedance.sdk.component.csi.bob bob(com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar == null) {
            oqVar = com.bytedance.sdk.component.csi.fou.bob.kq.oq.nn();
        }
        String string = oqVar.syt().toString();
        com.bytedance.sdk.component.csi.bob bobVar = this.csi.get(string);
        if (bobVar != null) {
            return bobVar;
        }
        com.bytedance.sdk.component.csi.bob bobVarFou = fou(oqVar);
        this.csi.put(string, bobVarFou);
        return bobVarFou;
    }

    public sns kq(com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar == null) {
            oqVar = com.bytedance.sdk.component.csi.fou.bob.kq.oq.nn();
        }
        if (this.bob == null) {
            synchronized (com.bytedance.sdk.component.csi.fou.bob.kq.oq.bob.class) {
                try {
                    if (this.bob == null) {
                        this.bob = new com.bytedance.sdk.component.csi.fou.bob.kq.oq.bob(new com.bytedance.sdk.component.csi.fou.bob.kq.oq.kq(oqVar.oq(), oqVar.bob()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.bob;
    }

    public wcx oq(com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar == null) {
            oqVar = com.bytedance.sdk.component.csi.fou.bob.kq.oq.nn();
        }
        if (this.fou == null) {
            synchronized (com.bytedance.sdk.component.csi.fou.bob.kq.oq.oq.class) {
                try {
                    if (this.fou == null) {
                        this.fou = new com.bytedance.sdk.component.csi.fou.bob.kq.oq.oq(oqVar.oq(), oqVar.fou());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.fou;
    }

    public com.bytedance.sdk.component.csi.fou fou() {
        if (this.rhi == null) {
            this.rhi = nn();
        }
        return this.rhi;
    }

    public com.bytedance.sdk.component.csi.bob kq(String str) {
        return bob(com.bytedance.sdk.component.csi.fou.bob.kq.oq.kq(new File(str)));
    }

    public com.bytedance.sdk.component.csi.fou.bob.oq.oq kq(bob bobVar) {
        ImageView.ScaleType scaleTypeFou = bobVar.fou();
        if (scaleTypeFou == null) {
            scaleTypeFou = com.bytedance.sdk.component.csi.fou.bob.oq.oq.kq;
        }
        ImageView.ScaleType scaleType = scaleTypeFou;
        Bitmap.Config configUbx = bobVar.ubx();
        if (configUbx == null) {
            configUbx = com.bytedance.sdk.component.csi.fou.bob.oq.oq.oq;
        }
        return new com.bytedance.sdk.component.csi.fou.bob.oq.oq(bobVar.oq(), bobVar.bob(), scaleType, configUbx, bobVar.rhi(), bobVar.rjo());
    }
}
