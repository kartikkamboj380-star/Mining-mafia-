package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zag {
    final d zaa;
    protected int zab;

    public zag(Uri uri, int i10) {
        this.zab = 0;
        this.zaa = new d(uri);
        this.zab = i10;
    }

    protected abstract void zaa(Drawable drawable, boolean z9, boolean z10, boolean z11);

    final void zab(Context context, l lVar, boolean z9) {
        int i10 = this.zab;
        zaa(i10 != 0 ? context.getResources().getDrawable(i10) : null, z9, false, false);
    }

    final void zac(Context context, Bitmap bitmap, boolean z9) {
        Asserts.checkNotNull(bitmap);
        zaa(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
