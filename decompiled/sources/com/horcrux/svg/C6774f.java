package com.horcrux.svg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: renamed from: com.horcrux.svg.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6774f extends AbstractC6773e {
    public C6774f(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.AbstractC6773e, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f10) {
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }
}
