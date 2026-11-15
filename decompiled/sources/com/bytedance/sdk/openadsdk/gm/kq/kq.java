package com.bytedance.sdk.openadsdk.gm.kq;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.csi.mxq;
import com.bytedance.sdk.component.csi.nn;
import com.bytedance.sdk.component.csi.syt;
import com.bytedance.sdk.component.csi.ubx;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.core.sns;
import com.bytedance.sdk.openadsdk.nn.fou;
import com.bytedance.sdk.openadsdk.utils.bss;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.gm.kq.kq$kq, reason: collision with other inner class name */
    public interface InterfaceC0304kq {
        void kq(int i10, String str, Throwable th);

        void kq(String str, oq oqVar);
    }

    public void kq(com.bytedance.sdk.openadsdk.gm.kq kqVar, final InterfaceC0304kq interfaceC0304kq, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, uml umlVar) {
        nn nnVarKq = fou.kq(kqVar.kq).kq(kqVar.oq).kq(i10).oq(i11).csi(bss.csi(sns.kq())).fou(bss.bob(sns.kq())).oq(str).kq(scaleType).kq(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            nnVarKq.bob(1);
        } else {
            nnVarKq.bob(2).kq(new syt() { // from class: com.bytedance.sdk.openadsdk.gm.kq.kq.1
                @Override // com.bytedance.sdk.component.csi.syt
                public Bitmap kq(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.fou.kq.kq(sns.kq(), bitmap, i12);
                }
            });
        }
        nnVarKq.kq(new com.bytedance.sdk.openadsdk.nn.oq(umlVar, kqVar.kq, new mxq() { // from class: com.bytedance.sdk.openadsdk.gm.kq.kq.2
            @Override // com.bytedance.sdk.component.csi.mxq
            public void kq(ubx ubxVar) {
                kq.this.kq(ubxVar, interfaceC0304kq);
            }

            @Override // com.bytedance.sdk.component.csi.mxq
            public void kq(int i13, String str2, Throwable th) {
                kq.this.kq(i13, str2, th, interfaceC0304kq);
            }
        }));
    }

    protected void kq(ubx ubxVar, InterfaceC0304kq interfaceC0304kq) {
        if (interfaceC0304kq != null) {
            Object objOq = ubxVar.oq();
            int iKq = kq(ubxVar);
            if (objOq instanceof Drawable) {
                interfaceC0304kq.kq(ubxVar.kq(), new oq((Drawable) objOq, iKq));
                return;
            }
            if (objOq instanceof byte[]) {
                interfaceC0304kq.kq(ubxVar.kq(), new oq((byte[]) objOq, iKq));
                return;
            }
            if (objOq instanceof Bitmap) {
                interfaceC0304kq.kq(ubxVar.kq(), new oq((Bitmap) objOq, ubxVar.bob() instanceof Bitmap ? (Bitmap) ubxVar.bob() : null, iKq));
            } else {
                interfaceC0304kq.kq(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int kq(ubx ubxVar) {
        Object obj;
        Map<String, String> mapFou = ubxVar.fou();
        if (mapFou == null || (obj = mapFou.get("image_size")) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void kq(int i10, String str, Throwable th, InterfaceC0304kq interfaceC0304kq) {
        if (interfaceC0304kq != null) {
            interfaceC0304kq.kq(i10, str, th);
        }
    }
}
