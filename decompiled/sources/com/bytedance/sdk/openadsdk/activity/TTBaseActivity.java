package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import com.bytedance.sdk.component.utils.fax;
import com.bytedance.sdk.openadsdk.utils.nb;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class TTBaseActivity extends Activity {
    protected boolean dgq = false;
    private OnBackInvokedCallback kq;
    protected String nn;

    private static class kq implements OnBackInvokedCallback {
        private final WeakReference<TTBaseActivity> kq;

        kq(TTBaseActivity tTBaseActivity) {
            this.kq = new WeakReference<>(tTBaseActivity);
        }

        public void onBackInvoked() {
            TTBaseActivity tTBaseActivity = this.kq.get();
            if (tTBaseActivity != null) {
                tTBaseActivity.oq();
            }
        }
    }

    public void bob(boolean z9) {
        this.dgq = z9;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    protected boolean kq() {
        return false;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (kq() && nb.kq()) {
            this.kq = new kq(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.kq);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!nb.kq() || this.kq == null) {
            return;
        }
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.kq);
        this.kq = null;
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (Build.VERSION.SDK_INT < 33) {
            super.onPause();
            return;
        }
        try {
            try {
                super.onPause();
            } catch (Exception unused) {
            }
        } catch (IllegalArgumentException unused2) {
            Field declaredField = Activity.class.getDeclaredField("mCalled");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.TRUE);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT > 28) {
            super.onResume();
            return;
        }
        try {
            super.onResume();
        } catch (IllegalArgumentException e10) {
            fax.kq("TTBaseActivity", "super.onResume() run fail", e10);
            try {
                Field declaredField = Activity.class.getDeclaredField("mCalled");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.TRUE);
            } catch (Exception e11) {
                fax.kq("TTBaseActivity", "onResume set mCalled fail", e11);
            }
        }
    }

    protected void oq() {
        onBackPressed();
    }
}
