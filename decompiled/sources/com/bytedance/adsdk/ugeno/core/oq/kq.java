package com.bytedance.adsdk.ugeno.core.oq;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    public String kq = "GesThrough_";
    private List<MotionEvent> oq = new ArrayList();
    private Set<String> bob = Collections.synchronizedSet(new HashSet());

    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar, MotionEvent motionEvent) {
        if (bobVar == null || motionEvent == null || this.oq == null) {
            return;
        }
        kq(bobVar.ubx(), bobVar.wf(), motionEvent);
    }

    public void kq(View view, String str, MotionEvent motionEvent) {
        if (view == null || motionEvent == null || this.oq == null) {
            return;
        }
        this.kq = "GesThrough_".concat(String.valueOf(str));
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        if (motionEvent.getAction() == 0) {
            this.oq.clear();
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(i10, i11);
        this.oq.add(motionEventObtain);
    }

    public boolean kq(MotionEvent motionEvent) {
        if (motionEvent == null || this.bob == null) {
            return false;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        return this.bob.contains(motionEvent.getDownTime() + "_" + pointerId);
    }

    public void kq(com.bytedance.adsdk.ugeno.oq.bob bobVar) {
        if (this.oq.isEmpty() || this.bob == null || bobVar == null || bobVar.ubx() == null || bobVar.ubx().getRootView() == null) {
            return;
        }
        kq(bobVar.ubx());
    }

    public void kq(View view) {
        if (this.oq.isEmpty() || this.bob == null || view == null || view.getRootView() == null) {
            return;
        }
        final View rootView = view.getRootView();
        Log.d(this.kq, "Re-dispatch motionEvents.size(): " + this.oq.size());
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.adsdk.ugeno.core.oq.kq.1
            @Override // java.lang.Runnable
            public void run() {
                for (MotionEvent motionEvent : kq.this.oq) {
                    if (motionEvent != null) {
                        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                        kq.this.bob.add(motionEvent.getDownTime() + "_" + pointerId);
                        rootView.dispatchTouchEvent(motionEvent);
                        motionEvent.recycle();
                    }
                }
                kq.this.oq.clear();
            }
        }, 300L);
    }
}
