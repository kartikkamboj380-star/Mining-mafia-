package com.google.android.gms.internal.ads;

import H4.C0654z;
import K4.AbstractC0786o0;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1880Ij extends RelativeLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float[] f19604b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AnimationDrawable f19605a;

    public C1880Ij(Context context, BinderC1828Hj binderC1828Hj, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(binderC1828Hj);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f19604b, null, null));
        shapeDrawable.getPaint().setColor(binderC1828Hj.zze());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(binderC1828Hj.zzb())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(binderC1828Hj.zzb());
            textView.setTextColor(binderC1828Hj.b());
            textView.setTextSize(binderC1828Hj.z6());
            C0654z.a();
            int iC = L4.g.c(context, 4);
            C0654z.a();
            textView.setPadding(iC, 0, L4.g.c(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List listZzd = binderC1828Hj.zzd();
        if (listZzd != null && listZzd.size() > 1) {
            this.f19605a = new AnimationDrawable();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                try {
                    this.f19605a.addFrame((Drawable) com.google.android.gms.dynamic.b.h0(((BinderC1984Kj) it.next()).zzb()), binderC1828Hj.A6());
                } catch (Exception e10) {
                    int i10 = AbstractC0786o0.f2696b;
                    L4.p.d("Error while getting drawable.", e10);
                }
            }
            imageView.setBackground(this.f19605a);
        } else if (listZzd.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) com.google.android.gms.dynamic.b.h0(((BinderC1984Kj) listZzd.get(0)).zzb()));
            } catch (Exception e11) {
                int i11 = AbstractC0786o0.f2696b;
                L4.p.d("Error while getting drawable.", e11);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f19605a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
