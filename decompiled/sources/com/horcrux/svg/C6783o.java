package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6783o extends AbstractC6785q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReadableArray f41605c;

    public C6783o(ReactContext reactContext) {
        super(reactContext);
    }

    public void D(ReadableArray readableArray) {
        this.f41605c = readableArray;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC6785q
    public Bitmap v(HashMap map, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int size = this.f41605c.size();
        for (int i10 = 0; i10 < size; i10++) {
            String string = this.f41605c.getString(i10);
            Bitmap bitmap2 = string.isEmpty() ? bitmap : (Bitmap) map.get(string);
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new Paint());
            }
        }
        return bitmapCreateBitmap;
    }
}
