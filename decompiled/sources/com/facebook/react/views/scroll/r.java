package com.facebook.react.views.scroll;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private VelocityTracker f16136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f16137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f16138c;

    public final void a(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f16136a == null) {
            this.f16136a = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f16136a;
        if (velocityTracker != null) {
            velocityTracker.addMovement(ev);
            int action = ev.getAction() & 255;
            if (action == 1 || action == 3) {
                velocityTracker.computeCurrentVelocity(1);
                this.f16137b = velocityTracker.getXVelocity();
                this.f16138c = velocityTracker.getYVelocity();
                velocityTracker.recycle();
                this.f16136a = null;
            }
        }
    }

    public final float b() {
        return this.f16137b;
    }

    public final float c() {
        return this.f16138c;
    }
}
