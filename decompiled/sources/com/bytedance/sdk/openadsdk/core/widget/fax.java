package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.kq.kq.kq.bob.c;
import com.bytedance.sdk.component.utils.uml;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class fax {
    private Context bob;
    private oq csi;
    private com.bytedance.sdk.openadsdk.core.wki.oq.kq fou;
    private View kq;
    private TextView oq;
    private boolean rhi = false;
    private c rjo;
    private ViewGroup syt;

    public enum kq {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public interface oq {
        boolean nn();

        void ubx();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bob() {
        if (this.bob == null) {
            return;
        }
        fou();
    }

    private void fou() {
        View view = this.kq;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void oq() {
        this.rjo = null;
    }

    public void kq(Context context, ViewGroup viewGroup) {
        if (context == null || viewGroup == null) {
            return;
        }
        this.syt = viewGroup;
        this.bob = com.bytedance.sdk.openadsdk.core.sns.kq().getApplicationContext();
    }

    private void kq(Context context, View view, boolean z9) {
        ViewGroup.LayoutParams layoutParamsKq;
        if (context == null || view == null || this.kq != null || (layoutParamsKq = kq(this.syt)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.nze.csi csiVar = new com.bytedance.sdk.openadsdk.nze.csi(context);
        this.kq = csiVar;
        csiVar.setLayoutParams(layoutParamsKq);
        this.syt.addView(this.kq);
        this.oq = (TextView) this.kq.findViewById(com.bytedance.sdk.openadsdk.utils.mxq.jqv);
        View viewFindViewById = this.kq.findViewById(com.bytedance.sdk.openadsdk.utils.mxq.iy);
        if (z9) {
            viewFindViewById.setClickable(true);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.fax.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    fax.this.bob();
                    if (fax.this.fou != null) {
                        fax.this.fou.kq(kq.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            viewFindViewById.setOnClickListener(null);
            viewFindViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams kq(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void kq(com.bytedance.sdk.openadsdk.core.wki.oq.kq kqVar, oq oqVar) {
        this.csi = oqVar;
        this.fou = kqVar;
    }

    public boolean kq(int i10, c cVar, boolean z9) {
        Context context = this.bob;
        if (context == null || cVar == null) {
            return true;
        }
        kq(context, this.syt, z9);
        this.rjo = cVar;
        if (i10 == 1 || i10 == 2) {
            return kq(i10);
        }
        return true;
    }

    private boolean kq(int i10) {
        oq oqVar;
        if (kq() || this.rhi) {
            return true;
        }
        if (this.fou != null && (oqVar = this.csi) != null) {
            if (oqVar.nn()) {
                this.fou.csi(null, null);
            }
            this.fou.kq(kq.PAUSE_VIDEO, (String) null);
        }
        kq(this.rjo, true);
        return false;
    }

    public void kq(boolean z9) {
        if (z9) {
            oq();
        }
        fou();
    }

    public boolean kq() {
        View view = this.kq;
        return view != null && view.getVisibility() == 0;
    }

    private void kq(c cVar, boolean z9) {
        View view;
        String str;
        View view2;
        if (cVar == null || (view = this.kq) == null || this.bob == null || view.getVisibility() == 0) {
            return;
        }
        oq oqVar = this.csi;
        if (oqVar != null) {
            oqVar.ubx();
        }
        double dCeil = Math.ceil((cVar.d() * 1.0d) / 1048576.0d);
        if (z9) {
            str = String.format(uml.kq(this.bob, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(dCeil).floatValue()));
        } else {
            str = uml.kq(this.bob, "tt_video_without_wifi_tips") + uml.kq(this.bob, "tt_video_bytesize");
        }
        bss.kq(this.kq, 0);
        bss.kq(this.oq, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!bss.fou(this.kq) || (view2 = this.kq) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
