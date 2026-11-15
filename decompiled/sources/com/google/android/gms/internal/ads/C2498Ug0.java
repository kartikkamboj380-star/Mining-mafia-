package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ug0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2498Ug0 implements InterfaceC2342Rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f24076a = new int[2];

    @Override // com.google.android.gms.internal.ads.InterfaceC2342Rg0
    public final JSONObject a(View view) {
        if (view == null) {
            return AbstractC3137ch0.b(0, 0, 0, 0);
        }
        int[] iArr = this.f24076a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return AbstractC3137ch0.b(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2342Rg0
    public final void b(View view, JSONObject jSONObject, InterfaceC2290Qg0 interfaceC2290Qg0, boolean z9, boolean z10) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z9) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    interfaceC2290Qg0.a(viewGroup.getChildAt(i11), this, jSONObject, z10);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 < size2) {
                        interfaceC2290Qg0.a((View) arrayList3.get(i14), this, jSONObject, z10);
                        i14++;
                    }
                }
                i13 = i10;
            }
        }
    }
}
