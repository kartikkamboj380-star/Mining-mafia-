package com.bytedance.adsdk.oq.kq.kq;

import android.annotation.TargetApi;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class vvw implements nn, wki {
    private final String fou;
    private final com.bytedance.adsdk.oq.bob.oq.dgq rhi;
    private final Path kq = new Path();
    private final Path oq = new Path();
    private final Path bob = new Path();
    private final List<wki> csi = new ArrayList();

    /* JADX INFO: renamed from: com.bytedance.adsdk.oq.kq.kq.vvw$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] kq;

        static {
            int[] iArr = new int[com.bytedance.adsdk.oq.bob.oq.dgq.kq.values().length];
            kq = iArr;
            try {
                iArr[com.bytedance.adsdk.oq.bob.oq.dgq.kq.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                kq[com.bytedance.adsdk.oq.bob.oq.dgq.kq.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                kq[com.bytedance.adsdk.oq.bob.oq.dgq.kq.SUBTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                kq[com.bytedance.adsdk.oq.bob.oq.dgq.kq.INTERSECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kq[com.bytedance.adsdk.oq.bob.oq.dgq.kq.EXCLUDE_INTERSECTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public vvw(com.bytedance.adsdk.oq.bob.oq.dgq dgqVar) {
        this.fou = dgqVar.kq();
        this.rhi = dgqVar;
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.wki
    public Path fou() {
        this.bob.reset();
        if (this.rhi.bob()) {
            return this.bob;
        }
        int i10 = AnonymousClass1.kq[this.rhi.oq().ordinal()];
        if (i10 == 1) {
            kq();
        } else if (i10 == 2) {
            kq(Path.Op.UNION);
        } else if (i10 == 3) {
            kq(Path.Op.REVERSE_DIFFERENCE);
        } else if (i10 == 4) {
            kq(Path.Op.INTERSECT);
        } else if (i10 == 5) {
            kq(Path.Op.XOR);
        }
        return this.bob;
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.nn
    public void kq(ListIterator<bob> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            bob bobVarPrevious = listIterator.previous();
            if (bobVarPrevious instanceof wki) {
                this.csi.add((wki) bobVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.bytedance.adsdk.oq.kq.kq.bob
    public void kq(List<bob> list, List<bob> list2) {
        for (int i10 = 0; i10 < this.csi.size(); i10++) {
            this.csi.get(i10).kq(list, list2);
        }
    }

    private void kq() {
        for (int i10 = 0; i10 < this.csi.size(); i10++) {
            this.bob.addPath(this.csi.get(i10).fou());
        }
    }

    @TargetApi(19)
    private void kq(Path.Op op) {
        this.oq.reset();
        this.kq.reset();
        for (int size = this.csi.size() - 1; size > 0; size--) {
            wki wkiVar = this.csi.get(size);
            if (wkiVar instanceof fou) {
                fou fouVar = (fou) wkiVar;
                List<wki> listOq = fouVar.oq();
                for (int size2 = listOq.size() - 1; size2 >= 0; size2--) {
                    Path pathFou = listOq.get(size2).fou();
                    pathFou.transform(fouVar.bob());
                    this.oq.addPath(pathFou);
                }
            } else {
                this.oq.addPath(wkiVar.fou());
            }
        }
        wki wkiVar2 = this.csi.get(0);
        if (wkiVar2 instanceof fou) {
            fou fouVar2 = (fou) wkiVar2;
            List<wki> listOq2 = fouVar2.oq();
            for (int i10 = 0; i10 < listOq2.size(); i10++) {
                Path pathFou2 = listOq2.get(i10).fou();
                pathFou2.transform(fouVar2.bob());
                this.kq.addPath(pathFou2);
            }
        } else {
            this.kq.set(wkiVar2.fou());
        }
        this.bob.op(this.kq, this.oq, op);
    }
}
