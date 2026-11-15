package com.bytedance.adsdk.oq.kq;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.oq.rhi.csi;

/* JADX INFO: loaded from: classes.dex */
public class kq extends Paint {
    public kq() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(csi.kq(i10, 0, 255));
        } else {
            setColor((csi.kq(i10, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public kq(int i10) {
        super(i10);
    }

    public kq(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public kq(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
