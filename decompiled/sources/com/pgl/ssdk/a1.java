package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class a1 extends a4 implements a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HandlerThread f41890b;

    a1(HandlerThread handlerThread, a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f41890b = handlerThread;
    }

    public void a(a4.a aVar) {
        this.f41893a = new WeakReference<>(aVar);
    }

    public void a(String str) {
        HandlerThread handlerThread = this.f41890b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
