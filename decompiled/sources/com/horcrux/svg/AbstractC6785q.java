package com.horcrux.svg;

import android.graphics.Bitmap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: renamed from: com.horcrux.svg.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC6785q extends AbstractC6773e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f41625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FilterRegion f41626b;

    public AbstractC6785q(ReactContext reactContext) {
        super(reactContext);
        this.f41626b = new FilterRegion();
    }

    protected static Bitmap x(HashMap map, Bitmap bitmap, String str) {
        Bitmap bitmap2 = str != null ? (Bitmap) map.get(str) : null;
        return bitmap2 != null ? bitmap2 : bitmap;
    }

    public void A(Dynamic dynamic) {
        this.f41626b.setWidth(dynamic);
        invalidate();
    }

    public void B(Dynamic dynamic) {
        this.f41626b.setX(dynamic);
        invalidate();
    }

    public void C(Dynamic dynamic) {
        this.f41626b.setY(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    void saveDefinition() {
    }

    public abstract Bitmap v(HashMap map, Bitmap bitmap);

    public String w() {
        return this.f41625a;
    }

    public void y(Dynamic dynamic) {
        this.f41626b.setHeight(dynamic);
        invalidate();
    }

    public void z(String str) {
        this.f41625a = str;
        invalidate();
    }
}
