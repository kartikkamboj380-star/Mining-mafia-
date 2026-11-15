package com.bytedance.adsdk.ugeno.dgq.oq;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class oq extends com.bytedance.adsdk.ugeno.oq.kq<com.bytedance.adsdk.ugeno.dgq.oq.kq> {
    private com.bytedance.adsdk.ugeno.dgq.oq.kq et;

    public static class kq extends com.bytedance.adsdk.ugeno.oq.kq.C0230kq {
        protected int ebt;

        public kq(com.bytedance.adsdk.ugeno.oq.kq kqVar) {
            super(kqVar);
            this.ebt = -1;
        }

        private int oq(String str) {
            str.getClass();
            switch (str) {
                case "bottom":
                    return 80;
                case "center":
                    return 17;
                case "center_vertical":
                    return 16;
                case "top":
                    return 48;
                case "left":
                    return 3;
                case "right":
                    return 5;
                case "center_horizontal":
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        public void kq(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.kq(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.ebt = kq(str2);
            }
        }

        @Override // com.bytedance.adsdk.ugeno.oq.kq.C0230kq
        /* JADX INFO: renamed from: oq, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams kq() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.kq, (int) this.oq);
            layoutParams.leftMargin = (int) this.rhi;
            layoutParams.rightMargin = (int) this.rjo;
            layoutParams.topMargin = (int) this.syt;
            layoutParams.bottomMargin = (int) this.dgq;
            layoutParams.gravity = this.ebt;
            return layoutParams;
        }

        private int kq(String str) {
            String[] strArrSplit;
            if (TextUtils.isEmpty(str) || (strArrSplit = str.split("\\|")) == null || strArrSplit.length <= 0) {
                return -1;
            }
            int iOq = 0;
            for (String str2 : strArrSplit) {
                iOq |= oq(str2);
            }
            return iOq;
        }
    }

    public oq(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.bob
    /* JADX INFO: renamed from: bob, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.dgq.oq.kq kq() {
        com.bytedance.adsdk.ugeno.dgq.oq.kq kqVar = new com.bytedance.adsdk.ugeno.dgq.oq.kq(this.oq);
        this.et = kqVar;
        kqVar.kq(this);
        return this.et;
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq
    public com.bytedance.adsdk.ugeno.oq.kq.C0230kq nn() {
        return new kq(this);
    }

    @Override // com.bytedance.adsdk.ugeno.oq.kq, com.bytedance.adsdk.ugeno.oq.bob
    public void oq() {
        this.et.setEventMap(this.clh);
        super.oq();
    }
}
