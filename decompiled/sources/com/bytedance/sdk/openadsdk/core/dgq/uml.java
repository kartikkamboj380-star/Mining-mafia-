package com.bytedance.sdk.openadsdk.core.dgq;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.bss;

/* JADX INFO: loaded from: classes.dex */
public class uml extends GestureDetector {
    private final kq kq;
    private final com.bytedance.sdk.openadsdk.core.bob.rhi oq;

    static class kq extends GestureDetector.SimpleOnGestureListener {
        boolean kq = false;

        kq() {
        }

        void kq() {
            this.kq = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            this.kq = true;
            return super.onSingleTapUp(motionEvent);
        }

        boolean oq() {
            return this.kq;
        }
    }

    public uml(Context context) {
        this(context, new kq());
    }

    void kq() {
        this.kq.kq();
    }

    @Override // android.view.GestureDetector
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.oq.kq(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public boolean oq() {
        return this.kq.oq();
    }

    public uml(Context context, kq kqVar) {
        super(context, kqVar);
        this.kq = kqVar;
        this.oq = new com.bytedance.sdk.openadsdk.core.bob.rhi();
        setIsLongpressEnabled(false);
    }

    public com.bytedance.sdk.openadsdk.core.model.vvw kq(Context context, View view) {
        if (this.oq == null) {
            return new com.bytedance.sdk.openadsdk.core.model.vvw.kq().kq();
        }
        return new com.bytedance.sdk.openadsdk.core.model.vvw.kq().rhi(this.oq.kq).csi(this.oq.oq).fou(this.oq.bob).bob(this.oq.fou).oq(this.oq.csi).kq(this.oq.rhi).kq(bss.kq(view)).oq(bss.bob(view)).fou(this.oq.rjo).csi(this.oq.syt).rhi(this.oq.dgq).kq(this.oq.vvw).oq(com.bytedance.sdk.openadsdk.core.dgq.oq().kq() ? 1 : 2).kq("vessel").kq(bss.syt(context)).bob(bss.nn(context)).oq(bss.dgq(context)).kq();
    }
}
