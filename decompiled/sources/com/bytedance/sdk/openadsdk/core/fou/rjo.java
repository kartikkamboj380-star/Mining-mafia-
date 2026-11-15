package com.bytedance.sdk.openadsdk.core.fou;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.uml;
import com.bytedance.sdk.openadsdk.utils.bss;
import com.bytedance.sdk.openadsdk.utils.fgm;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class rjo extends PAGBannerAd {
    protected AdSlot bob;
    private boolean csi;
    private int dgq;
    private boolean fou;
    protected Context kq;
    private final AtomicBoolean nn = new AtomicBoolean(false);
    protected uml oq;
    private csi rhi;
    private boolean rjo;
    private int syt;
    private List<com.bytedance.sdk.openadsdk.core.fou.kq> ubx;

    public interface kq {
        void kq();
    }

    public rjo(Context context, uml umlVar, AdSlot adSlot) {
        this.syt = 0;
        this.dgq = 0;
        this.kq = context;
        this.oq = umlVar;
        this.bob = adSlot;
        this.syt = (int) adSlot.getExpressViewAcceptedWidth();
        this.dgq = (int) this.bob.getExpressViewAcceptedHeight();
        kq(this.oq);
        oq(umlVar);
    }

    private void oq(uml umlVar) {
        com.bytedance.sdk.openadsdk.core.model.kq kqVarFou;
        if (umlVar == null || (kqVarFou = umlVar.fou()) == null) {
            return;
        }
        this.ubx = new ArrayList();
        int size = kqVarFou.fou().size();
        if (!this.rjo) {
            this.ubx.add(new com.bytedance.sdk.openadsdk.core.fou.kq(this.kq, umlVar, this.bob, this, false));
            return;
        }
        this.rhi = new csi(kqVarFou.rjo(), this.kq, this.syt, this.dgq);
        for (int i10 = 0; i10 < size; i10++) {
            this.bob.setExpressViewAccepted(((this.syt - bss.bob(this.kq, kqVarFou.rjo().csi())) - bss.bob(this.kq, kqVarFou.rjo().rhi())) - (bss.bob(this.kq, kqVarFou.rjo().rjo()) * 2), this.dgq);
            uml umlVar2 = kqVarFou.fou().get(i10);
            if (i10 != 0) {
                kq(i10, umlVar2);
            }
            com.bytedance.sdk.openadsdk.core.fou.kq kqVar = new com.bytedance.sdk.openadsdk.core.fou.kq(this.kq, umlVar2, this.bob, this, true);
            kqVar.kq(i10);
            this.ubx.add(kqVar);
        }
        this.rhi.kq(this.ubx);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.fou.kq> list = this.ubx;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.rjo) {
                this.rhi.kq();
            } else {
                this.ubx.get(0).rjo();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        return this.bob != null ? new PAGBannerSize(this.syt, this.dgq) : new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.fou.kq> list = this.ubx;
            if (list != null && !list.isEmpty()) {
                return this.rjo ? this.rhi.oq() : this.ubx.get(0).kq();
            }
        } catch (Throwable unused) {
        }
        return new View(this.kq);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        uml umlVar = this.oq;
        if (umlVar == null || umlVar.ll() == null) {
            return null;
        }
        try {
            return this.oq.ll().get(str);
        } catch (Throwable th) {
            fax.bob("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        uml umlVar = this.oq;
        if (umlVar != null) {
            return umlVar.ll();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d10, String str, String str2) {
        if (this.csi) {
            return;
        }
        fgm.kq(this.oq, d10, str, str2);
        this.csi = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.fou.kq> list = this.ubx;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.ubx.size(); i10++) {
            this.ubx.get(i10).kq(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.fou.rjo.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(@NonNull PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!rjo.this.nn.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.fou.kq> list = this.ubx;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.ubx.size(); i10++) {
            this.ubx.get(i10).kq(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.fou.rjo.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!rjo.this.nn.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d10) {
        if (this.fou) {
            return;
        }
        fgm.kq(this.oq, d10);
        this.fou = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private void kq(uml umlVar) {
        com.bytedance.sdk.openadsdk.core.model.kq kqVarFou;
        boolean z9;
        if (umlVar == null || (kqVarFou = umlVar.fou()) == null) {
            return;
        }
        if (kqVarFou.nn()) {
            z9 = kqVarFou.fou().size() > 1;
        }
        this.rjo = z9;
    }

    public boolean kq() {
        return this.rjo;
    }

    private void kq(int i10, uml umlVar) {
        if (i10 != 0) {
            if (!TextUtils.isEmpty(umlVar.rul())) {
                umlVar.suf("0");
            }
            Map<String, Object> mapLl = umlVar.ll();
            if (mapLl == null || !mapLl.containsKey(InAppPurchaseMetaData.KEY_PRICE)) {
                return;
            }
            mapLl.put(InAppPurchaseMetaData.KEY_PRICE, "0");
        }
    }
}
