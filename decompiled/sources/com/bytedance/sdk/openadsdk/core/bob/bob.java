package com.bytedance.sdk.openadsdk.core.bob;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.sns;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class bob implements View.OnClickListener, View.OnTouchListener {
    private static float bob = 0.0f;
    private static long csi = 0;
    private static float fou = 0.0f;
    protected static int ha = 8;
    private static float kq;
    private static float oq;
    protected View zfx;
    protected float fax = -1.0f;
    protected float mq = -1.0f;
    protected float jhe = -1.0f;
    protected float uml = -1.0f;
    protected long nb = -1;
    protected long ou = -1;
    protected int ebt = -1;
    protected int ibd = BackupConstant.UNFINISHED_FAIL_CODE;
    protected int rs = -1;
    protected boolean fgm = true;
    public SparseArray<kq> ktb = new SparseArray<>();
    private int rhi = 0;
    private int rjo = 0;

    public static class kq {
        public double bob;
        public long fou;
        public int kq;
        public double oq;

        public kq(int i10, double d10, double d11, long j10) {
            this.kq = i10;
            this.oq = d10;
            this.bob = d11;
            this.fou = j10;
        }
    }

    static {
        if (sns.kq() != null) {
            ha = sns.oq();
        }
        kq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        bob = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        fou = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        csi = 0L;
    }

    private boolean kq(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (oq.oq(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (kq(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    protected abstract void kq(View view, float f10, float f11, float f12, float f13, SparseArray<kq> sparseArray, boolean z9);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (com.bytedance.sdk.openadsdk.core.settings.rjo.kq()) {
            kq(view, this.fax, this.mq, this.jhe, this.uml, this.ktb, this.fgm);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        this.ibd = motionEvent.getDeviceId();
        this.ebt = motionEvent.getToolType(0);
        this.rs = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 1;
        if (actionMasked != 0) {
            int i12 = 3;
            if (actionMasked == 1) {
                this.jhe = motionEvent.getRawX();
                this.uml = motionEvent.getRawY();
                this.ou = System.currentTimeMillis();
                if (Math.abs(this.jhe - this.rhi) >= ha || Math.abs(this.uml - this.rjo) >= ha) {
                    this.fgm = false;
                }
                Point point = new Point((int) this.jhe, (int) this.uml);
                if (view != null && !oq.oq(view) && kq((View) view.getParent(), point)) {
                    return true;
                }
            } else if (actionMasked != 2) {
                i12 = actionMasked != 3 ? -1 : 4;
            } else {
                bob += Math.abs(motionEvent.getX() - kq);
                fou += Math.abs(motionEvent.getY() - oq);
                kq = motionEvent.getX();
                oq = motionEvent.getY();
                if (System.currentTimeMillis() - csi > 200) {
                    float f10 = bob;
                    int i13 = ha;
                    if (f10 <= i13 && fou <= i13) {
                        i11 = 2;
                    }
                } else {
                    i11 = 2;
                }
                this.jhe = motionEvent.getRawX();
                this.uml = motionEvent.getRawY();
                if (Math.abs(this.jhe - this.rhi) >= ha || Math.abs(this.uml - this.rjo) >= ha) {
                    this.fgm = false;
                }
                i10 = i11;
            }
            i10 = i12;
        } else {
            this.rhi = (int) motionEvent.getRawX();
            this.rjo = (int) motionEvent.getRawY();
            this.fax = motionEvent.getRawX();
            this.mq = motionEvent.getRawY();
            this.nb = System.currentTimeMillis();
            this.ebt = motionEvent.getToolType(0);
            this.ibd = motionEvent.getDeviceId();
            this.rs = motionEvent.getSource();
            csi = System.currentTimeMillis();
            this.fgm = true;
            this.zfx = view;
            com.bytedance.sdk.openadsdk.core.nn.bob.kq(motionEvent);
            i10 = 0;
        }
        this.ktb.put(motionEvent.getActionMasked(), new kq(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }

    public boolean rhi() {
        return this.fgm;
    }
}
