package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long kq;
    private long oq;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j10 = this.kq;
        if (j10 > 0) {
            com.bytedance.sdk.openadsdk.utils.csi.kq(j10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.oq > 0) {
            this.kq += SystemClock.elapsedRealtime() - this.oq;
            this.oq = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.csi.bob()) {
            this.oq = SystemClock.elapsedRealtime();
        }
    }
}
