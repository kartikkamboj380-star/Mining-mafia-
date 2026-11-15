package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.dgq.fou.a;
import com.bytedance.adsdk.ugeno.dgq.fou.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class rhi extends csi {
    private static String fax = "";
    protected com.bytedance.sdk.component.adexpress.dynamic.bob.dgq gm;
    private Runnable kq;
    private volatile boolean mq;
    private Runnable oq;

    private static class bob implements com.bytedance.sdk.component.csi.syt {
        private final WeakReference<Context> kq;
        private final int oq;

        public bob(Context context, int i10) {
            this.kq = new WeakReference<>(context);
            this.oq = i10;
        }

        @Override // com.bytedance.sdk.component.csi.syt
        public Bitmap kq(Bitmap bitmap) {
            Context context = this.kq.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.fou.kq.kq(context, bitmap, this.oq);
            }
            return null;
        }
    }

    private static class kq implements com.bytedance.sdk.component.csi.mxq {
        private final com.bytedance.sdk.component.adexpress.dynamic.fou.syt bob;
        private final WeakReference<View> kq;
        private final WeakReference<DynamicRootView> oq;

        public kq(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
            this.kq = new WeakReference<>(view);
            this.oq = new WeakReference<>(dynamicRootView);
            this.bob = sytVar;
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(com.bytedance.sdk.component.csi.ubx ubxVar) {
            Drawable bitmapDrawable;
            View view = this.kq.get();
            Object objOq = ubxVar.oq();
            if (objOq instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objOq);
            } else if (objOq instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && a.a(objOq)) {
                    b.a(objOq).start();
                }
                bitmapDrawable = (Drawable) objOq;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.fou.oq()) {
                DynamicRootView dynamicRootView = this.oq.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().fou()) || "splash_ad".equals(dynamicRootView.getRenderRequest().fou())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar = this.bob;
            if (sytVar == null || sytVar.nn() == null || 6 != this.bob.nn().kq() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    private static class oq implements com.bytedance.sdk.component.csi.mxq {
        private final WeakReference<View> kq;
        private final WeakReference<csi> oq;

        public oq(View view, csi csiVar) {
            this.kq = new WeakReference<>(view);
            this.oq = new WeakReference<>(csiVar);
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(int i10, String str, Throwable th) {
        }

        @Override // com.bytedance.sdk.component.csi.mxq
        public void kq(com.bytedance.sdk.component.csi.ubx ubxVar) {
            Object objOq;
            csi csiVar;
            View view = this.kq.get();
            if (view == null || (objOq = ubxVar.oq()) == null || ubxVar.bob() == null || (csiVar = this.oq.get()) == null || !(objOq instanceof Bitmap)) {
                return;
            }
            view.setBackground(csiVar.kq((Bitmap) objOq));
        }
    }

    public rhi(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        super(context, dynamicRootView, sytVar);
        this.mq = true;
        setTag(Integer.valueOf(getClickArea()));
        String strOq = sytVar.nn().oq();
        if ("logo-union".equals(strOq)) {
            dynamicRootView.setLogoUnionHeight(this.syt - ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, this.vvw.oq() + this.vvw.kq())));
        } else if ("scoreCountWithIcon".equals(strOq)) {
            dynamicRootView.setScoreCountWithIcon(this.syt - ((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(context, this.vvw.oq() + this.vvw.kq())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable bob(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i10));
                } else if (jSONArray.getString(i10).endsWith("deg")) {
                    string = jSONArray.getString(i10);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.fou.rjo.kq(((String) arrayList.get(i11)).substring(0, 7));
            }
            GradientDrawable gradientDrawableKq = kq(kq(string), iArr);
            gradientDrawableKq.setShape(0);
            gradientDrawableKq.setCornerRadius(com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.nze()));
            return gradientDrawableKq;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String getBuildModel() {
        try {
            fax = com.bytedance.sdk.component.utils.ebt.kq();
        } catch (Throwable unused) {
            fax = Build.MODEL;
        }
        if (TextUtils.isEmpty(fax)) {
            fax = Build.MODEL;
        }
        return fax;
    }

    private String oq(String str) {
        try {
            Map<String, String> mapUbx = this.suf.getRenderRequest().ubx();
            if (mapUbx != null && mapUbx.size() > 0) {
                return mapUbx.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public boolean dgq() {
        int iNze;
        int iMxq;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.nze;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.wki.kq(this.vvw.ibd()));
        String strWxb = this.vvw.wxb();
        String strNb = null;
        String strKq = (TextUtils.isEmpty(strWxb) || (dynamicRootView = this.suf) == null || dynamicRootView.getRenderRequest() == null || this.suf.getRenderRequest().bob() == null || (jSONObjectOptJSONObject = this.suf.getRenderRequest().bob().optJSONObject("creative")) == null) ? null : kq(jSONObjectOptJSONObject.opt(strWxb));
        if (TextUtils.isEmpty(strKq)) {
            strKq = this.vvw.mq();
        }
        com.bytedance.sdk.component.adexpress.kq.kq.bob bobVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().bob();
        if (bobVarBob != null) {
            iNze = bobVarBob.nze();
            iMxq = bobVarBob.mxq();
        } else {
            iNze = 0;
            iMxq = 0;
        }
        if (this.vvw.fax()) {
            int iGm = this.vvw.gm();
            String str = this.vvw.oq;
            com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().csi().kq(str).kq(this.rjo).oq(this.syt).fou(iNze).csi(iMxq).kq(oq(str)).bob(2).kq(new bob(this.ubx, iGm)).kq(new oq(view, this));
        } else if (!TextUtils.isEmpty(strKq)) {
            if (!strKq.startsWith("http:") && !strKq.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.suf;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strNb = this.suf.getRenderRequest().nb();
                }
                strKq = com.bytedance.sdk.component.adexpress.dynamic.csi.dgq.oq(strKq, strNb);
            }
            com.bytedance.sdk.component.csi.nn nnVarBob = com.bytedance.sdk.component.adexpress.kq.kq.kq.kq().csi().kq(strKq).kq(this.rjo).oq(this.syt).fou(iNze).csi(iMxq).kq(oq(strKq)).bob(1);
            kq(nnVarBob);
            nnVarBob.kq(new kq(view, this.suf, this.wki));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.vvw.ha() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (rhi.this.vvw.xn() > 0) {
                            rhi rhiVar = rhi.this;
                            Drawable drawableBob = rhiVar.bob(rhiVar.suf.getBgMaterialCenterCalcColor().get(Integer.valueOf(rhi.this.vvw.xn())));
                            if (drawableBob == null) {
                                rhi rhiVar2 = rhi.this;
                                drawableBob = rhiVar2.kq(true, rhiVar2.suf.getBgMaterialCenterCalcColor().get(Integer.valueOf(rhi.this.vvw.xn())));
                            }
                            if (drawableBob != null) {
                                view.setBackground(drawableBob);
                                return;
                            }
                            View view2 = view;
                            rhi rhiVar3 = rhi.this;
                            view2.setBackground(rhiVar3.kq(true, rhiVar3.suf.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.vvw.ha() * 1000.0d));
        }
        View view2 = this.nze;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.bob()), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.oq()), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.fou()), (int) com.bytedance.sdk.component.adexpress.fou.rjo.kq(this.ubx, this.vvw.kq()));
        }
        if (this.mxq || this.vvw.suf() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.rjo, this.syt);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.nze;
        View view2 = view;
        if (view == null) {
            view2 = this;
        }
        double dFax = this.wki.nn().csi().fax();
        if (dFax < 90.0d && dFax > 0.0d) {
            com.bytedance.sdk.component.utils.dgq.oq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi.2
                @Override // java.lang.Runnable
                public void run() {
                    rhi.this.setVisibility(8);
                }
            }, (long) (dFax * 1000.0d));
        }
        kq(this.wki.nn().csi().gm(), view2);
        if (!TextUtils.isEmpty(this.vvw.tvh())) {
            kq();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.csi, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.kq);
            removeCallbacks(this.oq);
        } catch (Exception unused) {
        }
    }

    private String kq(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return kq(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return kq((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private static void kq(com.bytedance.sdk.component.csi.nn nnVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            nnVar.kq(Bitmap.Config.ARGB_8888);
        }
    }

    private void kq(double d10, final View view) {
        if (d10 > 0.0d) {
            com.bytedance.sdk.component.utils.dgq.oq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi.3
                @Override // java.lang.Runnable
                public void run() {
                    if (rhi.this.wki.nn().csi().iaf() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    rhi.this.setVisibility(0);
                }
            }, (long) (d10 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kq(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) instanceof com.bytedance.sdk.component.adexpress.dynamic.bob.dgq) {
                viewGroup.removeViewAt(i10);
            }
        }
    }

    private void kq() {
        if (this.mq) {
            int iPfu = this.vvw.pfu();
            int iOxe = this.vvw.oxe();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = rhi.this.suf;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        rhi rhiVar = rhi.this;
                        rhi rhiVar2 = rhi.this;
                        rhiVar.gm = new com.bytedance.sdk.component.adexpress.dynamic.bob.dgq(rhiVar2.ubx, rhiVar2, rhiVar2.vvw);
                    } else {
                        com.bytedance.sdk.component.adexpress.oq.wki renderRequest = rhi.this.suf.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.fou.nn nnVar = new com.bytedance.sdk.component.adexpress.dynamic.fou.nn();
                        nnVar.kq(renderRequest.nze());
                        nnVar.oq(renderRequest.mxq());
                        nnVar.bob(renderRequest.sns());
                        nnVar.kq(renderRequest.wcx());
                        nnVar.oq(renderRequest.gm());
                        nnVar.bob(renderRequest.fax());
                        nnVar.fou(renderRequest.mq());
                        nnVar.csi(renderRequest.jhe());
                        rhi rhiVar3 = rhi.this;
                        rhi rhiVar4 = rhi.this;
                        rhiVar3.gm = new com.bytedance.sdk.component.adexpress.dynamic.bob.dgq(rhiVar4.ubx, rhiVar4, rhiVar4.vvw, nnVar, renderRequest);
                    }
                    rhi rhiVar5 = rhi.this;
                    rhiVar5.oq(rhiVar5.gm);
                    if (rhi.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) rhi.this.getParent()).setClipChildren(false);
                    }
                    rhi.this.setClipChildren(false);
                    rhi.this.gm.setTag(2);
                    rhi rhiVar6 = rhi.this;
                    rhiVar6.kq((ViewGroup) rhiVar6);
                    rhi rhiVar7 = rhi.this;
                    rhiVar7.addView(rhiVar7.gm, new FrameLayout.LayoutParams(-1, -1));
                    rhi.this.gm.bob();
                }
            };
            this.kq = runnable;
            postDelayed(runnable, ((long) iPfu) * 1000);
            if (this.vvw.ye() || iOxe >= Integer.MAX_VALUE || iPfu >= iOxe) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.rhi.5
                @Override // java.lang.Runnable
                public void run() {
                    rhi rhiVar = rhi.this;
                    if (rhiVar.gm != null) {
                        rhiVar.mq = false;
                        rhi.this.gm.fou();
                        rhi.this.gm.setVisibility(4);
                        rhi rhiVar2 = rhi.this;
                        rhiVar2.removeView(rhiVar2.gm);
                    }
                }
            };
            this.oq = runnable2;
            postDelayed(runnable2, ((long) iOxe) * 1000);
        }
    }
}
