package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DynamicRootView extends FrameLayout implements com.bytedance.sdk.component.adexpress.dynamic.fou, com.bytedance.sdk.component.adexpress.theme.kq {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private csi dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private com.bytedance.sdk.component.adexpress.dynamic.rhi.kq mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private com.bytedance.sdk.component.adexpress.oq.ubx mRenderListener;
    private com.bytedance.sdk.component.adexpress.oq.wki mRenderRequest;
    private ViewGroup mTimeOut;
    private com.bytedance.sdk.component.adexpress.dynamic.oq muteListener;
    protected final com.bytedance.sdk.component.adexpress.oq.suf renderResult;
    private int scoreCountWithIcon;
    private List<com.bytedance.sdk.component.adexpress.dynamic.bob> timeOutListener;
    private int timedown;
    private com.bytedance.sdk.component.adexpress.dynamic.csi videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z9, com.bytedance.sdk.component.adexpress.oq.wki wkiVar, com.bytedance.sdk.component.adexpress.dynamic.rhi.kq kqVar) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.oq.suf sufVar = new com.bytedance.sdk.component.adexpress.oq.suf();
        this.renderResult = sufVar;
        sufVar.kq(2);
        this.mDynamicClickListener = kqVar;
        kqVar.kq(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.kq(this);
        this.mIsMute = z9;
        this.mRenderRequest = wkiVar;
    }

    private void checkCanOpenLandingPage(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        com.bytedance.sdk.component.adexpress.dynamic.fou.rhi rhiVarCsi;
        com.bytedance.sdk.component.adexpress.dynamic.fou.csi csiVarNn = sytVar.nn();
        if (csiVarNn == null || (rhiVarCsi = csiVarNn.csi()) == null) {
            return;
        }
        this.renderResult.oq(rhiVarCsi.oyl());
    }

    private boolean checkSizeValid() {
        csi csiVar = this.dynamicBaseWidget;
        return csiVar.csi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && csiVar.rhi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void setClipChildren(ViewGroup viewGroup, com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !sytVar.nb()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void callBackRenderFail(int i10, String str) {
        this.renderResult.kq(false);
        this.renderResult.oq(i10);
        this.renderResult.kq(str);
        this.mRenderListener.kq(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.rhi.kq getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public com.bytedance.sdk.component.adexpress.oq.ubx getRenderListener() {
        return this.mRenderListener;
    }

    public com.bytedance.sdk.component.adexpress.oq.wki getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<com.bytedance.sdk.component.adexpress.dynamic.bob> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.kq
    public void onThemeChanged(int i10) {
        csi csiVar = this.dynamicBaseWidget;
        if (csiVar == null) {
            return;
        }
        csiVar.kq(i10);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fou
    public void onvideoComplate() {
        try {
            this.videoListener.kq();
        } catch (Exception unused) {
        }
    }

    public void render(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, int i10) {
        this.dynamicBaseWidget = renderDynamicView(sytVar, this, i10);
        this.renderResult.kq(true);
        this.renderResult.kq(this.dynamicBaseWidget.csi);
        this.renderResult.oq(this.dynamicBaseWidget.rhi);
        this.renderResult.kq(this.videoView);
        this.mRenderListener.kq(this.renderResult);
    }

    public csi renderDynamicView(com.bytedance.sdk.component.adexpress.dynamic.fou.syt sytVar, ViewGroup viewGroup, int i10) {
        if (sytVar == null) {
            return null;
        }
        List<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> listUbx = sytVar.ubx();
        csi csiVarKq = com.bytedance.sdk.component.adexpress.dynamic.kq.oq.kq(this.mContext, this, sytVar);
        if (csiVarKq instanceof fgm) {
            callBackRenderFail(i10 == 3 ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT : 118, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(sytVar);
        csiVarKq.bob();
        if (viewGroup != null) {
            viewGroup.addView(csiVarKq);
            setClipChildren(viewGroup, sytVar);
        }
        if (listUbx == null || listUbx.size() <= 0) {
            return null;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.fou.syt> it = listUbx.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), csiVarKq, i10);
        }
        return csiVarKq;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i10) {
        this.logoUnionHeight = i10;
    }

    public void setMuteListener(com.bytedance.sdk.component.adexpress.dynamic.oq oqVar) {
        this.muteListener = oqVar;
    }

    public void setRenderListener(com.bytedance.sdk.component.adexpress.oq.ubx ubxVar) {
        this.mRenderListener = ubxVar;
        this.mDynamicClickListener.kq(ubxVar);
    }

    public void setScoreCountWithIcon(int i10) {
        this.scoreCountWithIcon = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fou
    public void setSoundMute(boolean z9) {
        com.bytedance.sdk.component.adexpress.dynamic.oq oqVar = this.muteListener;
        if (oqVar != null) {
            oqVar.setSoundMute(z9);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fou
    public void setTime(CharSequence charSequence, int i10, int i11, boolean z9) {
        for (int i12 = 0; i12 < this.timeOutListener.size(); i12++) {
            if (this.timeOutListener.get(i12) != null) {
                this.timeOutListener.get(i12).kq(charSequence, i10 == 1, i11, z9);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(com.bytedance.sdk.component.adexpress.dynamic.bob bobVar) {
        this.timeOutListener.add(bobVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.fou
    public void setTimeUpdate(int i10) {
        this.videoListener.setTimeUpdate(i10);
    }

    public void setTimedown(int i10) {
        this.timedown = i10;
    }

    public void setVideoListener(com.bytedance.sdk.component.adexpress.dynamic.csi csiVar) {
        this.videoListener = csiVar;
    }

    public void updateRenderInfoForVideo(double d10, double d11, double d12, double d13, float f10) {
        this.renderResult.bob(d10);
        this.renderResult.fou(d11);
        this.renderResult.csi(d12);
        this.renderResult.rhi(d13);
        this.renderResult.kq(f10);
        this.renderResult.oq(f10);
        this.renderResult.bob(f10);
        this.renderResult.fou(f10);
    }

    public void beginShowFromInvisible(csi csiVar, int i10) {
        if (csiVar == null) {
            return;
        }
        if (csiVar.getBeginInvisibleAndShow()) {
            csiVar.setVisibility(i10);
            View view = csiVar.nze;
            if (view != null) {
                view.setVisibility(i10);
            }
        }
        int childCount = csiVar.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            if (csiVar.getChildAt(i11) instanceof csi) {
                beginShowFromInvisible((csi) csiVar.getChildAt(i11), i10);
            }
        }
    }
}
