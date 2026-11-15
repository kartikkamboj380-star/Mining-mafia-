package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class kq implements Application.ActivityLifecycleCallbacks {
    public static long bob = 0;
    public static boolean kq = false;
    public static long oq;
    private final fou dgq;
    private volatile WeakReference<Activity> suf;
    private final fou syt;
    private final AtomicBoolean fou = new AtomicBoolean(false);
    private final RunnableC0319kq csi = new RunnableC0319kq();
    private final rhi rhi = new rhi();
    private final csi rjo = new csi();
    private int nn = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.kq>> ubx = new CopyOnWriteArrayList<>();
    private HandlerThread vvw = null;
    private Handler wki = null;
    private final LinkedList<Activity> nze = new LinkedList<>();

    private static class bob extends fou {
        private bob() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.kq.fou, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.csi.kq();
        }
    }

    class csi implements Runnable {
        csi() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerOq = com.bytedance.sdk.openadsdk.core.suf.oq();
                Message messageObtain = Message.obtain(handlerOq, kq.this.csi);
                messageObtain.what = BackupConstant.SCENE_RENDER_FAIL;
                handlerOq.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    private static class fou implements Runnable {
        private fou() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.fou.kq.ubx ubxVarClh = com.bytedance.sdk.openadsdk.core.settings.ubx.bob().clh();
            if (ubxVarClh == null || ubxVarClh.kq() || !com.bytedance.sdk.component.utils.wcx.syt(com.bytedance.sdk.openadsdk.core.sns.kq())) {
                return;
            }
            com.bytedance.sdk.openadsdk.fou.kq.oq.kq(com.bytedance.sdk.openadsdk.core.vvw.kq(com.bytedance.sdk.openadsdk.core.sns.kq()));
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.kq$kq, reason: collision with other inner class name */
    static class RunnableC0319kq implements Runnable {
        RunnableC0319kq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            nz.bob(new com.bytedance.sdk.component.syt.syt("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.kq.kq.1
                @Override // java.lang.Runnable
                public void run() {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    private static class oq extends fou {
        private oq() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.kq.fou, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.rhi.oq.kq().oq();
            com.bytedance.sdk.openadsdk.utils.csi.oq();
            com.bytedance.sdk.openadsdk.component.rjo.kq.kq(3);
        }
    }

    class rhi implements Runnable {
        rhi() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.suf.oq().removeMessages(BackupConstant.SCENE_RENDER_FAIL);
            com.bytedance.sdk.openadsdk.core.sns.kq();
        }
    }

    public class rjo implements Runnable {
        private long bob;
        private boolean fou;
        private long oq;

        public rjo(long j10, long j11, boolean z9) {
            this.oq = j10;
            this.bob = j11;
            this.fou = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.fou) {
                com.bytedance.sdk.openadsdk.mxq.bob.kq().kq(this.oq / 1000, this.bob / 1000);
            }
        }
    }

    public kq() {
        this.syt = new oq();
        this.dgq = new bob();
        bob();
    }

    private void bob() {
        this.vvw = com.bytedance.sdk.component.utils.syt.kq("lifecycle", 10);
        this.wki = new Handler(this.vvw.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.nze.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.ubx != null && this.ubx.size() > 0) {
            for (WeakReference<com.bytedance.sdk.component.adexpress.kq> weakReference : this.ubx) {
                if (weakReference != null && weakReference.get() != null) {
                    try {
                        weakReference.get().kq(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.suf != null && this.suf.get() == activity) {
            this.suf = null;
        }
        this.nze.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i10 = this.nn - 1;
        this.nn = i10;
        if (i10 < 0) {
            this.nn = 0;
        }
        if (ApmHelper.isIsInit()) {
            kq(this.rjo);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kq(this.rhi);
        if (!kq) {
            oq = System.currentTimeMillis();
            kq = true;
        }
        this.suf = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (bss.oq() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.kq.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(@NonNull View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (bss.fou(activity)) {
                                bss.kq(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(@NonNull View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (bss.fou(activity)) {
                    bss.kq(true);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.fax.kq("TTAD.ActivityLifecycle", th);
        }
        this.nn++;
        if (this.fou.get()) {
            this.wki.removeCallbacks(this.dgq);
            this.wki.removeCallbacks(this.syt);
            kq(this.dgq);
        }
        this.fou.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.nn <= 0) {
            this.fou.set(true);
        }
        if (kq()) {
            kq = false;
            com.bytedance.sdk.openadsdk.core.suf.oq.set(false);
            bob = System.currentTimeMillis();
            this.wki.removeCallbacks(this.dgq);
            this.wki.removeCallbacks(this.syt);
            kq(this.syt);
        }
        kq(new rjo(oq, bob, kq()));
    }

    public boolean oq(com.bytedance.sdk.component.adexpress.kq kqVar) {
        return this.ubx.remove(new WeakReference(kqVar));
    }

    private void kq(Runnable runnable) {
        if (!this.vvw.isAlive()) {
            bob();
        }
        this.wki.postDelayed(runnable, 1000L);
    }

    public Activity oq() {
        if (this.nze.isEmpty()) {
            return null;
        }
        return this.nze.getFirst();
    }

    public void kq(com.bytedance.sdk.component.adexpress.kq kqVar) {
        this.ubx.add(new WeakReference<>(kqVar));
    }

    public boolean kq() {
        return this.fou.get();
    }

    public boolean kq(boolean z9) {
        Activity activity;
        Window window;
        return (this.suf == null || (activity = this.suf.get()) == null || (window = activity.getWindow()) == null) ? z9 : window.getDecorView().hasWindowFocus();
    }
}
