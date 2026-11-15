package com.bytedance.adsdk.oq.oq;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.oq.bob;
import com.bytedance.adsdk.oq.bob.rjo;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class kq {
    private bob csi;
    private final AssetManager fou;
    private final rjo<String> kq = new rjo<>();
    private final Map<rjo<String>, Typeface> oq = new HashMap();
    private final Map<String, Typeface> bob = new HashMap();
    private String rhi = ".ttf";

    public kq(Drawable.Callback callback, bob bobVar) {
        this.csi = bobVar;
        if (callback instanceof View) {
            this.fou = ((View) callback).getContext().getAssets();
        } else {
            this.fou = null;
        }
    }

    private Typeface oq(com.bytedance.adsdk.oq.bob.bob bobVar) {
        Typeface typefaceCreateFromAsset;
        String strKq = bobVar.kq();
        Typeface typeface = this.bob.get(strKq);
        if (typeface != null) {
            return typeface;
        }
        String strBob = bobVar.bob();
        String strOq = bobVar.oq();
        bob bobVar2 = this.csi;
        if (bobVar2 != null) {
            typefaceCreateFromAsset = bobVar2.kq(strKq, strBob, strOq);
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = this.csi.kq(strKq);
            }
        } else {
            typefaceCreateFromAsset = null;
        }
        bob bobVar3 = this.csi;
        if (bobVar3 != null && typefaceCreateFromAsset == null) {
            String strOq2 = bobVar3.oq(strKq, strBob, strOq);
            if (strOq2 == null) {
                strOq2 = this.csi.oq(strKq);
            }
            if (strOq2 != null) {
                try {
                    typefaceCreateFromAsset = Typeface.createFromAsset(this.fou, strOq2);
                } catch (Throwable unused) {
                    typefaceCreateFromAsset = Typeface.DEFAULT;
                }
            }
        }
        if (bobVar.fou() != null) {
            return bobVar.fou();
        }
        if (typefaceCreateFromAsset == null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(this.fou, "fonts/" + strKq + this.rhi);
            } catch (Throwable unused2) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        this.bob.put(strKq, typefaceCreateFromAsset);
        return typefaceCreateFromAsset;
    }

    public void kq(bob bobVar) {
        this.csi = bobVar;
    }

    public void kq(String str) {
        this.rhi = str;
    }

    public Typeface kq(com.bytedance.adsdk.oq.bob.bob bobVar) {
        this.kq.kq(bobVar.kq(), bobVar.bob());
        Typeface typeface = this.oq.get(this.kq);
        if (typeface != null) {
            return typeface;
        }
        Typeface typefaceKq = kq(oq(bobVar), bobVar.bob());
        this.oq.put(this.kq, typefaceKq);
        return typefaceKq;
    }

    private Typeface kq(Typeface typeface, String str) {
        int i10;
        boolean zContains = str.contains("Italic");
        boolean zContains2 = str.contains("Bold");
        if (zContains && zContains2) {
            i10 = 3;
        } else if (zContains) {
            i10 = 2;
        } else {
            i10 = zContains2 ? 1 : 0;
        }
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }
}
