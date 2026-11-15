package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f38951d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f38952e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38953c = 0;

    @Override // com.google.android.material.carousel.d
    f g(b bVar, View view) {
        float fB = bVar.b();
        if (bVar.d()) {
            fB = bVar.a();
        }
        float f10 = fB;
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f11 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (bVar.d()) {
            f11 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float f12 = f11;
        float fD = d() + f12;
        float fMax = Math.max(c() + f12, fD);
        float fMin = Math.min(measuredHeight + f12, f10);
        float fA = I.a.a((measuredHeight / 3.0f) + f12, fD + f12, fMax + f12);
        float f13 = (fMin + fA) / 2.0f;
        int[] iArrA = f38951d;
        if (f10 < 2.0f * fD) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f38952e;
        if (bVar.c() == 1) {
            iArrA = d.a(iArrA);
            iArrA2 = d.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        int iMax = (int) Math.max(1.0d, Math.floor(((f10 - (e.i(iArr) * f13)) - (e.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f10 / fMin);
        int i10 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr3[i11] = iCeil - i11;
        }
        a aVarC = a.c(f10, fA, fD, fMax, iArr2, f13, iArr, fMin, iArr3);
        this.f38953c = aVarC.e();
        if (i(aVarC, bVar.getItemCount())) {
            aVarC = a.c(f10, fA, fD, fMax, new int[]{aVarC.f38912c}, f13, new int[]{aVarC.f38913d}, fMin, new int[]{aVarC.f38916g});
        }
        return e.d(view.getContext(), f12, f10, aVarC, bVar.c());
    }

    @Override // com.google.android.material.carousel.d
    boolean h(b bVar, int i10) {
        if (i10 >= this.f38953c || bVar.getItemCount() < this.f38953c) {
            return i10 >= this.f38953c && bVar.getItemCount() < this.f38953c;
        }
        return true;
    }

    boolean i(a aVar, int i10) {
        int iE = aVar.e() - i10;
        boolean z9 = iE > 0 && (aVar.f38912c > 0 || aVar.f38913d > 1);
        while (iE > 0) {
            int i11 = aVar.f38912c;
            if (i11 > 0) {
                aVar.f38912c = i11 - 1;
            } else {
                int i12 = aVar.f38913d;
                if (i12 > 1) {
                    aVar.f38913d = i12 - 1;
                }
            }
            iE--;
        }
        return z9;
    }
}
