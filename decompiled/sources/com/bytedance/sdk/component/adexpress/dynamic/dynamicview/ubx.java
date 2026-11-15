package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.bytedance.adsdk.ugeno.dgq.fou.a;
import com.bytedance.adsdk.ugeno.dgq.fou.b;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ubx extends rhi {
    private String kq;

    private static class kq implements com.bytedance.sdk.component.csi.syt {
        private final WeakReference<Context> kq;

        public kq(Context context) {
            this.kq = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.csi.syt
        public Bitmap kq(Bitmap bitmap) {
            Context context = this.kq.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.fou.kq.kq(context, bitmap, 25);
            }
            return null;
        }
    }

    private static class oq implements com.bytedance.sdk.component.csi.mxq {
        private WeakReference<View> kq;
        private Resources oq;

        public oq(View view, Resources resources) {
            this.kq = new WeakReference<>(view);
            this.oq = resources;
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(com.bytedance.sdk.component.csi.ubx ubxVar) {
            Object objOq;
            View view = this.kq.get();
            if (view == null || (objOq = ubxVar.oq()) == null || ubxVar.bob() == null) {
                return;
            }
            if (objOq instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.oq, (Bitmap) objOq));
            } else if (objOq instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.a(objOq)) {
                    b.a(objOq).start();
                }
                view.setBackground((Drawable) objOq);
            }
        }
    }

    public ubx(Context context, @NonNull DynamicRootView dynamicRootView, @NonNull com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
        if (!TextUtils.isEmpty(this.vvw.hn()) && sytVar.gm()) {
            com.bytedance.sdk.component.adexpress.rhi.nn nnVar = new com.bytedance.sdk.component.adexpress.rhi.nn(context);
            nnVar.setAnimationsLoop(this.vvw.aq());
            nnVar.setImageLottieTosPath(this.vvw.hn());
            nnVar.setLottieAppNameMaxLength(this.vvw.noa());
            nnVar.setLottieAdTitleMaxLength(this.vvw.rhg());
            nnVar.setLottieAdDescMaxLength(this.vvw.fm());
            nnVar.setData(sytVar.fax());
            this.nze = nnVar;
        } else if (this.vvw.nze() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            com.bytedance.sdk.component.adexpress.rhi.ou ouVar = new com.bytedance.sdk.component.adexpress.rhi.ou(context);
            this.nze = ouVar;
            ouVar.setXRound((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, this.vvw.nze()));
            ((com.bytedance.sdk.component.adexpress.rhi.ou) this.nze).setYRound((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, this.vvw.nze()));
        } else if (!syt() && "arrowButton".equals(sytVar.nn().oq())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.oq oqVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.oq(context);
            oqVar.setBrickNativeValue(this.vvw);
            this.nze = oqVar;
        } else if (com.bytedance.sdk.component.adexpress.fou.dgq.oq(this.vvw.ubx())) {
            this.nze = new com.bytedance.sdk.component.adexpress.rhi.wki(context);
        } else {
            this.nze = new ImageView(context);
        }
        this.kq = getImageKey();
        this.nze.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(sytVar.nn().oq())) {
            if (this.vvw.oq() > 0 || this.vvw.kq() > 0) {
                int iMin = Math.min(this.rjo, this.syt);
                this.rjo = iMin;
                this.syt = Math.min(iMin, this.syt);
                this.dgq = (int) (this.dgq + com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, this.vvw.oq() + (this.vvw.kq() / 2) + 0.5f));
            } else {
                int iMax = Math.max(this.rjo, this.syt);
                this.rjo = iMax;
                this.syt = Math.max(iMax, this.syt);
            }
            this.vvw.kq(this.rjo / 2);
        }
        addView(this.nze, new FrameLayout.LayoutParams(this.rjo, this.syt));
    }

    private String getImageKey() {
        Map<String, String> mapUbx = this.suf.getRenderRequest().ubx();
        if (mapUbx == null || mapUbx.size() <= 0) {
            return null;
        }
        return mapUbx.get(this.vvw.ubx());
    }

    private boolean kq() {
        String strVvw = this.vvw.vvw();
        if (this.vvw.fax()) {
            return true;
        }
        if (TextUtils.isEmpty(strVvw)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strVvw);
            return Math.abs((((float) this.rjo) / (((float) this.syt) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wf
    public boolean dgq() {
        int iMxq;
        super.dgq();
        if (!TextUtils.isEmpty(this.vvw.hn())) {
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iNze = 0;
        if ("arrowButton".equals(this.wki.nn().oq())) {
            ((ImageView) this.nze).setImageResource(com.bytedance.sdk.component.utils.uml.fou(this.ubx, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.nze).getDrawable() != null) {
                ((ImageView) this.nze).getDrawable().setAutoMirrored(true);
            }
            this.nze.setPadding(0, 0, 0, 0);
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.nze.setBackgroundColor(this.vvw.rs());
        String strBob = this.wki.nn().bob();
        if ("user".equals(strBob)) {
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.nze).setColorFilter(this.vvw.rjo());
            ((ImageView) this.nze).setImageDrawable(com.bytedance.sdk.component.utils.uml.bob(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.nze;
            int i10 = this.rjo;
            imageView.setPadding(i10 / 10, this.syt / 5, i10 / 10, 0);
        } else if (strBob != null && strBob.startsWith("@")) {
            try {
                ((ImageView) this.nze).setImageResource(Integer.parseInt(strBob.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.csi.nze nzeVarCsi = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().csi();
        String strUbx = this.vvw.ubx();
        if (!TextUtils.isEmpty(strUbx) && !strUbx.startsWith("http:") && !strUbx.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.suf;
            strUbx = com.bytedance.sdk.component.adexpress.dynamic.csi.dgq.oq(strUbx, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.suf.getRenderRequest().nb());
        }
        com.bytedance.sdk.component.adexpress.kq.kq.bob bobVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob();
        if (bobVarBob != null) {
            iNze = bobVarBob.nze();
            iMxq = bobVarBob.mxq();
        } else {
            iMxq = 0;
        }
        com.bytedance.sdk.component.csi.nn nnVarCsi = nzeVarCsi.kq(strUbx).kq(this.kq).kq(this.rjo).oq(this.syt).fou(iNze).csi(iMxq);
        String strSuf = this.suf.getRenderRequest().suf();
        if (!TextUtils.isEmpty(strSuf)) {
            nnVarCsi.oq(strSuf);
        }
        if (kq()) {
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.FIT_CENTER);
            nnVarCsi.kq(Bitmap.Config.ARGB_4444).bob(2).kq(new kq(this.ubx)).kq(new oq(this.nze, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.fou.oq()) {
                nnVarCsi.bob(1).kq((ImageView) this.nze);
            }
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.nze instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.nze).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.nze).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.a(drawable)) {
            return;
        }
        b.a(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.nze).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.a(drawable)) {
            return;
        }
        b.a(drawable).stop();
    }
}
