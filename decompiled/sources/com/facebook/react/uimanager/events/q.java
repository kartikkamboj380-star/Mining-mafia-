package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.A0;
import com.facebook.react.uimanager.InterfaceC1395z0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f15615a = new q();

    private q() {
    }

    public static final void a(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC1395z0 interfaceC1395z0A = A0.a(view);
        if (interfaceC1395z0A != null) {
            interfaceC1395z0A.d(view, event);
        }
    }

    public static final void b(View view, MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        InterfaceC1395z0 interfaceC1395z0A = A0.a(view);
        if (interfaceC1395z0A != null) {
            interfaceC1395z0A.a(view, event);
        }
    }
}
