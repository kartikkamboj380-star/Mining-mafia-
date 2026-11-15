package com.bytedance.sdk.openadsdk.core.bob;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.bytedance.sdk.openadsdk.core.sns;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes.dex */
public class rhi {
    private static float mxq = 0.0f;
    public static int nn = 8;
    private static float nze;
    private static long sns;
    private static float suf;
    private static float wki;
    public float kq = -1.0f;
    public float oq = -1.0f;
    public float bob = -1.0f;
    public float fou = -1.0f;
    public long csi = -1;
    public long rhi = -1;
    public int rjo = -1;
    public int syt = BackupConstant.UNFINISHED_FAIL_CODE;
    public int dgq = -1;
    public boolean ubx = true;
    public SparseArray<bob.kq> vvw = new SparseArray<>();
    private int wcx = 0;
    private int gm = 0;

    static {
        if (sns.kq() != null) {
            nn = sns.oq();
        }
        wki = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        suf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        nze = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        mxq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        sns = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public void kq(MotionEvent motionEvent) {
        int i10;
        this.syt = motionEvent.getDeviceId();
        int i11 = 0;
        this.rjo = motionEvent.getToolType(0);
        this.dgq = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i12 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.bob = motionEvent.getRawX();
                this.fou = motionEvent.getRawY();
                this.rhi = System.currentTimeMillis();
                if (Math.abs(this.bob - this.wcx) >= nn || Math.abs(this.fou - this.gm) >= nn) {
                    this.ubx = false;
                }
                i10 = 3;
            } else if (actionMasked != 2) {
                i11 = actionMasked != 3 ? -1 : 4;
            } else {
                nze += Math.abs(motionEvent.getX() - wki);
                mxq += Math.abs(motionEvent.getY() - suf);
                wki = motionEvent.getX();
                suf = motionEvent.getY();
                if (System.currentTimeMillis() - sns > 200) {
                    float f10 = nze;
                    int i13 = nn;
                    if (f10 <= i13 && mxq <= i13) {
                        i12 = 2;
                    }
                } else {
                    i12 = 2;
                }
                this.bob = motionEvent.getRawX();
                this.fou = motionEvent.getRawY();
                if (Math.abs(this.bob - this.wcx) >= nn || Math.abs(this.fou - this.gm) >= nn) {
                    this.ubx = false;
                }
                i10 = i12;
            }
            this.vvw.put(motionEvent.getActionMasked(), new bob.kq(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.wcx = (int) motionEvent.getRawX();
        this.gm = (int) motionEvent.getRawY();
        this.kq = motionEvent.getRawX();
        this.oq = motionEvent.getRawY();
        this.csi = System.currentTimeMillis();
        this.rjo = motionEvent.getToolType(0);
        this.syt = motionEvent.getDeviceId();
        this.dgq = motionEvent.getSource();
        sns = System.currentTimeMillis();
        this.ubx = true;
        i10 = i11;
        this.vvw.put(motionEvent.getActionMasked(), new bob.kq(i10, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
