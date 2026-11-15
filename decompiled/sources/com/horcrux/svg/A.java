package com.horcrux.svg;

import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f41294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[][] f41295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f41296c;

    A(Paint paint) {
        ArrayList arrayList = new ArrayList();
        this.f41294a = arrayList;
        this.f41295b = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER][];
        this.f41296c = paint;
        arrayList.add(new Path());
    }

    private int a(char c10) {
        int[] iArr = this.f41295b[c10 >> '\b'];
        if (iArr == null) {
            return 0;
        }
        return iArr[c10 & 255];
    }

    Path b(char c10, String str) {
        Path path;
        int iA = a(c10);
        if (iA != 0) {
            path = (Path) this.f41294a.get(iA);
        } else {
            Path path2 = new Path();
            this.f41296c.getTextPath(str, 0, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, path2);
            int[][] iArr = this.f41295b;
            int i10 = c10 >> '\b';
            int[] iArr2 = iArr[i10];
            if (iArr2 == null) {
                iArr2 = new int[IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER];
                iArr[i10] = iArr2;
            }
            iArr2[c10 & 255] = this.f41294a.size();
            this.f41294a.add(path2);
            path = path2;
        }
        Path path3 = new Path();
        path3.addPath(path);
        return path3;
    }
}
