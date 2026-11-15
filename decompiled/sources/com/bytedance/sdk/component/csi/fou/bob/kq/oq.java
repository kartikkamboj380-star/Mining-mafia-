package com.bytedance.sdk.component.csi.fou.bob.kq;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class oq implements com.bytedance.sdk.component.csi.oq, Cloneable {
    private static volatile com.bytedance.sdk.component.csi.oq dgq;
    private int bob;
    private boolean csi;
    private int fou;
    private long kq;
    private int oq;
    private boolean rhi;
    private boolean rjo;
    private File syt;

    public oq(int i10, int i11, int i12, long j10, File file) {
        this(i10, i11, i12, j10, i11 != 0, j10 != 0, file);
    }

    public static com.bytedance.sdk.component.csi.oq nn() {
        return dgq;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public int bob() {
        return this.bob;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean csi() {
        return this.csi;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean dgq() {
        return true;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public int fou() {
        return this.fou;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public long kq() {
        return this.kq;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public int oq() {
        return this.oq;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean rhi() {
        return this.rjo;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public boolean rjo() {
        return this.rhi;
    }

    @Override // com.bytedance.sdk.component.csi.oq
    public File syt() {
        return this.syt;
    }

    public oq(int i10, int i11, int i12, long j10, boolean z9, boolean z10, File file) {
        this.kq = j10;
        this.oq = i10;
        this.bob = i11;
        this.fou = i12;
        this.csi = z9;
        this.rhi = z10;
        this.syt = file;
        this.rjo = i12 != 0;
    }

    public static void kq(Context context, com.bytedance.sdk.component.csi.oq oqVar) {
        if (oqVar != null) {
            dgq = oqVar;
        } else {
            dgq = kq(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.csi.oq kq(File file) {
        long jKq;
        int iBob;
        int iFou;
        file.mkdirs();
        if (dgq == null) {
            iBob = 10;
            iFou = 14;
            jKq = 20;
        } else {
            jKq = dgq.kq();
            iBob = dgq.bob();
            iFou = dgq.fou();
        }
        return new oq(0, iBob, iFou, jKq, file);
    }
}
