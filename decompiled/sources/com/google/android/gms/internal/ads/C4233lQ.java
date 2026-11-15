package com.google.android.gms.internal.ads;

import K4.C0794u;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.lQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4233lQ extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0794u f31268a;

    public C4233lQ(Context context, View view, C0794u c0794u) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f31268a = c0794u;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f31268a.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            KeyEvent.Callback childAt = getChildAt(i10);
            if (childAt instanceof InterfaceC1750Fw) {
                arrayList.add((InterfaceC1750Fw) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((InterfaceC1750Fw) arrayList.get(i11)).destroy();
        }
    }
}
