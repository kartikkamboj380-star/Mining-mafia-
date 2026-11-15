package com.horcrux.svg;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.facebook.react.bridge.ReactContext;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C6782n extends AbstractC6785q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f41598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    float f41599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f41600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    EnumC6786r f41601f;

    public C6782n(ReactContext reactContext) {
        super(reactContext);
    }

    private Bitmap D(Context context, Bitmap bitmap) {
        float fMax = Math.max(this.f41599d, this.f41600e) * 2.0f;
        if (fMax <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return bitmap;
        }
        float fMin = Math.min(fMax, 25.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap);
        RenderScript renderScriptCreate = RenderScript.create(context);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(fMin);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        allocationCreateFromBitmap.destroy();
        allocationCreateFromBitmap2.destroy();
        renderScriptCreate.destroy();
        return Bitmap.createScaledBitmap(bitmapCreateBitmap, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public void E(String str) {
        this.f41601f = EnumC6786r.d(str);
        invalidate();
    }

    public void F(String str) {
        this.f41598c = str;
        invalidate();
    }

    public void G(float f10) {
        this.f41599d = f10;
        invalidate();
    }

    public void H(float f10) {
        this.f41600e = f10;
        invalidate();
    }

    @Override // com.horcrux.svg.AbstractC6785q
    public Bitmap v(HashMap map, Bitmap bitmap) {
        return D(getContext(), AbstractC6785q.x(map, bitmap, this.f41598c));
    }
}
